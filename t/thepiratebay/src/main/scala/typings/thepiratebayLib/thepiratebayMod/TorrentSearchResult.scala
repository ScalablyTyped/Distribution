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
    val __obj = js.Dynamic.literal(category = category, id = id, leechers = leechers, link = link, magnetLink = magnetLink, name = name, seeders = seeders, size = size, subcategory = subcategory, uploadDate = uploadDate, uploader = uploader, uploaderLink = uploaderLink, verified = verified)
  
    __obj.asInstanceOf[TorrentSearchResult]
  }
}

