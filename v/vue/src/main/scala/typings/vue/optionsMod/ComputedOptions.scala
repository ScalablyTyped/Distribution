package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedOptions[T] extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var get: js.UndefOr[js.Function0[T]] = js.native
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}

object ComputedOptions {
  @scala.inline
  def apply[T](): ComputedOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedOptions[T]]
  }
  @scala.inline
  implicit class ComputedOptionsOps[Self <: ComputedOptions[_], T] (val x: Self with ComputedOptions[T]) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setSet(value: /* value */ T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

