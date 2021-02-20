package typings.webidl2.mod

import typings.webidl2.webidl2Strings.decimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideDecimal extends ExtendedAttributeRightHandSideBase {
  
  var `type`: decimal = js.native
  
  var value: String = js.native
}
object ExtendedAttributeRightHandSideDecimal {
  
  @scala.inline
  def apply(`type`: decimal, value: String): ExtendedAttributeRightHandSideDecimal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimal]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideDecimalMutableBuilder[Self <: ExtendedAttributeRightHandSideDecimal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: decimal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
