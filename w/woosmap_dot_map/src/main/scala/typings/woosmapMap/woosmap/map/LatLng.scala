package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLng extends StObject {
  
  /**
    * Comparison function.
    */
  def equals(other: LatLng): Boolean
  
  /**
    * Returns the latitude in degrees.
    */
  def lat(): Double
  
  /**
    * Returns the longitude in degrees.
    */
  def lng(): Double
  
  /**
    * Converts to JSON representation. This function is intended to be used via `JSON.stringify`.
    */
  def toJSON(): LatLngLiteral
}
object LatLng {
  
  inline def apply(equals_ : LatLng => Boolean, lat: () => Double, lng: () => Double, toJSON: () => LatLngLiteral): LatLng = {
    val __obj = js.Dynamic.literal(lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LatLng]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLng] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: LatLng => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setLat(value: () => Double): Self = StObject.set(x, "lat", js.Any.fromFunction0(value))
    
    inline def setLng(value: () => Double): Self = StObject.set(x, "lng", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => LatLngLiteral): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
