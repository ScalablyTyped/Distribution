package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftTop extends StObject {
  
  var left: Unit
  
  var top: String
}
object LeftTop {
  
  inline def apply(left: Unit, top: String): LeftTop = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftTop]
  }
  
  extension [Self <: LeftTop](x: Self) {
    
    inline def setLeft(value: Unit): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
