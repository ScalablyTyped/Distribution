package typings.uniDashApp.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabItemTapOption extends js.Object {
  /**
    * 被点击 tabItem 的序号，从0开始
    */
  var index: String
  /**
    * 被点击 tabItem 的页面路径
    */
  var pagePath: String
  /**
    * 被点击 tabItem 的按钮文字
    */
  var text: String
}

object TabItemTapOption {
  @scala.inline
  def apply(index: String, pagePath: String, text: String): TabItemTapOption = {
    val __obj = js.Dynamic.literal(index = index, pagePath = pagePath, text = text)
  
    __obj.asInstanceOf[TabItemTapOption]
  }
}

