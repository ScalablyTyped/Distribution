package typings.winrtUwp.global.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
@JSGlobal("Windows.Media.Playback.MediaPlayerDataReceivedEventArgs")
@js.native
abstract class MediaPlayerDataReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Playback.MediaPlayerDataReceivedEventArgs {
  /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
  /* CompleteClass */
  override var data: IMap[String, String] = js.native
}

