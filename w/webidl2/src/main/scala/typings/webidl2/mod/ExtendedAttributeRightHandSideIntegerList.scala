package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`integer-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideIntegerList extends ExtendedAttributeRightHandSideList {
  
  var `type`: `integer-list` = js.native
  
  var value: js.Array[ExtendedAttributeRightHandSideInteger] = js.native
}
object ExtendedAttributeRightHandSideIntegerList {
  
  @scala.inline
  def apply(`type`: `integer-list`, value: js.Array[ExtendedAttributeRightHandSideInteger]): ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIntegerList]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideIntegerListOps[Self <: ExtendedAttributeRightHandSideIntegerList] (val x: Self) extends AnyVal {
    
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
    def setType(value: `integer-list`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideInteger*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideInteger]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
