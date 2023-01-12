package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`identifier-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideIdentifierList
  extends StObject
     with ExtendedAttributeRightHandSideList {
  
  var `type`: `identifier-list`
  
  var value: js.Array[ExtendedAttributeRightHandSideIdentifier]
}
object ExtendedAttributeRightHandSideIdentifierList {
  
  inline def apply(value: js.Array[ExtendedAttributeRightHandSideIdentifier]): ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier-list")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifierList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedAttributeRightHandSideIdentifierList] (val x: Self) extends AnyVal {
    
    inline def setType(value: `identifier-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[ExtendedAttributeRightHandSideIdentifier]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ExtendedAttributeRightHandSideIdentifier*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
