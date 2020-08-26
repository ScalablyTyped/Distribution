package typings.systemjs.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Declare extends js.Object {
  var execute: js.UndefOr[js.Function0[_]] = js.native
  var setters: js.UndefOr[js.Array[SetterFn]] = js.native
}

object Declare {
  @scala.inline
  def apply(): Declare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declare]
  }
  @scala.inline
  implicit class DeclareOps[Self <: Declare] (val x: Self) extends AnyVal {
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
    def setExecute(value: () => _): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setSettersVarargs(value: SetterFn*): Self = this.set("setters", js.Array(value :_*))
    @scala.inline
    def setSetters(value: js.Array[SetterFn]): Self = this.set("setters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetters: Self = this.set("setters", js.undefined)
  }
  
}

