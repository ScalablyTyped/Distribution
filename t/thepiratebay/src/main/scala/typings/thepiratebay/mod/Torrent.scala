package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends js.Object {
  var id: String = js.native
  var leechers: String = js.native
  var link: String = js.native
  var magnetLink: String = js.native
  var name: String = js.native
  var seeders: String = js.native
  var size: String = js.native
  var uploadDate: String = js.native
  var uploader: String = js.native
  var uploaderLink: String = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], magnetLink = magnetLink.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], uploaderLink = uploaderLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeechers(value: String): Self = this.set("leechers", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagnetLink(value: String): Self = this.set("magnetLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeeders(value: String): Self = this.set("seeders", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDate(value: String): Self = this.set("uploadDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploader(value: String): Self = this.set("uploader", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploaderLink(value: String): Self = this.set("uploaderLink", value.asInstanceOf[js.Any])
  }
  
}

