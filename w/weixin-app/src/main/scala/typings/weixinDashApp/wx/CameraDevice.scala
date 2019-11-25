package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.front
  - typings.weixinDashApp.weixinDashAppStrings.back
*/
trait CameraDevice extends js.Object

object CameraDevice {
  @scala.inline
  def back: typings.weixinDashApp.weixinDashAppStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def front: typings.weixinDashApp.weixinDashAppStrings.front = this.cast("front")
}

