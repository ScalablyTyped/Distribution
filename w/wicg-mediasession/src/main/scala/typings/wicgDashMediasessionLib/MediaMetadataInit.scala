package typings
package wicgDashMediasessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaMetadataInit extends js.Object {
  // Media's album.
  var album: js.UndefOr[java.lang.String] = js.undefined
  // Media's artist.
  var artist: js.UndefOr[java.lang.String] = js.undefined
  // Media's artwork.
  var artwork: js.UndefOr[js.Array[MediaImage]] = js.undefined
  // Media's title.
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MediaMetadataInit {
  @scala.inline
  def apply(
    album: java.lang.String = null,
    artist: java.lang.String = null,
    artwork: js.Array[MediaImage] = null,
    title: java.lang.String = null
  ): MediaMetadataInit = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (artwork != null) __obj.updateDynamic("artwork")(artwork)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MediaMetadataInit]
  }
}

