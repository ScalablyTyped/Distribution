package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVisibilities extends js.Object {
  var overloads: AnonType
  var tags: AnonProperties
  var visibilities: AnonEnum
}

object AnonVisibilities {
  @scala.inline
  def apply(overloads: AnonType, tags: AnonProperties, visibilities: AnonEnum): AnonVisibilities = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVisibilities]
  }
}

