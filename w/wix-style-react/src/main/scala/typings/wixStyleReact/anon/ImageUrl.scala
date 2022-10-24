package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageUrl extends StObject {
  
  var dataHook: Any
  
  var imageUrl: Any
  
  var key: Any
  
  var onError: Any
  
  var onLoad: Any
  
  var shouldDisplay: Any
}
object ImageUrl {
  
  inline def apply(dataHook: Any, imageUrl: Any, key: Any, onError: Any, onLoad: Any, shouldDisplay: Any): ImageUrl = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], shouldDisplay = shouldDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  
  extension [Self <: ImageUrl](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: Any): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnLoad(value: Any): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setShouldDisplay(value: Any): Self = StObject.set(x, "shouldDisplay", value.asInstanceOf[js.Any])
  }
}
