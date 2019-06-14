package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Possible file types for Xrm.Device.pickFile options
  * @see {@link Xrm.Device.PickFileTypes}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.audio
  - xrmLib.xrmLibStrings.video
  - xrmLib.xrmLibStrings.image
*/
trait DevicePickFileType extends js.Object

object DevicePickFileType {
  @scala.inline
  def Audio: xrmLib.xrmLibStrings.audio = this.cast("audio")
  @scala.inline
  def Image: xrmLib.xrmLibStrings.image = this.cast("image")
  @scala.inline
  def Video: xrmLib.xrmLibStrings.video = this.cast("video")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

