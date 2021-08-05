package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Facebook extends StObject {
  
  var og_description: js.UndefOr[Nullable[String]] = js.undefined
  
  var og_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var og_title: js.UndefOr[Nullable[String]] = js.undefined
}
object Facebook {
  
  inline def apply(): Facebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facebook]
  }
  
  extension [Self <: Facebook](x: Self) {
    
    inline def setOg_description(value: Nullable[String]): Self = StObject.set(x, "og_description", value.asInstanceOf[js.Any])
    
    inline def setOg_descriptionNull: Self = StObject.set(x, "og_description", null)
    
    inline def setOg_descriptionUndefined: Self = StObject.set(x, "og_description", js.undefined)
    
    inline def setOg_image(value: Nullable[String]): Self = StObject.set(x, "og_image", value.asInstanceOf[js.Any])
    
    inline def setOg_imageNull: Self = StObject.set(x, "og_image", null)
    
    inline def setOg_imageUndefined: Self = StObject.set(x, "og_image", js.undefined)
    
    inline def setOg_title(value: Nullable[String]): Self = StObject.set(x, "og_title", value.asInstanceOf[js.Any])
    
    inline def setOg_titleNull: Self = StObject.set(x, "og_title", null)
    
    inline def setOg_titleUndefined: Self = StObject.set(x, "og_title", js.undefined)
  }
}
