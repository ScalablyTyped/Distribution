package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePostRevision[T /* <: Context */] extends BaseResponse {
  var author: Double
  var content: Contextual[T, js.Object, js.Object]
  var date: String
  var date_gmt: String
  var excerpt: Contextual[T, js.Object, js.Object]
  var guid: Contextual[T, js.Object, js.Object]
  var id: Double
  var modified: String
  var modified_gmt: String
  var parent: Double
  var slug: String
  var title: Contextual[T, js.Object, js.Object]
}

object BasePostRevision {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    author: Double,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, js.Object, js.Object],
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    modified: String,
    modified_gmt: String,
    parent: Double,
    slug: String,
    title: Contextual[T, js.Object, js.Object],
    _embedded: Record[String, js.Array[_]] = null
  ): BasePostRevision[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePostRevision[T]]
  }
}

