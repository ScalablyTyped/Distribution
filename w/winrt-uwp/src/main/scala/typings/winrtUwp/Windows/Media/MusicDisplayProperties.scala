package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
trait MusicDisplayProperties extends js.Object {
  /** Gets or sets the name of the album artist. */
  var albumArtist: String
  /** Gets or sets the album title. */
  var albumTitle: String
  /** Gets or set the name of the song artist. */
  var artist: String
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String]
  /** Gets or set the title of the song. */
  var title: String
  /** Gets or sets the track number. */
  var trackNumber: Double
}

object MusicDisplayProperties {
  @scala.inline
  def apply(
    albumArtist: String,
    albumTitle: String,
    artist: String,
    genres: IVector[String],
    title: String,
    trackNumber: Double
  ): MusicDisplayProperties = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumTitle = albumTitle.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicDisplayProperties]
  }
}

