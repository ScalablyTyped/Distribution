package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaMetadataInit extends js.Object {
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
  @scala.inline
  def apply(
    album: String = null,
    artist: String = null,
    artwork: js.Array[MediaImage] = null,
    title: String = null
  ): MediaMetadataInit = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaMetadataInit]
  }
}

