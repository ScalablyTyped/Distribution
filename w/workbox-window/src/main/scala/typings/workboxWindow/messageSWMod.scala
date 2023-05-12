package typings.workboxWindow

import typings.std.ServiceWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageSWMod {
  
  @JSImport("workbox-window/messageSW", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
