package typings.victory.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPropTypeInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.native
  /**
    * Event handlers map. Keys are standard event names (such as onClick) and values are event callbacks
    */
  var eventHandlers: StringDictionary[
    js.Function1[
      /* event */ SyntheticEvent[_, Event], 
      (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
    ]
  ] = js.native
  var eventKey: js.UndefOr[TEventKey] = js.native
  /**
    * Targets may be any valid style namespace for a given component
    */
  var target: TTarget = js.native
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
    target: TTarget
  ): EventPropTypeInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
  }
  @scala.inline
  implicit class EventPropTypeInterfaceOps[Self <: EventPropTypeInterface[_, _], TTarget, TEventKey] (val x: Self with (EventPropTypeInterface[TTarget, TEventKey])) extends AnyVal {
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
    def setEventHandlers(
      value: StringDictionary[
          js.Function1[
            /* event */ SyntheticEvent[_, Event], 
            (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
          ]
        ]
    ): Self = this.set("eventHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: TTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildName(value: String): Self = this.set("childName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildName: Self = this.set("childName", js.undefined)
    @scala.inline
    def setEventKey(value: TEventKey): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
  }
  
}

