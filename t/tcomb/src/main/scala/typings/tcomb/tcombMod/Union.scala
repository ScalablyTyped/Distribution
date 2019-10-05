package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameTypesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// union combinator
//
@js.native
trait Union[T] extends Type[T] {
  @JSName("meta")
  var meta_Union: Anon_IdentityKindNameTypesArray[T] = js.native
  @JSName("update")
  var update_Original: Update[T] = js.native
  def dispatch(x: js.Any): Constructor[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

@JSImport("tcomb", "union")
@js.native
object union extends js.Object {
  def apply[T](types: js.Array[Constructor[T]]): Union[T] = js.native
  def apply[T](types: js.Array[Constructor[T]], name: String): Union[T] = js.native
}

