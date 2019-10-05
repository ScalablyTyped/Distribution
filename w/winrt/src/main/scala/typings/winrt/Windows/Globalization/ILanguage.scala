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
    val __obj = js.Dynamic.literal(displayName = displayName, languageTag = languageTag, nativeName = nativeName, script = script)
  
    __obj.asInstanceOf[ILanguage]
  }
}

