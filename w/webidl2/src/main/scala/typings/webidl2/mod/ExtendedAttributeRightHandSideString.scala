package typings.webidl2.mod

import typings.webidl2.webidl2Strings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideString extends ExtendedAttributeRightHandSideBase {
  
  var `type`: string = js.native
  
  var value: String = js.native
}
object ExtendedAttributeRightHandSideString {
  
  @scala.inline
  def apply(`type`: string, value: String): ExtendedAttributeRightHandSideString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideString]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideStringMutableBuilder[Self <: ExtendedAttributeRightHandSideString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
