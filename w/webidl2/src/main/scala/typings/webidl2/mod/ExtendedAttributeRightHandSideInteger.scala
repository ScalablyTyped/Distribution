package typings.webidl2.mod

import typings.webidl2.webidl2Strings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideInteger extends ExtendedAttributeRightHandSideBase {
  
  var `type`: integer = js.native
  
  var value: String = js.native
}
object ExtendedAttributeRightHandSideInteger {
  
  @scala.inline
  def apply(`type`: integer, value: String): ExtendedAttributeRightHandSideInteger = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideInteger]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideIntegerMutableBuilder[Self <: ExtendedAttributeRightHandSideInteger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
