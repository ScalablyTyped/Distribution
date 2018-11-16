package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
@JSGlobal("Windows.Media.Playback.MediaPlayerDataReceivedEventArgs")
@js.native
abstract class MediaPlayerDataReceivedEventArgs () extends js.Object {
  /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
  var data: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
}

