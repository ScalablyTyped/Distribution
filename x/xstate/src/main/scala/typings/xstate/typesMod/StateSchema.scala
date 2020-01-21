package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateSchema[TC] extends js.Object {
  var context: js.UndefOr[Partial[TC]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var states: js.UndefOr[StringDictionary[StateSchema[TC]]] = js.undefined
}

object StateSchema {
  @scala.inline
  def apply[TC](context: Partial[TC] = null, meta: js.Any = null, states: StringDictionary[StateSchema[TC]] = null): StateSchema[TC] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSchema[TC]]
  }
}

