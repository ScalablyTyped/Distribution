package typings.summernote.mod.global.Summernote

import typings.summernote.summernoteStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverOptions extends StObject {
  
  var air: js.UndefOr[popoverAirDef] = js.undefined
  
  var image: js.UndefOr[popoverImageDef] = js.undefined
  
  var link: js.UndefOr[popoverLinkDef] = js.undefined
}
object PopoverOptions {
  
  inline def apply(): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOptions]
  }
  
  extension [Self <: PopoverOptions](x: Self) {
    
    inline def setAir(value: popoverAirDef): Self = StObject.set(x, "air", value.asInstanceOf[js.Any])
    
    inline def setAirUndefined: Self = StObject.set(x, "air", js.undefined)
    
    inline def setImage(value: popoverImageDef): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLink(value: popoverLinkDef): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: (js.Tuple2[link, js.Array[popoverLinkLinkOptions]])*): Self = StObject.set(x, "link", js.Array(value*))
  }
}
