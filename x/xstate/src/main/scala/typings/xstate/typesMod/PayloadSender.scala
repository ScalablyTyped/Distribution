package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadSender[TEvent /* <: EventObject */] extends js.Object {
  
  /**
    * Send an event object or just the event type, if the event has no other payload
    */
  def apply(event: TEvent): Unit = js.native
  def apply(
    event: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.ExtractSimple<TEvent>['type'] */ js.Any
  ): Unit = js.native
  /**
    * Send an event type and its payload
    */
  def apply[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](eventType: K, payload: NeverIfEmpty[ExtractExtraParameters[TEvent, K]]): Unit = js.native
}
