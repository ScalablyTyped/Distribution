package typings.tslint.anon

import typings.tslint.tagExclusionMod.IContentTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  var content: IContentTags = js.native
  
  var existence: js.Array[String] = js.native
}
object Content {
  
  @scala.inline
  def apply(content: IContentTags, existence: js.Array[String]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: IContentTags): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistence(value: js.Array[String]): Self = StObject.set(x, "existence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistenceVarargs(value: String*): Self = StObject.set(x, "existence", js.Array(value :_*))
  }
}
