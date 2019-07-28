package typings.thepiratebay.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentSearchResult extends Torrent {
  var category: Category
  var subcategory: Category
  var verified: Boolean
}

object TorrentSearchResult {
  @scala.inline
  def apply(
    category: Category,
    id: String,
    leechers: String,
    link: String,
    magnetLink: String,
    name: String,
    seeders: String,
    size: String,
    subcategory: Category,
    uploadDate: String,
    uploader: String,
    uploaderLink: String,
    verified: Boolean
  ): TorrentSearchResult = {
    val __obj = js.Dynamic.literal(category = category, id = id, leechers = leechers, link = link, magnetLink = magnetLink, name = name, seeders = seeders, size = size, subcategory = subcategory, uploadDate = uploadDate, uploader = uploader, uploaderLink = uploaderLink, verified = verified)
  
    __obj.asInstanceOf[TorrentSearchResult]
  }
}

