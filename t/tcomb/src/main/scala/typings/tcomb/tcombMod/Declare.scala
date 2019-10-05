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

@JSImport("tcomb", "declare")
@js.native
object declare extends js.Object {
  def apply[T](): Declare[T] = js.native
  def apply[T](name: String): Declare[T] = js.native
}

