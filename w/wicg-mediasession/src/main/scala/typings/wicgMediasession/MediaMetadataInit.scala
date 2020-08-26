package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaMetadataInit extends js.Object {
  // Media's album.
  var album: js.UndefOr[String] = js.native
  // Media's artist.
  var artist: js.UndefOr[String] = js.native
  // Media's artwork.
  var artwork: js.UndefOr[js.Array[MediaImage]] = js.native
  // Media's title.
  var title: js.UndefOr[String] = js.native
}

object MediaMetadataInit {
  @scala.inline
  def apply(): MediaMetadataInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaMetadataInit]
  }
  @scala.inline
  implicit class MediaMetadataInitOps[Self <: MediaMetadataInit] (val x: Self) extends AnyVal {
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
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    @scala.inline
    def setArtworkVarargs(value: MediaImage*): Self = this.set("artwork", js.Array(value :_*))
    @scala.inline
    def setArtwork(value: js.Array[MediaImage]): Self = this.set("artwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtwork: Self = this.set("artwork", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

