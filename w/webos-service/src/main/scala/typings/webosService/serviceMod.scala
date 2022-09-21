package typings.webosService

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.webosService.activityManagerMod.ActivityManager
import typings.webosService.messageMod.Message
import typings.webosService.methodMod.Method
import typings.webosService.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("webos-service/service", "Service")
  @js.native
  open class Service protected () extends StObject {
    def this(busId: String) = this()
    def this(busId: String, activityManager: ActivityManager) = this()
    def this(busId: String, activityManager: Unit, options: ServiceOptions) = this()
    def this(busId: String, activityManager: ActivityManager, options: ServiceOptions) = this()
    
    /* private */ val __serviceMainUnified: Any = js.native
    
    /* private */ def _dispatch(handle: Any, ls2Message: Any): Unit = js.native
    
    /* private */ def _register(privateBus: Boolean, name: String): Method = js.native
    /* private */ def _register(privateBus: Boolean, name: String, requestCallback: js.Function1[/* message */ Message, Unit]): Method = js.native
    /* private */ def _register(
      privateBus: Boolean,
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: js.Function1[/* message */ Message, Unit]
    ): Method = js.native
    /* private */ def _register(
      privateBus: Boolean,
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: js.Function1[/* message */ Message, Unit],
      description: Record[String, Any]
    ): Method = js.native
    /* private */ def _register(
      privateBus: Boolean,
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: Unit,
      description: Record[String, Any]
    ): Method = js.native
    /* private */ def _register(
      privateBus: Boolean,
      name: String,
      requestCallback: Unit,
      cancelCallback: js.Function1[/* message */ Message, Unit]
    ): Method = js.native
    /* private */ def _register(
      privateBus: Boolean,
      name: String,
      requestCallback: Unit,
      cancelCallback: js.Function1[/* message */ Message, Unit],
      description: Record[String, Any]
    ): Method = js.native
    /* private */ def _register(
      privateBus: Boolean,
      name: String,
      requestCallback: Unit,
      cancelCallback: Unit,
      description: Record[String, Any]
    ): Method = js.native
    
    /* private */ def _registerBuiltInMethods(privateBus: Boolean): Unit = js.native
    
    val activityManager: ActivityManager = js.native
    
    val busId: String = js.native
    
    def call(uri: String, args: Record[String, Any], callback: js.Function1[/* message */ Message, Unit]): Unit = js.native
    
    val cancelHandlers: Record[String, Any] = js.native
    
    def cancelSubscription(handle: Any, ls2Message: Any): Unit = js.native
    
    def cleanupUnified(): Unit = js.native
    
    var cleanupUnifiedDone: Boolean = js.native
    
    var handle: Any = js.native
    
    val handlers: Record[String, Any] = js.native
    
    var hasPublicMethods: Boolean = js.native
    
    def idIsPrivileged(id: String): Boolean = js.native
    
    var idleTimer: Double = js.native
    
    def info(message: Message): Unit = js.native
    
    val methods: StringDictionary[StringDictionary[Method]] = js.native
    
    val noBuiltinMethods: Boolean = js.native
    
    var privateHandle: Any = js.native
    
    var publicHandle: Any = js.native
    
    def quit(message: Message): Unit = js.native
    
    def register(name: String): Method = js.native
    def register(name: String, requestCallback: js.Function1[/* message */ Message, Unit]): Method = js.native
    def register(
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: js.Function1[/* message */ Message, Unit]
    ): Method = js.native
    def register(
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: js.Function1[/* message */ Message, Unit],
      description: Record[String, Any]
    ): Method = js.native
    def register(
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: Unit,
      description: Record[String, Any]
    ): Method = js.native
    def register(name: String, requestCallback: Unit, cancelCallback: js.Function1[/* message */ Message, Unit]): Method = js.native
    def register(
      name: String,
      requestCallback: Unit,
      cancelCallback: js.Function1[/* message */ Message, Unit],
      description: Record[String, Any]
    ): Method = js.native
    def register(name: String, requestCallback: Unit, cancelCallback: Unit, description: Record[String, Any]): Method = js.native
    
    def registerPrivate(name: String): Method = js.native
    def registerPrivate(name: String, requestCallback: js.Function1[/* message */ Message, Unit]): Method = js.native
    def registerPrivate(
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: js.Function1[/* message */ Message, Unit]
    ): Method = js.native
    def registerPrivate(
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: js.Function1[/* message */ Message, Unit],
      description: Record[String, Any]
    ): Method = js.native
    def registerPrivate(
      name: String,
      requestCallback: js.Function1[/* message */ Message, Unit],
      cancelCallback: Unit,
      description: Record[String, Any]
    ): Method = js.native
    def registerPrivate(name: String, requestCallback: Unit, cancelCallback: js.Function1[/* message */ Message, Unit]): Method = js.native
    def registerPrivate(
      name: String,
      requestCallback: Unit,
      cancelCallback: js.Function1[/* message */ Message, Unit],
      description: Record[String, Any]
    ): Method = js.native
    def registerPrivate(name: String, requestCallback: Unit, cancelCallback: Unit, description: Record[String, Any]): Method = js.native
    
    var sendingHandle: Any = js.native
    
    def subscribe(uri: String, args: Record[String, Any]): Subscription = js.native
    
    val subscriptions: StringDictionary[Message] = js.native
    
    var useACG: Boolean = js.native
  }
  
  trait ServiceOptions extends StObject {
    
    // Idle time in seconds before exiting.
    val idleTimer: js.UndefOr[Double] = js.undefined
    
    // Prevents registering 'info' & 'quit' methods.
    val noBuiltinMethods: js.UndefOr[Boolean] = js.undefined
  }
  object ServiceOptions {
    
    inline def apply(): ServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceOptions]
    }
    
    extension [Self <: ServiceOptions](x: Self) {
      
      inline def setIdleTimer(value: Double): Self = StObject.set(x, "idleTimer", value.asInstanceOf[js.Any])
      
      inline def setIdleTimerUndefined: Self = StObject.set(x, "idleTimer", js.undefined)
      
      inline def setNoBuiltinMethods(value: Boolean): Self = StObject.set(x, "noBuiltinMethods", value.asInstanceOf[js.Any])
      
      inline def setNoBuiltinMethodsUndefined: Self = StObject.set(x, "noBuiltinMethods", js.undefined)
    }
  }
}
