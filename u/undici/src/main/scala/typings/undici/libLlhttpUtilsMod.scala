package typings.undici

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLlhttpUtilsMod {
  
  @JSImport("undici/lib/llhttp/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumToMap(obj: Any): IEnumMap = ^.asInstanceOf[js.Dynamic].applyDynamic("enumToMap")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumMap]
  
  type IEnumMap = StringDictionary[Double]
}
