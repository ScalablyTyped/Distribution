package typings.xsockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XSockets {
  
  trait ConfirmationArgument extends StObject {
    
    var event: String
  }
  object ConfirmationArgument {
    
    inline def apply(event: String): ConfirmationArgument = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmationArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmationArgument] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebSocket extends StObject {
    
    var id: String = js.native
    
    def many(event: String, times: Double, handler: js.Function1[/* data */ Any, Unit]): Unit = js.native
    def many(
      event: String,
      times: Double,
      handler: js.Function1[/* data */ Any, Unit],
      confirmation: js.Function1[/* arg */ ConfirmationArgument, Unit]
    ): Unit = js.native
    
    def on(event: String, handler: js.Function1[/* data */ Any, Unit]): Unit = js.native
    def on(
      event: String,
      handler: js.Function1[/* data */ Any, Unit],
      confirmation: js.Function1[/* arg */ ConfirmationArgument, Unit]
    ): Unit = js.native
    
    def one(event: String, handler: js.Function1[/* data */ Any, Unit]): Unit = js.native
    def one(
      event: String,
      handler: js.Function1[/* data */ Any, Unit],
      confirmation: js.Function1[/* arg */ ConfirmationArgument, Unit]
    ): Unit = js.native
    
    def publish(topic: String, data: Any): Unit = js.native
    
    def unbind(event: String): Unit = js.native
  }
}
