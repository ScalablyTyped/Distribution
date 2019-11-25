package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameDashApi.wegameDashApiStrings.wifi
  - typings.wegameDashApi.wegameDashApiStrings.`2g`
  - typings.wegameDashApi.wegameDashApiStrings.`3g`
  - typings.wegameDashApi.wegameDashApiStrings.`4g`
  - typings.wegameDashApi.wegameDashApiStrings.unknown
  - typings.wegameDashApi.wegameDashApiStrings.none
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2g`: typings.wegameDashApi.wegameDashApiStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typings.wegameDashApi.wegameDashApiStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typings.wegameDashApi.wegameDashApiStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.wegameDashApi.wegameDashApiStrings.none = this.cast("none")
  @scala.inline
  def unknown: typings.wegameDashApi.wegameDashApiStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typings.wegameDashApi.wegameDashApiStrings.wifi = this.cast("wifi")
}

