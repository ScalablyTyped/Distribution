package typings.winrtUwp.global.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a marker at specific location in a media stream time-line. */
@JSGlobal("Windows.Media.Playback.PlaybackMediaMarker")
@js.native
class PlaybackMediaMarker protected ()
  extends typings.winrtUwp.Windows.Media.Playback.PlaybackMediaMarker {
  /**
    * Initializes a new instance of the PlaybackMediaMarker class with the specified offset into the media timeline.
    * @param value The media marker's offset into the media timeline.
    */
  def this(value: Double) = this()
  /**
    * Initializes a new instance of the PlaybackMediaMarker class with the specified offset into the media timeline, type string, and text.
    * @param value The media marker's offset into the media timeline.
    * @param mediaMarketType The type of the media marker.
    * @param text The text of the media marker.
    */
  def this(value: Double, mediaMarketType: String, text: String) = this()
  /** Gets the type of the media marker. */
  /* CompleteClass */
  override var mediaMarkerType: String = js.native
  /** Gets the text associated with the marker. */
  /* CompleteClass */
  override var text: String = js.native
  /** Gets the offset in the media timeline where the marker occurs. */
  /* CompleteClass */
  override var time: Double = js.native
}

