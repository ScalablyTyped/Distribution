package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocationsOverloads extends js.Object {
  var locations: AnonEnum
  var overloads: AnonType
  var privacies: AnonEnum
  var tags: AnonProperties
}

object AnonLocationsOverloads {
  @scala.inline
  def apply(locations: AnonEnum, overloads: AnonType, privacies: AnonEnum, tags: AnonProperties): AnonLocationsOverloads = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocationsOverloads]
  }
}

