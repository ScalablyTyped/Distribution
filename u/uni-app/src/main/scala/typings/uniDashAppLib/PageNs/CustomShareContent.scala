package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomShareContent extends js.Object {
  /**
    * 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径。支持PNG及JPG。显示图片长宽比是 5:4，默认值：使用默认截图
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 转发路径，必须是以 / 开头的完整路径。默认值：当前页面 path
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 转发标题。默认值：当前应用名称
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CustomShareContent {
  @scala.inline
  def apply(imageUrl: java.lang.String = null, path: java.lang.String = null, title: java.lang.String = null): CustomShareContent = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (path != null) __obj.updateDynamic("path")(path)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CustomShareContent]
  }
}

