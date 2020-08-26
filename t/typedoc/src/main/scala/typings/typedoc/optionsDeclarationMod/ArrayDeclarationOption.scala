package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayDeclarationOption
  extends DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  var defaultValue: js.UndefOr[js.Array[String]] = js.native
  @JSName("type")
  var type_ArrayDeclarationOption: Array = js.native
}

object ArrayDeclarationOption {
  @scala.inline
  def apply(help: String, name: String, `type`: Array): ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayDeclarationOption]
  }
  @scala.inline
  implicit class ArrayDeclarationOptionOps[Self <: ArrayDeclarationOption] (val x: Self) extends AnyVal {
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
    def setType(value: Array): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
  
}

