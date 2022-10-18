package typings.tslint.anon

import typings.tslint.libRulesCompletedDocsTagExclusionMod.IContentTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: IContentTags
  
  var existence: js.Array[String]
}
object Content {
  
  inline def apply(content: IContentTags, existence: js.Array[String]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: IContentTags): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExistence(value: js.Array[String]): Self = StObject.set(x, "existence", value.asInstanceOf[js.Any])
    
    inline def setExistenceVarargs(value: String*): Self = StObject.set(x, "existence", js.Array(value*))
  }
}
