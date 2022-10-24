package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var option: Any
}
object Option {
  
  inline def apply(option: Any): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setOption(value: Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
