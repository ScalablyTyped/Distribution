package typings.uniDashApp.Page

import typings.uniDashApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInstanceBaseProps[D /* <: AnyObject */] extends js.Object {
  /**
    * 到当前页面的路径，类型为 `String`
    */
  var route: js.UndefOr[String] = js.undefined
}

object PageInstanceBaseProps {
  @scala.inline
  def apply[D /* <: AnyObject */](route: String = null): PageInstanceBaseProps[D] = {
    val __obj = js.Dynamic.literal()
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[PageInstanceBaseProps[D]]
  }
}

