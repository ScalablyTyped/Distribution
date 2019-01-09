package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// tuple combinator
//
@js.native
trait Tuple[T] extends Type[T] {
  @JSName("meta")
  var meta_Tuple: tcombLib.Anon_IdentityKindNameTypes = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[T] = js.native
  def update(instance: T, spec: tcombLib.UpdatePatch): T = js.native
}

