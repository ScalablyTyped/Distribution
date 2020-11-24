package typings.writableConsumableStream.consumerMod

import typings.writableConsumableStream.anon.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node[T] extends js.Object {
  
  var data: Done[T] = js.native
  
  var next: Node[T] | Null = js.native
}
object Node {
  
  @scala.inline
  def apply[T](data: Done[T]): Node[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node[_], T] (val x: Self with Node[T]) extends AnyVal {
    
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
    def setData(value: Done[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Node[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
  }
}
