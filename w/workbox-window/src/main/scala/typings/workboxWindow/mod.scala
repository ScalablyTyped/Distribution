package typings.workboxWindow

import typings.std.Omit
import typings.std.ServiceWorker
import typings.trustedTypes.libMod.TrustedScriptURL
import typings.workboxWindow.workboxWindowStrings.message
import typings.workboxWindow.workboxWindowStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("workbox-window", "Workbox")
  @js.native
  open class Workbox protected ()
    extends typings.workboxWindow.workboxMod.Workbox {
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
  }
  
  @JSImport("workbox-window", "WorkboxEvent")
  @js.native
  open class WorkboxEvent[K /* <: message */] protected ()
    extends typings.workboxWindow.utilsWorkboxEventMod.WorkboxEvent[K] {
    def this(
      `type`: K,
      props: Omit[
            /* import warning: importer.ImportType#apply Failed type conversion: workbox-window.workbox-window/utils/WorkboxEvent.WorkboxEventMap[K] */ js.Any, 
            target | typings.workboxWindow.workboxWindowStrings.`type`
          ]
    ) = this()
  }
  
  /**
    * Sends a data object to a service worker via `postMessage` and resolves with
    * a response (if any).
    *
    * A response can be set in a message handler in the service worker by
    * calling `event.ports[0].postMessage(...)`, which will resolve the promise
    * returned by `messageSW()`. If no response is set, the promise will not
    * resolve.
    *
    * @param {ServiceWorker} sw The service worker to send the message to.
    * @param {Object} data An object to send to the service worker.
    * @return {Promise<Object|undefined>}
    * @memberof workbox-window
    */
  inline def messageSW(sw: ServiceWorker, data: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("messageSW")(sw.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
