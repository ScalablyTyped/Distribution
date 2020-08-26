package typings.xstate.anon

import typings.xstate.typesMod.ActionTypes.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeUpdate extends js.Object {
  var `type`: Update = js.native
}

object TypeUpdate {
  @scala.inline
  def apply(`type`: Update): TypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUpdate]
  }
  @scala.inline
  implicit class TypeUpdateOps[Self <: TypeUpdate] (val x: Self) extends AnyVal {
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
    def setType(value: Update): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

