package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows music file properties. */
@js.native
trait SystemMusicProperties extends js.Object {
  /** Gets the name of the System.Music.AlbumArtist property (one of the Windows music file properties). */
  var albumArtist: String = js.native
  /** Gets the name of the System.Music.AlbumTitle property (one of the Windows music file properties). */
  var albumTitle: String = js.native
  /** Gets the name of the System.Music.Artist property (one of the Windows music file properties). */
  var artist: String = js.native
  /** Gets the name of the System.Music.Composer property (one of the Windows music file properties). */
  var composer: String = js.native
  /** Gets the name of the System.Music.Conductor property (one of the Windows music file properties). */
  var conductor: String = js.native
  /** Gets the name of the System.Music.DisplayArtist property (one of the Windows music file properties). */
  var displayArtist: String = js.native
  /** Gets the name of the System.Music.Genre property (one of the Windows music file properties). */
  var genre: String = js.native
  /** Gets the name of the System.Music.TrackNumber property (one of the Windows music file properties). */
  var trackNumber: String = js.native
}

object SystemMusicProperties {
  @scala.inline
  def apply(
    albumArtist: String,
    albumTitle: String,
    artist: String,
    composer: String,
    conductor: String,
    displayArtist: String,
    genre: String,
    trackNumber: String
  ): SystemMusicProperties = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumTitle = albumTitle.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], conductor = conductor.asInstanceOf[js.Any], displayArtist = displayArtist.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMusicProperties]
  }
  @scala.inline
  implicit class SystemMusicPropertiesOps[Self <: SystemMusicProperties] (val x: Self) extends AnyVal {
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
    def setComposer(value: String): Self = this.set("composer", value.asInstanceOf[js.Any])
    @scala.inline
    def setConductor(value: String): Self = this.set("conductor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayArtist(value: String): Self = this.set("displayArtist", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackNumber(value: String): Self = this.set("trackNumber", value.asInstanceOf[js.Any])
  }
  
}

