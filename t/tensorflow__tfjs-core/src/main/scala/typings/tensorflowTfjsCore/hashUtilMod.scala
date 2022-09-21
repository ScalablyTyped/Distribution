package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/hash_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fingerPrint64(s: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fingerPrint64")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fingerPrint64(s: js.typedarray.Uint8Array, len: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fingerPrint64")(s.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hexToLong(hex: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToLong")(hex.asInstanceOf[js.Any]).asInstanceOf[Any]
}
