package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EAGER extends js.Object {
  
  var EAGER: String = js.native
  
  var LAZY: String = js.native
}
object EAGER {
  
  @scala.inline
  def apply(EAGER: String, LAZY: String): EAGER = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], LAZY = LAZY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAGER]
  }
  
  @scala.inline
  implicit class EAGEROps[Self <: EAGER] (val x: Self) extends AnyVal {
    
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
    def setEAGER(value: String): Self = this.set("EAGER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAZY(value: String): Self = this.set("LAZY", value.asInstanceOf[js.Any])
  }
}
