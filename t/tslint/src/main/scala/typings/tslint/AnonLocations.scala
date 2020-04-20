package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocations extends js.Object {
  var locations: AnonEnum
  var privacies: AnonEnum
  var tags: AnonProperties
}

object AnonLocations {
  @scala.inline
  def apply(locations: AnonEnum, privacies: AnonEnum, tags: AnonProperties): AnonLocations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocations]
  }
}

