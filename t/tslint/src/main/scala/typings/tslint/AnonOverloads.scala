package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverloads extends js.Object {
  var overloads: AnonType
  var privacies: AnonEnum
  var tags: AnonProperties
}

object AnonOverloads {
  @scala.inline
  def apply(overloads: AnonType, privacies: AnonEnum, tags: AnonProperties): AnonOverloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverloads]
  }
}

