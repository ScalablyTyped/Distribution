package typings.tuyaPanelKit.typesMod

import typings.std.Extract
import typings.tuyaPanelKit.anon.TargetTypeEventName
import typings.tuyaPanelKit.anon.`3`
import typings.tuyaPanelKit.anon.`4`
import typings.tuyaPanelKit.anon.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter[EventMap /* <: EventMapBase */] extends js.Object {
  
  /**
    * Emit an event to child screens.
    *
    * @param options.type Type of the event (e.g. `focus`, `blur`)
    * @param [options.data] Optional information regarding the event.
    * @param [options.target] Key of the target route which should receive the event.
    * If not specified, all routes receive the event.
    */
  def emit[EventName /* <: Extract[/* keyof EventMap */ String, String] */](
    options: (TargetTypeEventName[EventName, EventMap]) with (js.Object | `3`) with ((`5`[EventMap, EventName]) | (`4`[EventMap, EventName]))
  ): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ] = js.native
}
object EventEmitter {
  
  @scala.inline
  def apply[EventMap /* <: EventMapBase */](
    emit: (TargetTypeEventName[js.Any, EventMap]) with (js.Object | `3`) with ((`5`[EventMap, js.Any]) | (`4`[EventMap, js.Any])) => EventArg[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ]
  ): EventEmitter[EventMap] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit))
    __obj.asInstanceOf[EventEmitter[EventMap]]
  }
  
  @scala.inline
  implicit class EventEmitterOps[Self <: EventEmitter[_], EventMap /* <: EventMapBase */] (val x: Self with EventEmitter[EventMap]) extends AnyVal {
    
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
    def setEmit(
      value: (TargetTypeEventName[js.Any, EventMap]) with (js.Object | `3`) with ((`5`[EventMap, js.Any]) | (`4`[EventMap, js.Any])) => EventArg[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
        ]
    ): Self = this.set("emit", js.Any.fromFunction1(value))
  }
}
