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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "backend")
  @js.native
  def backend(): KernelBackend = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "deprecationWarn")
  @js.native
  def deprecationWarn(msg: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "disableDeprecationWarnings")
  @js.native
  def disableDeprecationWarnings(): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "dispose")
  @js.native
  def dispose(container: TensorContainer): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "disposeVariables")
  @js.native
  def disposeVariables(): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "enableDebugMode")
  @js.native
  def enableDebugMode(): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "enableProdMode")
  @js.native
  def enableProdMode(): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "engine")
  @js.native
  def engine(): Engine = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "findBackend")
  @js.native
  def findBackend(name: String): KernelBackend = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "findBackendFactory")
  @js.native
  def findBackendFactory(name: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "getBackend")
  @js.native
  def getBackend(): String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "keep")
  @js.native
  def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "memory")
  @js.native
  def memory(): MemoryInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "profile")
  @js.native
  def profile(f: js.Function0[TensorContainer | js.Promise[TensorContainer]]): js.Promise[ProfileInfo] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "ready")
  @js.native
  def ready(): js.Promise[Unit] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "registerBackend")
  @js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/globals", "registerBackend")
  @js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]], priority: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "removeBackend")
  @js.native
  def removeBackend(name: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "setBackend")
  @js.native
  def setBackend(backendName: String): js.Promise[Boolean] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "setPlatform")
  @js.native
  def setPlatform(platformName: String, platform: Platform): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "tidy")
  @js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/globals", "tidy")
  @js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/globals", "tidy")
  @js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/globals", "tidy")
  @js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/globals", "time")
  @js.native
  def time(f: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
}
