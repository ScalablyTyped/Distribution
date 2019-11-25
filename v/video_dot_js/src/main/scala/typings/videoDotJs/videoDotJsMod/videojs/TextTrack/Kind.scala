package typings.videoDotJs.videoDotJsMod.videojs.TextTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.videoDotJs.videoDotJsStrings.subtitles
  - typings.videoDotJs.videoDotJsStrings.captions
  - typings.videoDotJs.videoDotJsStrings.descriptions
  - typings.videoDotJs.videoDotJsStrings.chapters
  - typings.videoDotJs.videoDotJsStrings.metadata
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def captions: typings.videoDotJs.videoDotJsStrings.captions = this.cast("captions")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chapters: typings.videoDotJs.videoDotJsStrings.chapters = this.cast("chapters")
  @scala.inline
  def descriptions: typings.videoDotJs.videoDotJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def metadata: typings.videoDotJs.videoDotJsStrings.metadata = this.cast("metadata")
  @scala.inline
  def subtitles: typings.videoDotJs.videoDotJsStrings.subtitles = this.cast("subtitles")
}

