package typings.wordpressApiFetch.anon

import typings.wordpressApiFetch.wordpressApiFetchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var author: js.UndefOr[`true`] = js.native
  var comments: js.UndefOr[`true`] = js.native
  var `custom-fields`: js.UndefOr[`true`] = js.native
  var editor: js.UndefOr[`true`] = js.native
  var excerpt: js.UndefOr[`true`] = js.native
  var `page-attributes`: js.UndefOr[`true`] = js.native
  var `post-formats`: js.UndefOr[`true`] = js.native
  var revisions: js.UndefOr[`true`] = js.native
  var thumbnail: js.UndefOr[`true`] = js.native
  var title: js.UndefOr[`true`] = js.native
  var trackbacks: js.UndefOr[`true`] = js.native
}

object Author {
  @scala.inline
  def apply(): Author = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
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
    def setAuthor(value: `true`): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setComments(value: `true`): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def `setCustom-fields`(value: `true`): Self = this.set("custom-fields", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCustom-fields`: Self = this.set("custom-fields", js.undefined)
    @scala.inline
    def setEditor(value: `true`): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setExcerpt(value: `true`): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcerpt: Self = this.set("excerpt", js.undefined)
    @scala.inline
    def `setPage-attributes`(value: `true`): Self = this.set("page-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-attributes`: Self = this.set("page-attributes", js.undefined)
    @scala.inline
    def `setPost-formats`(value: `true`): Self = this.set("post-formats", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePost-formats`: Self = this.set("post-formats", js.undefined)
    @scala.inline
    def setRevisions(value: `true`): Self = this.set("revisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisions: Self = this.set("revisions", js.undefined)
    @scala.inline
    def setThumbnail(value: `true`): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setTitle(value: `true`): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrackbacks(value: `true`): Self = this.set("trackbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackbacks: Self = this.set("trackbacks", js.undefined)
  }
  
}

