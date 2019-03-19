package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabItemTapOption extends js.Object {
  /**
    * 被点击tabItem的序号，从0开始
    */
  var index: java.lang.String
  /**
    * 被点击tabItem的页面路径
    */
  var pagePath: java.lang.String
  /**
    * 被点击tabItem的按钮文字
    */
  var text: java.lang.String
}

object TabItemTapOption {
  @scala.inline
  def apply(index: java.lang.String, pagePath: java.lang.String, text: java.lang.String): TabItemTapOption = {
    val __obj = js.Dynamic.literal(index = index, pagePath = pagePath, text = text)
  
    __obj.asInstanceOf[TabItemTapOption]
  }
}

