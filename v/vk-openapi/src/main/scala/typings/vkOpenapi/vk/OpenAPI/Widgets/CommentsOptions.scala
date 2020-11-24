package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsOptions extends js.Object {
  
  var attach: js.UndefOr[String] = js.native
  
  var autoPublish: js.UndefOr[NumericBoolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var norealtime: js.UndefOr[NumericBoolean] = js.native
  
  var pageUrl: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object CommentsOptions {
  
  @scala.inline
  def apply(): CommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsOptions]
  }
  
  @scala.inline
  implicit class CommentsOptionsOps[Self <: CommentsOptions] (val x: Self) extends AnyVal {
    
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
    def setAttach(value: String): Self = this.set("attach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttach: Self = this.set("attach", js.undefined)
    
    @scala.inline
    def setAutoPublish(value: NumericBoolean): Self = this.set("autoPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPublish: Self = this.set("autoPublish", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setNorealtime(value: NumericBoolean): Self = this.set("norealtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNorealtime: Self = this.set("norealtime", js.undefined)
    
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
