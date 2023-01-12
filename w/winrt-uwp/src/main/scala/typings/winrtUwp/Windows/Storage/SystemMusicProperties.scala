package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for Windows music file properties. */
trait SystemMusicProperties extends StObject {
  
  /** Gets the name of the System.Music.AlbumArtist property (one of the Windows music file properties). */
  var albumArtist: String
  
  /** Gets the name of the System.Music.AlbumTitle property (one of the Windows music file properties). */
  var albumTitle: String
  
  /** Gets the name of the System.Music.Artist property (one of the Windows music file properties). */
  var artist: String
  
  /** Gets the name of the System.Music.Composer property (one of the Windows music file properties). */
  var composer: String
  
  /** Gets the name of the System.Music.Conductor property (one of the Windows music file properties). */
  var conductor: String
  
  /** Gets the name of the System.Music.DisplayArtist property (one of the Windows music file properties). */
  var displayArtist: String
  
  /** Gets the name of the System.Music.Genre property (one of the Windows music file properties). */
  var genre: String
  
  /** Gets the name of the System.Music.TrackNumber property (one of the Windows music file properties). */
  var trackNumber: String
}
object SystemMusicProperties {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SystemMusicProperties] (val x: Self) extends AnyVal {
    
    inline def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    inline def setAlbumTitle(value: String): Self = StObject.set(x, "albumTitle", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    inline def setConductor(value: String): Self = StObject.set(x, "conductor", value.asInstanceOf[js.Any])
    
    inline def setDisplayArtist(value: String): Self = StObject.set(x, "displayArtist", value.asInstanceOf[js.Any])
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setTrackNumber(value: String): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
  }
}
