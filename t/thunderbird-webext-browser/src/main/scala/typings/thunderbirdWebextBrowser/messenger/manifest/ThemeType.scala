package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeType extends StObject {
  
  /**
    * A _dictionary object_ with one or more _key-value_ pairs to map color
    * values to theme color keys. The following built-in theme color keys
    * are supported:
    */
  var colors: js.UndefOr[ThemeTypeColors] = js.undefined
  
  /**
    * A _dictionary object_ with one or more _key-value_ pairs to map images
    * to theme image keys. The following built-in theme image keys are
    * supported:
    */
  var images: js.UndefOr[ThemeTypeImages] = js.undefined
  
  /**
    * A _dictionary object_ with one or more _key-value_ pairs to map
    * property values to theme property keys. The following built-in theme
    * property keys are supported:
    */
  var properties: js.UndefOr[_ThemeType] = js.undefined
}
object ThemeType {
  
  inline def apply(): ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeType] (val x: Self) extends AnyVal {
    
    inline def setColors(value: ThemeTypeColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setImages(value: ThemeTypeImages): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setProperties(value: _ThemeType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
