package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// maybe combinator
//
@js.native
trait Maybe[T] extends Type[Unit | T] {
  @JSName("meta")
  var meta_Maybe: Anon_IdentityKindNameType[T] = js.native
  @JSName("update")
  var update_Original: Update[Unit | T] = js.native
  def update(instance: Unit | T, spec: UpdatePatch): Unit | T = js.native
  def update(instance: Unit, spec: UpdatePatch): Unit | T = js.native
}

