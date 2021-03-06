package typings.xstate.anon

import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.RaiseAction
import typings.xstate.typesMod.SendAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent]) = js.native
}
