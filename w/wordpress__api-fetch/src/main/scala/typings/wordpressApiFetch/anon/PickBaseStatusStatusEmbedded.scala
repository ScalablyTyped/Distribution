package typings.wordpressApiFetch.anon

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseStatus, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.Status> */
@js.native
trait PickBaseStatusStatusEmbedded
  extends Status[js.Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  
  var _links: Record[String, js.Array[Dictk]] = js.native
  
  var name: String = js.native
  
  var public: Boolean = js.native
  
  var queryable: Boolean = js.native
  
  var slug: String = js.native
}
object PickBaseStatusStatusEmbedded {
  
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    name: String,
    public: Boolean,
    queryable: Boolean,
    slug: String
  ): PickBaseStatusStatusEmbedded = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseStatusStatusEmbedded]
  }
  
  @scala.inline
  implicit class PickBaseStatusStatusEmbeddedMutableBuilder[Self <: PickBaseStatusStatusEmbedded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryable(value: Boolean): Self = StObject.set(x, "queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embedded(value: Record[String, js.Array[_]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    @scala.inline
    def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
