package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// refinement
//
@js.native
trait Refinement[T] extends Type[T] {
  @JSName("meta")
  var meta_Refinement: Anon_IdentityKindName[T] = js.native
  @JSName("update")
  var update_Original: Update[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

