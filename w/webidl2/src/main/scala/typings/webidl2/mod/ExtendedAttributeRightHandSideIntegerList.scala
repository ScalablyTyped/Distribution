package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`integer-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideIntegerList
  extends StObject
     with ExtendedAttributeRightHandSideList {
  
  var `type`: `integer-list`
  
  var value: js.Array[ExtendedAttributeRightHandSideInteger]
}
object ExtendedAttributeRightHandSideIntegerList {
  
  inline def apply(value: js.Array[ExtendedAttributeRightHandSideInteger]): ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer-list")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIntegerList]
  }
  
  extension [Self <: ExtendedAttributeRightHandSideIntegerList](x: Self) {
    
    inline def setType(value: `integer-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[ExtendedAttributeRightHandSideInteger]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ExtendedAttributeRightHandSideInteger*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
