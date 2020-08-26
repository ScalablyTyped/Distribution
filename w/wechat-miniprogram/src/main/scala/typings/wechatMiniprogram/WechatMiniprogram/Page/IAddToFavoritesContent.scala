package typings.wechatMiniprogram.WechatMiniprogram.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddToFavoritesContent extends js.Object {
  /** 自定义图片，显示图片长宽比为 1：1，默认值：页面截图 */
  var imageUrl: js.UndefOr[String] = js.native
  /** 自定义query字段，默认值：当前页面的query */
  var query: js.UndefOr[String] = js.native
  /** 自定义标题，默认值：页面标题或账号名称 */
  var title: js.UndefOr[String] = js.native
}

object IAddToFavoritesContent {
  @scala.inline
  def apply(): IAddToFavoritesContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddToFavoritesContent]
  }
  @scala.inline
  implicit class IAddToFavoritesContentOps[Self <: IAddToFavoritesContent] (val x: Self) extends AnyVal {
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

