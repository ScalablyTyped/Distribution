package typings
package workboxDashWindowLib.workboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window/Workbox", "Workbox")
@js.native
class Workbox protected ()
  extends workboxDashWindowLib.utilsEventTargetShimMod.EventTargetShim {
  /**
    * Creates a new Workbox instance with a script URL and service worker
    * options. The script URL and options are the same as those used when
    * calling `navigator.serviceWorker.register(scriptURL, options)`. See:
    * https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register
    */
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: java.lang.String, registerOptions: stdLib.RegistrationOptions) = this()
  /**
    * Resolves to the service worker registered by this instance as soon as it
    * is active. If a service worker was already controlling at registration
    * time then it will resolve to that if the script URLs (and optionally
    * script versions) match, otherwise it will wait until an update is found
    * and activates.
    */
  val active: js.Promise[stdLib.ServiceWorker] = js.native
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
  val controlling: js.Promise[stdLib.ServiceWorker] = js.native
  @JSName("addEventListener")
  def addEventListener_activated(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.activated,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controlling(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.controlling,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalactivated(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalinstalled(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalwaiting(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_installed(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.installed,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redundant(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.redundant,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, scala.Unit]
  ): scala.Unit = js.native
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
  def getSW(): js.Promise[stdLib.ServiceWorker] = js.native
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
  def messageSW(): js.Promise[js.Object] = js.native
  /**
    * Registers a service worker for this instances script URL and service
    * worker options. By default this method delays registration until after
    * the window has loaded.
    */
  def register(): js.Promise[stdLib.ServiceWorkerRegistration] = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.activated,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controlling(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.controlling,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalactivated(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalinstalled(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalwaiting(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_installed(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.installed,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redundant(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.redundant,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: workboxDashWindowLib.workboxDashWindowLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, scala.Unit]
  ): scala.Unit = js.native
}

