package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearance extends StObject {
  
  var appearance: Any
  
  var content: Any
  
  var width: Any
}
object Appearance {
  
  inline def apply(appearance: Any, content: Any, width: Any): Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
  
  extension [Self <: Appearance](x: Self) {
    
    inline def setAppearance(value: Any): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
