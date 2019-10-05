package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// intersection combinator
//
@js.native
trait Intersection[T] extends Type[T] {
  @JSName("meta")
  var meta_Intersection: Anon_IdentityKindNameTypes = js.native
  @JSName("update")
  var update_Original: Update[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

@JSImport("tcomb", "intersection")
@js.native
object intersection extends js.Object {
  def apply[T](types: js.Array[Constructor[_]]): Intersection[T] = js.native
  def apply[T](types: js.Array[Constructor[_]], name: String): Intersection[T] = js.native
}

