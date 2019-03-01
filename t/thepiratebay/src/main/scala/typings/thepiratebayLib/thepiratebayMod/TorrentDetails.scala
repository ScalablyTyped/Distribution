package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentDetails extends Torrent {
  var description: java.lang.String
}

object TorrentDetails {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    leechers: java.lang.String,
    link: java.lang.String,
    magnetLink: java.lang.String,
    name: java.lang.String,
    seeders: java.lang.String,
    size: java.lang.String,
    uploadDate: java.lang.String,
    uploader: java.lang.String,
    uploaderLink: java.lang.String
  ): TorrentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("leechers")(leechers)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("magnetLink")(magnetLink)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("seeders")(seeders)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uploadDate")(uploadDate)
    __obj.updateDynamic("uploader")(uploader)
    __obj.updateDynamic("uploaderLink")(uploaderLink)
    __obj.asInstanceOf[TorrentDetails]
  }
}

