package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
@JSGlobal("Windows.Media.MusicDisplayProperties")
@js.native
abstract class MusicDisplayProperties () extends js.Object {
  /** Gets or sets the name of the album artist. */
  var albumArtist: java.lang.String = js.native
  /** Gets or sets the album title. */
  var albumTitle: java.lang.String = js.native
  /** Gets or set the name of the song artist. */
  var artist: java.lang.String = js.native
  /** Gets a modifiable list of strings representing genre names. */
  var genres: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or set the title of the song. */
  var title: java.lang.String = js.native
  /** Gets or sets the track number. */
  var trackNumber: scala.Double = js.native
}

