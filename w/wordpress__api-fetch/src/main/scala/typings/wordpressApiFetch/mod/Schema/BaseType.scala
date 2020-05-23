package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Addnew
import typings.wordpressApiFetch.anon.Author
import typings.wordpressApiFetch.anon.Createposts
import typings.wordpressApiFetch.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseType[T /* <: Context */] extends BaseResponse {
  var capabilities: Createposts
  var description: String
  var hierarchical: Boolean
  var labels: Addnew
  var name: String
  var rest_base: String
  var slug: String
  var supports: Author
  var taxonomies: js.Array[TaxonomyKind]
  var viewable: Boolean
}

object BaseType {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[Dictk]],
    capabilities: Createposts,
    description: String,
    hierarchical: Boolean,
    labels: Addnew,
    name: String,
    rest_base: String,
    slug: String,
    supports: Author,
    taxonomies: js.Array[TaxonomyKind],
    viewable: Boolean,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseType[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], taxonomies = taxonomies.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseType[T]]
  }
}

