package typings
package tcombLib.tcombMod

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
  def define(`type`: Type[_]): scala.Unit = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

