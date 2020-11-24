package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AB[A, B, C] extends js.Object {
  
  var a: A = js.native
  
  var b: B = js.native
  
  var c: C = js.native
}
object AB {
  
  @scala.inline
  def apply[A, B, C](a: A, b: B, c: C): AB[A, B, C] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[AB[A, B, C]]
  }
  
  @scala.inline
  implicit class ABOps[Self <: AB[_, _, _], A, B, C] (val x: Self with (AB[A, B, C])) extends AnyVal {
    
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
    def setA(value: A): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: B): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: C): Self = this.set("c", value.asInstanceOf[js.Any])
  }
}
