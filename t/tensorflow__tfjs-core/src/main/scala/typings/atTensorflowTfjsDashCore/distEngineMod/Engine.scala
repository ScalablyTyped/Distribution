package typings.atTensorflowTfjsDashCore.distEngineMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.Anon_Factory
import typings.atTensorflowTfjsDashCore.Anon_Grads
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment
import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.TensorTracker
import typings.atTensorflowTfjsDashCore.distTensorMod.Variable
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.GradSaveFunc
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedVariableMap
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.PixelData
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
@js.native
class Engine protected ()
  extends TensorManager
     with TensorTracker
     with DataMover {
  def this(ENV: Environment) = this()
  var ENV: Environment = js.native
  var addTapeNode: js.Any = js.native
  val backend: KernelBackend = js.native
  var backendInstance: js.Any = js.native
  var backendName: String = js.native
  /**
    * This method is called instead of the public-facing tensor.clone() when
    * saving a tensor for backwards pass. It makes sure to add the clone
    * operation to the tape regardless of being called inside a kernel
    * execution.
    */
  @JSName("clone")
  var clone_FEngine: js.Any = js.native
  var endTape: js.Any = js.native
  var getSortedBackends: js.Any = js.native
  /**
    * Initializes a backend by looking up the backend name in the factory
    * registry and calling the factory method. Returns a boolean representing
    * whether the initialization of the backend suceeded. Throws an error if
    * there is no backend in the factory registry.
    */
  var initializeBackend: js.Any = js.native
  var initializeBackendsAndReturnBest: js.Any = js.native
  var pendingBackendInit: js.Any = js.native
  var pendingBackendInitId: js.Any = js.native
  var profiler: js.Any = js.native
  val registeredVariables: NamedVariableMap = js.native
  var registry: StringDictionary[KernelBackend] = js.native
  var registryFactory: StringDictionary[Anon_Factory] = js.native
  var scopedRun: js.Any = js.native
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
  /* InferMemberOverrides */
  override def disposeTensor(a: Tensor[Rank]): Unit = js.native
  def disposeVariables(): Unit = js.native
  /**
    * End a scope. Use this with startScope() to achieve the same functionality
    * as scope() without the need for a function closure.
    */
  def endScope(): Unit = js.native
  def endScope(result: TensorContainer): Unit = js.native
  def findBackend(backendName: String): KernelBackend = js.native
  def findBackendFactory(backendName: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
  def fromPixels(pixels: PixelData, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLCanvasElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLImageElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLVideoElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: ImageData, numChannels: Double): Tensor3D = js.native
  /**
    * Returns gradients of `f` with respect to each of the `xs`. The gradients
    * returned are of the same length as `xs`, but some might be null if `f`
    * was not a function of that `x`. It also takes optional dy to multiply the
    * gradient, which defaults to `1`.
    */
  def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]]): Anon_Grads[T] = js.native
  def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T): Anon_Grads[T] = js.native
  def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T, allowNoGradients: Boolean): Anon_Grads[T] = js.native
  def isTapeOn(): Boolean = js.native
  def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
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
  /* InferMemberOverrides */
  override def registerTensor(a: Tensor[Rank]): Unit = js.native
  def registerTensor(a: Variable[Rank]): Unit = js.native
  def registerTensor(a: Variable[Rank], backend: KernelBackend): Unit = js.native
  /* InferMemberOverrides */
  override def registerVariable(v: Variable[Rank]): Unit = js.native
  def removeBackend(backendName: String): Unit = js.native
  /**
    * Resets the engine state. Removes all backends but does not remove
    * registered backend factories.
    */
  def reset(): Unit = js.native
  def runKernel[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](forwardFunc: ForwardFunc[T], inputs: I): T = js.native
  def runKernel[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[Tensor[Rank]], 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.Engine with I
    ]
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
  def write(destBackend: KernelBackend, dataId: DataId, values: BackendValues): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
@js.native
object Engine extends js.Object {
  var nextTensorId: js.Any = js.native
  var nextVariableId: js.Any = js.native
}

