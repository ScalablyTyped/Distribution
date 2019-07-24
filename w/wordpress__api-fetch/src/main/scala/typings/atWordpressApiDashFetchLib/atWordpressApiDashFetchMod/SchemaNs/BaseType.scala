package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseType[T /* <: Context */] extends BaseResponse {
  var capabilities: atWordpressApiDashFetchLib.Anon_Createposts
  var description: java.lang.String
  var hierarchical: scala.Boolean
  var labels: atWordpressApiDashFetchLib.Anon_Addnew
  var name: java.lang.String
  var rest_base: java.lang.String
  var slug: java.lang.String
  var supports: atWordpressApiDashFetchLib.Anon_Author
  var taxonomies: js.Array[TaxonomyKind]
  var viewable: scala.Boolean
}

object BaseType {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    capabilities: atWordpressApiDashFetchLib.Anon_Createposts,
    description: java.lang.String,
    hierarchical: scala.Boolean,
    labels: atWordpressApiDashFetchLib.Anon_Addnew,
    name: java.lang.String,
    rest_base: java.lang.String,
    slug: java.lang.String,
    supports: atWordpressApiDashFetchLib.Anon_Author,
    taxonomies: js.Array[TaxonomyKind],
    viewable: scala.Boolean,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseType[T] = {
    val __obj = js.Dynamic.literal(_links = _links, capabilities = capabilities, description = description, hierarchical = hierarchical, labels = labels, name = name, rest_base = rest_base, slug = slug, supports = supports, taxonomies = taxonomies, viewable = viewable)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseType[T]]
  }
}

