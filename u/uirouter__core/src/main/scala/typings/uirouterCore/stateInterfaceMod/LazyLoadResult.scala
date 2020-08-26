package typings.uirouterCore.stateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyLoadResult extends js.Object {
  var states: js.UndefOr[js.Array[StateDeclaration]] = js.native
}

object LazyLoadResult {
  @scala.inline
  def apply(): LazyLoadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyLoadResult]
  }
  @scala.inline
  implicit class LazyLoadResultOps[Self <: LazyLoadResult] (val x: Self) extends AnyVal {
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
    def setStatesVarargs(value: StateDeclaration*): Self = this.set("states", js.Array(value :_*))
    @scala.inline
    def setStates(value: js.Array[StateDeclaration]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
  
}

