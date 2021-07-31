package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object escapeMod {
  
  @JSImport("xmlcreate/lib/escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escapeAmpersands(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAmpersands")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeDoubleQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeDoubleQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeLeftAngleBrackets(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeLeftAngleBrackets")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeRightAngleBracketsInCdataTerminator(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRightAngleBracketsInCdataTerminator")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeSingleQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeSingleQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
