package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMedia[T /* <: Context */] extends BaseResponse {
  var alt_text: java.lang.String
  var author: scala.Double
  var caption: Contextual[T, js.Object, js.Object]
  var comment_status: OpenOrClosed
  var date: java.lang.String
  var date_gmt: java.lang.String
  var description: Contextual[T, js.Object, js.Object]
  var generated_slug: java.lang.String
  var guid: Contextual[T, js.Object, js.Object]
  var id: scala.Double
  var link: java.lang.String
  var media_details: atWordpressApiDashFetchLib.Anon_FileHeight
  var media_type: atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.file | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.image
  var meta: js.Array[_]
  var mime_type: java.lang.String
  var modified: java.lang.String
  var modified_gmt: java.lang.String
  var permalink_template: java.lang.String
  var ping_status: OpenOrClosed
  var post: scala.Double | scala.Null
  var slug: java.lang.String
  var source_url: java.lang.String
  var status: PostStatus | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.inherit
  var template: java.lang.String
  var title: Contextual[T, js.Object, js.Object]
  var `type`: java.lang.String
}

object BaseMedia {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    alt_text: java.lang.String,
    author: scala.Double,
    caption: Contextual[T, js.Object, js.Object],
    comment_status: OpenOrClosed,
    date: java.lang.String,
    date_gmt: java.lang.String,
    description: Contextual[T, js.Object, js.Object],
    generated_slug: java.lang.String,
    guid: Contextual[T, js.Object, js.Object],
    id: scala.Double,
    link: java.lang.String,
    media_details: atWordpressApiDashFetchLib.Anon_FileHeight,
    media_type: atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.file | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.image,
    meta: js.Array[_],
    mime_type: java.lang.String,
    modified: java.lang.String,
    modified_gmt: java.lang.String,
    permalink_template: java.lang.String,
    ping_status: OpenOrClosed,
    slug: java.lang.String,
    source_url: java.lang.String,
    status: PostStatus | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.inherit,
    template: java.lang.String,
    title: Contextual[T, js.Object, js.Object],
    `type`: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null,
    post: scala.Int | scala.Double = null
  ): BaseMedia[T] = {
    val __obj = js.Dynamic.literal(_links = _links, alt_text = alt_text, author = author, caption = caption.asInstanceOf[js.Any], comment_status = comment_status, date = date, date_gmt = date_gmt, description = description.asInstanceOf[js.Any], generated_slug = generated_slug, guid = guid.asInstanceOf[js.Any], id = id, link = link, media_details = media_details, media_type = media_type.asInstanceOf[js.Any], meta = meta, mime_type = mime_type, modified = modified, modified_gmt = modified_gmt, permalink_template = permalink_template, ping_status = ping_status, slug = slug, source_url = source_url, status = status.asInstanceOf[js.Any], template = template, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMedia[T]]
  }
}

