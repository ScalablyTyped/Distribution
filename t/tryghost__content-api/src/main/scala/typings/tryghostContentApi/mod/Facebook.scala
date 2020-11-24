package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Facebook extends js.Object {
  
  var og_description: js.UndefOr[Nullable[String]] = js.native
  
  var og_image: js.UndefOr[Nullable[String]] = js.native
  
  var og_title: js.UndefOr[Nullable[String]] = js.native
}
object Facebook {
  
  @scala.inline
  def apply(): Facebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facebook]
  }
  
  @scala.inline
  implicit class FacebookOps[Self <: Facebook] (val x: Self) extends AnyVal {
    
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
    def setOg_description(value: Nullable[String]): Self = this.set("og_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOg_description: Self = this.set("og_description", js.undefined)
    
    @scala.inline
    def setOg_descriptionNull: Self = this.set("og_description", null)
    
    @scala.inline
    def setOg_image(value: Nullable[String]): Self = this.set("og_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOg_image: Self = this.set("og_image", js.undefined)
    
    @scala.inline
    def setOg_imageNull: Self = this.set("og_image", null)
    
    @scala.inline
    def setOg_title(value: Nullable[String]): Self = this.set("og_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOg_title: Self = this.set("og_title", js.undefined)
    
    @scala.inline
    def setOg_titleNull: Self = this.set("og_title", null)
  }
}
