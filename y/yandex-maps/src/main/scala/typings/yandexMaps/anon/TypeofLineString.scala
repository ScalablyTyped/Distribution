package typings.yandexMaps.anon

import typings.yandexMaps.mod.geometry.LineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLineString extends StObject {
  
  /* static member */
  def fromEncodedCoordinates(encodedCoordinates: String): LineString
  
  /* static member */
  def toEncodedCoordinates(geometry: LineString): String
}
object TypeofLineString {
  
  inline def apply(fromEncodedCoordinates: String => LineString, toEncodedCoordinates: LineString => String): TypeofLineString = {
    val __obj = js.Dynamic.literal(fromEncodedCoordinates = js.Any.fromFunction1(fromEncodedCoordinates), toEncodedCoordinates = js.Any.fromFunction1(toEncodedCoordinates))
    __obj.asInstanceOf[TypeofLineString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLineString] (val x: Self) extends AnyVal {
    
    inline def setFromEncodedCoordinates(value: String => LineString): Self = StObject.set(x, "fromEncodedCoordinates", js.Any.fromFunction1(value))
    
    inline def setToEncodedCoordinates(value: LineString => String): Self = StObject.set(x, "toEncodedCoordinates", js.Any.fromFunction1(value))
  }
}
