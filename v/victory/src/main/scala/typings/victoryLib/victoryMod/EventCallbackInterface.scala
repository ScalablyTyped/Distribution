package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return value for eventHandlers values
  */
trait EventCallbackInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[java.lang.String] = js.undefined
  var eventKey: js.UndefOr[TEventKey] = js.undefined
  var target: js.UndefOr[TTarget] = js.undefined
  /**
    * Will be called with the calculated props for the individual selected element and result will override
    * props of selected element via object assignment
    * @param props
    */
  def mutation(props: js.Any): js.Any
}

object EventCallbackInterface {
  @scala.inline
  def apply[TTarget, TEventKey](
    mutation: js.Function1[js.Any, js.Any],
    childName: java.lang.String = null,
    eventKey: TEventKey = null,
    target: TTarget = null
  ): EventCallbackInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(mutation = mutation)
    if (childName != null) __obj.updateDynamic("childName")(childName)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
  }
}

