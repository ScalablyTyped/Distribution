package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locations extends js.Object {
  var locations: Enum
  var privacies: Enum
  var tags: Properties
}

object Locations {
  @scala.inline
  def apply(locations: Enum, privacies: Enum, tags: Properties): Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locations]
  }
}

