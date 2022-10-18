package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.WeakMap
import typings.tensorflowTfjsCore.anon.Backend
import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.anon.Factory
import typings.tensorflowTfjsCore.anon.GradFunc
import typings.tensorflowTfjsCore.anon.GradsValue
import typings.tensorflowTfjsCore.distBackendsBackendMod.BackendTimingInfo
import typings.tensorflowTfjsCore.distBackendsBackendMod.DataMover
import typings.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend
import typings.tensorflowTfjsCore.distEnvironmentMod.Environment
import typings.tensorflowTfjsCore.distKernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distTapeMod.TapeNode
import typings.tensorflowTfjsCore.distTensorMod.DataId
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.TensorTracker
import typings.tensorflowTfjsCore.distTensorTypesMod.GradSaveFunc
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedVariableMap
import typings.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.DataValues
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", "ENGINE")
  @js.native
  val ENGINE_ : Engine = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
  @js.native
  open class Engine protected ()
    extends StObject
       with TensorTracker
       with DataMover {
    def this(ENV: Environment) = this()
    
    var ENV: Environment = js.native
    
    /* private */ var addTapeNode: Any = js.native
    
    def backend: KernelBackend = js.native
    
    /* private */ var backendInstance: Any = js.native
    
    var backendName: String = js.native
    
    def backendNames(): js.Array[String] = js.native
    
    /* private */ var checkKernelForMemLeak: Any = js.native
    
    /**
      * This method is called instead of the public-facing tensor.clone() when
      * saving a tensor for backwards pass. It makes sure to add the clone
      * operation to the tape regardless of being called inside a kernel
      * execution.
      */
    /* private */ @JSName("clone")
    var clone_FEngine: Any = js.native
    
    def customGrad[T /* <: Tensor[Rank] */](f: CustomGradientFunc[T]): js.Function1[/* repeated */ Tensor[Rank] | GradSaveFunc, T] = js.native
    
    /* private */ var disposeRegisteredKernels: Any = js.native
    
    def disposeVariables(): Unit = js.native
    
    /**
      * End a scope. Use this with startScope() to achieve the same functionality
      * as scope() without the need for a function closure.
      */
    def endScope(): Unit = js.native
    def endScope(result: TensorContainer): Unit = js.native
    
    /* private */ var endTape: Any = js.native
    
    def findBackend(backendName: String): KernelBackend = js.native
    
    def findBackendFactory(backendName: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
    
    /* private */ var getSortedBackends: Any = js.native
    
    /**
      * Returns a list of tensors to save for a given gradient calculation.
      *
      * @param kernelName name of kernel to look up gradient for.
      * @param inputs a map of input tensors.
      * @param outputs an array of output tensors from forward mode of kernel.
      */
    /* private */ var getTensorsForGradient: Any = js.native
    
    /**
      * Returns gradients of `f` with respect to each of the `xs`. The gradients
      * returned are of the same length as `xs`, but some might be null if `f`
      * was not a function of that `x`. It also takes optional dy to multiply the
      * gradient, which defaults to `1`.
      */
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]]): GradsValue[T] = js.native
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T): GradsValue[T] = js.native
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T, allowNoGradients: Boolean): GradsValue[T] = js.native
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: Unit, allowNoGradients: Boolean): GradsValue[T] = js.native
    
    def incRef(a: Tensor[Rank], backend: KernelBackend): Unit = js.native
    
    /**
      * Initializes a backend by looking up the backend name in the factory
      * registry and calling the factory method. Returns a boolean representing
      * whether the initialization of the backend suceeded. Throws an error if
      * there is no backend in the factory registry.
      */
    /* private */ var initializeBackend: Any = js.native
    
    /* private */ var initializeBackendsAndReturnBest: Any = js.native
    
    def isTapeOn(): Boolean = js.native
    
    def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
    
    def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType, backend: KernelBackend): Tensor[Rank] = js.native
    
    /**
      * Internal method used by backends. Makes a new tensor
      * that is a wrapper around an existing data id. It doesn't create
      * a new data id, only increments the ref count used in memory tracking.
      * @deprecated
      */
    def makeTensorFromDataId(dataId: DataId, shape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
    def makeTensorFromDataId(dataId: DataId, shape: js.Array[Double], dtype: DataType, backend: KernelBackend): Tensor[Rank] = js.native
    
    /**
      * Internal method used by backends. Makes a new tensor that is a wrapper
      * around an existing data id in TensorInfo. It doesn't create a new data id,
      * only increments the ref count used in memory tracking.
      */
    def makeTensorFromTensorInfo(tensorInfo: TensorInfo): Tensor[Rank] = js.native
    def makeTensorFromTensorInfo(tensorInfo: TensorInfo, backend: KernelBackend): Tensor[Rank] = js.native
    
    def memory(): MemoryInfo = js.native
    
    /**
      * To be called by backends whenever they see a dataId that they don't own.
      * Upon calling this method, the mover will fetch the tensor from another
      * backend and register it with the current active backend.
      */
    /* CompleteClass */
    override def moveData(backend: KernelBackend, dataId: DataId): Unit = js.native
    
    /* private */ var nextTensorId: Any = js.native
    
    /* private */ var nextVariableId: Any = js.native
    
    /* private */ var pendingBackendInit: Any = js.native
    
    /* private */ var pendingBackendInitId: Any = js.native
    
    def profile(query: js.Function0[TensorContainer | js.Promise[TensorContainer]]): js.Promise[ProfileInfo] = js.native
    
    /* private */ var profiler: Any = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    def registerBackend(backendName: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = js.native
    def registerBackend(
      backendName: String,
      factory: js.Function0[KernelBackend | js.Promise[KernelBackend]],
      priority: Double
    ): Boolean = js.native
    
    def registeredVariables: NamedVariableMap = js.native
    
    var registry: StringDictionary[KernelBackend] = js.native
    
    var registryFactory: StringDictionary[Factory] = js.native
    
    def removeBackend(backendName: String): Unit = js.native
    
    def removeDataId(dataId: DataId, backend: KernelBackend): Unit = js.native
    
    /**
      * Resets the engine state. Removes all backends but does not remove
      * registered backend factories.
      */
    def reset(): Unit = js.native
    
    /**
      * Execute a kernel with the given name and return the output tensor.
      *
      * @param kernelName The name of the kernel to execute.
      * @param inputs A map of input names to tensors.
      * @param attrs A map of attribute names to their values. An attribute is a
      *     primitive (non-tensor) input to the kernel.
      * @param inputsToSave A list of tensors, inputs to save for the backprop
      *     computation.
      * @param outputsToSave A list of booleans, specifying which output to save
      *     for the backprop computation. These are booleans since the output
      * tensors are not visible to the user.
      */
    def runKernel[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */](kernelName: String, inputs: NamedTensorMap): T = js.native
    def runKernel[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */](kernelName: String, inputs: NamedTensorMap, attrs: NamedAttrMap): T = js.native
    
    /**
      * Internal helper method to execute a kernel Func
      *
      * Use `runKernel` to execute kernels from outside of engine.
      */
    /* private */ var runKernelFunc: Any = js.native
    
    /**
      * Saves tensors used in forward mode for use in backward mode.
      *
      * @param tensors the list of tensors to save.
      */
    /* private */ var saveTensorsForBackwardMode: Any = js.native
    
    /* private */ var scopedRun: Any = js.native
    
    def setBackend(backendName: String): js.Promise[Boolean] = js.native
    
    /* private */ var setupRegisteredKernels: Any = js.native
    
    /* private */ var shouldCheckForMemLeaks: Any = js.native
    
    /**
      * Start a scope. Use this with endScope() to achieve the same functionality
      * as scope() without the need for a function closure.
      */
    def startScope(): Unit = js.native
    def startScope(name: String): Unit = js.native
    
    /* private */ var startTape: Any = js.native
    
    var state: EngineState = js.native
    
    def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
    def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
    def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
    def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
    
    def time(query: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
    
    /**
      * Tracks a Tensor in the current scope to be automatically cleaned up
      * when the current scope ends, and returns the value.
      *
      * @param result The Tensor to track in the current scope.
      */
    /* private */ var track: Any = js.native
    
    def trackTensor(a: Tensor[Rank], backend: KernelBackend): Unit = js.native
  }
  /* static members */
  object Engine {
    
    @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine.nextTensorId")
    @js.native
    def nextTensorId: Any = js.native
    inline def nextTensorId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextTensorId")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine.nextVariableId")
    @js.native
    def nextVariableId: Any = js.native
    inline def nextVariableId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextVariableId")(x.asInstanceOf[js.Any])
  }
  
  inline def add(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def getOrMakeEngine(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrMakeEngine")().asInstanceOf[Engine]
  
  @js.native
  trait CustomGradientFunc[T /* <: Tensor[Rank] */] extends StObject {
    
    def apply(inputs: (Tensor[Rank] | GradSaveFunc)*): GradFunc[T] = js.native
  }
  
  trait EngineState extends StObject {
    
    var activeProfile: ProfileInfo
    
    var activeScope: ScopeState
    
    var activeTape: js.Array[TapeNode]
    
    def dispose(): Unit
    
    var gradientDepth: Double
    
    var kernelDepth: Double
    
    var nextScopeId: Double
    
    var nextTapeNodeId: Double
    
    var numBytes: Double
    
    var numDataBuffers: Double
    
    /**
      * Keeps track of the number of data moves during a kernel execution. We
      * maintain a stack since kernels can call other kernels, recursively.
      */
    var numDataMovesStack: js.Array[Double]
    
    var numStringTensors: Double
    
    var numTensors: Double
    
    var profiling: Boolean
    
    var registeredVariables: NamedVariableMap
    
    var scopeStack: js.Array[ScopeState]
    
    var tensorInfo: WeakMap[js.Object, Backend]
  }
  object EngineState {
    
    inline def apply(
      activeProfile: ProfileInfo,
      activeScope: ScopeState,
      activeTape: js.Array[TapeNode],
      dispose: () => Unit,
      gradientDepth: Double,
      kernelDepth: Double,
      nextScopeId: Double,
      nextTapeNodeId: Double,
      numBytes: Double,
      numDataBuffers: Double,
      numDataMovesStack: js.Array[Double],
      numStringTensors: Double,
      numTensors: Double,
      profiling: Boolean,
      registeredVariables: NamedVariableMap,
      scopeStack: js.Array[ScopeState],
      tensorInfo: WeakMap[js.Object, Backend]
    ): EngineState = {
      val __obj = js.Dynamic.literal(activeProfile = activeProfile.asInstanceOf[js.Any], activeScope = activeScope.asInstanceOf[js.Any], activeTape = activeTape.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gradientDepth = gradientDepth.asInstanceOf[js.Any], kernelDepth = kernelDepth.asInstanceOf[js.Any], nextScopeId = nextScopeId.asInstanceOf[js.Any], nextTapeNodeId = nextTapeNodeId.asInstanceOf[js.Any], numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numDataMovesStack = numDataMovesStack.asInstanceOf[js.Any], numStringTensors = numStringTensors.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], profiling = profiling.asInstanceOf[js.Any], registeredVariables = registeredVariables.asInstanceOf[js.Any], scopeStack = scopeStack.asInstanceOf[js.Any], tensorInfo = tensorInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineState]
    }
    
    extension [Self <: EngineState](x: Self) {
      
      inline def setActiveProfile(value: ProfileInfo): Self = StObject.set(x, "activeProfile", value.asInstanceOf[js.Any])
      
      inline def setActiveScope(value: ScopeState): Self = StObject.set(x, "activeScope", value.asInstanceOf[js.Any])
      
      inline def setActiveTape(value: js.Array[TapeNode]): Self = StObject.set(x, "activeTape", value.asInstanceOf[js.Any])
      
      inline def setActiveTapeVarargs(value: TapeNode*): Self = StObject.set(x, "activeTape", js.Array(value*))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGradientDepth(value: Double): Self = StObject.set(x, "gradientDepth", value.asInstanceOf[js.Any])
      
      inline def setKernelDepth(value: Double): Self = StObject.set(x, "kernelDepth", value.asInstanceOf[js.Any])
      
      inline def setNextScopeId(value: Double): Self = StObject.set(x, "nextScopeId", value.asInstanceOf[js.Any])
      
      inline def setNextTapeNodeId(value: Double): Self = StObject.set(x, "nextTapeNodeId", value.asInstanceOf[js.Any])
      
      inline def setNumBytes(value: Double): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
      
      inline def setNumDataBuffers(value: Double): Self = StObject.set(x, "numDataBuffers", value.asInstanceOf[js.Any])
      
      inline def setNumDataMovesStack(value: js.Array[Double]): Self = StObject.set(x, "numDataMovesStack", value.asInstanceOf[js.Any])
      
      inline def setNumDataMovesStackVarargs(value: Double*): Self = StObject.set(x, "numDataMovesStack", js.Array(value*))
      
      inline def setNumStringTensors(value: Double): Self = StObject.set(x, "numStringTensors", value.asInstanceOf[js.Any])
      
      inline def setNumTensors(value: Double): Self = StObject.set(x, "numTensors", value.asInstanceOf[js.Any])
      
      inline def setProfiling(value: Boolean): Self = StObject.set(x, "profiling", value.asInstanceOf[js.Any])
      
      inline def setRegisteredVariables(value: NamedVariableMap): Self = StObject.set(x, "registeredVariables", value.asInstanceOf[js.Any])
      
      inline def setScopeStack(value: js.Array[ScopeState]): Self = StObject.set(x, "scopeStack", value.asInstanceOf[js.Any])
      
      inline def setScopeStackVarargs(value: ScopeState*): Self = StObject.set(x, "scopeStack", js.Array(value*))
      
      inline def setTensorInfo(value: WeakMap[js.Object, Backend]): Self = StObject.set(x, "tensorInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type ForwardFunc[T] = js.Function2[/* backend */ KernelBackend, /* save */ js.UndefOr[GradSaveFunc], T]
  
  trait KernelInfo extends StObject {
    
    var bytesAdded: Double
    
    var extraInfo: String | js.Promise[String]
    
    var inputShapes: js.Array[js.Array[Double]]
    
    var kernelTimeMs: Double | Error | (js.Promise[Double | Error])
    
    var name: String
    
    var outputShapes: js.Array[js.Array[Double]]
    
    var tensorsAdded: Double
    
    var totalBytesSnapshot: Double
    
    var totalTensorsSnapshot: Double
  }
  object KernelInfo {
    
    inline def apply(
      bytesAdded: Double,
      extraInfo: String | js.Promise[String],
      inputShapes: js.Array[js.Array[Double]],
      kernelTimeMs: Double | Error | (js.Promise[Double | Error]),
      name: String,
      outputShapes: js.Array[js.Array[Double]],
      tensorsAdded: Double,
      totalBytesSnapshot: Double,
      totalTensorsSnapshot: Double
    ): KernelInfo = {
      val __obj = js.Dynamic.literal(bytesAdded = bytesAdded.asInstanceOf[js.Any], extraInfo = extraInfo.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], kernelTimeMs = kernelTimeMs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], tensorsAdded = tensorsAdded.asInstanceOf[js.Any], totalBytesSnapshot = totalBytesSnapshot.asInstanceOf[js.Any], totalTensorsSnapshot = totalTensorsSnapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelInfo]
    }
    
    extension [Self <: KernelInfo](x: Self) {
      
      inline def setBytesAdded(value: Double): Self = StObject.set(x, "bytesAdded", value.asInstanceOf[js.Any])
      
      inline def setExtraInfo(value: String | js.Promise[String]): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
      
      inline def setInputShapes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "inputShapes", value.asInstanceOf[js.Any])
      
      inline def setInputShapesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "inputShapes", js.Array(value*))
      
      inline def setKernelTimeMs(value: Double | Error | (js.Promise[Double | Error])): Self = StObject.set(x, "kernelTimeMs", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutputShapes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "outputShapes", value.asInstanceOf[js.Any])
      
      inline def setOutputShapesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "outputShapes", js.Array(value*))
      
      inline def setTensorsAdded(value: Double): Self = StObject.set(x, "tensorsAdded", value.asInstanceOf[js.Any])
      
      inline def setTotalBytesSnapshot(value: Double): Self = StObject.set(x, "totalBytesSnapshot", value.asInstanceOf[js.Any])
      
      inline def setTotalTensorsSnapshot(value: Double): Self = StObject.set(x, "totalTensorsSnapshot", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemoryInfo extends StObject {
    
    var numBytes: Double
    
    var numDataBuffers: Double
    
    var numTensors: Double
    
    var reasons: js.Array[String]
    
    var unreliable: js.UndefOr[Boolean] = js.undefined
  }
  object MemoryInfo {
    
    inline def apply(numBytes: Double, numDataBuffers: Double, numTensors: Double, reasons: js.Array[String]): MemoryInfo = {
      val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryInfo]
    }
    
    extension [Self <: MemoryInfo](x: Self) {
      
      inline def setNumBytes(value: Double): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
      
      inline def setNumDataBuffers(value: Double): Self = StObject.set(x, "numDataBuffers", value.asInstanceOf[js.Any])
      
      inline def setNumTensors(value: Double): Self = StObject.set(x, "numTensors", value.asInstanceOf[js.Any])
      
      inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value*))
      
      inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
      
      inline def setUnreliableUndefined: Self = StObject.set(x, "unreliable", js.undefined)
    }
  }
  
  trait ProfileInfo extends StObject {
    
    var kernelNames: js.Array[String]
    
    var kernels: js.Array[KernelInfo]
    
    var newBytes: Double
    
    var newTensors: Double
    
    var peakBytes: Double
    
    var result: TensorContainer
  }
  object ProfileInfo {
    
    inline def apply(
      kernelNames: js.Array[String],
      kernels: js.Array[KernelInfo],
      newBytes: Double,
      newTensors: Double,
      peakBytes: Double,
      result: TensorContainer
    ): ProfileInfo = {
      val __obj = js.Dynamic.literal(kernelNames = kernelNames.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any], newBytes = newBytes.asInstanceOf[js.Any], newTensors = newTensors.asInstanceOf[js.Any], peakBytes = peakBytes.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileInfo]
    }
    
    extension [Self <: ProfileInfo](x: Self) {
      
      inline def setKernelNames(value: js.Array[String]): Self = StObject.set(x, "kernelNames", value.asInstanceOf[js.Any])
      
      inline def setKernelNamesVarargs(value: String*): Self = StObject.set(x, "kernelNames", js.Array(value*))
      
      inline def setKernels(value: js.Array[KernelInfo]): Self = StObject.set(x, "kernels", value.asInstanceOf[js.Any])
      
      inline def setKernelsVarargs(value: KernelInfo*): Self = StObject.set(x, "kernels", js.Array(value*))
      
      inline def setNewBytes(value: Double): Self = StObject.set(x, "newBytes", value.asInstanceOf[js.Any])
      
      inline def setNewTensors(value: Double): Self = StObject.set(x, "newTensors", value.asInstanceOf[js.Any])
      
      inline def setPeakBytes(value: Double): Self = StObject.set(x, "peakBytes", value.asInstanceOf[js.Any])
      
      inline def setResult(value: TensorContainer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  type ScopeFn[T /* <: TensorContainer */] = js.Function0[T]
  
  trait ScopeState extends StObject {
    
    var id: Double
    
    var name: String
    
    var track: js.Array[Tensor[Rank]]
  }
  object ScopeState {
    
    inline def apply(id: Double, name: String, track: js.Array[Tensor[Rank]]): ScopeState = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopeState]
    }
    
    extension [Self <: ScopeState](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "track", js.Array(value*))
    }
  }
  
  trait TimingInfo
    extends StObject
       with BackendTimingInfo {
    
    var wallMs: Double
  }
  object TimingInfo {
    
    inline def apply(kernelMs: Double | Error, wallMs: Double): TimingInfo = {
      val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingInfo]
    }
    
    extension [Self <: TimingInfo](x: Self) {
      
      inline def setWallMs(value: Double): Self = StObject.set(x, "wallMs", value.asInstanceOf[js.Any])
    }
  }
}
