package typings.winrtDashUwp.WindowsNs.MediaNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
@JSGlobal("Windows.Media.MusicDisplayProperties")
@js.native
abstract class MusicDisplayProperties () extends js.Object {
  /** Gets or sets the name of the album artist. */
  var albumArtist: String = js.native
  /** Gets or sets the album title. */
  var albumTitle: String = js.native
  /** Gets or set the name of the song artist. */
  var artist: String = js.native
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String] = js.native
  /** Gets or set the title of the song. */
  var title: String = js.native
  /** Gets or sets the track number. */
  var trackNumber: Double = js.native
}

