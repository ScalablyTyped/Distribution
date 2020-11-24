package typings.summernote.mod.global.Summernote

import typings.summernote.summernoteStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverOptions extends js.Object {
  
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
  implicit class PopoverOptionsOps[Self <: PopoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAir(value: popoverAirDef): Self = this.set("air", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAir: Self = this.set("air", js.undefined)
    
    @scala.inline
    def setImage(value: popoverImageDef): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: (js.Tuple2[link, js.Array[popoverLinkLinkOptions]])*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: popoverLinkDef): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
