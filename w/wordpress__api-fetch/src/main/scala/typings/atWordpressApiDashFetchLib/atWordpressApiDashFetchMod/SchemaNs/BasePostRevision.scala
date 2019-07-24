package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePostRevision[T /* <: Context */] extends BaseResponse {
  var author: scala.Double
  var content: Contextual[T, js.Object, js.Object]
  var date: java.lang.String
  var date_gmt: java.lang.String
  var excerpt: Contextual[T, js.Object, js.Object]
  var guid: Contextual[T, js.Object, js.Object]
  var id: scala.Double
  var modified: java.lang.String
  var modified_gmt: java.lang.String
  var parent: scala.Double
  var slug: java.lang.String
  var title: Contextual[T, js.Object, js.Object]
}

object BasePostRevision {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    author: scala.Double,
    content: Contextual[T, js.Object, js.Object],
    date: java.lang.String,
    date_gmt: java.lang.String,
    excerpt: Contextual[T, js.Object, js.Object],
    guid: Contextual[T, js.Object, js.Object],
    id: scala.Double,
    modified: java.lang.String,
    modified_gmt: java.lang.String,
    parent: scala.Double,
    slug: java.lang.String,
    title: Contextual[T, js.Object, js.Object],
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BasePostRevision[T] = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, content = content.asInstanceOf[js.Any], date = date, date_gmt = date_gmt, excerpt = excerpt.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id, modified = modified, modified_gmt = modified_gmt, parent = parent, slug = slug, title = title.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BasePostRevision[T]]
  }
}

