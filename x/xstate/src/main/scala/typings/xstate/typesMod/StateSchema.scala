package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateSchema[TC] extends js.Object {
  var context: js.UndefOr[Partial[TC]] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var states: js.UndefOr[StringDictionary[StateSchema[TC]]] = js.native
}

object StateSchema {
  @scala.inline
  def apply[TC](): StateSchema[TC] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSchema[TC]]
  }
  @scala.inline
  implicit class StateSchemaOps[Self <: StateSchema[_], TC] (val x: Self with StateSchema[TC]) extends AnyVal {
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
    def setContext(value: Partial[TC]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setStates(value: StringDictionary[StateSchema[TC]]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
  
}

