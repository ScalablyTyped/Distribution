package typings.webosService

import typings.std.Record
import typings.webosService.serviceMod.Service
import typings.webosService.serviceMod.ServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webos-service", JSImport.Default)
  @js.native
  open class default protected () extends Service {
    def this(busId: String) = this()
    def this(busId: String, activityManager: typings.webosService.activityManagerMod.ActivityManager) = this()
    def this(busId: String, activityManager: Unit, options: ServiceOptions) = this()
    def this(
      busId: String,
      activityManager: typings.webosService.activityManagerMod.ActivityManager,
      options: ServiceOptions
    ) = this()
  }
  
  @JSImport("webos-service", "ActivityManager")
  @js.native
  open class ActivityManager protected ()
    extends typings.webosService.activityManagerMod.ActivityManager {
    def this(service: Service, idleTimeout: Double) = this()
  }
  
  @JSImport("webos-service", "Message")
  @js.native
  open class Message protected ()
    extends typings.webosService.messageMod.Message {
    def this(
      message: Any,
      handle: Any,
      activityManager: typings.webosService.activityManagerMod.ActivityManager,
      service: Service
    ) = this()
  }
  
  @JSImport("webos-service", "Method")
  @js.native
  open class Method protected ()
    extends typings.webosService.methodMod.Method {
    def this(methodName: String, description: Record[String, Any]) = this()
  }
  
  @JSImport("webos-service", "Subscription")
  @js.native
  open class Subscription protected ()
    extends typings.webosService.subscriptionMod.Subscription {
    def this(handle: Any, uri: String, args: Record[String, Any]) = this()
  }
}
