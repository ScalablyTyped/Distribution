package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typings.wordpressApiFetch.mod.Schema.BaseStatus
  - typings.wordpressApiFetch.anon.PickBaseStatusStatusEmbedded
  - typings.wordpressApiFetch.anon.PickBaseStatusStatus
*/
trait Status[T /* <: Context */] extends StObject
object Status {
  
  @scala.inline
  def BaseStatus(
    _links: Record[String, js.Array[Dictk]],
    name: String,
    `private`: Boolean,
    `protected`: Boolean,
    public: Boolean,
    queryable: Boolean,
    show_in_list: Boolean,
    slug: String
  ): typings.wordpressApiFetch.mod.Schema.BaseStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], show_in_list = show_in_list.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressApiFetch.mod.Schema.BaseStatus]
  }
  
  @scala.inline
  def PickBaseStatusStatus(_links: Record[String, js.Array[Dictk]], name: String, slug: String): typings.wordpressApiFetch.anon.PickBaseStatusStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressApiFetch.anon.PickBaseStatusStatus]
  }
  
  @scala.inline
  def PickBaseStatusStatusEmbedded(
    _links: Record[String, js.Array[Dictk]],
    name: String,
    public: Boolean,
    queryable: Boolean,
    slug: String
  ): typings.wordpressApiFetch.anon.PickBaseStatusStatusEmbedded = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressApiFetch.anon.PickBaseStatusStatusEmbedded]
  }
}
