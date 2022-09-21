package typings.webosService

import typings.std.Record
import typings.webosService.activityManagerMod.ActivityManager
import typings.webosService.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("webos-service/message", "Message")
  @js.native
  open class Message protected () extends StObject {
    def this(message: Any, handle: Any, activityManager: ActivityManager, service: Service) = this()
    
    val activityManager: ActivityManager = js.native
    
    def cancel(response: Record[String, Any]): Unit = js.native
    
    val category: String = js.native
    
    val handle: Any = js.native
    
    val isSubscription: Boolean = js.native
    
    val ls2Message: Any = js.native
    
    val method: String = js.native
    
    val payload: Record[String, Any] = js.native
    
    def respond(response: Record[String, Any]): Boolean = js.native
    
    val sender: String = js.native
    
    val service: Service = js.native
    
    val token: String = js.native
    
    val uniqueToken: String = js.native
  }
}
