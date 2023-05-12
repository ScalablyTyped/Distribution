package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStaticRegexReplaceMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StaticRegexReplace", "staticRegexReplaceConfig")
  @js.native
  val staticRegexReplaceConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StaticRegexReplace", "staticRegexReplaceImpl")
  @js.native
  val staticRegexReplaceImpl: SimpleUnaryImpl[String, String] = js.native
}
