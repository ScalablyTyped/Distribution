package typings.webidl2.mod

import typings.webidl2.webidl2Strings.decimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideDecimal
  extends StObject
     with ExtendedAttributeRightHandSideBase {
  
  var `type`: decimal
  
  var value: String
}
object ExtendedAttributeRightHandSideDecimal {
  
  inline def apply(value: String): ExtendedAttributeRightHandSideDecimal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decimal")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimal]
  }
  
  extension [Self <: ExtendedAttributeRightHandSideDecimal](x: Self) {
    
    inline def setType(value: decimal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
