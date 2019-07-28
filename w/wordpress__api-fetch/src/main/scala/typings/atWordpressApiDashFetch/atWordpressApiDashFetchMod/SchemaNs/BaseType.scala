package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import typings.atWordpressApiDashFetch.Anon_Addnew
import typings.atWordpressApiDashFetch.Anon_Author
import typings.atWordpressApiDashFetch.Anon_Createposts
import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseType[T /* <: Context */] extends BaseResponse {
  var capabilities: Anon_Createposts
  var description: String
  var hierarchical: Boolean
  var labels: Anon_Addnew
  var name: String
  var rest_base: String
  var slug: String
  var supports: Anon_Author
  var taxonomies: js.Array[TaxonomyKind]
  var viewable: Boolean
}

object BaseType {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    capabilities: Anon_Createposts,
    description: String,
    hierarchical: Boolean,
    labels: Anon_Addnew,
    name: String,
    rest_base: String,
    slug: String,
    supports: Anon_Author,
    taxonomies: js.Array[TaxonomyKind],
    viewable: Boolean,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseType[T] = {
    val __obj = js.Dynamic.literal(_links = _links, capabilities = capabilities, description = description, hierarchical = hierarchical, labels = labels, name = name, rest_base = rest_base, slug = slug, supports = supports, taxonomies = taxonomies, viewable = viewable)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseType[T]]
  }
}

