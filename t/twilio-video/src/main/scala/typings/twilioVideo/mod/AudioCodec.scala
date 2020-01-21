package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioVideo.twilioVideoStrings.isac
  - typings.twilioVideo.twilioVideoStrings.opus
  - typings.twilioVideo.twilioVideoStrings.PCMA
  - typings.twilioVideo.twilioVideoStrings.PCMU
*/
trait AudioCodec extends js.Object

object AudioCodec {
  @scala.inline
  def PCMA: typings.twilioVideo.twilioVideoStrings.PCMA = this.cast("PCMA")
  @scala.inline
  def PCMU: typings.twilioVideo.twilioVideoStrings.PCMU = this.cast("PCMU")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def isac: typings.twilioVideo.twilioVideoStrings.isac = this.cast("isac")
  @scala.inline
  def opus: typings.twilioVideo.twilioVideoStrings.opus = this.cast("opus")
}

