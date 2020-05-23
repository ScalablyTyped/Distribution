package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tags extends js.Object {
  var tags: Properties
  var visibilities: Enum
}

object Tags {
  @scala.inline
  def apply(tags: Properties, visibilities: Enum): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
}

