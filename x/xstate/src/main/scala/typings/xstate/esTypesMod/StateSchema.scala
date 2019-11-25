package typings.xstate.esTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateSchema extends js.Object {
  var meta: js.UndefOr[js.Any] = js.undefined
  var states: js.UndefOr[Record[String | Double, StateSchema]] = js.undefined
}

object StateSchema {
  @scala.inline
  def apply(meta: js.Any = null, states: Record[String | Double, StateSchema] = null): StateSchema = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSchema]
  }
}

