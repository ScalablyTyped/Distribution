package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// list
//
@js.native
trait List[T]
  extends Type[js.Array[T]] {
  @JSName("meta")
  var meta_List: Anon_IdentityKindNameType[T] = js.native
  @JSName("update")
  var update_Original: Update[js.Array[T]] = js.native
  def update(instance: js.Array[js.Array[T]], spec: UpdatePatch): js.Array[js.Array[T]] = js.native
}

@JSImport("tcomb", "list")
@js.native
object list extends js.Object {
  def apply[T](`type`: Constructor[T]): List[T] = js.native
  def apply[T](`type`: Constructor[T], name: String): List[T] = js.native
}

