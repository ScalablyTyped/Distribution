package typings.tstl.mapContainerMod.MapContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorBase[Key, T] extends js.Object {
  
  /**
    * The first, key element.
    */
  val first: Key = js.native
  
  /**
    * The second, stored element.
    */
  var second: T = js.native
}
object IteratorBase {
  
  @scala.inline
  def apply[Key, T](first: Key, second: T): IteratorBase[Key, T] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorBase[Key, T]]
  }
  
  @scala.inline
  implicit class IteratorBaseOps[Self <: IteratorBase[_, _], Key, T] (val x: Self with (IteratorBase[Key, T])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: Key): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: T): Self = this.set("second", value.asInstanceOf[js.Any])
  }
}
