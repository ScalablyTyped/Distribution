package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoading extends StObject {
  
  var imageLoading: Boolean
  
  var popoverOpen: Boolean
  
  var previousImageUrl: Unit
}
object ImageLoading {
  
  inline def apply(imageLoading: Boolean, popoverOpen: Boolean, previousImageUrl: Unit): ImageLoading = {
    val __obj = js.Dynamic.literal(imageLoading = imageLoading.asInstanceOf[js.Any], popoverOpen = popoverOpen.asInstanceOf[js.Any], previousImageUrl = previousImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoading]
  }
  
  extension [Self <: ImageLoading](x: Self) {
    
    inline def setImageLoading(value: Boolean): Self = StObject.set(x, "imageLoading", value.asInstanceOf[js.Any])
    
    inline def setPopoverOpen(value: Boolean): Self = StObject.set(x, "popoverOpen", value.asInstanceOf[js.Any])
    
    inline def setPreviousImageUrl(value: Unit): Self = StObject.set(x, "previousImageUrl", value.asInstanceOf[js.Any])
  }
}
