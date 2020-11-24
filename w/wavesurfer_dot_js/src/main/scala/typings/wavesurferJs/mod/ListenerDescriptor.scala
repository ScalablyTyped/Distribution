package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDescriptor extends js.Object {
  
  def callback(args: js.Any*): Unit = js.native
  
  var name: String = js.native
  
  def un(): Unit = js.native
}
object ListenerDescriptor {
  
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Unit, name: String, un: () => Unit): ListenerDescriptor = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any], un = js.Any.fromFunction0(un))
    __obj.asInstanceOf[ListenerDescriptor]
  }
  
  @scala.inline
  implicit class ListenerDescriptorOps[Self <: ListenerDescriptor] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* repeated */ js.Any => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUn(value: () => Unit): Self = this.set("un", js.Any.fromFunction0(value))
  }
}
