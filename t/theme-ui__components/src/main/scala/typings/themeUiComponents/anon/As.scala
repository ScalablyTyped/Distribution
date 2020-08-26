package typings.themeUiComponents.anon

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As[T /* <: ElementType[_] */] extends js.Object {
  /**
    * form control to render, default Input
    */
  var as: js.UndefOr[T] = js.native
}

object As {
  @scala.inline
  def apply[/* <: typings.react.mod.ElementType[_] */ T](): As[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[T]]
  }
  @scala.inline
  implicit class AsOps[Self <: As[_], /* <: typings.react.mod.ElementType[_] */ T] (val x: Self with As[T]) extends AnyVal {
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
    def setAs(value: T): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
  }
  
}

