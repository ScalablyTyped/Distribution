package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`decimal-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideDecimalList extends ExtendedAttributeRightHandSideList {
  
  var `type`: `decimal-list` = js.native
  
  var value: js.Array[ExtendedAttributeRightHandSideDecimal] = js.native
}
object ExtendedAttributeRightHandSideDecimalList {
  
  @scala.inline
  def apply(`type`: `decimal-list`, value: js.Array[ExtendedAttributeRightHandSideDecimal]): ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimalList]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideDecimalListMutableBuilder[Self <: ExtendedAttributeRightHandSideDecimalList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `decimal-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideDecimal]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideDecimal*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
