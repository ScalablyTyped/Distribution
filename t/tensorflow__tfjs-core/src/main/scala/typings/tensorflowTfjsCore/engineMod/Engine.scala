package typings.tensorflowTfjsCore.engineMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.AnonFactory
import typings.tensorflowTfjsCore.AnonGrads
import typings.tensorflowTfjsCore.backendMod.DataMover
import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.DataValues
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.environmentMod.Environment
import typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.tensorMod.DataId
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.TensorTracker
import typings.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorTypesMod.NamedVariableMap
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
@js.native
class Engine protected ()
  extends TensorTracker
     with DataMover {
  def this(ENV: Environment) = this()
  var ENV: Environment = js.native
  var addTapeNode: js.Any = js.native
  val backend: KernelBackend = js.native
  var backendInstance: js.Any = js.native
  var backendName: String = js.native
  var checkKernelForMemLeak: js.Any = js.native
  /**
    * This method is called instead of the public-facing tensor.clone() when
    * saving a tensor for backwards pass. It makes sure to add the clone
    * operation to the tape regardless of being called inside a kernel
    * execution.
    *
    * This method will go away once all kernels are modularized since we won't
    * need to turn off the tape inside runKernel().
    */
  @JSName("clone")
  var clone_FEngine: js.Any = js.native
  var disposeRegisteredKernels: js.Any = js.native
  var endTape: js.Any = js.native
  var getSortedBackends: js.Any = js.native
  /**
    * Returns a list of tensors to save for a given gradient calculation.
    *
    * Returns undefined if their is no registered gradient for this kernel in the
    * gradient registry.
    *
    * @param kernelName name of kernel to look up gradient for.
    * @param inputs a map of input tensors.
    * @param outputs an array of output tensors from forward mode of kernel.
    */
  var getTensorsForGradient: js.Any = js.native
  /**
    * Initializes a backend by looking up the backend name in the factory
    * registry and calling the factory method. Returns a boolean representing
    * whether the initialization of the backend suceeded. Throws an error if
    * there is no backend in the factory registry.
    */
  var initializeBackend: js.Any = js.native
  var initializeBackendsAndReturnBest: js.Any = js.native
  var nextTensorId: js.Any = js.native
  var nextVariableId: js.Any = js.native
  var pendingBackendInit: js.Any = js.native
  var pendingBackendInitId: js.Any = js.native
  var profiler: js.Any = js.native
  val registeredVariables: NamedVariableMap = js.native
  var registry: StringDictionary[KernelBackend] = js.native
  var registryFactory: StringDictionary[AnonFactory] = js.native
  /**
    * Saves tensors used in forward mode for use in backward mode.
    *
    * @param tensors the list of tensors to save.
    */
  var saveTensorsForBackwardMode: js.Any = js.native
  var scopedRun: js.Any = js.native
  var setupRegisteredKernels: js.Any = js.native
  var shouldCheckForMemLeaks: js.Any = js.native
  var startTape: js.Any = js.native
  var state: EngineState = js.native
  /**
    * Tracks a Tensor in the current scope to be automatically cleaned up
    * when the current scope ends, and returns the value.
    *
    * @param result The Tensor to track in the current scope.
    */
  var track: js.Any = js.native
  def backendNames(): js.Array[String] = js.native
  def customGrad[T /* <: Tensor[Rank] */](f: CustomGradientFunc[T]): js.Function1[/* repeated */ Tensor[Rank] | GradSaveFunc, T] = js.native
  def disposeVariables(): Unit = js.native
  /**
    * End a scope. Use this with startScope() to achieve the same functionality
    * as scope() without the need for a function closure.
    */
  def endScope(): Unit = js.native
  def endScope(result: TensorContainer): Unit = js.native
  def findBackend(backendName: String): KernelBackend = js.native
  def findBackendFactory(backendName: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
  /**
    * Returns gradients of `f` with respect to each of the `xs`. The gradients
    * returned are of the same length as `xs`, but some might be null if `f`
    * was not a function of that `x`. It also takes optional dy to multiply the
    * gradient, which defaults to `1`.
    */
  def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]]): AnonGrads[T] = js.native
  def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T): AnonGrads[T] = js.native
  def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T, allowNoGradients: Boolean): AnonGrads[T] = js.native
  def incRef(a: Tensor[Rank], backend: KernelBackend): Unit = js.native
  def isTapeOn(): Boolean = js.native
  def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
  def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType, backend: KernelBackend): Tensor[Rank] = js.native
  /**
    * Internal method used by backends. Makes a new tensor
    * that is a wrapper around an existing data id. It doesn't create
    * a new data id, only increments the ref count used in memory tracking.
    */
  def makeTensorFromDataId(dataId: DataId, shape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
  def makeTensorFromDataId(dataId: DataId, shape: js.Array[Double], dtype: DataType, backend: KernelBackend): Tensor[Rank] = js.native
  def memory(): MemoryInfo = js.native
  /**
    * To be called by backends whenever they see a dataId that they don't own.
    * Upon calling this method, the mover will fetch the tensor from another
    * backend and register it with the current active backend.
    */
  /* CompleteClass */
  override def moveData(backend: KernelBackend, dataId: DataId): Unit = js.native
  def profile(query: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
  def ready(): js.Promise[Unit] = js.native
  def registerBackend(backendName: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = js.native
  def registerBackend(
    backendName: String,
    factory: js.Function0[KernelBackend | js.Promise[KernelBackend]],
    priority: Double
  ): Boolean = js.native
  def removeBackend(backendName: String): Unit = js.native
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
  def runKernel(kernelName: String, inputs: NamedTensorMap, attrs: NamedAttrMap): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def runKernel(
    kernelName: String,
    inputs: NamedTensorMap,
    attrs: NamedAttrMap,
    inputsToSave: js.Array[Tensor[Rank]]
  ): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def runKernel(
    kernelName: String,
    inputs: NamedTensorMap,
    attrs: NamedAttrMap,
    inputsToSave: js.Array[Tensor[Rank]],
    outputsToSave: js.Array[Boolean]
  ): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * @deprecated Use `runKernel` for newly added kernels. Keep using this method
    *     only for kernels that are not yet fully modularized.
    */
  def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](forwardFunc: ForwardFunc[T], inputs: I): T = js.native
  def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[Tensor[Rank]], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
    ]
  ): T = js.native
  def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[Tensor[Rank]], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
    ],
    kernelName: String
  ): T = js.native
  def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[Tensor[Rank]], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
    ],
    kernelName: String,
    attrs: NamedAttrMap
  ): T = js.native
  def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[Tensor[Rank]], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
    ],
    kernelName: String,
    attrs: NamedAttrMap,
    inputsToSave: js.Array[Tensor[Rank]]
  ): T = js.native
  def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[Tensor[Rank]], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
    ],
    kernelName: String,
    attrs: NamedAttrMap,
    inputsToSave: js.Array[Tensor[Rank]],
    outputsToSave: js.Array[Boolean]
  ): T = js.native
  def setBackend(backendName: String): js.Promise[Boolean] = js.native
  /**
    * Start a scope. Use this with endScope() to achieve the same functionality
    * as scope() without the need for a function closure.
    */
  def startScope(): Unit = js.native
  def startScope(name: String): Unit = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
  def time(query: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
@js.native
object Engine extends js.Object {
  var nextTensorId: js.Any = js.native
  var nextVariableId: js.Any = js.native
}

