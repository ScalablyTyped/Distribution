package typings
package atTinajsTinaLib.atTinajsTinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHooks extends js.Object {
  def beforeLoad(`this`: Page): scala.Unit
  def onHide(`this`: Page): scala.Unit
  def onLoad(`this`: Page): scala.Unit
  def onReady(`this`: Page): scala.Unit
  def onShow(`this`: Page): scala.Unit
  def onUnload(`this`: Page): scala.Unit
}

object PageHooks {
  @scala.inline
  def apply(
    beforeLoad: Page => scala.Unit,
    onHide: Page => scala.Unit,
    onLoad: Page => scala.Unit,
    onReady: Page => scala.Unit,
    onShow: Page => scala.Unit,
    onUnload: Page => scala.Unit
  ): PageHooks = {
    val __obj = js.Dynamic.literal(beforeLoad = js.Any.fromFunction1(beforeLoad), onHide = js.Any.fromFunction1(onHide), onLoad = js.Any.fromFunction1(onLoad), onReady = js.Any.fromFunction1(onReady), onShow = js.Any.fromFunction1(onShow), onUnload = js.Any.fromFunction1(onUnload))
  
    __obj.asInstanceOf[PageHooks]
  }
}

