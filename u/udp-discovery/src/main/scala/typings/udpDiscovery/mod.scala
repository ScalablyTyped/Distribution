package typings.udpDiscovery

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("udp-discovery", "Discovery")
  @js.native
  /**
    * Invokes the constructor to create an instance of Discovery to receive discovery events. The config options object is optional, but if included, the following options are available:
    * @param options constructor options
    */
  open class Discovery () extends EventEmitter {
    def this(options: DiscoveryConstructorOptions) = this()
    
    /**
      * Starts announcing the service at the specified interval. The parameter, serviceObject, is an object describing the service that udp-discoveryy announces.
      * @param name The name of the service being announced. It must be unique, or it will collide with another.
      * @param userData The duration between announcements in milliseconds.
      * @param interval Any data that can be serialized into JSON.
      * @param available Optional parameter to set availability of the service. If not specified, the default is 'true', meaning available.
      */
    def announce(name: String, userData: Any): Unit = js.native
    def announce(name: String, userData: Any, interval: Double): Unit = js.native
    def announce(name: String, userData: Any, interval: Double, available: Boolean): Unit = js.native
    def announce(name: String, userData: Any, interval: Unit, available: Boolean): Unit = js.native
    
    /**
      * Returns the service object, which can be modified. For example, if you need to alter the userData, you can. You cannot, however, alter the name (it's a constant property).
      * @param name name of the service.
      * @returns Returns Object serviceObject from announce.
      */
    def getData(name: String): Any = js.native
    
    /**
      * Halts announcements.
      * @param name The name of the service.
      * @returns Returns true if successful, false otherwise.
      */
    def pause(name: String): Boolean = js.native
    
    /**
      * Resumes the announcements at the time interval.
      * @param name The name of the service.
      * @param interval optional interval between announcements in ms.
      * @returns Returns true if successful, false otherwise.
      */
    def resume(name: String): Boolean = js.native
    def resume(name: String, interval: Double): Boolean = js.native
    
    /**
      * Not documented at the time this type definition was created.
      * Network traffic inspection shows that it sends an event as UDP multicast, and a listener receives it.
      * @param eventName The name of the event.
      * @param data The payload for the event.
      */
    def sendEvent(eventName: String, data: Any): Unit = js.native
    
    /**
      * Updates the existing service.
      * @param name The name of the service being announced. It must be unique, or it will collide with another.
      * @param userData The duration between announcements in milliseconds.
      * @param interval Any data that can be serialized into JSON.
      * @param available Optional parameter to set availability of the service. If not specified, the default is 'true', meaning available.
      */
    def update(name: String, userData: Any): Unit = js.native
    def update(name: String, userData: Any, interval: Double): Unit = js.native
    def update(name: String, userData: Any, interval: Double, available: Boolean): Unit = js.native
    def update(name: String, userData: Any, interval: Unit, available: Boolean): Unit = js.native
  }
  
  trait DiscoveryConstructorOptions extends StObject {
    
    /**
      * The address to bind to. Default: listens to all interfaces.
      */
    var bindAddr: js.UndefOr[String] = js.undefined
    
    /**
      * Either 'udp4' or 'udp6'. Default: 'udp4'.
      */
    var dgramType: js.UndefOr[String] = js.undefined
    
    /**
      * The port to listen upon for service announcements. Default: 44201.
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object DiscoveryConstructorOptions {
    
    inline def apply(): DiscoveryConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscoveryConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiscoveryConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
      
      inline def setBindAddrUndefined: Self = StObject.set(x, "bindAddr", js.undefined)
      
      inline def setDgramType(value: String): Self = StObject.set(x, "dgramType", value.asInstanceOf[js.Any])
      
      inline def setDgramTypeUndefined: Self = StObject.set(x, "dgramType", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait DiscoveryEvents extends StObject {
    
    /**
      * Not documented at the time this type definition was created.
      * Although, it does capture events that appear to come from a listener's sendEvent.
      * @param eventName The name of the event.
      * @param data The payload for the event.
      */
    var MessageBus: js.UndefOr[js.Function2[/* eventName */ String, /* data */ Any, Unit]] = js.undefined
    
    /**
      * This event can happen when:
      *  - The first announcement for a service is received.
      *  - The availability changes, if the available status changes from false to true.
      * @param name name of the service.
      * @param data user-defined object describing the service.
      * @param reason why this event was sent: 'new', 'availabilityChange', 'timedOut'.
      */
    def available(name: String, data: Any, reason: ReasonType): Unit
    
    /**
      * This event can happen when:
      *  - The first announcement for a service is received and the service is unavailable..
      *  - The availability changes, if the available status changes from true to false.
      *  - When 2x the announce interval time for the service elapsed without an announcement being seen. The service is considered unavailable and removed from the list of services.
      * @param name name of the service.
      * @param data user-defined object describing the service.
      * @param reason why this event was sent: 'new', 'availabilityChange', 'timedOut'.
      */
    def unavailable(name: String, data: Any, reason: ReasonType): Unit
  }
  object DiscoveryEvents {
    
    inline def apply(available: (String, Any, ReasonType) => Unit, unavailable: (String, Any, ReasonType) => Unit): DiscoveryEvents = {
      val __obj = js.Dynamic.literal(available = js.Any.fromFunction3(available), unavailable = js.Any.fromFunction3(unavailable))
      __obj.asInstanceOf[DiscoveryEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiscoveryEvents] (val x: Self) extends AnyVal {
      
      inline def setAvailable(value: (String, Any, ReasonType) => Unit): Self = StObject.set(x, "available", js.Any.fromFunction3(value))
      
      inline def setMessageBus(value: (/* eventName */ String, /* data */ Any) => Unit): Self = StObject.set(x, "MessageBus", js.Any.fromFunction2(value))
      
      inline def setMessageBusUndefined: Self = StObject.set(x, "MessageBus", js.undefined)
      
      inline def setUnavailable(value: (String, Any, ReasonType) => Unit): Self = StObject.set(x, "unavailable", js.Any.fromFunction3(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.udpDiscovery.udpDiscoveryStrings.`new`
    - typings.udpDiscovery.udpDiscoveryStrings.availabilityChange
    - typings.udpDiscovery.udpDiscoveryStrings.timedOut
  */
  trait ReasonType extends StObject
  object ReasonType {
    
    inline def availabilityChange: typings.udpDiscovery.udpDiscoveryStrings.availabilityChange = "availabilityChange".asInstanceOf[typings.udpDiscovery.udpDiscoveryStrings.availabilityChange]
    
    inline def `new`: typings.udpDiscovery.udpDiscoveryStrings.`new` = "new".asInstanceOf[typings.udpDiscovery.udpDiscoveryStrings.`new`]
    
    inline def timedOut: typings.udpDiscovery.udpDiscoveryStrings.timedOut = "timedOut".asInstanceOf[typings.udpDiscovery.udpDiscoveryStrings.timedOut]
  }
}
