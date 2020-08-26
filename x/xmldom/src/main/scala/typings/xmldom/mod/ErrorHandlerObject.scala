package typings.xmldom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorHandlerObject extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.native
  var fatalError: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.native
  var warning: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.native
}

object ErrorHandlerObject {
  @scala.inline
  def apply(): ErrorHandlerObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerObject]
  }
  @scala.inline
  implicit class ErrorHandlerObjectOps[Self <: ErrorHandlerObject] (val x: Self) extends AnyVal {
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
    def setError(value: /* msg */ js.Any => _): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFatalError(value: /* msg */ js.Any => _): Self = this.set("fatalError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFatalError: Self = this.set("fatalError", js.undefined)
    @scala.inline
    def setWarning(value: /* msg */ js.Any => _): Self = this.set("warning", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

