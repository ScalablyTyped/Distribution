package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// list
//
@js.native
trait List_[T]
  extends Type[js.Array[T]] {
  
  @JSName("meta")
  var meta_List_ : typings.tcomb.anon.Type[T] = js.native
  
  def update(instance: js.Array[T], spec: UpdatePatch): js.Array[T] = js.native
  @JSName("update")
  var update_Original: Update_[js.Array[T]] = js.native
}
