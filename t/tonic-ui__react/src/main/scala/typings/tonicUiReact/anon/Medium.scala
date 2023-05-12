package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var medium: String
  
  var thick: String
  
  var thin: String
}
object Medium {
  
  inline def apply(medium: String, thick: String, thin: String): Medium = {
    val __obj = js.Dynamic.literal(medium = medium.asInstanceOf[js.Any], thick = thick.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medium]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Medium] (val x: Self) extends AnyVal {
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setThick(value: String): Self = StObject.set(x, "thick", value.asInstanceOf[js.Any])
    
    inline def setThin(value: String): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
  }
}
