package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseUtilityMod {
  
  @JSImport("twilio/lib/base/utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidPathParam(param: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPathParam")(param.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trim(str: String, c: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[String]
}
