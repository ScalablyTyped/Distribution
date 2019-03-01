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
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[Torrent]
  }
}

