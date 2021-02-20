package typings.titanium.Titanium

import typings.std.Error
import typings.titanium.AcceptDict
import typings.titanium.AcceptedCallbackArgs
import typings.titanium.ConnectedCallbackArgs
import typings.titanium.ErrorCallbackArgs
import typings.titanium.FailureResponse
import typings.titanium.ProxyEventMap
import typings.titanium.SecurityManagerProtocol
import typings.titanium.SuccessResponse
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Network.Socket.TCP
import typings.titanium.Titanium.XML.Document
import typings.titanium.titaniumStrings.publish
import typings.titanium.titaniumStrings.resolve
import typings.titanium.titaniumStrings.stop
import typings.titanium.titaniumStrings.updatedservices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level network module.
  */
object Network {
  
  /**
    * A browser for the discovery and retrieval of Bonjour services available on the network.
    */
  @js.native
  trait BonjourBrowser extends Proxy {
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_updatedservices(
      name: updatedservices,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourBrowserUpdatedservicesEvent, Unit]
    ): Unit = js.native
    
    /**
      * The domain the browser is searching in
      */
    var domain: String = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_updatedservices(name: updatedservices): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_updatedservices(name: updatedservices, event: BonjourBrowserUpdatedservicesEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourBrowser.domain> property.
      * @deprecated Access <Titanium.Network.BonjourBrowser.domain> instead.
      */
    def getDomain(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
      * @deprecated Access <Titanium.Network.BonjourBrowser.isSearching> instead.
      */
    def getIsSearching(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
      * @deprecated Access <Titanium.Network.BonjourBrowser.serviceType> instead.
      */
    def getServiceType(): String = js.native
    
    /**
      * Whether or not the browser is currently searching
      */
    var isSearching: Boolean = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_updatedservices(
      name: updatedservices,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourBrowserUpdatedservicesEvent, Unit]
    ): Unit = js.native
    
    /**
      * Conduct a search for Bonjour services matching the type and domain specified during creation
      */
    def search(): Unit = js.native
    
    /**
      * The type of the service the browser searches for
      */
    var serviceType: String = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourBrowser.domain> property.
      * @deprecated Set the value using <Titanium.Network.BonjourBrowser.domain> instead.
      */
    def setDomain(domain: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
      * @deprecated Set the value using <Titanium.Network.BonjourBrowser.isSearching> instead.
      */
    def setIsSearching(isSearching: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
      * @deprecated Set the value using <Titanium.Network.BonjourBrowser.serviceType> instead.
      */
    def setServiceType(serviceType: String): Unit = js.native
    
    /**
      * Halt an ongoing search
      */
    def stopSearch(): Unit = js.native
  }
  
  /**
    * Base event for class Titanium.Network.BonjourBrowser
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
  trait BonjourBrowserBaseEvent extends StObject {
    
    /**
      * Source object that fired the event.
      */
    var source: BonjourBrowser = js.native
  }
  object BonjourBrowserBaseEvent {
    
    @scala.inline
    def apply(source: BonjourBrowser): BonjourBrowserBaseEvent = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourBrowserBaseEvent]
    }
    
    @scala.inline
    implicit class BonjourBrowserBaseEventMutableBuilder[Self <: BonjourBrowserBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: BonjourBrowser): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BonjourBrowserEventMap extends ProxyEventMap {
    
    var updatedservices: BonjourBrowserUpdatedservicesEvent = js.native
  }
  object BonjourBrowserEventMap {
    
    @scala.inline
    def apply(updatedservices: BonjourBrowserUpdatedservicesEvent): BonjourBrowserEventMap = {
      val __obj = js.Dynamic.literal(updatedservices = updatedservices.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourBrowserEventMap]
    }
    
    @scala.inline
    implicit class BonjourBrowserEventMapMutableBuilder[Self <: BonjourBrowserEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdatedservices(value: BonjourBrowserUpdatedservicesEvent): Self = StObject.set(x, "updatedservices", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when the discovered services list is updated
    */
  @js.native
  trait BonjourBrowserUpdatedservicesEvent extends BonjourBrowserBaseEvent {
    
    /**
      * An array of BonjourService objects corresponding to currently available services.  If you cache this value, including using it as table data, be aware that it could become out of date at any time due to the asynchronous nature of Bonjour service discovery.
      */
    var services: js.Array[BonjourService] = js.native
  }
  object BonjourBrowserUpdatedservicesEvent {
    
    @scala.inline
    def apply(services: js.Array[BonjourService], source: BonjourBrowser): BonjourBrowserUpdatedservicesEvent = {
      val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourBrowserUpdatedservicesEvent]
    }
    
    @scala.inline
    implicit class BonjourBrowserUpdatedservicesEventMutableBuilder[Self <: BonjourBrowserUpdatedservicesEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServices(value: js.Array[BonjourService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: BonjourService*): Self = StObject.set(x, "services", js.Array(value :_*))
    }
  }
  
  /**
    * Describes a service on the network which is published by Bonjour.
    */
  @js.native
  trait BonjourService extends Proxy {
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_publish(
      name: publish,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServicePublishEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resolve(
      name: resolve,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceResolveEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stop(
      name: stop,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceStopEvent, Unit]
    ): Unit = js.native
    
    /**
      * the domain of the service
      */
    var domain: String = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_publish(name: publish): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_publish(name: publish, event: BonjourServicePublishEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_resolve(name: resolve): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_resolve(name: resolve, event: BonjourServiceResolveEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_stop(name: stop): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_stop(name: stop, event: BonjourServiceStopEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourService.domain> property.
      * @deprecated Access <Titanium.Network.BonjourService.domain> instead.
      */
    def getDomain(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourService.isLocal> property.
      * @deprecated Access <Titanium.Network.BonjourService.isLocal> instead.
      */
    def getIsLocal(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourService.name> property.
      * @deprecated Access <Titanium.Network.BonjourService.name> instead.
      */
    def getName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourService.socket> property.
      * @deprecated Access <Titanium.Network.BonjourService.socket> instead.
      */
    def getSocket(): TCP = js.native
    
    /**
      * Gets the value of the <Titanium.Network.BonjourService.type> property.
      * @deprecated Access <Titanium.Network.BonjourService.type> instead.
      */
    def getType(): String = js.native
    
    /**
      * whether or not the service is local to the device
      */
    var isLocal: Boolean = js.native
    
    /**
      * the name of the service
      */
    var name: String = js.native
    
    /**
      * Asynchronously publish a Bonjour service to the network.  Only works if isLocal is TRUE
      */
    def publish(socket: TCP): Unit = js.native
    def publish(socket: TCP, callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_publish(
      name: publish,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServicePublishEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resolve(
      name: resolve,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceResolveEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stop(
      name: stop,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceStopEvent, Unit]
    ): Unit = js.native
    
    /**
      * Asynchronously resolve a Bonjour service from the network.  Must be done before attempting to access the service's socket information, if a remote service.  You cannot resolve a locally published service.
      */
    def resolve(): Unit = js.native
    def resolve(
      timeout: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]
    ): Unit = js.native
    def resolve(timeout: Double): Unit = js.native
    def resolve(timeout: Double, callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourService.domain> property.
      * @deprecated Set the value using <Titanium.Network.BonjourService.domain> instead.
      */
    def setDomain(domain: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourService.isLocal> property.
      * @deprecated Set the value using <Titanium.Network.BonjourService.isLocal> instead.
      */
    def setIsLocal(isLocal: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourService.name> property.
      * @deprecated Set the value using <Titanium.Network.BonjourService.name> instead.
      */
    def setName(name: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourService.socket> property.
      * @deprecated Set the value using <Titanium.Network.BonjourService.socket> instead.
      */
    def setSocket(socket: TCP): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.BonjourService.type> property.
      * @deprecated Set the value using <Titanium.Network.BonjourService.type> instead.
      */
    def setType(`type`: String): Unit = js.native
    
    /**
      * the TCPSocket object that is used to connect to the service
      */
    var socket: TCP = js.native
    
    /**
      * Asynchronously halts a currently running attempt to publish or resolve a service.
      */
    def stop(): Unit = js.native
    def stop(callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]): Unit = js.native
    
    /**
      * the type of the service
      */
    var `type`: String = js.native
  }
  
  /**
    * Base event for class Titanium.Network.BonjourService
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
  trait BonjourServiceBaseEvent extends StObject {
    
    /**
      * Source object that fired the event.
      */
    var source: BonjourService = js.native
  }
  object BonjourServiceBaseEvent {
    
    @scala.inline
    def apply(source: BonjourService): BonjourServiceBaseEvent = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourServiceBaseEvent]
    }
    
    @scala.inline
    implicit class BonjourServiceBaseEventMutableBuilder[Self <: BonjourServiceBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: BonjourService): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BonjourServiceEventMap extends ProxyEventMap {
    
    var publish: BonjourServicePublishEvent = js.native
    
    var resolve: BonjourServiceResolveEvent = js.native
    
    var stop: BonjourServiceStopEvent = js.native
  }
  object BonjourServiceEventMap {
    
    @scala.inline
    def apply(
      publish: BonjourServicePublishEvent,
      resolve: BonjourServiceResolveEvent,
      stop: BonjourServiceStopEvent
    ): BonjourServiceEventMap = {
      val __obj = js.Dynamic.literal(publish = publish.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourServiceEventMap]
    }
    
    @scala.inline
    implicit class BonjourServiceEventMapMutableBuilder[Self <: BonjourServiceEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublish(value: BonjourServicePublishEvent): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: BonjourServiceResolveEvent): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: BonjourServiceStopEvent): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when the service has been published (or errored).
    */
  @js.native
  trait BonjourServicePublishEvent extends BonjourServiceBaseEvent {
    
    /**
      * Error code
      */
    var code: Double = js.native
    
    /**
      * Error message
      */
    var error: String = js.native
    
    /**
      * Reports if the publish operation was successful
      */
    var success: Boolean = js.native
  }
  object BonjourServicePublishEvent {
    
    @scala.inline
    def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServicePublishEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourServicePublishEvent]
    }
    
    @scala.inline
    implicit class BonjourServicePublishEventMutableBuilder[Self <: BonjourServicePublishEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when the service has been resolved (or errored). If successful, the [socket](Titanium.Network.BonjourService.socket) property should now be available.
    */
  @js.native
  trait BonjourServiceResolveEvent extends BonjourServiceBaseEvent {
    
    /**
      * Error code
      */
    var code: Double = js.native
    
    /**
      * Error message
      */
    var error: String = js.native
    
    /**
      * Reports if the resolve operation was successful
      */
    var success: Boolean = js.native
  }
  object BonjourServiceResolveEvent {
    
    @scala.inline
    def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServiceResolveEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourServiceResolveEvent]
    }
    
    @scala.inline
    implicit class BonjourServiceResolveEventMutableBuilder[Self <: BonjourServiceResolveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when a service's publish or resolution was stopped via <Titanium.Network.BonjourService.stop>
    */
  @js.native
  trait BonjourServiceStopEvent extends BonjourServiceBaseEvent {
    
    /**
      * Error code
      */
    var code: Double = js.native
    
    /**
      * Error message
      */
    var error: String = js.native
    
    /**
      * Reports if the stop operation was successful
      */
    var success: Boolean = js.native
  }
  object BonjourServiceStopEvent {
    
    @scala.inline
    def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServiceStopEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[BonjourServiceStopEvent]
    }
    
    @scala.inline
    implicit class BonjourServiceStopEventMutableBuilder[Self <: BonjourServiceStopEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Cookie object used to manage the system cookie store and HTTP client cookie store.
    */
  @js.native
  trait Cookie extends Proxy {
    
    /**
      * The comment describing the purpose of this cookie
      */
    var comment: String = js.native
    
    /**
      * The domain attribute of the cookie.
      */
    var domain: String = js.native
    
    /**
      * The expiration Date of the cookie.
      */
    var expiryDate: String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.comment> property.
      * @deprecated Access <Titanium.Network.Cookie.comment> instead.
      */
    def getComment(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.domain> property.
      * @deprecated Access <Titanium.Network.Cookie.domain> instead.
      */
    def getDomain(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.expiryDate> property.
      * @deprecated Access <Titanium.Network.Cookie.expiryDate> instead.
      */
    def getExpiryDate(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.httponly> property.
      * @deprecated Access <Titanium.Network.Cookie.httponly> instead.
      */
    def getHttponly(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.maxAge> property.
      * @deprecated Access <Titanium.Network.Cookie.maxAge> instead.
      */
    def getMaxAge(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.name> property.
      * @deprecated Access <Titanium.Network.Cookie.name> instead.
      */
    def getName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.originalUrl> property.
      * @deprecated Access <Titanium.Network.Cookie.originalUrl> instead.
      */
    def getOriginalUrl(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.path> property.
      * @deprecated Access <Titanium.Network.Cookie.path> instead.
      */
    def getPath(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.secure> property.
      * @deprecated Access <Titanium.Network.Cookie.secure> instead.
      */
    def getSecure(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.value> property.
      * @deprecated Access <Titanium.Network.Cookie.value> instead.
      */
    def getValue(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Cookie.version> property.
      * @deprecated Access <Titanium.Network.Cookie.version> instead.
      */
    def getVersion(): Double = js.native
    
    /**
      * The httponly attribute of the cookie.
      */
    var httponly: Boolean = js.native
    
    /**
      * Returns true if the cookie is valid.
      */
    def isValid(): Boolean = js.native
    
    /**
      * Sets the Max-Age attribute of a Cookie, in delta-seconds.
      */
    var maxAge: Double = js.native
    
    /**
      * The name of the cookie.
      */
    val name: String = js.native
    
    /**
      * The origual url attribute of the cookie.
      */
    var originalUrl: String = js.native
    
    /**
      * The path attribute of the cookie.
      */
    var path: String = js.native
    
    /**
      * The secure attribute of the cookie.
      */
    var secure: Boolean = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.comment> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.comment> instead.
      */
    def setComment(comment: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.domain> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.domain> instead.
      */
    def setDomain(domain: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.expiryDate> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.expiryDate> instead.
      */
    def setExpiryDate(expiryDate: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.httponly> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.httponly> instead.
      */
    def setHttponly(httponly: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.maxAge> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.maxAge> instead.
      */
    def setMaxAge(maxAge: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.originalUrl> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.originalUrl> instead.
      */
    def setOriginalUrl(originalUrl: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.path> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.path> instead.
      */
    def setPath(path: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.secure> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.secure> instead.
      */
    def setSecure(secure: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.value> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.value> instead.
      */
    def setValue(value: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Cookie.version> property.
      * @deprecated Set the value using <Titanium.Network.Cookie.version> instead.
      */
    def setVersion(version: Double): Unit = js.native
    
    /**
      * The value of the cookie.
      */
    var value: String = js.native
    
    /**
      * The version of the cookie specification to which this cookie conforms.
      */
    var version: Double = js.native
  }
  
  /**
    * HTTP client object that (mostly) implements the XMLHttpRequest specification.
    */
  @js.native
  trait HTTPClient extends Proxy {
    
    /**
      * Ready state constant indicating that the request is complete.
      */
    val DONE: Double = js.native
    
    /**
      * Ready state constant indicating that response headers have been received.
      */
    val HEADERS_RECEIVED: Double = js.native
    
    /**
      * Ready state constant indicating that response data is being received from the remote server.
      */
    val LOADING: Double = js.native
    
    /**
      * Ready state constant indicating that the connection has been opened, but the request has
      * not yet been sent.
      */
    val OPENED: Double = js.native
    
    /**
      * Ready state constant indicating that HTTPClient request has not been opened or sent.
      */
    val UNSENT: Double = js.native
    
    /**
      * Cancels a pending request.
      */
    def abort(): Unit = js.native
    
    /**
      * All of the response headers.
      */
    val allResponseHeaders: String = js.native
    
    /**
      * Determines whether automatic encoding is enabled for the specified URL.
      */
    var autoEncodeUrl: Boolean = js.native
    
    /**
      * Determines whether automatic automatic handling of HTTP redirects is enabled.
      */
    var autoRedirect: Boolean = js.native
    
    /**
      * Determines whether HTTP responses are cached.
      */
    var cache: Boolean = js.native
    
    /**
      * Clears any cookies stored for the host.
      */
    def clearCookies(host: String): Unit = js.native
    
    /**
      * Indicates whether the response was successful.
      */
    val connected: Boolean = js.native
    
    /**
      * Connection type, normally either `GET`, `POST` or `PATCH`.
      */
    val connectionType: String = js.native
    
    /**
      * Sets the domain parameter for authentication credentials.
      */
    var domain: String = js.native
    
    /**
      * Determines whether the client should attempt to keep a persistent connection.
      */
    var enableKeepAlive: Boolean = js.native
    
    /**
      * Target local file or file path to receive data.
      */
    var file: String | File = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.allResponseHeaders> property.
      * @deprecated Access <Titanium.Network.HTTPClient.allResponseHeaders> instead.
      */
    def getAllResponseHeaders(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
      * @deprecated Access <Titanium.Network.HTTPClient.autoEncodeUrl> instead.
      */
    def getAutoEncodeUrl(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
      * @deprecated Access <Titanium.Network.HTTPClient.autoRedirect> instead.
      */
    def getAutoRedirect(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.cache> property.
      * @deprecated Access <Titanium.Network.HTTPClient.cache> instead.
      */
    def getCache(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.connected> property.
      * @deprecated Access <Titanium.Network.HTTPClient.connected> instead.
      */
    def getConnected(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.connectionType> property.
      * @deprecated Access <Titanium.Network.HTTPClient.connectionType> instead.
      */
    def getConnectionType(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.domain> property.
      * @deprecated Access <Titanium.Network.HTTPClient.domain> instead.
      */
    def getDomain(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
      * @deprecated Access <Titanium.Network.HTTPClient.enableKeepAlive> instead.
      */
    def getEnableKeepAlive(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.file> property.
      * @deprecated Access <Titanium.Network.HTTPClient.file> instead.
      */
    def getFile(): String | File = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.location> property.
      * @deprecated Access <Titanium.Network.HTTPClient.location> instead.
      */
    def getLocation(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
      * @deprecated Access <Titanium.Network.HTTPClient.ondatastream> instead.
      */
    def getOndatastream(): js.Function1[/* param0 */ js.Any, Unit] = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.onerror> property.
      * @deprecated Access <Titanium.Network.HTTPClient.onerror> instead.
      */
    def getOnerror(): js.Function1[/* param0 */ FailureResponse, Unit] = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.onload> property.
      * @deprecated Access <Titanium.Network.HTTPClient.onload> instead.
      */
    def getOnload(): js.Function1[/* param0 */ SuccessResponse, Unit] = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
      * @deprecated Access <Titanium.Network.HTTPClient.onreadystatechange> instead.
      */
    def getOnreadystatechange(): js.Function1[/* param0 */ js.Any, Unit] = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
      * @deprecated Access <Titanium.Network.HTTPClient.onsendstream> instead.
      */
    def getOnsendstream(): js.Function1[/* param0 */ js.Any, Unit] = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.password> property.
      * @deprecated Access <Titanium.Network.HTTPClient.password> instead.
      */
    def getPassword(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.readyState> property.
      * @deprecated Access <Titanium.Network.HTTPClient.readyState> instead.
      */
    def getReadyState(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.responseData> property.
      * @deprecated Access <Titanium.Network.HTTPClient.responseData> instead.
      */
    def getResponseData(): Blob = js.native
    
    /**
      * Returns the value of the specified response header.
      */
    def getResponseHeader(name: String): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.responseHeaders> property.
      * @deprecated Access <Titanium.Network.HTTPClient.responseHeaders> instead.
      */
    def getResponseHeaders(): js.Any = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.responseText> property.
      * @deprecated Access <Titanium.Network.HTTPClient.responseText> instead.
      */
    def getResponseText(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.responseXML> property.
      * @deprecated Access <Titanium.Network.HTTPClient.responseXML> instead.
      */
    def getResponseXML(): Document = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.securityManager> property.
      * @deprecated Access <Titanium.Network.HTTPClient.securityManager> instead.
      */
    def getSecurityManager(): SecurityManagerProtocol = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.status> property.
      * @deprecated Access <Titanium.Network.HTTPClient.status> instead.
      */
    def getStatus(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.statusText> property.
      * @deprecated Access <Titanium.Network.HTTPClient.statusText> instead.
      */
    def getStatusText(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.timeout> property.
      * @deprecated Access <Titanium.Network.HTTPClient.timeout> instead.
      */
    def getTimeout(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.timeoutForResource> property.
      * @deprecated Access <Titanium.Network.HTTPClient.timeoutForResource> instead.
      */
    def getTimeoutForResource(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
      * @deprecated Access <Titanium.Network.HTTPClient.tlsVersion> instead.
      */
    def getTlsVersion(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.username> property.
      * @deprecated Access <Titanium.Network.HTTPClient.username> instead.
      */
    def getUsername(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
      * @deprecated Access <Titanium.Network.HTTPClient.validatesSecureCertificate> instead.
      */
    def getValidatesSecureCertificate(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.HTTPClient.waitsForConnectivity> property.
      * @deprecated Access <Titanium.Network.HTTPClient.waitsForConnectivity> instead.
      */
    def getWaitsForConnectivity(): Boolean = js.native
    
    /**
      * Absolute URL of the request.
      */
    val location: String = js.native
    
    /**
      * Function to be called at regular intervals as the request data is being received.
      */
    def ondatastream(param0: js.Any): Unit = js.native
    
    /**
      * Function to be called upon a error response.
      */
    def onerror(param0: FailureResponse): Unit = js.native
    
    /**
      * Function to be called upon a successful response.
      */
    def onload(param0: SuccessResponse): Unit = js.native
    
    /**
      * Function to be called for each [readyState](Titanium.Network.HTTPClient.readyState) change.
      */
    def onreadystatechange(param0: js.Any): Unit = js.native
    
    /**
      * Function to be called at regular intervals as the request data is being transmitted.
      */
    def onsendstream(param0: js.Any): Unit = js.native
    
    /**
      * Opens the request and prepares the connection.
      */
    def open(method: String, url: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    
    /**
      * Sets the password parameter for authentication credentials.
      */
    var password: String = js.native
    
    /**
      * The current ready state of this HTTP request.
      */
    val readyState: Double = js.native
    
    /**
      * Response data as a `Blob` object.
      */
    val responseData: Blob = js.native
    
    /**
      * Returns all the response headers returned with the request.
      */
    val responseHeaders: js.Any = js.native
    
    /**
      * Response as text.
      */
    val responseText: String = js.native
    
    /**
      * Response object as an XML DOM Document object.
      */
    val responseXML: Document = js.native
    
    /**
      * The Security Manager for this client.
      */
    var securityManager: SecurityManagerProtocol = js.native
    
    /**
      * Sends the request.
      */
    def send(): Unit = js.native
    def send(data: js.Any): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.autoEncodeUrl> instead.
      */
    def setAutoEncodeUrl(autoEncodeUrl: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.autoRedirect> instead.
      */
    def setAutoRedirect(autoRedirect: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.cache> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.cache> instead.
      */
    def setCache(cache: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.domain> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.domain> instead.
      */
    def setDomain(domain: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.enableKeepAlive> instead.
      */
    def setEnableKeepAlive(enableKeepAlive: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.file> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.file> instead.
      */
    def setFile(file: String): Unit = js.native
    def setFile(file: File): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.ondatastream> instead.
      */
    def setOndatastream(ondatastream: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.onerror> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.onerror> instead.
      */
    def setOnerror(onerror: js.Function1[/* param0 */ FailureResponse, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.onload> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.onload> instead.
      */
    def setOnload(onload: js.Function1[/* param0 */ SuccessResponse, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.onreadystatechange> instead.
      */
    def setOnreadystatechange(onreadystatechange: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.onsendstream> instead.
      */
    def setOnsendstream(onsendstream: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.password> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.password> instead.
      */
    def setPassword(password: String): Unit = js.native
    
    /**
      * Sets the value for the specified request header. Must be called after `open` but before `send`.
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.securityManager> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.securityManager> instead.
      */
    def setSecurityManager(securityManager: SecurityManagerProtocol): Unit = js.native
    
    /**
      * Sets the request timeout.
      */
    def setTimeout(timeout: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.timeoutForResource> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.timeoutForResource> instead.
      */
    def setTimeoutForResource(timeoutForResource: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.tlsVersion> instead.
      */
    def setTlsVersion(tlsVersion: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.username> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.username> instead.
      */
    def setUsername(username: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.validatesSecureCertificate> instead.
      */
    def setValidatesSecureCertificate(validatesSecureCertificate: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.HTTPClient.waitsForConnectivity> property.
      * @deprecated Set the value using <Titanium.Network.HTTPClient.waitsForConnectivity> instead.
      */
    def setWaitsForConnectivity(waitsForConnectivity: Boolean): Unit = js.native
    
    /**
      * Response HTTP status code.
      */
    val status: Double = js.native
    
    /**
      * Human-readable status message associated with the status code.
      */
    val statusText: String = js.native
    
    /**
      * Timeout in milliseconds when the connection should be aborted.
      */
    var timeout: Double = js.native
    
    /**
      * The maximum amount of time (in milliseconds) that a resource request should be allowed to take.
      */
    var timeoutForResource: Double = js.native
    
    /**
      * Sets the TLS version to use for handshakes.
      */
    var tlsVersion: Double = js.native
    
    /**
      * Sets the username parameter for authentication credentials.
      */
    var username: String = js.native
    
    /**
      * Determines how SSL certification validation is performed on connection.
      */
    var validatesSecureCertificate: Boolean = js.native
    
    /**
      * A Boolean value that indicates whether the session should wait for connectivity to become available, or fail immediately.
      */
    var waitsForConnectivity: Boolean = js.native
  }
  
  /**
    * Socket module, used for creating sockets.
    */
  object Socket {
    
    /**
      * TCP socket that implements the `Titanium.IOStream` interface.
      */
    @js.native
    trait TCP extends IOStream {
      
      /**
        * Tells a [LISTENING](Titanium.Network.Socket.LISTENING) socket to accept a connection request at the top of a listener's request queue when one becomes available.
        */
      def accept(options: AcceptDict): Unit = js.native
      
      /**
        * Callback to be fired when a listener accepts a connection.
        */
      def accepted(param0: AcceptedCallbackArgs): Unit = js.native
      
      /**
        * Attempts to connect the socket to its host/port.
        */
      def connect(): Unit = js.native
      
      /**
        * Callback to be fired when the socket enters the "connected" state.
        */
      def connected(param0: ConnectedCallbackArgs): Unit = js.native
      
      /**
        * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
        */
      def error(param0: ErrorCallbackArgs): Unit = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.accepted> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.accepted> instead.
        */
      def getAccepted(): js.Function1[/* param0 */ AcceptedCallbackArgs, Unit] = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.connected> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.connected> instead.
        */
      def getConnected(): js.Function1[/* param0 */ ConnectedCallbackArgs, Unit] = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.error> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.error> instead.
        */
      def getError(): js.Function1[/* param0 */ ErrorCallbackArgs, Unit] = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.host> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.host> instead.
        */
      def getHost(): String = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.listenQueueSize> instead.
        */
      def getListenQueueSize(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.port> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.port> instead.
        */
      def getPort(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.state> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.state> instead.
        */
      def getState(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Network.Socket.TCP.timeout> property.
        * @deprecated Access <Titanium.Network.Socket.TCP.timeout> instead.
        */
      def getTimeout(): Double = js.native
      
      /**
        * The host to connect to or listen on.
        */
      var host: String = js.native
      
      /**
        * Attempts to start listening on the socket's host/port.
        */
      def listen(): Unit = js.native
      
      /**
        * Max number of pending incoming connections to be allowed when the socket is in the [LISTENING](Titanium.Network.Socket.LISTENING) state.
        */
      var listenQueueSize: Double = js.native
      
      /**
        * The port to connect to or listen on.
        */
      var port: Double = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.accepted> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.accepted> instead.
        */
      def setAccepted(accepted: js.Function1[/* param0 */ AcceptedCallbackArgs, Unit]): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.connected> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.connected> instead.
        */
      def setConnected(connected: js.Function1[/* param0 */ ConnectedCallbackArgs, Unit]): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.error> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.error> instead.
        */
      def setError(error: js.Function1[/* param0 */ ErrorCallbackArgs, Unit]): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.host> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.host> instead.
        */
      def setHost(host: String): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.listenQueueSize> instead.
        */
      def setListenQueueSize(listenQueueSize: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.port> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.port> instead.
        */
      def setPort(port: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Network.Socket.TCP.timeout> property.
        * @deprecated Set the value using <Titanium.Network.Socket.TCP.timeout> instead.
        */
      def setTimeout(timeout: Double): Unit = js.native
      
      /**
        * Current state of the socket.
        */
      val state: Double = js.native
      
      /**
        * Timeout, in milliseconds, for `connect` and all `write` operations.
        */
      var timeout: Double = js.native
    }
  }
  /**
    * Socket module, used for creating sockets.
    */
  type Socket = Module
}
