package typings.victory.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPropTypeInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.undefined
  /**
    * Event handlers map. Keys are standard event names (such as onClick) and values are event callbacks
    */
  var eventHandlers: StringDictionary[
    js.Function1[
      /* event */ SyntheticEvent[_, Event], 
      (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
    ]
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
    eventHandlers: StringDictionary[
      js.Function1[
        /* event */ SyntheticEvent[_, Event], 
        (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
      ]
    ],
    target: TTarget,
    childName: String = null,
    eventKey: TEventKey = null
  ): EventPropTypeInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (childName != null) __obj.updateDynamic("childName")(childName.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
  }
}

