package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
@js.native
class Engine protected ()
  extends TensorManager
     with atTensorflowTfjsDashCoreLib.distTensorMod.TensorTracker
     with atTensorflowTfjsDashCoreLib.distBackendsBackendMod.DataMover {
  def this(ENV: atTensorflowTfjsDashCoreLib.distEnvironmentMod.Environment) = this()
  var ENV: atTensorflowTfjsDashCoreLib.distEnvironmentMod.Environment = js.native
  var addTapeNode: js.Any = js.native
  val backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend = js.native
  var backendInstance: js.Any = js.native
  var backendName: java.lang.String = js.native
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
  val registeredVariables: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedVariableMap = js.native
  var registry: org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend] = js.native
  var registryFactory: org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashCoreLib.Anon_Factory] = js.native
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
  def backendNames(): js.Array[java.lang.String] = js.native
  def customGrad[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](f: CustomGradientFunc[T]): js.Function1[
    /* repeated */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.GradSaveFunc, 
    T
  ] = js.native
  /* InferMemberOverrides */
  override def disposeTensor(a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def disposeVariables(): scala.Unit = js.native
  /**
    * End a scope. Use this with startScope() to achieve the same functionality
    * as scope() without the need for a function closure.
    */
  def endScope(): scala.Unit = js.native
  def endScope(result: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer): scala.Unit = js.native
  def findBackend(backendName: java.lang.String): atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend = js.native
  def findBackendFactory(backendName: java.lang.String): js.Function0[
    atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
  ] = js.native
  def fromPixels(pixels: atTensorflowTfjsDashCoreLib.distTypesMod.PixelData, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.HTMLCanvasElement, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.HTMLImageElement, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.HTMLVideoElement, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.ImageData, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  /**
    * Returns gradients of `f` with respect to each of the `xs`. The gradients
    * returned are of the same length as `xs`, but some might be null if `f`
    * was not a function of that `x`. It also takes optional dy to multiply the
    * gradient, which defaults to `1`.
    */
  def gradients[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    f: js.Function0[T],
    xs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.Anon_Grads[T] = js.native
  def gradients[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    f: js.Function0[T],
    xs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    dy: T
  ): atTensorflowTfjsDashCoreLib.Anon_Grads[T] = js.native
  def gradients[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    f: js.Function0[T],
    xs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    dy: T,
    allowNoGradients: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.Anon_Grads[T] = js.native
  def isTapeOn(): scala.Boolean = js.native
  def keep[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](result: T): T = js.native
  /**
    * To be called by backends whenever they see a dataId that they don't own.
    * Upon calling this method, the mover will fetch the tensor from another
    * backend and register it with the current active backend.
    */
  /* CompleteClass */
  override def moveData(
    backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend,
    dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId
  ): scala.Unit = js.native
  def profile(query: js.Function0[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer]): js.Promise[ProfileInfo] = js.native
  def ready(): js.Promise[scala.Unit] = js.native
  def registerBackend(
    backendName: java.lang.String,
    factory: js.Function0[
      atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
    ]
  ): scala.Boolean = js.native
  def registerBackend(
    backendName: java.lang.String,
    factory: js.Function0[
      atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
    ],
    priority: scala.Double
  ): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def registerTensor(a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def registerTensor(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  def registerTensor(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def registerVariable(
    v: atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  def removeBackend(backendName: java.lang.String): scala.Unit = js.native
  /**
    * Resets the engine state. Removes all backends but does not remove
    * registered backend factories.
    */
  def reset(): scala.Unit = js.native
  def runKernel[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) */, I /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap */](forwardFunc: ForwardFunc[T], inputs: I): T = js.native
  def runKernel[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) */, I /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap */](
    forwardFunc: ForwardFunc[T],
    inputs: I,
    backwardsFunc: js.Function2[
      /* dy */ T, 
      /* saved */ js.Array[
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ], 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof I ]: (): I[P]}
    */ atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.Engine with I
    ]
  ): T = js.native
  def setBackend(backendName: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Start a scope. Use this with endScope() to achieve the same functionality
    * as scope() without the need for a function closure.
    */
  def startScope(): scala.Unit = js.native
  def startScope(name: java.lang.String): scala.Unit = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: java.lang.String): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: java.lang.String, fn: ScopeFn[T]): T = js.native
  def time(query: js.Function0[scala.Unit]): js.Promise[TimingInfo] = js.native
  def write(
    destBackend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend,
    dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId,
    values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues
  ): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
@js.native
object Engine extends js.Object {
  var nextTensorId: js.Any = js.native
  var nextVariableId: js.Any = js.native
}

