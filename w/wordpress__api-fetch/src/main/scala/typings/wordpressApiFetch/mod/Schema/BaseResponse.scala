package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseResponse extends StObject {
  
  var _embedded: js.UndefOr[Record[String, js.Array[js.Any]]] = js.undefined
  
  var _links: Record[String, js.Array[Dictk]]
}
object BaseResponse {
  
  @scala.inline
  def apply(_links: Record[String, js.Array[Dictk]]): BaseResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
  
  @scala.inline
  implicit class BaseResponseMutableBuilder[Self <: BaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_embedded(value: Record[String, js.Array[js.Any]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    @scala.inline
    def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
