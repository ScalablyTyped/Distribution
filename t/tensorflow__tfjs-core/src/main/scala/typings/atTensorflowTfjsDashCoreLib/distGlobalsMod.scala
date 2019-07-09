package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/globals", JSImport.Namespace)
@js.native
object distGlobalsMod extends js.Object {
  def backend(): atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend = js.native
  def deprecationWarn(msg: java.lang.String): scala.Unit = js.native
  def disableDeprecationWarnings(): scala.Unit = js.native
  def dispose(container: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer): scala.Unit = js.native
  def disposeVariables(): scala.Unit = js.native
  def enableDebugMode(): scala.Unit = js.native
  def enableProdMode(): scala.Unit = js.native
  def findBackend(name: java.lang.String): atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend = js.native
  def findBackendFactory(name: java.lang.String): js.Function0[
    atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
  ] = js.native
  def getBackend(): java.lang.String = js.native
  def keep[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](result: T): T = js.native
  def memory(): atTensorflowTfjsDashCoreLib.distEngineMod.MemoryInfo = js.native
  def profile(f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer]): js.Promise[atTensorflowTfjsDashCoreLib.distEngineMod.ProfileInfo] = js.native
  def ready(): js.Promise[scala.Unit] = js.native
  def registerBackend(
    name: java.lang.String,
    factory: js.Function0[
      atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
    ]
  ): scala.Boolean = js.native
  def registerBackend(
    name: java.lang.String,
    factory: js.Function0[
      atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
    ],
    priority: scala.Double
  ): scala.Boolean = js.native
  def removeBackend(name: java.lang.String): scala.Unit = js.native
  def setBackend(backendName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setPlatform(
    platformName: java.lang.String,
    platform: atTensorflowTfjsDashCoreLib.distPlatformsPlatformMod.Platform
  ): scala.Unit = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T]): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](
    nameOrFn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T],
    fn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T]
  ): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: java.lang.String): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: java.lang.String, fn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T]): T = js.native
  def time(f: js.Function0[scala.Unit]): js.Promise[atTensorflowTfjsDashCoreLib.distEngineMod.TimingInfo] = js.native
}

