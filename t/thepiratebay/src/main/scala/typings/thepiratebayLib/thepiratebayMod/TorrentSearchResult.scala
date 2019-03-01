package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentSearchResult extends Torrent {
  var category: Category
  var subcategory: Category
  var verified: scala.Boolean
}

object TorrentSearchResult {
  @scala.inline
  def apply(
    category: Category,
    id: java.lang.String,
    leechers: java.lang.String,
    link: java.lang.String,
    magnetLink: java.lang.String,
    name: java.lang.String,
    seeders: java.lang.String,
    size: java.lang.String,
    subcategory: Category,
    uploadDate: java.lang.String,
    uploader: java.lang.String,
    uploaderLink: java.lang.String,
    verified: scala.Boolean
  ): TorrentSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("leechers")(leechers)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("magnetLink")(magnetLink)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("seeders")(seeders)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("subcategory")(subcategory)
    __obj.updateDynamic("uploadDate")(uploadDate)
    __obj.updateDynamic("uploader")(uploader)
    __obj.updateDynamic("uploaderLink")(uploaderLink)
    __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[TorrentSearchResult]
  }
}

