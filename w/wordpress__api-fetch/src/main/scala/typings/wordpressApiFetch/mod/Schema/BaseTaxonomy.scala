package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.AnonAddnewitem
import typings.wordpressApiFetch.AnonAssignterms
import typings.wordpressApiFetch.AnonDictk
import typings.wordpressApiFetch.AnonPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTaxonomy[T /* <: Context */] extends BaseResponse {
  var capabilities: AnonAssignterms
  var description: String
  var hierarchical: Boolean
  var labels: AnonAddnewitem
  var name: String
  var rest_base: String
  var show_cloud: Boolean
  var slug: String
  var types: js.Array[String]
  var visibility: AnonPublic
}

object BaseTaxonomy {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[AnonDictk]],
    capabilities: AnonAssignterms,
    description: String,
    hierarchical: Boolean,
    labels: AnonAddnewitem,
    name: String,
    rest_base: String,
    show_cloud: Boolean,
    slug: String,
    types: js.Array[String],
    visibility: AnonPublic,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseTaxonomy[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], show_cloud = show_cloud.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTaxonomy[T]]
  }
}

