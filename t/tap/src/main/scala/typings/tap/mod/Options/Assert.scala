package typings.tap.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends Bag {
  var diagnostic: js.UndefOr[Boolean] = js.native
  var skip: js.UndefOr[Boolean | String] = js.native
  var todo: js.UndefOr[Boolean | String] = js.native
}

object Assert {
  @scala.inline
  def apply(): Assert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assert]
  }
  @scala.inline
  implicit class AssertOps[Self <: Assert] (val x: Self) extends AnyVal {
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
    def setDiagnostic(value: Boolean): Self = this.set("diagnostic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostic: Self = this.set("diagnostic", js.undefined)
    @scala.inline
    def setSkip(value: Boolean | String): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setTodo(value: Boolean | String): Self = this.set("todo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTodo: Self = this.set("todo", js.undefined)
  }
  
}

