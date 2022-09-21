package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActorRef[TEvent /* <: EventObject */, TEmitted]
  extends StObject
     with Subscribable[TEmitted]
     with InteropObservable[TEmitted] {
  
  def getSnapshot(): js.UndefOr[TEmitted] = js.native
  
  var id: String = js.native
  
  def send(event: Event[TEvent]): Unit = js.native
  @JSName("send")
  var send_Original: Sender[TEvent] = js.native
  
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var toJSON: js.UndefOr[js.Function0[Any]] = js.native
}
