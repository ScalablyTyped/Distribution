package typings.workboxDashWindow.workboxMod

import typings.std.RegistrationOptions
import typings.std.ServiceWorker
import typings.std.ServiceWorkerRegistration
import typings.workboxDashWindow.utilsEventTargetShimMod.EventTargetShim
import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent
import typings.workboxDashWindow.workboxDashWindowStrings.activated
import typings.workboxDashWindow.workboxDashWindowStrings.externalactivated
import typings.workboxDashWindow.workboxDashWindowStrings.externalinstalled
import typings.workboxDashWindow.workboxDashWindowStrings.externalwaiting
import typings.workboxDashWindow.workboxDashWindowStrings.installed
import typings.workboxDashWindow.workboxDashWindowStrings.message
import typings.workboxDashWindow.workboxDashWindowStrings.redundant
import typings.workboxDashWindow.workboxDashWindowStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window/Workbox", "Workbox")
@js.native
class Workbox protected () extends EventTargetShim {
  /**
    * Creates a new Workbox instance with a script URL and service worker
    * options. The script URL and options are the same as those used when
    * calling `navigator.serviceWorker.register(scriptURL, options)`. See:
    * https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register
    */
  def this(scriptURL: String) = this()
  def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  /**
    * Resolves to the service worker registered by this instance as soon as it
    * is active. If a service worker was already controlling at registration
    * time then it will resolve to that if the script URLs (and optionally
    * script versions) match, otherwise it will wait until an update is found
    * and activates.
    */
  val active: js.Promise[ServiceWorker] = js.native
  /**
    * Resolves to the service worker registered by this instance as soon as it
    * is controlling the page. If a service worker was already controlling at
    * registration time then it will resolve to that if the script URLs (and
    * optionally script versions) match, otherwise it will wait until an update
    * is found and starts controlling the page.
    * Note: the first time a service worker is installed it will active but
    * not start controlling the page unless `clients.claim()` is called in the
    * service worker.
    */
  val controlling: js.Promise[ServiceWorker] = js.native
  @JSName("addEventListener")
  def addEventListener_activated(
    `type`: activated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controlling(
    `type`: typings.workboxDashWindow.workboxDashWindowStrings.controlling,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalactivated(
    `type`: externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalinstalled(
    `type`: externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalwaiting(
    `type`: externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_installed(`type`: installed, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redundant(`type`: redundant, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, Unit]
  ): Unit = js.native
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
    */
  def getSW(): js.Promise[ServiceWorker] = js.native
  /**
    * Sends the passed data object to the service worker registered by this
    * instance (via [`getSW()`]{@link module:workbox-window.Workbox#getSW}) and resolves
    * with a response (if any).
    *
    * A response can be set in a message handler in the service worker by
    * calling `event.ports[0].postMessage(...)`, which will resolve the promise
    * returned by `messageSW()`. If no response is set, the promise will never
    * resolve.
    */
  def messageSW(data: js.Any): js.Promise[js.Object] = js.native
  /**
    * Registers a service worker for this instances script URL and service
    * worker options. By default this method delays registration until after
    * the window has loaded.
    */
  def register(): js.Promise[ServiceWorkerRegistration] = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(
    `type`: activated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controlling(
    `type`: typings.workboxDashWindow.workboxDashWindowStrings.controlling,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalactivated(
    `type`: externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalinstalled(
    `type`: externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalwaiting(
    `type`: externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_installed(`type`: installed, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redundant(`type`: redundant, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, Unit]
  ): Unit = js.native
}

