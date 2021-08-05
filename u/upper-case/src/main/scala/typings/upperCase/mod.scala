package typings.upperCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("upper-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def localeUpperCase(str: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localeUpperCase")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def upperCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
