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
    val __obj = js.Dynamic.literal(description = description, id = id, leechers = leechers, link = link, magnetLink = magnetLink, name = name, seeders = seeders, size = size, uploadDate = uploadDate, uploader = uploader, uploaderLink = uploaderLink)
  
    __obj.asInstanceOf[TorrentDetails]
  }
}

