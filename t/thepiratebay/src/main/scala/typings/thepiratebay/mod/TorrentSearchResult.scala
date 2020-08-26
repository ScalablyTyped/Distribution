package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentSearchResult extends Torrent {
  var category: Category = js.native
  var subcategory: Category = js.native
  var verified: Boolean = js.native
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
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], magnetLink = magnetLink.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subcategory = subcategory.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], uploaderLink = uploaderLink.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentSearchResult]
  }
  @scala.inline
  implicit class TorrentSearchResultOps[Self <: TorrentSearchResult] (val x: Self) extends AnyVal {
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
    def setCategory(value: Category): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubcategory(value: Category): Self = this.set("subcategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
  
}

