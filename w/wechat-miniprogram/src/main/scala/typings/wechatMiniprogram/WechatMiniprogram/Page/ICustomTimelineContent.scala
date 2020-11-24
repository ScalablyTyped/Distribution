package typings.wechatMiniprogram.WechatMiniprogram.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomTimelineContent extends js.Object {
  
  /** 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径。支持 PNG 及 JPG。显示图片长宽比是 1:1。默认值：默认使用小程序 Logo*/
  var imageUrl: js.UndefOr[String] = js.native
  
  /** 自定义页面路径中携带的参数，如 `path?a=1&b=2` 的 “?” 后面部分 默认值：当前页面路径携带的参数 */
  var query: js.UndefOr[String] = js.native
  
  /** 自定义标题，即朋友圈列表页上显示的标题。默认值：当前小程序名称 */
  var title: js.UndefOr[String] = js.native
}
object ICustomTimelineContent {
  
  @scala.inline
  def apply(): ICustomTimelineContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomTimelineContent]
  }
  
  @scala.inline
  implicit class ICustomTimelineContentOps[Self <: ICustomTimelineContent] (val x: Self) extends AnyVal {
    
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
