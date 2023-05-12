package typings.workboxWindow

import typings.std.ServiceWorker
import typings.std.ServiceWorkerRegistration
import typings.trustedTypes.libMod.TrustedScriptURL
import typings.workboxWindow.anon.Immediate
import typings.workboxWindow.utilsWorkboxEventTargetMod.WorkboxEventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxMod {
  
  /**
    * A class to aid in handling service worker registration, updates, and
    * reacting to service worker lifecycle events.
    *
    * @fires {@link workbox-window.Workbox#message}
    * @fires {@link workbox-window.Workbox#installed}
    * @fires {@link workbox-window.Workbox#waiting}
    * @fires {@link workbox-window.Workbox#controlling}
    * @fires {@link workbox-window.Workbox#activated}
    * @fires {@link workbox-window.Workbox#redundant}
    * @memberof workbox-window
    */
  @JSImport("workbox-window/Workbox", "Workbox")
  @js.native
  open class Workbox protected () extends WorkboxEventTarget {
    /**
      * Creates a new Workbox instance with a script URL and service worker
      * options. The script URL and options are the same as those used when
      * calling [navigator.serviceWorker.register(scriptURL, options)](https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register).
      *
      * @param {string|TrustedScriptURL} scriptURL The service worker script
      *     associated with this instance. Using a
      *     [`TrustedScriptURL`](https://web.dev/trusted-types/) is supported.
      * @param {Object} [registerOptions] The service worker options associated
      *     with this instance.
      */
    def this(scriptURL: String) = this()
    def this(scriptURL: TrustedScriptURL) = this()
    def this(scriptURL: String, registerOptions: js.Object) = this()
    def this(scriptURL: TrustedScriptURL, registerOptions: js.Object) = this()
    
    /* private */ val _activeDeferred: Any = js.native
    
    /* private */ var _compatibleControllingSW: Any = js.native
    
    /* private */ val _controllingDeferred: Any = js.native
    
    /* private */ var _externalSW: Any = js.native
    
    /**
      * Checks for a service worker already controlling the page and returns
      * it if its script URL matches.
      *
      * @private
      * @return {ServiceWorker|undefined}
      */
    /* private */ var _getControllingSWIfCompatible: Any = js.native
    
    /* private */ var _isUpdate: Any = js.native
    
    /**
      * @private
      * @param {Event} originalEvent
      */
    /* private */ val _onControllerChange: Any = js.native
    
    /**
      * @private
      * @param {Event} originalEvent
      */
    /* private */ val _onMessage: Any = js.native
    
    /**
      * @private
      * @param {Event} originalEvent
      */
    /* private */ val _onStateChange: Any = js.native
    
    /**
      * @private
      */
    /* private */ val _onUpdateFound: Any = js.native
    
    /* private */ val _ownSWs: Any = js.native
    
    /* private */ val _registerOptions: Any = js.native
    
    /**
      * Registers a service worker for this instances script URL and register
      * options and tracks the time registration was complete.
      *
      * @private
      */
    /* private */ var _registerScript: Any = js.native
    
    /* private */ var _registration: Any = js.native
    
    /* private */ var _registrationTime: Any = js.native
    
    /* private */ val _scriptURL: Any = js.native
    
    /* private */ var _sw: Any = js.native
    
    /* private */ val _swDeferred: Any = js.native
    
    /* private */ var _updateFoundCount: Any = js.native
    
    /* private */ var _waitingTimeout: Any = js.native
    
    /**
      * Resolves to the service worker registered by this instance as soon as it
      * is active. If a service worker was already controlling at registration
      * time then it will resolve to that if the script URLs (and optionally
      * script versions) match, otherwise it will wait until an update is found
      * and activates.
      *
      * @return {Promise<ServiceWorker>}
      */
    def active: js.Promise[ServiceWorker] = js.native
    
    /**
      * Resolves to the service worker registered by this instance as soon as it
      * is controlling the page. If a service worker was already controlling at
      * registration time then it will resolve to that if the script URLs (and
      * optionally script versions) match, otherwise it will wait until an update
      * is found and starts controlling the page.
      * Note: the first time a service worker is installed it will active but
      * not start controlling the page unless `clients.claim()` is called in the
      * service worker.
      *
      * @return {Promise<ServiceWorker>}
      */
    def controlling: js.Promise[ServiceWorker] = js.native
    
    /**
      * Resolves with a reference to a service worker that matches the script URL
      * of this instance, as soon as it's available.
      *
      * If, at registration time, there's already an active or waiting service
      * worker with a matching script URL, it will be used (with the waiting
      * service worker taking precedence over the active service worker if both
      * match, since the waiting service worker would have been registered more
      * recently).
      * If there's no matching active or waiting service worker at registration
      * time then the promise will not resolve until an update is found and starts
      * installing, at which point the installing service worker is used.
      *
      * @return {Promise<ServiceWorker>}
      */
    def getSW(): js.Promise[ServiceWorker] = js.native
    
    /**
      * Sends the passed data object to the service worker registered by this
      * instance (via {@link workbox-window.Workbox#getSW}) and resolves
      * with a response (if any).
      *
      * A response can be set in a message handler in the service worker by
      * calling `event.ports[0].postMessage(...)`, which will resolve the promise
      * returned by `messageSW()`. If no response is set, the promise will never
      * resolve.
      *
      * @param {Object} data An object to send to the service worker
      * @return {Promise<Object>}
      */
    def messageSW(data: js.Object): js.Promise[Any] = js.native
    
    /**
      * Sends a `{type: 'SKIP_WAITING'}` message to the service worker that's
      * currently in the `waiting` state associated with the current registration.
      *
      * If there is no current registration or no service worker is `waiting`,
      * calling this will have no effect.
      */
    def messageSkipWaiting(): Unit = js.native
    
    /**
      * Registers a service worker for this instances script URL and service
      * worker options. By default this method delays registration until after
      * the window has loaded.
      *
      * @param {Object} [options]
      * @param {Function} [options.immediate=false] Setting this to true will
      *     register the service worker immediately, even if the window has
      *     not loaded (not recommended).
      */
    def register(): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
    def register(param0: Immediate): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
    
    /**
      * Checks for updates of the registered service worker.
      */
    def update(): js.Promise[Unit] = js.native
  }
}
