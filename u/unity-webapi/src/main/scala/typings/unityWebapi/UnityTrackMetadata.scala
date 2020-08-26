package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnityTrackMetadata extends js.Object {
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
  implicit class UnityTrackMetadataOps[Self <: UnityTrackMetadata] (val x: Self) extends AnyVal {
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
    def setArtLocation(value: String): Self = this.set("artLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

