package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameStyle extends StObject {
  
  var className: String
  
  var style: String
}
object ClassNameStyle {
  
  inline def apply(className: String, style: String): ClassNameStyle = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameStyle]
  }
  
  extension [Self <: ClassNameStyle](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
