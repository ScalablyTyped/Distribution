package typings.winrtDashUwp.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a marker at specific location in a media stream time-line. */
trait IMediaMarker extends js.Object {
  /** Gets the type of the media marker. */
  var mediaMarkerType: String
  /** Gets the text associated with the marker. */
  var text: String
  /** Gets the offset in the media time-line that the marker occurs. */
  var time: Double
}

object IMediaMarker {
  @scala.inline
  def apply(mediaMarkerType: String, text: String, time: Double): IMediaMarker = {
    val __obj = js.Dynamic.literal(mediaMarkerType = mediaMarkerType, text = text, time = time)
  
    __obj.asInstanceOf[IMediaMarker]
  }
}

