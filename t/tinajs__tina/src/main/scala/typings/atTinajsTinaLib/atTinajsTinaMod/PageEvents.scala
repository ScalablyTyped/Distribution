package typings
package atTinajsTinaLib.atTinajsTinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageEvents extends js.Object {
  def onPageScroll(event: Page): scala.Unit
  def onPullDownRefresh(event: Page): scala.Unit
  def onReachBottom(event: Page): scala.Unit
  def onShareAppMessage(event: Page): scala.Unit
}

object PageEvents {
  @scala.inline
  def apply(
    onPageScroll: js.Function1[Page, scala.Unit],
    onPullDownRefresh: js.Function1[Page, scala.Unit],
    onReachBottom: js.Function1[Page, scala.Unit],
    onShareAppMessage: js.Function1[Page, scala.Unit]
  ): PageEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPageScroll")(onPageScroll)
    __obj.updateDynamic("onPullDownRefresh")(onPullDownRefresh)
    __obj.updateDynamic("onReachBottom")(onReachBottom)
    __obj.updateDynamic("onShareAppMessage")(onShareAppMessage)
    __obj.asInstanceOf[PageEvents]
  }
}

