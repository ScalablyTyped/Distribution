package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a tab is updated.
  */
@js.native
trait onUpdatedEvent
  extends StObject
     with Event[
      js.Function3[/* tabId */ Double, /* changeInfo */ OnUpdatedChangeInfoType, /* tab */ Tab, Unit]
    ] {
  
  /**
    * Registers an event listener <em>callback</em> to an event.
    *
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * @param filter Optional. A set of filters that restricts the events that will be sent to this listener.
    */
  def addListener(
    callback: js.Function3[/* tabId */ Double, /* changeInfo */ OnUpdatedChangeInfoType, /* tab */ Tab, Unit]
  ): Unit = js.native
  def addListener(
    callback: js.Function3[/* tabId */ Double, /* changeInfo */ OnUpdatedChangeInfoType, /* tab */ Tab, Unit],
    filter: UpdateFilter
  ): Unit = js.native
}
