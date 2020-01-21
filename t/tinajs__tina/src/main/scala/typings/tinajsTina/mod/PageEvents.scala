package typings.tinajsTina.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageEvents extends js.Object {
  def onPageScroll(event: Page): Unit
  def onPullDownRefresh(event: Page): Unit
  def onReachBottom(event: Page): Unit
  def onShareAppMessage(event: Page): Unit
}

object PageEvents {
  @scala.inline
  def apply(
    onPageScroll: Page => Unit,
    onPullDownRefresh: Page => Unit,
    onReachBottom: Page => Unit,
    onShareAppMessage: Page => Unit
  ): PageEvents = {
    val __obj = js.Dynamic.literal(onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction1(onPullDownRefresh), onReachBottom = js.Any.fromFunction1(onReachBottom), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage))
  
    __obj.asInstanceOf[PageEvents]
  }
}

