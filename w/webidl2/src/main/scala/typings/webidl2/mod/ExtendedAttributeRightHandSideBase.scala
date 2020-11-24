package typings.webidl2.mod

import typings.webidl2.webidl2Strings.decimal
import typings.webidl2.webidl2Strings.identifier
import typings.webidl2.webidl2Strings.integer
import typings.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.ExtendedAttributeRightHandSideIdentifier
  - typings.webidl2.mod.ExtendedAttributeRightHandSideString
  - typings.webidl2.mod.ExtendedAttributeRightHandSideDecimal
  - typings.webidl2.mod.ExtendedAttributeRightHandSideInteger
*/
trait ExtendedAttributeRightHandSideBase extends ExtendedAttributeRightHandSide
object ExtendedAttributeRightHandSideBase {
  
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifier(`type`: identifier, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideString(`type`: string, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideDecimal(`type`: decimal, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideInteger(`type`: integer, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
}
