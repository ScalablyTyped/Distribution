package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivacies extends js.Object {
  var locations: AnonEnum
  var overloads: AnonType
  var privacies: AnonEnum
  var tags: AnonProperties
}

object AnonPrivacies {
  @scala.inline
  def apply(locations: AnonEnum, overloads: AnonType, privacies: AnonEnum, tags: AnonProperties): AnonPrivacies = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivacies]
  }
}

