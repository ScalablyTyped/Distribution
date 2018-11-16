package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// intersection combinator
//
@js.native
trait Intersection[T] extends Type[T] {
  @JSName("meta")
  var meta_Intersection: tcombLib.Anon_KindIdentity = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[T] = js.native
  def update(instance: T, spec: tcombLib.UpdatePatch): T = js.native
}

