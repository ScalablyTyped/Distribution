package typings.vertx3EventbusClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("vertx3-eventbus-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends EventBus {
    def this(url: String) = this()
    def this(url: String, options: js.Any) = this()
  }
  @JSImport("vertx3-eventbus-client", JSImport.Namespace)
  @js.native
  val ^ : EventBusStatic = js.native
  
  @js.native
  trait EventBus extends StObject {
    
    def close(): js.Any = js.native
    
    def enablePing(enable: Boolean): Unit = js.native
    
    def enableReconnect(enable: Boolean): Unit = js.native
    
    def onclose(): js.Any = js.native
    
    def onerror(error: Error): js.Any = js.native
    
    def onopen(): js.Any = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    def publish(address: String, message: js.Any): js.Any = js.native
    def publish(address: String, message: js.Any, headers: js.Any): js.Any = js.native
    
    def registerHandler(address: String): js.Any = js.native
    def registerHandler(
      address: String,
      headers: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
    ): js.Any = js.native
    def registerHandler(address: String, headers: js.Object): js.Any = js.native
    def registerHandler(
      address: String,
      headers: js.Object,
      callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
    ): js.Any = js.native
    
    def send(address: String, message: js.Any): js.Any = js.native
    def send(
      address: String,
      message: js.Any,
      headers: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
    ): js.Any = js.native
    def send(address: String, message: js.Any, headers: js.Object): js.Any = js.native
    def send(
      address: String,
      message: js.Any,
      headers: js.Object,
      callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
    ): js.Any = js.native
    
    def unregisterHandler(address: String): js.Any = js.native
    def unregisterHandler(
      address: String,
      headers: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
    ): js.Any = js.native
    def unregisterHandler(address: String, headers: js.Object): js.Any = js.native
    def unregisterHandler(
      address: String,
      headers: js.Object,
      callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
    ): js.Any = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait EventBusStatic
    extends Instantiable1[/* url */ String, EventBus]
       with Instantiable2[/* url */ String, /* options */ js.Any, EventBus]
  
  type _To = EventBusStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EventBusStatic = ^
}
