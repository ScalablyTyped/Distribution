package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFormShown extends StObject {
  
  var isFormShown: Boolean
}
object IsFormShown {
  
  inline def apply(isFormShown: Boolean): IsFormShown = {
    val __obj = js.Dynamic.literal(isFormShown = isFormShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFormShown]
  }
  
  extension [Self <: IsFormShown](x: Self) {
    
    inline def setIsFormShown(value: Boolean): Self = StObject.set(x, "isFormShown", value.asInstanceOf[js.Any])
  }
}
