package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoresOverlay
  extends StObject
     with OverlayView {
  
  /**
    * Clears selected store if any
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Sets the query used to fetch stores.
    * To clear the query set it to undefined.
    */
  def setQuery(): Unit = js.native
  def setQuery(query: String): Unit = js.native
  
  /**
    * Sets the selected store
    */
  def setSelection(feature: js.Object): Unit = js.native
  
  /**
    * Updates the style.
    */
  def setStyle(style: Style): Unit = js.native
}
