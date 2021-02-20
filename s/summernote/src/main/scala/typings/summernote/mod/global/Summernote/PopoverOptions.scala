package typings.summernote.mod.global.Summernote

import typings.summernote.summernoteStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverOptions extends StObject {
  
  var air: js.UndefOr[popoverAirDef] = js.native
  
  var image: js.UndefOr[popoverImageDef] = js.native
  
  var link: js.UndefOr[popoverLinkDef] = js.native
}
object PopoverOptions {
  
  @scala.inline
  def apply(): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOptions]
  }
  
  @scala.inline
  implicit class PopoverOptionsMutableBuilder[Self <: PopoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAir(value: popoverAirDef): Self = StObject.set(x, "air", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirUndefined: Self = StObject.set(x, "air", js.undefined)
    
    @scala.inline
    def setImage(value: popoverImageDef): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLink(value: popoverLinkDef): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: (js.Tuple2[link, js.Array[popoverLinkLinkOptions]])*): Self = StObject.set(x, "link", js.Array(value :_*))
  }
}
