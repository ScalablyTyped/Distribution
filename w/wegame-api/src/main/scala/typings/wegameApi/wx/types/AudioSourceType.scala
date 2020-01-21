package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameApi.wegameApiStrings.auto
  - typings.wegameApi.wegameApiStrings.buildInMic
  - typings.wegameApi.wegameApiStrings.headsetMic
  - typings.wegameApi.wegameApiStrings.mic
  - typings.wegameApi.wegameApiStrings.camcorder
*/
trait AudioSourceType extends js.Object

object AudioSourceType {
  @scala.inline
  def auto: typings.wegameApi.wegameApiStrings.auto = this.cast("auto")
  @scala.inline
  def buildInMic: typings.wegameApi.wegameApiStrings.buildInMic = this.cast("buildInMic")
  @scala.inline
  def camcorder: typings.wegameApi.wegameApiStrings.camcorder = this.cast("camcorder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def headsetMic: typings.wegameApi.wegameApiStrings.headsetMic = this.cast("headsetMic")
  @scala.inline
  def mic: typings.wegameApi.wegameApiStrings.mic = this.cast("mic")
}

