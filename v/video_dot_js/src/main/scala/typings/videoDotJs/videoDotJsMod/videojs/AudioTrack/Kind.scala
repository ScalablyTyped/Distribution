package typings.videoDotJs.videoDotJsMod.videojs.AudioTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All possible `AudioTrackKind`s
  *
  * @see https://html.spec.whatwg.org/multipage/embedded-content.html#dom-audiotrack-kind
  */
/* Rewritten from type alias, can be one of: 
  - typings.videoDotJs.videoDotJsStrings.alternative
  - typings.videoDotJs.videoDotJsStrings.descriptions
  - typings.videoDotJs.videoDotJsStrings.main
  - typings.videoDotJs.videoDotJsStrings.`main-desc`
  - typings.videoDotJs.videoDotJsStrings.translation
  - typings.videoDotJs.videoDotJsStrings.commentary
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def alternative: typings.videoDotJs.videoDotJsStrings.alternative = this.cast("alternative")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commentary: typings.videoDotJs.videoDotJsStrings.commentary = this.cast("commentary")
  @scala.inline
  def descriptions: typings.videoDotJs.videoDotJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def main: typings.videoDotJs.videoDotJsStrings.main = this.cast("main")
  @scala.inline
  def `main-desc`: typings.videoDotJs.videoDotJsStrings.`main-desc` = this.cast("main-desc")
  @scala.inline
  def translation: typings.videoDotJs.videoDotJsStrings.translation = this.cast("translation")
}

