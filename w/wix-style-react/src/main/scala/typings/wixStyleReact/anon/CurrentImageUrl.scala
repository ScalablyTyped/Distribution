package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentImageUrl extends StObject {
  
  var currentImageUrl: Any
  
  var previousImageUrl: Unit
}
object CurrentImageUrl {
  
  inline def apply(currentImageUrl: Any, previousImageUrl: Unit): CurrentImageUrl = {
    val __obj = js.Dynamic.literal(currentImageUrl = currentImageUrl.asInstanceOf[js.Any], previousImageUrl = previousImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentImageUrl]
  }
  
  extension [Self <: CurrentImageUrl](x: Self) {
    
    inline def setCurrentImageUrl(value: Any): Self = StObject.set(x, "currentImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviousImageUrl(value: Unit): Self = StObject.set(x, "previousImageUrl", value.asInstanceOf[js.Any])
  }
}
