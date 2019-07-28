package typings.atWordpressApiDashFetch

import typings.atWordpressApiDashFetch.atWordpressApiDashFetchNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: js.UndefOr[`true`] = js.undefined
  var comments: js.UndefOr[`true`] = js.undefined
  var `custom-fields`: js.UndefOr[`true`] = js.undefined
  var editor: js.UndefOr[`true`] = js.undefined
  var excerpt: js.UndefOr[`true`] = js.undefined
  var `page-attributes`: js.UndefOr[`true`] = js.undefined
  var `post-formats`: js.UndefOr[`true`] = js.undefined
  var revisions: js.UndefOr[`true`] = js.undefined
  var thumbnail: js.UndefOr[`true`] = js.undefined
  var title: js.UndefOr[`true`] = js.undefined
  var trackbacks: js.UndefOr[`true`] = js.undefined
}

object Anon_Author {
  @scala.inline
  def apply(
    author: `true` = null,
    comments: `true` = null,
    `custom-fields`: `true` = null,
    editor: `true` = null,
    excerpt: `true` = null,
    `page-attributes`: `true` = null,
    `post-formats`: `true` = null,
    revisions: `true` = null,
    thumbnail: `true` = null,
    title: `true` = null,
    trackbacks: `true` = null
  ): Anon_Author = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (`custom-fields` != null) __obj.updateDynamic("custom-fields")(`custom-fields`)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt)
    if (`page-attributes` != null) __obj.updateDynamic("page-attributes")(`page-attributes`)
    if (`post-formats` != null) __obj.updateDynamic("post-formats")(`post-formats`)
    if (revisions != null) __obj.updateDynamic("revisions")(revisions)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trackbacks != null) __obj.updateDynamic("trackbacks")(trackbacks)
    __obj.asInstanceOf[Anon_Author]
  }
}

