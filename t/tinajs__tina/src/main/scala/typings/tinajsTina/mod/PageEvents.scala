package typings.tinajsTina.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageEvents extends js.Object {
  def onPageScroll(event: Page): Unit = js.native
  def onPullDownRefresh(event: Page): Unit = js.native
  def onReachBottom(event: Page): Unit = js.native
  def onShareAppMessage(event: Page): Unit = js.native
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
  @scala.inline
  implicit class PageEventsOps[Self <: PageEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnPageScroll(value: Page => Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPullDownRefresh(value: Page => Unit): Self = this.set("onPullDownRefresh", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReachBottom(value: Page => Unit): Self = this.set("onReachBottom", js.Any.fromFunction1(value))
    @scala.inline
    def setOnShareAppMessage(value: Page => Unit): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
  }
  
}

