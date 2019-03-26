package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeDefinition[TContext, TEvent /* <: EventObject */] extends ActivityDefinition[TContext, TEvent] {
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])] = js.undefined
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var forward: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: java.lang.String
}

object InvokeDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    id: java.lang.String,
    src: java.lang.String,
    `type`: java.lang.String,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    exec: ActionFunction[TContext, TEvent] = null,
    forward: js.UndefOr[scala.Boolean] = js.undefined
  ): InvokeDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id, src = src)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward)
    __obj.asInstanceOf[InvokeDefinition[TContext, TEvent]]
  }
}

