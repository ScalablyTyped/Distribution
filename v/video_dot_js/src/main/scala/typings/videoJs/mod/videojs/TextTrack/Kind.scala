package typings.videoJs.mod.videojs.TextTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.videoJs.videoJsStrings.subtitles
  - typings.videoJs.videoJsStrings.captions
  - typings.videoJs.videoJsStrings.descriptions
  - typings.videoJs.videoJsStrings.chapters
  - typings.videoJs.videoJsStrings.metadata
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def captions: typings.videoJs.videoJsStrings.captions = this.cast("captions")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chapters: typings.videoJs.videoJsStrings.chapters = this.cast("chapters")
  @scala.inline
  def descriptions: typings.videoJs.videoJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def metadata: typings.videoJs.videoJsStrings.metadata = this.cast("metadata")
  @scala.inline
  def subtitles: typings.videoJs.videoJsStrings.subtitles = this.cast("subtitles")
}

