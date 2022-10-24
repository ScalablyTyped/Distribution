package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hover extends StObject {
  
  var hover: Boolean
}
object Hover {
  
  inline def apply(hover: Boolean): Hover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  extension [Self <: Hover](x: Self) {
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
  }
}
