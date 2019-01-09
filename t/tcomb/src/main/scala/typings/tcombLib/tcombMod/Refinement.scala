package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// refinement
//
@js.native
trait Refinement[T] extends Type[T] {
  @JSName("meta")
  var meta_Refinement: tcombLib.Anon_IdentityKindName[T] = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[T] = js.native
  def update(instance: T, spec: tcombLib.UpdatePatch): T = js.native
}

