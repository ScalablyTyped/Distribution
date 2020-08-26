package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReadyobject extends js.Object {
  var context: js.UndefOr[js.Object] = js.native
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var require: js.UndefOr[js.Array[String]] = js.native
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.native
}

object IReadyobject {
  @scala.inline
  def apply(): IReadyobject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadyobject]
  }
  @scala.inline
  implicit class IReadyobjectOps[Self <: IReadyobject] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setErrorCallback(value: () => Unit): Self = this.set("errorCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteErrorCallback: Self = this.set("errorCallback", js.undefined)
    @scala.inline
    def setRequireVarargs(value: String*): Self = this.set("require", js.Array(value :_*))
    @scala.inline
    def setRequire(value: js.Array[String]): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    @scala.inline
    def setSuccessCallback(value: () => Unit): Self = this.set("successCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccessCallback: Self = this.set("successCallback", js.undefined)
  }
  
}

