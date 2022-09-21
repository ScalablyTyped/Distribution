package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends StObject
     with BaseGeometry {
  
  /**
    * Returns the bounds for the circle geometry.
    */
  def getBounds(): LatLngBounds = js.native
  
  /**
    * Returns the center for the circle geometry.
    */
  def getCenter(): LatLng = js.native
  
  /**
    * Returns the radius for the circle geometry.
    */
  def getRadius(): Double = js.native
  
  /**
    * Sets the center for the circle.
    */
  def setCenter(center: LatLng): Unit = js.native
  def setCenter(center: LatLngLiteral): Unit = js.native
  
  /**
    * Sets the options for the circle.
    */
  def setOptions(options: CircleOptions): Unit = js.native
  
  /**
    * Sets the radius for the circle.
    */
  def setRadius(radius: Double): Unit = js.native
}
