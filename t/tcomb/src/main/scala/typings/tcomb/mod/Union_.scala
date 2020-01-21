package typings.tcomb.mod

import typings.tcomb.AnonIdentityKindNameTypesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// union combinator
//
@js.native
trait Union_[T] extends Type[T] {
  @JSName("meta")
  var meta_Union_ : AnonIdentityKindNameTypesArray[T] = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
  def dispatch(x: js.Any): Constructor[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

