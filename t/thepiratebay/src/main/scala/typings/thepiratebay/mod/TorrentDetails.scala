package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentDetails extends Torrent {
  var description: String = js.native
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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], magnetLink = magnetLink.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], uploaderLink = uploaderLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentDetails]
  }
  @scala.inline
  implicit class TorrentDetailsOps[Self <: TorrentDetails] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
  
}

