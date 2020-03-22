package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.AnonDictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typings.wordpressApiFetch.mod.Schema.BaseTag
  - typings.wordpressApiFetch.PickBaseTagTag
*/
trait Tag[T /* <: Context */] extends js.Object

object Tag {
  @scala.inline
  def BaseTag[T /* <: Context */](
    _links: Record[String, js.Array[AnonDictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): Tag[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag[T]]
  }
  @scala.inline
  def PickBaseTagTag[T /* <: Context */](
    _links: Record[String, js.Array[AnonDictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): Tag[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag[T]]
  }
}

