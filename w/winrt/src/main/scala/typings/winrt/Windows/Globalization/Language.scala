package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Language")
@js.native
class Language protected () extends ILanguage {
  def this(languageTag: String) = this()
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var languageTag: String = js.native
  /* CompleteClass */
  override var nativeName: String = js.native
  /* CompleteClass */
  override var script: String = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.Language")
@js.native
object Language extends js.Object {
  var currentInputMethodLanguageTag: String = js.native
  def isWellFormed(languageTag: String): Boolean = js.native
}

