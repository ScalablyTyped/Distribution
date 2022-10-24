package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  var left: Unit
  
  var top: Unit
}
object Left {
  
  inline def apply(left: Unit, top: Unit): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setLeft(value: Unit): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Unit): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
