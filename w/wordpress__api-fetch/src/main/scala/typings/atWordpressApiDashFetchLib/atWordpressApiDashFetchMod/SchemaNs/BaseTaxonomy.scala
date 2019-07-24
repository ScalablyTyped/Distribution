package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTaxonomy[T /* <: Context */] extends BaseResponse {
  var capabilities: atWordpressApiDashFetchLib.Anon_Assignterms
  var description: java.lang.String
  var hierarchical: scala.Boolean
  var labels: atWordpressApiDashFetchLib.Anon_Addnewitem
  var name: java.lang.String
  var rest_base: java.lang.String
  var show_cloud: scala.Boolean
  var slug: java.lang.String
  var types: js.Array[java.lang.String]
  var visibility: atWordpressApiDashFetchLib.Anon_Public
}

object BaseTaxonomy {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    capabilities: atWordpressApiDashFetchLib.Anon_Assignterms,
    description: java.lang.String,
    hierarchical: scala.Boolean,
    labels: atWordpressApiDashFetchLib.Anon_Addnewitem,
    name: java.lang.String,
    rest_base: java.lang.String,
    show_cloud: scala.Boolean,
    slug: java.lang.String,
    types: js.Array[java.lang.String],
    visibility: atWordpressApiDashFetchLib.Anon_Public,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseTaxonomy[T] = {
    val __obj = js.Dynamic.literal(_links = _links, capabilities = capabilities, description = description, hierarchical = hierarchical, labels = labels, name = name, rest_base = rest_base, show_cloud = show_cloud, slug = slug, types = types, visibility = visibility)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseTaxonomy[T]]
  }
}

