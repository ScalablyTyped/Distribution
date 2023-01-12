package typings.vertxEventbusBridgeClientJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@vertx/eventbus-bridge-client.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EventBus {
    def this(url: String) = this()
    def this(url: String, options: Any) = this()
  }
  @JSImport("@vertx/eventbus-bridge-client.js", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EventBusStatic = js.native
  
  @js.native
  trait EventBus extends StObject {
    
    def close(): Unit = js.native
    
    def enablePing(enable: Boolean): Unit = js.native
    
    def enableReconnect(enable: Boolean): Unit = js.native
    
    def onclose(): Unit = js.native
    
    def onerror(error: EventBusError): Unit = js.native
    
    def onopen(): Unit = js.native
    
    var options: js.UndefOr[EventBusOptions] = js.native
    
    def publish(address: String, message: Any): Unit = js.native
    def publish(address: String, message: Any, headers: Any): Unit = js.native
    
    def registerHandler(address: String): Unit = js.native
    def registerHandler(address: String, headers: js.Object): Unit = js.native
    def registerHandler(
      address: String,
      headers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Unit]
    ): Unit = js.native
    def registerHandler(
      address: String,
      headers: Unit,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Unit]
    ): Unit = js.native
    
    def send(address: String, message: Any): Unit = js.native
    def send(address: String, message: Any, headers: js.Object): Unit = js.native
    def send(
      address: String,
      message: Any,
      headers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Unit]
    ): Unit = js.native
    def send(
      address: String,
      message: Any,
      headers: Unit,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Unit]
    ): Unit = js.native
    
    def unregisterHandler(address: String): Unit = js.native
    def unregisterHandler(address: String, headers: js.Object): Unit = js.native
    def unregisterHandler(
      address: String,
      headers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Unit]
    ): Unit = js.native
    def unregisterHandler(
      address: String,
      headers: Unit,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Unit]
    ): Unit = js.native
    
    var url: String = js.native
  }
  
  trait EventBusError extends StObject {
    
    var body: String
    
    var `type`: String
  }
  object EventBusError {
    
    inline def apply(body: String, `type`: String): EventBusError = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBusError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventBusError] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventBusOptions extends StObject {
    
    // Exponential backoff factor
    var vertxbus_randomization_factor: Double
    
    var vertxbus_reconnect_attempts_max: Double
    
    // Initial delay (in ms) before first reconnect attempt
    var vertxbus_reconnect_delay_max: Double
    
    // Max reconnect attempts
    var vertxbus_reconnect_delay_min: Double
    
    // Max delay (in ms) between reconnect attempts
    var vertxbus_reconnect_exponent: Double
  }
  object EventBusOptions {
    
    inline def apply(
      vertxbus_randomization_factor: Double,
      vertxbus_reconnect_attempts_max: Double,
      vertxbus_reconnect_delay_max: Double,
      vertxbus_reconnect_delay_min: Double,
      vertxbus_reconnect_exponent: Double
    ): EventBusOptions = {
      val __obj = js.Dynamic.literal(vertxbus_randomization_factor = vertxbus_randomization_factor.asInstanceOf[js.Any], vertxbus_reconnect_attempts_max = vertxbus_reconnect_attempts_max.asInstanceOf[js.Any], vertxbus_reconnect_delay_max = vertxbus_reconnect_delay_max.asInstanceOf[js.Any], vertxbus_reconnect_delay_min = vertxbus_reconnect_delay_min.asInstanceOf[js.Any], vertxbus_reconnect_exponent = vertxbus_reconnect_exponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBusOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventBusOptions] (val x: Self) extends AnyVal {
      
      inline def setVertxbus_randomization_factor(value: Double): Self = StObject.set(x, "vertxbus_randomization_factor", value.asInstanceOf[js.Any])
      
      inline def setVertxbus_reconnect_attempts_max(value: Double): Self = StObject.set(x, "vertxbus_reconnect_attempts_max", value.asInstanceOf[js.Any])
      
      inline def setVertxbus_reconnect_delay_max(value: Double): Self = StObject.set(x, "vertxbus_reconnect_delay_max", value.asInstanceOf[js.Any])
      
      inline def setVertxbus_reconnect_delay_min(value: Double): Self = StObject.set(x, "vertxbus_reconnect_delay_min", value.asInstanceOf[js.Any])
      
      inline def setVertxbus_reconnect_exponent(value: Double): Self = StObject.set(x, "vertxbus_reconnect_exponent", value.asInstanceOf[js.Any])
    }
  }
  
  type EventBusStatic = Instantiable2[/* url */ String, /* options */ js.UndefOr[Any], EventBus]
  
  type _To = js.Object & EventBusStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & EventBusStatic = ^
}
