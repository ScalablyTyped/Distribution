package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.engineMod.Engine
import typings.tensorflowTfjsCore.engineMod.MemoryInfo
import typings.tensorflowTfjsCore.engineMod.ProfileInfo
import typings.tensorflowTfjsCore.engineMod.ScopeFn
import typings.tensorflowTfjsCore.engineMod.TimingInfo
import typings.tensorflowTfjsCore.platformMod.Platform
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def backend(): KernelBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("backend")().asInstanceOf[KernelBackend]
  
  @scala.inline
  def deprecationWarn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecationWarn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def disableDeprecationWarnings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDeprecationWarnings")().asInstanceOf[Unit]
  
  @scala.inline
  def dispose(container: TensorContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def disposeVariables(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeVariables")().asInstanceOf[Unit]
  
  @scala.inline
  def enableDebugMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebugMode")().asInstanceOf[Unit]
  
  @scala.inline
  def enableProdMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableProdMode")().asInstanceOf[Unit]
  
  @scala.inline
  def engine(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("engine")().asInstanceOf[Engine]
  
  @scala.inline
  def findBackend(name: String): KernelBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("findBackend")(name.asInstanceOf[js.Any]).asInstanceOf[KernelBackend]
  
  @scala.inline
  def findBackendFactory(name: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findBackendFactory")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function0[KernelBackend | js.Promise[KernelBackend]]]
  
  @scala.inline
  def getBackend(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackend")().asInstanceOf[String]
  
  @scala.inline
  def keep[T /* <: Tensor[Rank] */](result: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("keep")(result.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def memory(): MemoryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("memory")().asInstanceOf[MemoryInfo]
  
  @scala.inline
  def profile(f: js.Function0[TensorContainer | js.Promise[TensorContainer]]): js.Promise[ProfileInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileInfo]]
  
  @scala.inline
  def ready(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBackend")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]], priority: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBackend")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def removeBackend(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBackend")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setBackend(backendName: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackend")(backendName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def setPlatform(platformName: String, platform: Platform): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPlatform")(platformName.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def tidy[T /* <: TensorContainer */](nameOrFn: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def time(f: js.Function0[Unit]): js.Promise[TimingInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TimingInfo]]
}
