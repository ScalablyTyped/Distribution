package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// maybe combinator
//
@js.native
trait Maybe[T]
  extends Type[scala.Unit | T] {
  @JSName("meta")
  var meta_Maybe: tcombLib.Anon_IdentityKindNameType[T] = js.native
  @JSName("update")
  var update_Original: Update[scala.Unit | T] = js.native
  def update(instance: scala.Unit | T, spec: UpdatePatch): scala.Unit | T = js.native
  def update(instance: scala.Unit, spec: UpdatePatch): scala.Unit | T = js.native
}

