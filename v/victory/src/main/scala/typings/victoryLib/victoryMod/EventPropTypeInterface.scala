package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPropTypeInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Event handlers map. Keys are standard event names (such as onClick) and values are event callbacks
    */
  var eventHandlers: org.scalablytyped.runtime.StringDictionary[
    (victoryLib.Fn_Event[TTarget, TEventKey]) | (victoryLib.Fn_EventAny[TTarget, TEventKey])
  ]
  var eventKey: js.UndefOr[TEventKey] = js.undefined
  /**
    * Targets may be any valid style namespace for a given component
    */
  var target: TTarget
}

object EventPropTypeInterface {
  @scala.inline
  def apply[TTarget, TEventKey](
    eventHandlers: org.scalablytyped.runtime.StringDictionary[
      (victoryLib.Fn_Event[TTarget, TEventKey]) | (victoryLib.Fn_EventAny[TTarget, TEventKey])
    ],
    target: TTarget,
    childName: java.lang.String = null,
    eventKey: TEventKey = null
  ): EventPropTypeInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers, target = target.asInstanceOf[js.Any])
    if (childName != null) __obj.updateDynamic("childName")(childName)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
  }
}

