package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftNumber extends StObject {
  
  var left: Double
}
object LeftNumber {
  
  inline def apply(left: Double): LeftNumber = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftNumber]
  }
  
  extension [Self <: LeftNumber](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
  }
}
