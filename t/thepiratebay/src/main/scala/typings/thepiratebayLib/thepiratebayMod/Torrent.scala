package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var id: java.lang.String
  var leechers: java.lang.String
  var link: java.lang.String
  var magnetLink: java.lang.String
  var name: java.lang.String
  var seeders: java.lang.String
  var size: java.lang.String
  var uploadDate: java.lang.String
  var uploader: java.lang.String
  var uploaderLink: java.lang.String
}

object Torrent {
  @scala.inline
  def apply(
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
  ): Torrent = {
    val __obj = js.Dynamic.literal(id = id, leechers = leechers, link = link, magnetLink = magnetLink, name = name, seeders = seeders, size = size, uploadDate = uploadDate, uploader = uploader, uploaderLink = uploaderLink)
  
    __obj.asInstanceOf[Torrent]
  }
}

