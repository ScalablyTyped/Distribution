package typings
package tcombLib.tcombMod

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
  var meta_List: tcombLib.Anon_Type[T] = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[js.Array[T]] = js.native
  def update(instance: js.Array[js.Array[T]], spec: tcombLib.UpdatePatch): js.Array[js.Array[T]] = js.native
}

