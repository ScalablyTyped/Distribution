package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaMetadata extends js.Object {
  
  // Media's album.
  var album: String = js.native
  
  // Media's artist.
  var artist: String = js.native
  
  // Media's artwork.
  var artwork: js.Array[MediaImage] = js.native
  
  // Media's title.
  var title: String = js.native
}
object MediaMetadata {
  
  @scala.inline
  def apply(album: String, artist: String, artwork: js.Array[MediaImage], title: String): MediaMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaMetadata]
  }
  
  @scala.inline
  implicit class MediaMetadataOps[Self <: MediaMetadata] (val x: Self) extends AnyVal {
    
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
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkVarargs(value: MediaImage*): Self = this.set("artwork", js.Array(value :_*))
    
    @scala.inline
    def setArtwork(value: js.Array[MediaImage]): Self = this.set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
