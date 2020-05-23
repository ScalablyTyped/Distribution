package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesPrivacies extends js.Object {
  var properties: Privacies
  var `type`: String
}

object PropertiesPrivacies {
  @scala.inline
  def apply(properties: Privacies, `type`: String): PropertiesPrivacies = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesPrivacies]
  }
}

