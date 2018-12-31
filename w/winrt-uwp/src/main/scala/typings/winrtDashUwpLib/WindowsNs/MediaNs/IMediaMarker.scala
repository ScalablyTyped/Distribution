package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a marker at specific location in a media stream time-line. */
trait IMediaMarker extends js.Object {
  /** Gets the type of the media marker. */
  var mediaMarkerType: java.lang.String
  /** Gets the text associated with the marker. */
  var text: java.lang.String
  /** Gets the offset in the media time-line that the marker occurs. */
  var time: scala.Double
}

