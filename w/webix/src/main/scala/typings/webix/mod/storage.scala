package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait storage extends StObject {
  
  var cookie: typings.webix.webix.cookie
  
  var local: typings.webix.webix.local
  
  var session: typings.webix.webix.session
}
object storage {
  
  @JSImport("webix", "storage")
  @js.native
  val ^ : typings.webix.webix.storage = js.native
  
  @scala.inline
  implicit class storageMutableBuilder[Self <: storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: typings.webix.webix.cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: typings.webix.webix.local): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: typings.webix.webix.session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
