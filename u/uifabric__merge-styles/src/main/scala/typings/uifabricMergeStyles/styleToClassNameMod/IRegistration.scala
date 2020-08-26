package typings.uifabricMergeStyles.styleToClassNameMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegistration extends js.Object {
  var args: js.Array[IStyle] = js.native
  var className: String = js.native
  var key: String = js.native
  var rulesToInsert: js.Array[String] = js.native
}

object IRegistration {
  @scala.inline
  def apply(args: js.Array[IStyle], className: String, key: String, rulesToInsert: js.Array[String]): IRegistration = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rulesToInsert = rulesToInsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegistration]
  }
  @scala.inline
  implicit class IRegistrationOps[Self <: IRegistration] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: IStyle*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[IStyle]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesToInsertVarargs(value: String*): Self = this.set("rulesToInsert", js.Array(value :_*))
    @scala.inline
    def setRulesToInsert(value: js.Array[String]): Self = this.set("rulesToInsert", value.asInstanceOf[js.Any])
  }
  
}

