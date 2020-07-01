package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Addnewitem
import typings.wordpressApiFetch.anon.Assignterms
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTaxonomy[T /* <: Context */] extends BaseResponse {
  var capabilities: Assignterms
  var description: String
  var hierarchical: Boolean
  var labels: Addnewitem
  var name: String
  var rest_base: String
  var show_cloud: Boolean
  var slug: String
  var types: js.Array[String]
  var visibility: Public
}

object BaseTaxonomy {
  @scala.inline
  def apply[/* <: typings.wordpressApiFetch.mod.Schema.Context */ T](
    _links: Record[String, js.Array[Dictk]],
    capabilities: Assignterms,
    description: String,
    hierarchical: Boolean,
    labels: Addnewitem,
    name: String,
    rest_base: String,
    show_cloud: Boolean,
    slug: String,
    types: js.Array[String],
    visibility: Public,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseTaxonomy[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], show_cloud = show_cloud.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTaxonomy[T]]
  }
}

