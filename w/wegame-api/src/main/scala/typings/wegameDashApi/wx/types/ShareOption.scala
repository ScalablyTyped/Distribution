package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOption extends js.Object {
  /**
    * 转发显示图片的链接，可以是网络图片路径或本地图片文件路径或相对代码包根目录的图片文件路径。显示图片长宽比是 5:4
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * 查询字符串，必须是 key1=val1&key2=val2 的格式。从这条转发消息进入后，可通过 wx.getLaunchOptionsSync() 或 wx.onShow 获取启动参数中的 query。
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * 转发标题，不传则默认使用当前小游戏的昵称。
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShareOption {
  @scala.inline
  def apply(imageUrl: String = null, query: String = null, title: String = null): ShareOption = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOption]
  }
}

