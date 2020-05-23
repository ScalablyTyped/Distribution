package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaMetadata extends js.Object {
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
}

