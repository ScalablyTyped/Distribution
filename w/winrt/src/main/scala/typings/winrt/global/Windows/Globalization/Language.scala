package typings.winrt.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Globalization.Language")
@js.native
class Language protected ()
  extends typings.winrt.Windows.Globalization.Language {
  def this(languageTag: String) = this()
}
/* static members */
@JSGlobal("Windows.Globalization.Language")
@js.native
object Language extends js.Object {
  
  var currentInputMethodLanguageTag: String = js.native
  
  def isWellFormed(languageTag: String): Boolean = js.native
}
