package typings.winston.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bearer extends js.Object {
  
  var bearer: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Bearer {
  
  @scala.inline
  def apply(): Bearer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bearer]
  }
  
  @scala.inline
  implicit class BearerOps[Self <: Bearer] (val x: Self) extends AnyVal {
    
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
    def setBearer(value: String): Self = this.set("bearer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearer: Self = this.set("bearer", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
