package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait storage extends js.Object {
  
  var cookie: typings.webix.webix.cookie = js.native
  
  var local: typings.webix.webix.local = js.native
  
  var session: typings.webix.webix.session = js.native
}
object storage {
  
  @scala.inline
  def apply(cookie: cookie, local: local, session: session): storage = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[storage]
  }
  
  @scala.inline
  implicit class storageOps[Self <: storage] (val x: Self) extends AnyVal {
    
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
    def setCookie(value: cookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: local): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: session): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
