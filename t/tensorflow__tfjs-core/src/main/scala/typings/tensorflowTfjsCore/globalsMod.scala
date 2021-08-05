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
  
  inline def backend(): KernelBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("backend")().asInstanceOf[KernelBackend]
  
  inline def deprecationWarn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecationWarn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disableDeprecationWarnings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDeprecationWarnings")().asInstanceOf[Unit]
  
  inline def dispose(container: TensorContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disposeVariables(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeVariables")().asInstanceOf[Unit]
  
  inline def enableDebugMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebugMode")().asInstanceOf[Unit]
  
  inline def enableProdMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableProdMode")().asInstanceOf[Unit]
  
  inline def engine(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("engine")().asInstanceOf[Engine]
  
  inline def findBackend(name: String): KernelBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("findBackend")(name.asInstanceOf[js.Any]).asInstanceOf[KernelBackend]
  
  inline def findBackendFactory(name: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findBackendFactory")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function0[KernelBackend | js.Promise[KernelBackend]]]
  
  inline def getBackend(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackend")().asInstanceOf[String]
  
  inline def keep[T /* <: Tensor[Rank] */](result: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("keep")(result.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def memory(): MemoryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("memory")().asInstanceOf[MemoryInfo]
  
  inline def profile(f: js.Function0[TensorContainer | js.Promise[TensorContainer]]): js.Promise[ProfileInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileInfo]]
  
  inline def ready(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[Unit]]
  
  inline def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBackend")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]], priority: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBackend")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeBackend(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBackend")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setBackend(backendName: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackend")(backendName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def setPlatform(platformName: String, platform: Platform): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPlatform")(platformName.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tidy[T /* <: TensorContainer */](nameOrFn: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tidy")(nameOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def time(f: js.Function0[Unit]): js.Promise[TimingInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TimingInfo]]
}
