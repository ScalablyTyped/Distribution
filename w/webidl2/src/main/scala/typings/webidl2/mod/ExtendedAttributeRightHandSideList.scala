package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList
  - typings.webidl2.mod.ExtendedAttributeRightHandSideStringList
  - typings.webidl2.mod.ExtendedAttributeRightHandSideDecimalList
  - typings.webidl2.mod.ExtendedAttributeRightHandSideIntegerList
*/
trait ExtendedAttributeRightHandSideList
  extends StObject
     with ExtendedAttributeRightHandSide
object ExtendedAttributeRightHandSideList {
  
  @scala.inline
  def ExtendedAttributeRightHandSideDecimalList(value: js.Array[ExtendedAttributeRightHandSideDecimal]): typings.webidl2.mod.ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decimal-list")
    __obj.asInstanceOf[typings.webidl2.mod.ExtendedAttributeRightHandSideDecimalList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifierList(value: js.Array[ExtendedAttributeRightHandSideIdentifier]): typings.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier-list")
    __obj.asInstanceOf[typings.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIntegerList(value: js.Array[ExtendedAttributeRightHandSideInteger]): typings.webidl2.mod.ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer-list")
    __obj.asInstanceOf[typings.webidl2.mod.ExtendedAttributeRightHandSideIntegerList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideStringList(value: js.Array[ExtendedAttributeRightHandSideString]): typings.webidl2.mod.ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string-list")
    __obj.asInstanceOf[typings.webidl2.mod.ExtendedAttributeRightHandSideStringList]
  }
}
