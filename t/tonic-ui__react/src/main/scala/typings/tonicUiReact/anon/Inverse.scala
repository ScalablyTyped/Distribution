package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverse extends StObject {
  
  var inverse: String
  
  var primary: String
  
  var secondary: String
  
  var tertiary: String
}
object Inverse {
  
  inline def apply(inverse: String, primary: String, secondary: String, tertiary: String): Inverse = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], tertiary = tertiary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inverse] (val x: Self) extends AnyVal {
    
    inline def setInverse(value: String): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setTertiary(value: String): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
  }
}
