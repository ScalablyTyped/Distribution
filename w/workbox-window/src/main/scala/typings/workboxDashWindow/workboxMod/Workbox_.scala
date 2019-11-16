package typings.workboxDashWindow.workboxMod

import typings.std.RegistrationOptions
import typings.std.ServiceWorker
import typings.std.ServiceWorkerRegistration
import typings.workboxDashWindow.typesWorkboxEventMapMod.WorkboxExtendableEvent
import typings.workboxDashWindow.typesWorkboxEventMapMod.WorkboxMessageEvent
import typings.workboxDashWindow.typesWorkboxEventMapMod.WorkboxUpdatableEvent
import typings.workboxDashWindow.typesWorkboxEventMapMod.WorkboxWaitingEvent
import typings.workboxDashWindow.typesWorkboxEventMod.WorkboxEvent
import typings.workboxDashWindow.utilsEventTargetShimMod.EventTargetShim
import typings.workboxDashWindow.workboxDashWindowStrings.activated
import typings.workboxDashWindow.workboxDashWindowStrings.externalactivated
import typings.workboxDashWindow.workboxDashWindowStrings.externalinstalled
import typings.workboxDashWindow.workboxDashWindowStrings.externalwaiting
import typings.workboxDashWindow.workboxDashWindowStrings.installed
import typings.workboxDashWindow.workboxDashWindowStrings.message
import typings.workboxDashWindow.workboxDashWindowStrings.redundant
import typings.workboxDashWindow.workboxDashWindowStrings.waiting
import typings.workboxDashWindow.workboxMod.Workbox.RegisterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window/Workbox", "Workbox")
@js.native
class Workbox_ protected () extends EventTargetShim {
  def this(scriptURL: String) = this()
  def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  val active: js.Promise[ServiceWorker] = js.native
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
  def addEventListener_installed(
    `type`: installed,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
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
  def getSW(): js.Promise[ServiceWorker] = js.native
  def messageSW(data: js.Any): js.Promise[_] = js.native
  def register(): js.Promise[ServiceWorkerRegistration] = js.native
  def register(options: RegisterOptions): js.Promise[ServiceWorkerRegistration] = js.native
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
  def removeEventListener_installed(
    `type`: installed,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
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

