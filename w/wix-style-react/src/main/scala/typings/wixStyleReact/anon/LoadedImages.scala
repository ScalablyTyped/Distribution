package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadedImages extends StObject {
  
  var loadedImages: js.Array[scala.Nothing]
  
  var sliderSettings: AfterChange
}
object LoadedImages {
  
  inline def apply(loadedImages: js.Array[scala.Nothing], sliderSettings: AfterChange): LoadedImages = {
    val __obj = js.Dynamic.literal(loadedImages = loadedImages.asInstanceOf[js.Any], sliderSettings = sliderSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedImages]
  }
  
  extension [Self <: LoadedImages](x: Self) {
    
    inline def setLoadedImages(value: js.Array[scala.Nothing]): Self = StObject.set(x, "loadedImages", value.asInstanceOf[js.Any])
    
    inline def setLoadedImagesVarargs(value: scala.Nothing*): Self = StObject.set(x, "loadedImages", js.Array(value*))
    
    inline def setSliderSettings(value: AfterChange): Self = StObject.set(x, "sliderSettings", value.asInstanceOf[js.Any])
  }
}
