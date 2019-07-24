package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePost[T /* <: Context */] extends BaseResponse {
  var author: scala.Double
  var categories: js.Array[scala.Double]
  var comment_status: OpenOrClosed
  var content: Contextual[
    T, 
    atWordpressApiDashFetchLib.Anon_Protected, 
    atWordpressApiDashFetchLib.Anon_Blockversion
  ]
  var date: java.lang.String
  var date_gmt: java.lang.String
  var excerpt: Contextual[T, atWordpressApiDashFetchLib.Anon_Protected, js.Object]
  var featured_media: scala.Double
  var format: PostFormat
  var generated_slug: java.lang.String
  var guid: Contextual[T, js.Object, js.Object]
  var id: scala.Double
  var link: java.lang.String
  var meta: js.Array[_]
  var modified: java.lang.String
  var modified_gmt: java.lang.String
  var password: java.lang.String
  var permalink_template: java.lang.String
  var ping_status: OpenOrClosed
  var slug: java.lang.String
  var status: PostStatus
  var sticky: scala.Boolean
  var tags: js.Array[java.lang.String]
  var template: java.lang.String
  var title: Contextual[T, js.Object, js.Object]
  var `type`: java.lang.String
}

object BasePost {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    author: scala.Double,
    categories: js.Array[scala.Double],
    comment_status: OpenOrClosed,
    content: Contextual[
      T, 
      atWordpressApiDashFetchLib.Anon_Protected, 
      atWordpressApiDashFetchLib.Anon_Blockversion
    ],
    date: java.lang.String,
    date_gmt: java.lang.String,
    excerpt: Contextual[T, atWordpressApiDashFetchLib.Anon_Protected, js.Object],
    featured_media: scala.Double,
    format: PostFormat,
    generated_slug: java.lang.String,
    guid: Contextual[T, js.Object, js.Object],
    id: scala.Double,
    link: java.lang.String,
    meta: js.Array[_],
    modified: java.lang.String,
    modified_gmt: java.lang.String,
    password: java.lang.String,
    permalink_template: java.lang.String,
    ping_status: OpenOrClosed,
    slug: java.lang.String,
    status: PostStatus,
    sticky: scala.Boolean,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    title: Contextual[T, js.Object, js.Object],
    `type`: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BasePost[T] = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, categories = categories, comment_status = comment_status, content = content.asInstanceOf[js.Any], date = date, date_gmt = date_gmt, excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media, format = format, generated_slug = generated_slug, guid = guid.asInstanceOf[js.Any], id = id, link = link, meta = meta, modified = modified, modified_gmt = modified_gmt, password = password, permalink_template = permalink_template, ping_status = ping_status, slug = slug, status = status, sticky = sticky, tags = tags, template = template, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BasePost[T]]
  }
}

