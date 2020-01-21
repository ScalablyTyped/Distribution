package typings.twilioVideo.mod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioVideo.twilioVideoStrings.audio
  - typings.twilioVideo.twilioVideoStrings.video
  - typings.twilioVideo.twilioVideoStrings.data
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def audio: typings.twilioVideo.twilioVideoStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.twilioVideo.twilioVideoStrings.data = this.cast("data")
  @scala.inline
  def video: typings.twilioVideo.twilioVideoStrings.video = this.cast("video")
}

