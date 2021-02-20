package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnityTrackMetadata extends StObject {
  
  // Optionals
  var album: String = js.native
  
  var artLocation: String = js.native
  
  var artist: String = js.native
  
  var title: String = js.native
}
object UnityTrackMetadata {
  
  @scala.inline
  def apply(album: String, artLocation: String, artist: String, title: String): UnityTrackMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artLocation = artLocation.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityTrackMetadata]
  }
  
  @scala.inline
  implicit class UnityTrackMetadataMutableBuilder[Self <: UnityTrackMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtLocation(value: String): Self = StObject.set(x, "artLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
