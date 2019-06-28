package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInstanceBaseProps[D /* <: uniDashAppLib.AnyObject */] extends js.Object {
  /**
    * 到当前页面的路径，类型为 `String`
    */
  var route: js.UndefOr[java.lang.String] = js.undefined
}

object PageInstanceBaseProps {
  @scala.inline
  def apply[D /* <: uniDashAppLib.AnyObject */](route: java.lang.String = null): PageInstanceBaseProps[D] = {
    val __obj = js.Dynamic.literal()
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[PageInstanceBaseProps[D]]
  }
}

