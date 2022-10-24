package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewBrandingClass extends StObject {
  
  var newBrandingClass: String
  
  var newColorsBranding: Boolean
}
object NewBrandingClass {
  
  inline def apply(newBrandingClass: String, newColorsBranding: Boolean): NewBrandingClass = {
    val __obj = js.Dynamic.literal(newBrandingClass = newBrandingClass.asInstanceOf[js.Any], newColorsBranding = newColorsBranding.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewBrandingClass]
  }
  
  extension [Self <: NewBrandingClass](x: Self) {
    
    inline def setNewBrandingClass(value: String): Self = StObject.set(x, "newBrandingClass", value.asInstanceOf[js.Any])
    
    inline def setNewColorsBranding(value: Boolean): Self = StObject.set(x, "newColorsBranding", value.asInstanceOf[js.Any])
  }
}
