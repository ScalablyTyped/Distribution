package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameDashApi.wegameDashApiStrings.auto
  - typings.wegameDashApi.wegameDashApiStrings.buildInMic
  - typings.wegameDashApi.wegameDashApiStrings.headsetMic
  - typings.wegameDashApi.wegameDashApiStrings.mic
  - typings.wegameDashApi.wegameDashApiStrings.camcorder
*/
trait AudioSourceType extends js.Object

object AudioSourceType {
  @scala.inline
  def auto: typings.wegameDashApi.wegameDashApiStrings.auto = this.cast("auto")
  @scala.inline
  def buildInMic: typings.wegameDashApi.wegameDashApiStrings.buildInMic = this.cast("buildInMic")
  @scala.inline
  def camcorder: typings.wegameDashApi.wegameDashApiStrings.camcorder = this.cast("camcorder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def headsetMic: typings.wegameDashApi.wegameDashApiStrings.headsetMic = this.cast("headsetMic")
  @scala.inline
  def mic: typings.wegameDashApi.wegameDashApiStrings.mic = this.cast("mic")
}

