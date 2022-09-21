package typings.yandexMaps.anon

import typings.yandexMaps.mod.geometry.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPolygonFromEncodedCoordinates extends StObject {
  
  /* static member */
  def fromEncodedCoordinates(encodedCoordinates: String): Polygon
  
  /* static member */
  def toEncodedCoordinates(geometry: Polygon): String
}
object TypeofPolygonFromEncodedCoordinates {
  
  inline def apply(fromEncodedCoordinates: String => Polygon, toEncodedCoordinates: Polygon => String): TypeofPolygonFromEncodedCoordinates = {
    val __obj = js.Dynamic.literal(fromEncodedCoordinates = js.Any.fromFunction1(fromEncodedCoordinates), toEncodedCoordinates = js.Any.fromFunction1(toEncodedCoordinates))
    __obj.asInstanceOf[TypeofPolygonFromEncodedCoordinates]
  }
  
  extension [Self <: TypeofPolygonFromEncodedCoordinates](x: Self) {
    
    inline def setFromEncodedCoordinates(value: String => Polygon): Self = StObject.set(x, "fromEncodedCoordinates", js.Any.fromFunction1(value))
    
    inline def setToEncodedCoordinates(value: Polygon => String): Self = StObject.set(x, "toEncodedCoordinates", js.Any.fromFunction1(value))
  }
}
