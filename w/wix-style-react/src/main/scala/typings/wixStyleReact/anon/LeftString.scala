package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftString extends StObject {
  
  var left: String
}
object LeftString {
  
  inline def apply(left: String): LeftString = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftString]
  }
  
  extension [Self <: LeftString](x: Self) {
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
  }
}
