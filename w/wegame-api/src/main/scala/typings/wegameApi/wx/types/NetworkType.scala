package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameApi.wegameApiStrings.wifi
  - typings.wegameApi.wegameApiStrings.`2g`
  - typings.wegameApi.wegameApiStrings.`3g`
  - typings.wegameApi.wegameApiStrings.`4g`
  - typings.wegameApi.wegameApiStrings.unknown
  - typings.wegameApi.wegameApiStrings.none
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2g`: typings.wegameApi.wegameApiStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typings.wegameApi.wegameApiStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typings.wegameApi.wegameApiStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.wegameApi.wegameApiStrings.none = this.cast("none")
  @scala.inline
  def unknown: typings.wegameApi.wegameApiStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typings.wegameApi.wegameApiStrings.wifi = this.cast("wifi")
}

