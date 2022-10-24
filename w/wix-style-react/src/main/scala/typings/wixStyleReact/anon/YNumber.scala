package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YNumber extends StObject {
  
  var y: Double
}
object YNumber {
  
  inline def apply(y: Double): YNumber = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YNumber]
  }
  
  extension [Self <: YNumber](x: Self) {
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
