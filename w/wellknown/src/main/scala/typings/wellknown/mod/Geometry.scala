package typings.wellknown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry[T, C] extends js.Object {
  var coordinates: C
  var `type`: T
}

object Geometry {
  @scala.inline
  def apply[T, C](coordinates: C, `type`: T): Geometry[T, C] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry[T, C]]
  }
}

