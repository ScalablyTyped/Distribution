package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`decimal-list`
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
  implicit class ExtendedAttributeRightHandSideDecimalListOps[Self <: ExtendedAttributeRightHandSideDecimalList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: `decimal-list`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideDecimal*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideDecimal]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
