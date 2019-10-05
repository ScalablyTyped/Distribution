package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_Addnewitem
import typings.atWordpressApiDashFetch.Anon_Assignterms
import typings.atWordpressApiDashFetch.Anon_Href
import typings.atWordpressApiDashFetch.Anon_Public
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTaxonomy[T /* <: Context */] extends BaseResponse {
  var capabilities: Anon_Assignterms
  var description: String
  var hierarchical: Boolean
  var labels: Anon_Addnewitem
  var name: String
  var rest_base: String
  var show_cloud: Boolean
  var slug: String
  var types: js.Array[String]
  var visibility: Anon_Public
}

object BaseTaxonomy {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    capabilities: Anon_Assignterms,
    description: String,
    hierarchical: Boolean,
    labels: Anon_Addnewitem,
    name: String,
    rest_base: String,
    show_cloud: Boolean,
    slug: String,
    types: js.Array[String],
    visibility: Anon_Public,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseTaxonomy[T] = {
    val __obj = js.Dynamic.literal(_links = _links, capabilities = capabilities, description = description, hierarchical = hierarchical, labels = labels, name = name, rest_base = rest_base, show_cloud = show_cloud, slug = slug, types = types, visibility = visibility)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseTaxonomy[T]]
  }
}

