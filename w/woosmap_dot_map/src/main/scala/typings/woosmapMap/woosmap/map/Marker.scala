package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker
  extends StObject
     with MVCObject {
  
  /**
    * Returns true if the marker can be dragged
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Get the marker's offset.
    */
  def getOffset(): Point = js.native
  
  /**
    * Gets the marker opacity.
    */
  def getOpacity(): Double = js.native
  
  /**
    * Returns the current `pitchAlignment` property of the marker.
    */
  def getPitchAlignment(): String = js.native
  
  /**
    * Get the marker's geographical location.The longitude of the result may differ by a multiple of 360 degrees from the longitude previously
    * set by `setLngLat` because `Marker` wraps the anchor longitude across copies of the world to keep
    * the marker on screen.
    */
  def getPosition(): LatLng = js.native
  
  /**
    * Returns the current rotation angle of the marker (in degrees).
    */
  def getRotation(): Double = js.native
  
  /**
    * Returns the current `rotationAlignment` property of the marker.
    */
  def getRotationAlignment(): String = js.native
  
  var map: Map | Null = js.native
  
  var position: LatLng = js.native
  
  /**
    * Sets the `draggable` property and functionality of the marker
    */
  def setDraggable(shouldBeDraggable: Boolean): Marker = js.native
  
  def setIcon(icon: String): Unit = js.native
  def setIcon(icon: Icon): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the offset of the marker
    */
  def setOffset(offset: Point): Marker = js.native
  
  /**
    * Sets the marker opacity.
    */
  def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * Sets the `pitchAlignment` property of the marker.
    */
  def setPitchAlignment(): Marker = js.native
  def setPitchAlignment(alignment: String): Marker = js.native
  
  /**
    * Sets the position of the marker
    */
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: LatLngLiteral): Unit = js.native
  
  /**
    * Sets the `rotation` property of the marker.
    */
  def setRotation(rotation: Double): Marker = js.native
  
  /**
    * Sets the `rotationAlignment` property of the marker.
    */
  def setRotationAlignment(alignment: String): Marker = js.native
}
