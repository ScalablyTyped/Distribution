package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashVideo.twilioDashVideoStrings.isac
  - typings.twilioDashVideo.twilioDashVideoStrings.opus
  - typings.twilioDashVideo.twilioDashVideoStrings.PCMA
  - typings.twilioDashVideo.twilioDashVideoStrings.PCMU
*/
trait AudioCodec extends js.Object

object AudioCodec {
  @scala.inline
  def PCMA: typings.twilioDashVideo.twilioDashVideoStrings.PCMA = this.cast("PCMA")
  @scala.inline
  def PCMU: typings.twilioDashVideo.twilioDashVideoStrings.PCMU = this.cast("PCMU")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def isac: typings.twilioDashVideo.twilioDashVideoStrings.isac = this.cast("isac")
  @scala.inline
  def opus: typings.twilioDashVideo.twilioDashVideoStrings.opus = this.cast("opus")
}

