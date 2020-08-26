package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`identifier-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedAttributeRightHandSideIdentifierList extends ExtendedAttributeRightHandSideList {
  var `type`: `identifier-list` = js.native
  var value: js.Array[ExtendedAttributeRightHandSideIdentifier] = js.native
}

object ExtendedAttributeRightHandSideIdentifierList {
  @scala.inline
  def apply(`type`: `identifier-list`, value: js.Array[ExtendedAttributeRightHandSideIdentifier]): ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifierList]
  }
  @scala.inline
  implicit class ExtendedAttributeRightHandSideIdentifierListOps[Self <: ExtendedAttributeRightHandSideIdentifierList] (val x: Self) extends AnyVal {
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
    def setType(value: `identifier-list`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideIdentifier*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideIdentifier]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

