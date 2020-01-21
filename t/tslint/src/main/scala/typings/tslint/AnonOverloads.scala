package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverloads extends js.Object {
  var overloads: AnonType
  var tags: AnonProperties
  var visibilities: AnonEnum
}

object AnonOverloads {
  @scala.inline
  def apply(overloads: AnonType, tags: AnonProperties, visibilities: AnonEnum): AnonOverloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOverloads]
  }
}

