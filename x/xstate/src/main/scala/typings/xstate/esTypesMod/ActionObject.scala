package typings.xstate.esTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject[TContext, TEvent /* <: EventObject */]
  extends /* other */ StringDictionary[js.Any] {
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TEvent]] = js.undefined
  /**
    * The type of action that is executed.
    */
  var `type`: String
}

object ActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    `type`: String,
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    exec: ActionFunction[TContext, TEvent] = null
  ): ActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[ActionObject[TContext, TEvent]]
  }
}

