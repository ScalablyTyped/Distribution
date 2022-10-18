package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEscapeMod {
  
  @JSImport("xmlcreate/lib/escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeAmpersands(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAmpersands")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeDoubleQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeDoubleQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeLeftAngleBrackets(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeLeftAngleBrackets")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeRightAngleBracketsInCdataTerminator(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRightAngleBracketsInCdataTerminator")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeSingleQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeSingleQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
