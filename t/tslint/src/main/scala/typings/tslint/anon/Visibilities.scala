package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visibilities extends js.Object {
  var overloads: Type
  var tags: Properties
  var visibilities: Enum
}

object Visibilities {
  @scala.inline
  def apply(overloads: Type, tags: Properties, visibilities: Enum): Visibilities = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibilities]
  }
}

