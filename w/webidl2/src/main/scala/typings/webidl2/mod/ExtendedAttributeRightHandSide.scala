package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`decimal-list`
import typings.webidl2.webidl2Strings.`identifier-list`
import typings.webidl2.webidl2Strings.`integer-list`
import typings.webidl2.webidl2Strings.`string-list`
import typings.webidl2.webidl2Strings.decimal
import typings.webidl2.webidl2Strings.identifier
import typings.webidl2.webidl2Strings.integer
import typings.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.ExtendedAttributeRightHandSideBase
  - typings.webidl2.mod.ExtendedAttributeRightHandSideList
*/
trait ExtendedAttributeRightHandSide extends js.Object
object ExtendedAttributeRightHandSide {
  
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifier(`type`: identifier, value: String): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideStringList(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideInteger(`type`: integer, value: String): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIntegerList(`type`: `integer-list`, value: js.Array[ExtendedAttributeRightHandSideInteger]): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideDecimalList(`type`: `decimal-list`, value: js.Array[ExtendedAttributeRightHandSideDecimal]): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideString(`type`: string, value: String): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideDecimal(`type`: decimal, value: String): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifierList(`type`: `identifier-list`, value: js.Array[ExtendedAttributeRightHandSideIdentifier]): ExtendedAttributeRightHandSide = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSide]
  }
}
