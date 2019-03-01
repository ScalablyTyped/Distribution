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
    beforeLoad: js.Function1[Page, scala.Unit],
    onHide: js.Function1[Page, scala.Unit],
    onLoad: js.Function1[Page, scala.Unit],
    onReady: js.Function1[Page, scala.Unit],
    onShow: js.Function1[Page, scala.Unit],
    onUnload: js.Function1[Page, scala.Unit]
  ): PageHooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLoad")(beforeLoad)
    __obj.updateDynamic("onHide")(onHide)
    __obj.updateDynamic("onLoad")(onLoad)
    __obj.updateDynamic("onReady")(onReady)
    __obj.updateDynamic("onShow")(onShow)
    __obj.updateDynamic("onUnload")(onUnload)
    __obj.asInstanceOf[PageHooks]
  }
}

