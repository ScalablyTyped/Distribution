package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a navigation is committed. The document (and the resources it refers to, such as images and subframes)
  * might still be downloading, but at least part of the document has been received from the server and the browser has
  * decided to switch to the new document.
  */
@js.native
trait onCommittedEvent
  extends StObject
     with Event[js.Function1[/* details */ OnCommittedDetailsType, Unit]] {
  
  /**
    * Registers an event listener <em>callback</em> to an event.
    *
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * @param filters Optional. Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of
    * UrlFilter are ignored for this event.
    */
  def addListener(callback: js.Function1[/* details */ OnCommittedDetailsType, Unit]): Unit = js.native
  def addListener(callback: js.Function1[/* details */ OnCommittedDetailsType, Unit], filters: EventUrlFilters): Unit = js.native
}
