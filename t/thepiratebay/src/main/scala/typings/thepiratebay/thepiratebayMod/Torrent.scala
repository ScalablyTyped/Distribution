package typings.thepiratebay.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var id: String
  var leechers: String
  var link: String
  var magnetLink: String
  var name: String
  var seeders: String
  var size: String
  var uploadDate: String
  var uploader: String
  var uploaderLink: String
}

object Torrent {
  @scala.inline
  def apply(
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
  ): Torrent = {
    val __obj = js.Dynamic.literal(id = id, leechers = leechers, link = link, magnetLink = magnetLink, name = name, seeders = seeders, size = size, uploadDate = uploadDate, uploader = uploader, uploaderLink = uploaderLink)
  
    __obj.asInstanceOf[Torrent]
  }
}

