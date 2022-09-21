package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTypeImagesType extends StObject {
  
  /**
    * Optional.
    */
  var additional_backgrounds: js.UndefOr[js.Array[ImageDataOrExtensionURL]] = js.undefined
  
  /**
    * Optional.
    */
  var theme_frame: js.UndefOr[ImageDataOrExtensionURL] = js.undefined
}
object ThemeTypeImagesType {
  
  inline def apply(): ThemeTypeImagesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTypeImagesType]
  }
  
  extension [Self <: ThemeTypeImagesType](x: Self) {
    
    inline def setAdditional_backgrounds(value: js.Array[ImageDataOrExtensionURL]): Self = StObject.set(x, "additional_backgrounds", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgroundsUndefined: Self = StObject.set(x, "additional_backgrounds", js.undefined)
    
    inline def setAdditional_backgroundsVarargs(value: ImageDataOrExtensionURL*): Self = StObject.set(x, "additional_backgrounds", js.Array(value*))
    
    inline def setTheme_frame(value: ImageDataOrExtensionURL): Self = StObject.set(x, "theme_frame", value.asInstanceOf[js.Any])
    
    inline def setTheme_frameUndefined: Self = StObject.set(x, "theme_frame", js.undefined)
  }
}
