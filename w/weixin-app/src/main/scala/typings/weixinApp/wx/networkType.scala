package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----网络状态
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.`2g`
  - typings.weixinApp.weixinAppStrings.`3g`
  - typings.weixinApp.weixinAppStrings.`4g`
  - typings.weixinApp.weixinAppStrings.wifi
  - typings.weixinApp.weixinAppStrings.unknown
  - typings.weixinApp.weixinAppStrings.none
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typings.weixinApp.weixinAppStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typings.weixinApp.weixinAppStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typings.weixinApp.weixinAppStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.weixinApp.weixinAppStrings.none = this.cast("none")
  @scala.inline
  def unknown: typings.weixinApp.weixinAppStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typings.weixinApp.weixinAppStrings.wifi = this.cast("wifi")
}

