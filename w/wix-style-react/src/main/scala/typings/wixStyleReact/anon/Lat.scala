package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat extends StObject {
  
  def lat(): Double
  
  def lng(): Double
}
object Lat {
  
  inline def apply(lat: () => Double, lng: () => Double): Lat = {
    val __obj = js.Dynamic.literal(lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng))
    __obj.asInstanceOf[Lat]
  }
  
  extension [Self <: Lat](x: Self) {
    
    inline def setLat(value: () => Double): Self = StObject.set(x, "lat", js.Any.fromFunction0(value))
    
    inline def setLng(value: () => Double): Self = StObject.set(x, "lng", js.Any.fromFunction0(value))
  }
}
