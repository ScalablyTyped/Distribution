package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated URL.
  */
@js.native
trait onHistoryStateUpdatedEvent
  extends StObject
     with Event[js.Function1[/* details */ OnHistoryStateUpdatedDetailsType, Unit]] {
  
  /**
    * Registers an event listener <em>callback</em> to an event.
    *
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * @param filters Optional. Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of
    * UrlFilter are ignored for this event.
    */
  def addListener(callback: js.Function1[/* details */ OnHistoryStateUpdatedDetailsType, Unit]): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ OnHistoryStateUpdatedDetailsType, Unit],
    filters: EventUrlFilters
  ): Unit = js.native
}
