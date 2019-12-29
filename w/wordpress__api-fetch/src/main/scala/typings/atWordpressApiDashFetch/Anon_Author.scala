package typings.atWordpressApiDashFetch

import typings.atWordpressApiDashFetch.atWordpressApiDashFetchBooleans.`true`
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
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (`custom-fields` != null) __obj.updateDynamic("custom-fields")(`custom-fields`.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt.asInstanceOf[js.Any])
    if (`page-attributes` != null) __obj.updateDynamic("page-attributes")(`page-attributes`.asInstanceOf[js.Any])
    if (`post-formats` != null) __obj.updateDynamic("post-formats")(`post-formats`.asInstanceOf[js.Any])
    if (revisions != null) __obj.updateDynamic("revisions")(revisions.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trackbacks != null) __obj.updateDynamic("trackbacks")(trackbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Author]
  }
}

