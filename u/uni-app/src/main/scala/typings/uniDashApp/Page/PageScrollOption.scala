package typings.uniDashApp.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageScrollOption extends js.Object {
  /**
    * 页面在垂直方向已滚动的距离（单位 px）
    */
  var scrollTop: Double
}

object PageScrollOption {
  @scala.inline
  def apply(scrollTop: Double): PageScrollOption = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop)
  
    __obj.asInstanceOf[PageScrollOption]
  }
}

