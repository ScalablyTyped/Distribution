package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`string-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideStringList
  extends StObject
     with ExtendedAttributeRightHandSideList {
  
  var `type`: `string-list`
  
  var value: js.Array[ExtendedAttributeRightHandSideString]
}
object ExtendedAttributeRightHandSideStringList {
  
  inline def apply(value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string-list")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideStringList]
  }
  
  extension [Self <: ExtendedAttributeRightHandSideStringList](x: Self) {
    
    inline def setType(value: `string-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[ExtendedAttributeRightHandSideString]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ExtendedAttributeRightHandSideString*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
