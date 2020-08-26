package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
@js.native
trait IAnimationMethodResponse extends js.Object {
  def execute(): Promise[_] = js.native
}

object IAnimationMethodResponse {
  @scala.inline
  def apply(execute: () => Promise[_]): IAnimationMethodResponse = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[IAnimationMethodResponse]
  }
  @scala.inline
  implicit class IAnimationMethodResponseOps[Self <: IAnimationMethodResponse] (val x: Self) extends AnyVal {
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
    def setExecute(value: () => Promise[_]): Self = this.set("execute", js.Any.fromFunction0(value))
  }
  
}

