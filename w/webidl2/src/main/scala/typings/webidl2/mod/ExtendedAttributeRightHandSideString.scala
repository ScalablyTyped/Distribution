package typings.webidl2.mod

import typings.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ExtendedAttributeRightHandSideStringOps[Self <: ExtendedAttributeRightHandSideString] (val x: Self) extends AnyVal {
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
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

