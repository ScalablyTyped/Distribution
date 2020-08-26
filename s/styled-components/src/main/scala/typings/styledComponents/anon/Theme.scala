package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme[T /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[T] = js.native
}

object Theme {
  @scala.inline
  def apply[/* <: js.Object */ T](): Theme[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[T]]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme[_], /* <: js.Object */ T] (val x: Self with Theme[T]) extends AnyVal {
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
    def setTheme(value: T): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

