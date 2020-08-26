package typings.typedoc.tsInternalMod

import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineOptionOfPrimitiveType
  extends CommandLineOptionBase
     with CommandLineOption {
  @JSName("type")
  var type_CommandLineOptionOfPrimitiveType: string | number | boolean = js.native
}

object CommandLineOptionOfPrimitiveType {
  @scala.inline
  def apply(name: String, `type`: string | number | boolean): CommandLineOptionOfPrimitiveType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionOfPrimitiveType]
  }
  @scala.inline
  implicit class CommandLineOptionOfPrimitiveTypeOps[Self <: CommandLineOptionOfPrimitiveType] (val x: Self) extends AnyVal {
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
    def setType(value: string | number | boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

