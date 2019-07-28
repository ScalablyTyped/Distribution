package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// tuple combinator
//
@js.native
trait Tuple[T] extends Type[T] {
  @JSName("meta")
  var meta_Tuple: Anon_IdentityKindNameTypes = js.native
  @JSName("update")
  var update_Original: Update[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

