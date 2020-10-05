package typings.vue.vnodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNodeDirective extends js.Object {
  var arg: js.UndefOr[String] = js.native
  var expression: js.UndefOr[js.Any] = js.native
  var modifiers: js.UndefOr[StringDictionary[Boolean]] = js.native
  var name: String = js.native
  var oldArg: js.UndefOr[String] = js.native
  var oldValue: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object VNodeDirective {
  @scala.inline
  def apply(name: String): VNodeDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeDirective]
  }
  @scala.inline
  implicit class VNodeDirectiveOps[Self <: VNodeDirective] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    @scala.inline
    def setExpression(value: js.Any): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setModifiers(value: StringDictionary[Boolean]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOldArg(value: String): Self = this.set("oldArg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldArg: Self = this.set("oldArg", js.undefined)
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

