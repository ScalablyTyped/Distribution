package typings.vertx3EventbusClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("vertx3-eventbus-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EventBus {
    def this(url: String) = this()
    def this(url: String, options: Any) = this()
  }
  @JSImport("vertx3-eventbus-client", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EventBusStatic = js.native
  
  @js.native
  trait EventBus extends StObject {
    
    def close(): Any = js.native
    
    def enablePing(enable: Boolean): Unit = js.native
    
    def enableReconnect(enable: Boolean): Unit = js.native
    
    def onclose(): Any = js.native
    
    def onerror(error: js.Error): Any = js.native
    
    def onopen(): Any = js.native
    
    var options: js.UndefOr[Any] = js.native
    
    def publish(address: String, message: Any): Any = js.native
    def publish(address: String, message: Any, headers: Any): Any = js.native
    
    def registerHandler(address: String): Any = js.native
    def registerHandler(address: String, headers: js.Object): Any = js.native
    def registerHandler(
      address: String,
      headers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Any]
    ): Any = js.native
    def registerHandler(
      address: String,
      headers: Unit,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Any]
    ): Any = js.native
    
    def send(address: String, message: Any): Any = js.native
    def send(address: String, message: Any, headers: js.Object): Any = js.native
    def send(
      address: String,
      message: Any,
      headers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Any]
    ): Any = js.native
    def send(
      address: String,
      message: Any,
      headers: Unit,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Any]
    ): Any = js.native
    
    def unregisterHandler(address: String): Any = js.native
    def unregisterHandler(address: String, headers: js.Object): Any = js.native
    def unregisterHandler(
      address: String,
      headers: js.Object,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Any]
    ): Any = js.native
    def unregisterHandler(
      address: String,
      headers: Unit,
      callback: js.Function2[/* error */ js.Error, /* message */ Any, Any]
    ): Any = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait EventBusStatic
    extends StObject
       with Instantiable1[/* url */ String, EventBus]
       with Instantiable2[/* url */ String, /* options */ Any, EventBus]
  
  type _To = js.Object & EventBusStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & EventBusStatic = ^
}
