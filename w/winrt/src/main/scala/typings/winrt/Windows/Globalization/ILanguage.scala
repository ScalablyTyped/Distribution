package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguage extends js.Object {
  var displayName: String
  var languageTag: String
  var nativeName: String
  var script: String
}

object ILanguage {
  @scala.inline
  def apply(displayName: String, languageTag: String, nativeName: String, script: String): ILanguage = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguage]
  }
}

