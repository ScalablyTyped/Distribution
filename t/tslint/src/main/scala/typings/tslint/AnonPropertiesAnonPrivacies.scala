package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesAnonPrivacies extends js.Object {
  var properties: AnonPrivacies
  var `type`: String
}

object AnonPropertiesAnonPrivacies {
  @scala.inline
  def apply(properties: AnonPrivacies, `type`: String): AnonPropertiesAnonPrivacies = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesAnonPrivacies]
  }
}

