package typings.uiBox.anon

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowUnsafeHref[E /* <: ElementType[_] */] extends js.Object {
  var allowUnsafeHref: js.UndefOr[Boolean] = js.native
  var is: js.UndefOr[E] = js.native
}

object AllowUnsafeHref {
  @scala.inline
  def apply[/* <: typings.react.mod.ElementType[_] */ E](): AllowUnsafeHref[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUnsafeHref[E]]
  }
  @scala.inline
  implicit class AllowUnsafeHrefOps[Self <: AllowUnsafeHref[_], /* <: typings.react.mod.ElementType[_] */ E] (val x: Self with AllowUnsafeHref[E]) extends AnyVal {
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
    def setAllowUnsafeHref(value: Boolean): Self = this.set("allowUnsafeHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnsafeHref: Self = this.set("allowUnsafeHref", js.undefined)
    @scala.inline
    def setIs(value: E): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
  }
  
}

