package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemContent extends StObject {
  
  var content: String = js.native
  
  var contentType: ItemContentType = js.native
}
object ItemContent {
  
  @scala.inline
  def apply(content: String, contentType: ItemContentType): ItemContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContent]
  }
  
  @scala.inline
  implicit class ItemContentMutableBuilder[Self <: ItemContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ItemContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
