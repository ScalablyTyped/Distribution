package typings.woosmapMap.woosmap.map

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends StObject
     with MVCObject {
  
  /**
    * An instance of `Data`, bound to the map.
    * Add features to this `Data` object to conveniently display them on this map.
    */
  var data: Data_ = js.native
  
  /**
    * Sets the viewport to contain the given bounds.
    */
  def fitBounds(bounds: LatLngBounds): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Padding): Unit = js.native
  
  /**
    * Returns the lat/lng bounds of the current viewport.
    * Optionally takes a padding parameter.
    */
  def getBounds(): LatLngBounds = js.native
  def getBounds(padding: Padding): LatLngBounds = js.native
  
  /**
    * Returns the position displayed at the center of the map.
    */
  def getCenter(): LatLng = js.native
  
  def getDiv(): HTMLElement = js.native
  
  /**
    * Returns the compass heading.
    * The heading value is measured in degrees (clockwise) from cardinal direction North.
    */
  def getHeading(): Double = js.native
  
  /**
    * Returns the current angle of incidence of the map, in degrees from the viewport plane to the map plane
    */
  def getTilt(): Double = js.native
  
  /**
    * Returns the current angle of incidence of the map, in degrees from the viewport plane to the map plane.
    */
  def getZoom(): Double = js.native
  
  /**
    * Changes the center of the map by the given distance in pixels
    */
  def panBy(x: Double, y: Double): Unit = js.native
  
  /**
    * Changes the center of the map to the given LatLng.
    */
  def panTo(latLng: LatLng): Unit = js.native
  def panTo(latLng: LatLngLiteral): Unit = js.native
  def panTo(latLng: LatLngLiteral, padding: Padding): Unit = js.native
  def panTo(latLng: LatLng, padding: Padding): Unit = js.native
  
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  /**
    * Pans the map by the minimum amount necessary to contain the given LatLngBounds.
    * It makes no guarantee where on the map the bounds will be,
    * except that the map will be panned to show as much of the bounds as possible inside
    * `{currentMapSizeInPx} - {padding}.`
    */
  def panToBounds(latLngBounds: LatLngBounds, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Padding): Unit = js.native
  
  /**
    * Sets the map center
    */
  def setCenter(center: LatLng): Unit = js.native
  def setCenter(center: LatLngLiteral): Unit = js.native
  def setCenter(center: LatLngLiteral, padding: Padding): Unit = js.native
  def setCenter(center: LatLng, padding: Padding): Unit = js.native
  
  /**
    * Sets the compass heading for map measured in degrees from cardinal direction North.
    */
  def setHeading(heading: Double): Unit = js.native
  
  def setTilt(tilt: Double): Unit = js.native
  
  def setZoom(zoom: Double): Unit = js.native
}
