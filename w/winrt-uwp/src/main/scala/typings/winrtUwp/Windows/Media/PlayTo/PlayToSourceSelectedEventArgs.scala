package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceSelected event. */
@JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
@js.native
abstract class PlayToSourceSelectedEventArgs () extends js.Object {
  /** Gets the display name of the selected Play To source. */
  var friendlyName: String = js.native
  /** Gets the display icon for the selected Play To source. */
  var icon: IRandomAccessStreamWithContentType = js.native
  /** Gets a value that indicates whether the selected Play To source supports audio. */
  var supportsAudio: Boolean = js.native
  /** Gets a value that indicates whether the selected Play To source supports displaying images. */
  var supportsImage: Boolean = js.native
  /** Gets a value that indicates whether the selected Play To source supports video. */
  var supportsVideo: Boolean = js.native
}

