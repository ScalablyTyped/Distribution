package typings
package atTinajsTinaLib.tinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageEvents extends js.Object {
  def onPageScroll(event: Page): scala.Unit
  def onPullDownRefresh(event: Page): scala.Unit
  def onReachBottom(event: Page): scala.Unit
  def onShareAppMessage(event: Page): scala.Unit
}

