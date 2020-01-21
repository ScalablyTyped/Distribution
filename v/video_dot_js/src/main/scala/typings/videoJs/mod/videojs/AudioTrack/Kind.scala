package typings.videoJs.mod.videojs.AudioTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All possible `AudioTrackKind`s
  *
  * @see https://html.spec.whatwg.org/multipage/embedded-content.html#dom-audiotrack-kind
  */
/* Rewritten from type alias, can be one of: 
  - typings.videoJs.videoJsStrings.alternative
  - typings.videoJs.videoJsStrings.descriptions
  - typings.videoJs.videoJsStrings.main
  - typings.videoJs.videoJsStrings.`main-desc`
  - typings.videoJs.videoJsStrings.translation
  - typings.videoJs.videoJsStrings.commentary
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def alternative: typings.videoJs.videoJsStrings.alternative = this.cast("alternative")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commentary: typings.videoJs.videoJsStrings.commentary = this.cast("commentary")
  @scala.inline
  def descriptions: typings.videoJs.videoJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def main: typings.videoJs.videoJsStrings.main = this.cast("main")
  @scala.inline
  def `main-desc`: typings.videoJs.videoJsStrings.`main-desc` = this.cast("main-desc")
  @scala.inline
  def translation: typings.videoJs.videoJsStrings.translation = this.cast("translation")
}

