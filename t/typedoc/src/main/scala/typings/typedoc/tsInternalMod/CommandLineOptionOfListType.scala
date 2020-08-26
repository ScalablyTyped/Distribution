package typings.typedoc.tsInternalMod

import typings.typedoc.typedocStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineOptionOfListType
  extends CommandLineOptionBase
     with CommandLineOption {
  var element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType = js.native
  @JSName("type")
  var type_CommandLineOptionOfListType: list = js.native
}

object CommandLineOptionOfListType {
  @scala.inline
  def apply(
    element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
    name: String,
    `type`: list
  ): CommandLineOptionOfListType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionOfListType]
  }
  @scala.inline
  implicit class CommandLineOptionOfListTypeOps[Self <: CommandLineOptionOfListType] (val x: Self) extends AnyVal {
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
    def setElement(value: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: list): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

