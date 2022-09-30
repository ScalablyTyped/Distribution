package typings.uint8arrayTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uint8array-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(v1: js.typedarray.Uint8Array, v2: js.typedarray.Uint8Array): CompareResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[CompareResult]
  
  inline def fromHex(hexString: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toHex(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.uint8arrayTools.uint8arrayToolsInts.`-1`
    - typings.uint8arrayTools.uint8arrayToolsInts.`0`
    - typings.uint8arrayTools.uint8arrayToolsInts.`1`
  */
  trait CompareResult extends StObject
  object CompareResult {
    
    inline def `-1`: typings.uint8arrayTools.uint8arrayToolsInts.`-1` = -1.asInstanceOf[typings.uint8arrayTools.uint8arrayToolsInts.`-1`]
    
    inline def `0`: typings.uint8arrayTools.uint8arrayToolsInts.`0` = 0.asInstanceOf[typings.uint8arrayTools.uint8arrayToolsInts.`0`]
    
    inline def `1`: typings.uint8arrayTools.uint8arrayToolsInts.`1` = 1.asInstanceOf[typings.uint8arrayTools.uint8arrayToolsInts.`1`]
  }
}
