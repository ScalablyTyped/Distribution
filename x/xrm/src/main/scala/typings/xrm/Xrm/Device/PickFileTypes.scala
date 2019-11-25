package typings.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Posible file types for Xrm.Device.pickFile options
  * @see {@link XrmEnum.DevicePickFileType}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.audio
  - typings.xrm.xrmStrings.video
  - typings.xrm.xrmStrings.image
*/
trait PickFileTypes extends js.Object

object PickFileTypes {
  @scala.inline
  def audio: typings.xrm.xrmStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.xrm.xrmStrings.image = this.cast("image")
  @scala.inline
  def video: typings.xrm.xrmStrings.video = this.cast("video")
}

