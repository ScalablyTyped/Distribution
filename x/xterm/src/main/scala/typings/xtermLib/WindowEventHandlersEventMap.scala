package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventHandlersEventMap extends js.Object {
  var afterprint: Event
  var beforeprint: Event
  var beforeunload: BeforeUnloadEvent
  var hashchange: HashChangeEvent
  var languagechange: Event
  var message: MessageEvent
  var messageerror: MessageEvent
  var offline: Event
  var online: Event
  var pagehide: PageTransitionEvent
  var pageshow: PageTransitionEvent
  var popstate: PopStateEvent
  var rejectionhandled: Event
  var storage: StorageEvent
  var unhandledrejection: PromiseRejectionEvent
  var unload: Event
}

object WindowEventHandlersEventMap {
  @scala.inline
  def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    languagechange: Event,
    message: MessageEvent,
    messageerror: MessageEvent,
    offline: Event,
    online: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: PopStateEvent,
    rejectionhandled: Event,
    storage: StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterprint")(afterprint)
    __obj.updateDynamic("beforeprint")(beforeprint)
    __obj.updateDynamic("beforeunload")(beforeunload)
    __obj.updateDynamic("hashchange")(hashchange)
    __obj.updateDynamic("languagechange")(languagechange)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("messageerror")(messageerror)
    __obj.updateDynamic("offline")(offline)
    __obj.updateDynamic("online")(online)
    __obj.updateDynamic("pagehide")(pagehide)
    __obj.updateDynamic("pageshow")(pageshow)
    __obj.updateDynamic("popstate")(popstate)
    __obj.updateDynamic("rejectionhandled")(rejectionhandled)
    __obj.updateDynamic("storage")(storage)
    __obj.updateDynamic("unhandledrejection")(unhandledrejection)
    __obj.updateDynamic("unload")(unload)
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
}

