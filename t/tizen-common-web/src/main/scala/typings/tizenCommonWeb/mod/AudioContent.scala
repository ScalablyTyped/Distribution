package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContent
  extends StObject
     with Content_ {
  
  /**
    * The album name to which the audio belongs.
    */
  val album: String | Null
  
  /**
    * The list of artists who created the audio.
    */
  val artists: js.Array[String] | Null
  
  /**
    * The audio bitrate in bits per second. By default, this value is 0.
    */
  val bitrate: Double
  
  /**
    * The list of composers for the music.
    */
  val composers: js.Array[String] | Null
  
  /**
    * The copyright information.
    */
  val copyright: String | Null
  
  /**
    * The audio duration in milliseconds.
    */
  val duration: Double
  
  /**
    * The list of genres to which the audio belongs.
    */
  val genres: js.Array[String] | Null
  
  /**
    * The lyrics of a song in an audio file.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  val lyrics: AudioContentLyrics | Null
  
  /**
    * The track number if the audio belongs to an album.
    */
  val trackNumber: Double | Null
}
object AudioContent {
  
  inline def apply(
    bitrate: Double,
    contentURI: String,
    duration: Double,
    editableAttributes: js.Array[String],
    id: ContentId,
    isFavorite: Boolean,
    mimeType: String,
    name: String,
    rating: Double,
    size: Double,
    title: String,
    `type`: ContentType
  ): AudioContent = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], contentURI = contentURI.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editableAttributes = editableAttributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFavorite = isFavorite.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], album = null, artists = null, composers = null, copyright = null, description = null, genres = null, lyrics = null, modifiedDate = null, releaseDate = null, thumbnailURIs = null, trackNumber = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioContent] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumNull: Self = StObject.set(x, "album", null)
    
    inline def setArtists(value: js.Array[String]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsNull: Self = StObject.set(x, "artists", null)
    
    inline def setArtistsVarargs(value: String*): Self = StObject.set(x, "artists", js.Array(value*))
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setComposers(value: js.Array[String]): Self = StObject.set(x, "composers", value.asInstanceOf[js.Any])
    
    inline def setComposersNull: Self = StObject.set(x, "composers", null)
    
    inline def setComposersVarargs(value: String*): Self = StObject.set(x, "composers", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setGenresNull: Self = StObject.set(x, "genres", null)
    
    inline def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value*))
    
    inline def setLyrics(value: AudioContentLyrics): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
    
    inline def setLyricsNull: Self = StObject.set(x, "lyrics", null)
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackNumberNull: Self = StObject.set(x, "trackNumber", null)
  }
}
