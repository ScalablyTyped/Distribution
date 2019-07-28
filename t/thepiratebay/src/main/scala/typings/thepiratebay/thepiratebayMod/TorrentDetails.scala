package typings.thepiratebay.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentDetails extends Torrent {
  var description: String
}

object TorrentDetails {
  @scala.inline
  def apply(
    description: String,
    id: String,
    leechers: String,
    link: String,
    magnetLink: String,
    name: String,
    seeders: String,
    size: String,
    uploadDate: String,
    uploader: String,
    uploaderLink: String
  ): TorrentDetails = {
    val __obj = js.Dynamic.literal(description = description, id = id, leechers = leechers, link = link, magnetLink = magnetLink, name = name, seeders = seeders, size = size, uploadDate = uploadDate, uploader = uploader, uploaderLink = uploaderLink)
  
    __obj.asInstanceOf[TorrentDetails]
  }
}

