package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typings.wordpressCoreData.schemaMod.Schema.BaseTag
  - typings.wordpressCoreData.anon.PickBaseTagTag
*/
trait Tag[T /* <: Context */] extends StObject
object Tag {
  
  inline def BaseTag(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[Any],
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): typings.wordpressCoreData.schemaMod.Schema.BaseTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressCoreData.schemaMod.Schema.BaseTag]
  }
  
  inline def PickBaseTagTag(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): typings.wordpressCoreData.anon.PickBaseTagTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressCoreData.anon.PickBaseTagTag]
  }
}
