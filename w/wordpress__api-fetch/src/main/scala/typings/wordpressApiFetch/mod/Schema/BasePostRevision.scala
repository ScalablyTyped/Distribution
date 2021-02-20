package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePostRevision[T /* <: Context */] extends BaseResponse {
  
  var author: Double = js.native
  
  var content: Contextual[T, js.Object, js.Object] = js.native
  
  var date: String = js.native
  
  var date_gmt: String = js.native
  
  var excerpt: Contextual[T, js.Object, js.Object] = js.native
  
  var guid: Contextual[T, js.Object, js.Object] = js.native
  
  var id: Double = js.native
  
  var modified: String = js.native
  
  var modified_gmt: String = js.native
  
  var parent: Double = js.native
  
  var slug: String = js.native
  
  var title: Contextual[T, js.Object, js.Object] = js.native
}
object BasePostRevision {
  
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, js.Object, js.Object],
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    modified: String,
    modified_gmt: String,
    parent: Double,
    slug: String,
    title: Contextual[T, js.Object, js.Object]
  ): BasePostRevision[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePostRevision[T]]
  }
  
  @scala.inline
  implicit class BasePostRevisionMutableBuilder[Self <: BasePostRevision[_], T /* <: Context */] (val x: Self with BasePostRevision[T]) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcerpt(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified_gmt(value: String): Self = StObject.set(x, "modified_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
