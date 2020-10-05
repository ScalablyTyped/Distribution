package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropOptions[T] extends js.Object {
  var default: js.UndefOr[T | Null | (js.Function0[js.UndefOr[T | Null]])] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[PropType[T]] = js.native
  var validator: js.UndefOr[js.Function1[/* value */ T, Boolean]] = js.native
}

object PropOptions {
  @scala.inline
  def apply[T](): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions[T]]
  }
  @scala.inline
  implicit class PropOptionsOps[Self <: PropOptions[_], T] (val x: Self with PropOptions[T]) extends AnyVal {
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
    def setDefaultFunction0(value: () => js.UndefOr[T | Null]): Self = this.set("default", js.Any.fromFunction0(value))
    @scala.inline
    def setDefault(value: T | (js.Function0[js.UndefOr[T | Null]])): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTypeVarargs(value: Prop[T]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setTypeFunction0(value: () => T): Self = this.set("type", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: PropType[T]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidator(value: /* value */ T => Boolean): Self = this.set("validator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
  
}

