package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageScrollOption extends js.Object {
  /**
    * 页面在垂直方向已滚动的距离（单位px）
    */
  var scrollTop: scala.Double
}

object PageScrollOption {
  @scala.inline
  def apply(scrollTop: scala.Double): PageScrollOption = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop)
  
    __obj.asInstanceOf[PageScrollOption]
  }
}

