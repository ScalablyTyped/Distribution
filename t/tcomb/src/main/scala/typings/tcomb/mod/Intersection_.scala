package typings.tcomb.mod

import typings.tcomb.AnonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// intersection combinator
//
@js.native
trait Intersection_[T] extends Type[T] {
  @JSName("meta")
  var meta_Intersection_ : AnonTypes = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

