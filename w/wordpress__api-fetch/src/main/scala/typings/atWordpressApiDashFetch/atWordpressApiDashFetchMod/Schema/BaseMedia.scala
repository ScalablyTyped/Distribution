package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_FileHeight
import typings.atWordpressApiDashFetch.Anon_Href
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.file
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.image
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.inherit
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMedia[T /* <: Context */] extends BaseResponse {
  var alt_text: String
  var author: Double
  var caption: Contextual[T, js.Object, js.Object]
  var comment_status: OpenOrClosed
  var date: String
  var date_gmt: String
  var description: Contextual[T, js.Object, js.Object]
  var generated_slug: String
  var guid: Contextual[T, js.Object, js.Object]
  var id: Double
  var link: String
  var media_details: Anon_FileHeight
  var media_type: file | image
  var meta: js.Array[_]
  var mime_type: String
  var modified: String
  var modified_gmt: String
  var permalink_template: String
  var ping_status: OpenOrClosed
  var post: Double | Null
  var slug: String
  var source_url: String
  var status: PostStatus | inherit
  var template: String
  var title: Contextual[T, js.Object, js.Object]
  var `type`: String
}

object BaseMedia {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    alt_text: String,
    author: Double,
    caption: Contextual[T, js.Object, js.Object],
    comment_status: OpenOrClosed,
    date: String,
    date_gmt: String,
    description: Contextual[T, js.Object, js.Object],
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    media_details: Anon_FileHeight,
    media_type: file | image,
    meta: js.Array[_],
    mime_type: String,
    modified: String,
    modified_gmt: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    source_url: String,
    status: PostStatus | inherit,
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String,
    _embedded: Record[String, js.Array[_]] = null,
    post: Int | Double = null
  ): BaseMedia[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], alt_text = alt_text.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], media_details = media_details.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source_url = source_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMedia[T]]
  }
}

