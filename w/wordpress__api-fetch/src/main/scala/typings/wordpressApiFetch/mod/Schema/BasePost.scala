package typings.wordpressApiFetch.mod.Schema

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wordpressApiFetch.AnonBlockversion
import typings.wordpressApiFetch.AnonDictk
import typings.wordpressApiFetch.AnonProtected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePost[T /* <: Context */]
  extends BaseResponse
     with /* k */ StringDictionary[js.Any] {
  var author: Double
  var categories: js.Array[Double]
  var comment_status: OpenOrClosed
  var content: Contextual[T, AnonProtected, AnonBlockversion]
  var date: String
  var date_gmt: String
  var excerpt: Contextual[T, AnonProtected, js.Object]
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
    _links: Record[String, js.Array[AnonDictk]],
    author: Double,
    categories: js.Array[Double],
    comment_status: OpenOrClosed,
    content: Contextual[T, AnonProtected, AnonBlockversion],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, AnonProtected, js.Object],
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePost[T]]
  }
}

