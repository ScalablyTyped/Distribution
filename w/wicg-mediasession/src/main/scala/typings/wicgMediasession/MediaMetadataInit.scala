package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaMetadataInit extends StObject {
  
  // Media's album.
  var album: js.UndefOr[String] = js.undefined
  
  // Media's artist.
  var artist: js.UndefOr[String] = js.undefined
  
  // Media's artwork.
  var artwork: js.UndefOr[js.Array[MediaImage]] = js.undefined
  
  // Media's title.
  var title: js.UndefOr[String] = js.undefined
}
object MediaMetadataInit {
  
  inline def apply(): MediaMetadataInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaMetadataInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaMetadataInit] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    inline def setArtwork(value: js.Array[MediaImage]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    inline def setArtworkVarargs(value: MediaImage*): Self = StObject.set(x, "artwork", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
