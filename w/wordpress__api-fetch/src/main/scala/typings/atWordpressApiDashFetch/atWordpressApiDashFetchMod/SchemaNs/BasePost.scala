package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import org.scalablytyped.runtime.StringDictionary
import typings.atWordpressApiDashFetch.Anon_Blockversion
import typings.atWordpressApiDashFetch.Anon_Href
import typings.atWordpressApiDashFetch.Anon_Protected
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePost[T /* <: Context */]
  extends BaseResponse
     with /* k */ StringDictionary[js.Any] {
  var author: Double
  var categories: js.Array[Double]
  var comment_status: OpenOrClosed
  var content: Contextual[T, Anon_Protected, Anon_Blockversion]
  var date: String
  var date_gmt: String
  var excerpt: Contextual[T, Anon_Protected, js.Object]
  var featured_media: Double
  var format: PostFormat
  var generated_slug: String
  var guid: Contextual[T, js.Object, js.Object]
  var id: Double
  var link: String
  var meta: js.Array[_]
  var modified: String
  var modified_gmt: String
  var password: String
  var permalink_template: String
  var ping_status: OpenOrClosed
  var slug: String
  var status: PostStatus
  var sticky: Boolean
  var tags: js.Array[String]
  var template: String
  var title: Contextual[T, js.Object, js.Object]
  var `type`: String
}

object BasePost {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    author: Double,
    categories: js.Array[Double],
    comment_status: OpenOrClosed,
    content: Contextual[T, Anon_Protected, Anon_Blockversion],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, Anon_Protected, js.Object],
    featured_media: Double,
    format: PostFormat,
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    meta: js.Array[_],
    modified: String,
    modified_gmt: String,
    password: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    status: PostStatus,
    sticky: Boolean,
    tags: js.Array[String],
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String,
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    _embedded: Record[String, js.Array[_]] = null
  ): BasePost[T] = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, categories = categories, comment_status = comment_status, content = content.asInstanceOf[js.Any], date = date, date_gmt = date_gmt, excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media, format = format, generated_slug = generated_slug, guid = guid.asInstanceOf[js.Any], id = id, link = link, meta = meta, modified = modified, modified_gmt = modified_gmt, password = password, permalink_template = permalink_template, ping_status = ping_status, slug = slug, status = status, sticky = sticky, tags = tags, template = template, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BasePost[T]]
  }
}

