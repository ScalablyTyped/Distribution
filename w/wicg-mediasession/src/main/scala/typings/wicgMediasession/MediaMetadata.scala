package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaMetadata extends StObject {
  
  // Media's album.
  var album: String
  
  // Media's artist.
  var artist: String
  
  // Media's artwork.
  var artwork: js.Array[MediaImage]
  
  // Media's title.
  var title: String
}
object MediaMetadata {
  
  @scala.inline
  def apply(album: String, artist: String, artwork: js.Array[MediaImage], title: String): MediaMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaMetadata]
  }
  
  @scala.inline
  implicit class MediaMetadataMutableBuilder[Self <: MediaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtwork(value: js.Array[MediaImage]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkVarargs(value: MediaImage*): Self = StObject.set(x, "artwork", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
