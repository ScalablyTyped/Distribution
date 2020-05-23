package typings.umtrackWx.mod.UMA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UMAStatic extends js.Object {
  def init(_underscore: InitParams): Unit = js.native
  def setOpenid(openid: String): Unit = js.native
  def setUnionid(unionid: String): Unit = js.native
  def trackEvent(eventName: String): Unit = js.native
  def trackEvent(eventName: String, eventParams: EventParams): Unit = js.native
}

