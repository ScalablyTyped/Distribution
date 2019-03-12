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
    onPageScroll: Page => scala.Unit,
    onPullDownRefresh: Page => scala.Unit,
    onReachBottom: Page => scala.Unit,
    onShareAppMessage: Page => scala.Unit
  ): PageEvents = {
    val __obj = js.Dynamic.literal(onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction1(onPullDownRefresh), onReachBottom = js.Any.fromFunction1(onReachBottom), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage))
  
    __obj.asInstanceOf[PageEvents]
  }
}

