package typings.webosService

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("webos-service/subscription", "Subscription")
  @js.native
  open class Subscription protected () extends EventEmitter {
    def this(handle: Any, uri: String, args: Record[String, Any]) = this()
    
    val args: Record[String, Any] = js.native
    
    def cancel(): Unit = js.native
    
    val handle: Any = js.native
    
    val request: Any = js.native
    
    val uri: String = js.native
  }
}
