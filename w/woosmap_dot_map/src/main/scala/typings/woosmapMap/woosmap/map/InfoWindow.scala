package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow
  extends StObject
     with MVCObject {
  
  /**
    * Closes this InfoWindow by removing it from the DOM structure.
    */
  def close(): Unit = js.native
  
  /**
    * Gets the current map bound to the
    */
  def getMap(): Map | Null = js.native
  
  def open(map: Map, anchor: LatLng): Unit = js.native
  def open(map: Map, anchor: LatLngLiteral): Unit = js.native
  /**
    * Opens the info window.
    */
  def open(map: Map, anchor: Marker): Unit = js.native
  
  /**
    * Sets the info window content
    */
  def setContent(content: String): Unit = js.native
  
  /**
    * Sets the info window map.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the marker
    */
  def setMarker(): Unit = js.native
  def setMarker(marker: Marker): Unit = js.native
  
  /**
    * Sets the offset
    */
  def setOffset(offset: Point): Unit = js.native
  
  def setPosition(positionOrMarker: LatLng): Unit = js.native
  def setPosition(positionOrMarker: LatLngLiteral): Unit = js.native
  /**
    * Sets the anchor
    */
  def setPosition(positionOrMarker: Marker): Unit = js.native
}
