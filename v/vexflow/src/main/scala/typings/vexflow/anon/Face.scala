package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Face extends StObject {
  
  var face: String
  
  var point: Double
  
  var style: String
}
object Face {
  
  inline def apply(face: String, point: Double, style: String): Face = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
    
    inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Double): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
