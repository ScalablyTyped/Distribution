package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anonymous extends js.Object {
  
  var anonymous: String = js.native
  
  var asyncArrow: String = js.native
  
  var constructor: String = js.native
  
  var method: String = js.native
  
  var named: String = js.native
}
object Anonymous {
  
  @scala.inline
  def apply(anonymous: String, asyncArrow: String, constructor: String, method: String, named: String): Anonymous = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], asyncArrow = asyncArrow.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anonymous]
  }
  
  @scala.inline
  implicit class AnonymousOps[Self <: Anonymous] (val x: Self) extends AnyVal {
    
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
    def setAnonymous(value: String): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncArrow(value: String): Self = this.set("asyncArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: String): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: String): Self = this.set("named", value.asInstanceOf[js.Any])
  }
}
