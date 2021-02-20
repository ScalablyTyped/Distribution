package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait storage extends StObject {
  
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
  implicit class storageMutableBuilder[Self <: storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: local): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
