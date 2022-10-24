package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var left: String
  
  var top: Unit
}
object Top {
  
  inline def apply(left: String, top: Unit): Top = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  extension [Self <: Top](x: Self) {
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Unit): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
