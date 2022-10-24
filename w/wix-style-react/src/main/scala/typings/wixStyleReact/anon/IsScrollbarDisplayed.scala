package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsScrollbarDisplayed extends StObject {
  
  var isScrollbarDisplayed: Boolean
}
object IsScrollbarDisplayed {
  
  inline def apply(isScrollbarDisplayed: Boolean): IsScrollbarDisplayed = {
    val __obj = js.Dynamic.literal(isScrollbarDisplayed = isScrollbarDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsScrollbarDisplayed]
  }
  
  extension [Self <: IsScrollbarDisplayed](x: Self) {
    
    inline def setIsScrollbarDisplayed(value: Boolean): Self = StObject.set(x, "isScrollbarDisplayed", value.asInstanceOf[js.Any])
  }
}
