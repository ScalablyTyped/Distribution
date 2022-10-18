package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading.
  */
@js.native
trait onDOMContentLoadedEvent
  extends StObject
     with Event[js.Function1[/* details */ OnDOMContentLoadedDetailsType, Unit]] {
  
  /**
    * Registers an event listener <em>callback</em> to an event.
    *
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * @param filters Optional. Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of
    * UrlFilter are ignored for this event.
    */
  def addListener(callback: js.Function1[/* details */ OnDOMContentLoadedDetailsType, Unit]): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ OnDOMContentLoadedDetailsType, Unit],
    filters: EventUrlFilters
  ): Unit = js.native
}
