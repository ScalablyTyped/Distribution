package typings.victory.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPropTypeInterface[TTarget, TEventKey] extends StObject {
  
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
      /* event */ SyntheticEvent[js.Any, Event], 
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
        /* event */ SyntheticEvent[js.Any, Event], 
        (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
      ]
    ],
    target: TTarget
  ): EventPropTypeInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
  }
  
  @scala.inline
  implicit class EventPropTypeInterfaceMutableBuilder[Self <: EventPropTypeInterface[?, ?], TTarget, TEventKey] (val x: Self & (EventPropTypeInterface[TTarget, TEventKey])) extends AnyVal {
    
    @scala.inline
    def setChildName(value: String): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
    
    @scala.inline
    def setEventHandlers(
      value: StringDictionary[
          js.Function1[
            /* event */ SyntheticEvent[js.Any, Event], 
            (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
          ]
        ]
    ): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKey(value: TEventKey): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setTarget(value: TTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
