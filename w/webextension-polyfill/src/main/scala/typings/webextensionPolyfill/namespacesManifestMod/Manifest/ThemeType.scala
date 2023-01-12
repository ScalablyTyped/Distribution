package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeType extends StObject {
  
  /**
    * Optional.
    */
  var colors: js.UndefOr[ThemeTypeColorsType] = js.undefined
  
  /**
    * Optional.
    */
  var images: js.UndefOr[ThemeTypeImagesType] = js.undefined
  
  /**
    * Optional.
    */
  var properties: js.UndefOr[ThemeTypePropertiesType] = js.undefined
}
object ThemeType {
  
  inline def apply(): ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeType] (val x: Self) extends AnyVal {
    
    inline def setColors(value: ThemeTypeColorsType): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setImages(value: ThemeTypeImagesType): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setProperties(value: ThemeTypePropertiesType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
