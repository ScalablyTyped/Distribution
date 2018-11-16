package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceSelected event. */
@JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
@js.native
abstract class PlayToSourceSelectedEventArgs () extends js.Object {
  /** Gets the display name of the selected Play To source. */
  var friendlyName: java.lang.String = js.native
  /** Gets the display icon for the selected Play To source. */
  var icon: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType = js.native
  /** Gets a value that indicates whether the selected Play To source supports audio. */
  var supportsAudio: scala.Boolean = js.native
  /** Gets a value that indicates whether the selected Play To source supports displaying images. */
  var supportsImage: scala.Boolean = js.native
  /** Gets a value that indicates whether the selected Play To source supports video. */
  var supportsVideo: scala.Boolean = js.native
}

