package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatLngBounds extends StObject {
  
  /**
    * Checks if current bounds contain latlng.
    */
  def contains(latlng: LatLng): Boolean = js.native
  def contains(latlng: LatLngLiteral): Boolean = js.native
  
  /**
    * Extends the current bounds with point.
    */
  def extend(latlng: LatLng): Unit = js.native
  def extend(latlng: LatLngLiteral): Unit = js.native
  
  /**
    * Computes the center of the latlng bounds.
    */
  def getCenter(): LatLng = js.native
  
  /**
    * Returns the north-east corner of this bounds.
    */
  def getNorthEast(): LatLng = js.native
  
  /**
    * Returns the south-west corner of this bounds.
    */
  def getSouthWest(): LatLng = js.native
  
  /**
    * Checks if bounds are intersecting with other.
    */
  def intersects(other: LatLngBounds): Boolean = js.native
  
  /**
    * Checks if the current bounds are empty.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Computes the union of this bounds and other.
    */
  def union(other: LatLngBounds): Unit = js.native
}
