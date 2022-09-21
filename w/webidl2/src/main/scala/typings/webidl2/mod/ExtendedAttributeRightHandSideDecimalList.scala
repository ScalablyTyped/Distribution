package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`decimal-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideDecimalList
  extends StObject
     with ExtendedAttributeRightHandSideList {
  
  var `type`: `decimal-list`
  
  var value: js.Array[ExtendedAttributeRightHandSideDecimal]
}
object ExtendedAttributeRightHandSideDecimalList {
  
  inline def apply(value: js.Array[ExtendedAttributeRightHandSideDecimal]): ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decimal-list")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimalList]
  }
  
  extension [Self <: ExtendedAttributeRightHandSideDecimalList](x: Self) {
    
    inline def setType(value: `decimal-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[ExtendedAttributeRightHandSideDecimal]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ExtendedAttributeRightHandSideDecimal*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
