package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguage extends js.Object {
  var displayName: java.lang.String
  var languageTag: java.lang.String
  var nativeName: java.lang.String
  var script: java.lang.String
}

object ILanguage {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    languageTag: java.lang.String,
    nativeName: java.lang.String,
    script: java.lang.String
  ): ILanguage = {
    val __obj = js.Dynamic.literal(displayName = displayName, languageTag = languageTag, nativeName = nativeName, script = script)
  
    __obj.asInstanceOf[ILanguage]
  }
}

