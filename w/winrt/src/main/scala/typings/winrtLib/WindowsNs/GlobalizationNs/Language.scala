package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Language")
@js.native
class Language protected () extends ILanguage {
  def this(languageTag: java.lang.String) = this()
  /* CompleteClass */
  override var displayName: java.lang.String = js.native
  /* CompleteClass */
  override var languageTag: java.lang.String = js.native
  /* CompleteClass */
  override var nativeName: java.lang.String = js.native
  /* CompleteClass */
  override var script: java.lang.String = js.native
}

@JSGlobal("Windows.Globalization.Language")
@js.native
object Language extends js.Object {
  var currentInputMethodLanguageTag: java.lang.String = js.native
  def isWellFormed(languageTag: java.lang.String): scala.Boolean = js.native
}

