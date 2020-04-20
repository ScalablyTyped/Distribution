package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTags extends js.Object {
  var tags: AnonProperties
  var visibilities: AnonEnum
}

object AnonTags {
  @scala.inline
  def apply(tags: AnonProperties, visibilities: AnonEnum): AnonTags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTags]
  }
}

