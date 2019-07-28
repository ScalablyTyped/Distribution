package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// declare combinator
//
@js.native
trait Declare[T] extends Type[T] {
  @JSName("update")
  var update_Original: Update[T] = js.native
  def define(`type`: Type[_]): Unit = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

