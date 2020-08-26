package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
@js.native
trait MusicDisplayProperties extends js.Object {
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
  @scala.inline
  implicit class MusicDisplayPropertiesOps[Self <: MusicDisplayProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlbumArtist(value: String): Self = this.set("albumArtist", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlbumTitle(value: String): Self = this.set("albumTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenres(value: IVector[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackNumber(value: Double): Self = this.set("trackNumber", value.asInstanceOf[js.Any])
  }
  
}

