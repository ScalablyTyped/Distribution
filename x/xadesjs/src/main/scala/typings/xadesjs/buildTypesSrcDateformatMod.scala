package typings.xadesjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcDateformatMod {
  
  @JSImport("xadesjs/build/types/src/dateformat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateFormat(date: Any, mask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateFormat(date: Any, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateFormat(date: Any, mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateFormat(date: Any, mask: String, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
}
