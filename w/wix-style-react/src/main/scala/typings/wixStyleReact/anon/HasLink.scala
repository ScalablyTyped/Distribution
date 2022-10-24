package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasLink extends StObject {
  
  var hasLink: Any
  
  var idx: Any
  
  var option: Any
}
object HasLink {
  
  inline def apply(hasLink: Any, idx: Any, option: Any): HasLink = {
    val __obj = js.Dynamic.literal(hasLink = hasLink.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasLink]
  }
  
  extension [Self <: HasLink](x: Self) {
    
    inline def setHasLink(value: Any): Self = StObject.set(x, "hasLink", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Any): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setOption(value: Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
