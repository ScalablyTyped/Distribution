package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
	 */
trait PageLifetimes extends js.Object {
  def hide(): scala.Unit
  def show(): scala.Unit
}

object PageLifetimes {
  @scala.inline
  def apply(hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): PageLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[PageLifetimes]
  }
}

