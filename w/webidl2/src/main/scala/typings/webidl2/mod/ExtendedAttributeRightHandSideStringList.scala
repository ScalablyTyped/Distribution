package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`string-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideStringList extends ExtendedAttributeRightHandSideList {
  
  var `type`: `string-list` = js.native
  
  var value: js.Array[ExtendedAttributeRightHandSideString] = js.native
}
object ExtendedAttributeRightHandSideStringList {
  
  @scala.inline
  def apply(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideStringList]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideStringListOps[Self <: ExtendedAttributeRightHandSideStringList] (val x: Self) extends AnyVal {
    
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
    def setType(value: `string-list`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideString*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideString]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
