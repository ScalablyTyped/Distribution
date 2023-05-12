package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTypeImages extends StObject {
  
  /**
    * Additional images added to the header area and displayed behind the
    * `theme_frame` image.
    */
  var additional_backgrounds: js.UndefOr[js.Array[ImageDataOrExtensionURL]] = js.undefined
  
  /**
    * @deprecated Unsupported images property, use
    * `theme.images.theme_frame`, this alias is ignored in
    * Thunderbird >= 70.
    */
  var headerURL: js.UndefOr[ImageDataOrExtensionURL] = js.undefined
  
  /** Foreground image on the header area. */
  var theme_frame: js.UndefOr[ImageDataOrExtensionURL] = js.undefined
}
object ThemeTypeImages {
  
  inline def apply(): ThemeTypeImages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTypeImages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeTypeImages] (val x: Self) extends AnyVal {
    
    inline def setAdditional_backgrounds(value: js.Array[ImageDataOrExtensionURL]): Self = StObject.set(x, "additional_backgrounds", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgroundsUndefined: Self = StObject.set(x, "additional_backgrounds", js.undefined)
    
    inline def setAdditional_backgroundsVarargs(value: ImageDataOrExtensionURL*): Self = StObject.set(x, "additional_backgrounds", js.Array(value*))
    
    inline def setHeaderURL(value: ImageDataOrExtensionURL): Self = StObject.set(x, "headerURL", value.asInstanceOf[js.Any])
    
    inline def setHeaderURLUndefined: Self = StObject.set(x, "headerURL", js.undefined)
    
    inline def setTheme_frame(value: ImageDataOrExtensionURL): Self = StObject.set(x, "theme_frame", value.asInstanceOf[js.Any])
    
    inline def setTheme_frameUndefined: Self = StObject.set(x, "theme_frame", js.undefined)
  }
}
