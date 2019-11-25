package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----网络状态
/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.`2g`
  - typings.weixinDashApp.weixinDashAppStrings.`3g`
  - typings.weixinDashApp.weixinDashAppStrings.`4g`
  - typings.weixinDashApp.weixinDashAppStrings.wifi
  - typings.weixinDashApp.weixinDashAppStrings.unknown
  - typings.weixinDashApp.weixinDashAppStrings.none
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typings.weixinDashApp.weixinDashAppStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typings.weixinDashApp.weixinDashAppStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typings.weixinDashApp.weixinDashAppStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.weixinDashApp.weixinDashAppStrings.none = this.cast("none")
  @scala.inline
  def unknown: typings.weixinDashApp.weixinDashAppStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typings.weixinDashApp.weixinDashAppStrings.wifi = this.cast("wifi")
}

