package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadiusAny extends StObject {
  
  var borderRadius: Any
}
object BorderRadiusAny {
  
  inline def apply(borderRadius: Any): BorderRadiusAny = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusAny]
  }
  
  extension [Self <: BorderRadiusAny](x: Self) {
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
  }
}
