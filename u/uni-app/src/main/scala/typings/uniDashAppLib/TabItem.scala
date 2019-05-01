package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabItem extends js.Object {
  /**
    * 被点击tabItem的序号，从0开始
    *
    * 参考: [http://uniapp.dcloud.io/frame?id=页面生命周期](http://uniapp.dcloud.io/frame?id=页面生命周期)
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * 被点击tabItem的页面路径
    *
    * 参考: [http://uniapp.dcloud.io/frame?id=页面生命周期](http://uniapp.dcloud.io/frame?id=页面生命周期)
    */
  var pagePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 被点击tabItem的按钮文字
    *
    * 参考: [http://uniapp.dcloud.io/frame?id=页面生命周期](http://uniapp.dcloud.io/frame?id=页面生命周期)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TabItem {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    pagePath: java.lang.String = null,
    text: java.lang.String = null
  ): TabItem = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pagePath != null) __obj.updateDynamic("pagePath")(pagePath)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TabItem]
  }
}

