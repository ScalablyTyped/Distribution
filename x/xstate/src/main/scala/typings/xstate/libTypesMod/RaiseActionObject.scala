package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaiseActionObject[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with RaiseAction[TContext, TExpressionEvent, TEvent] {
  
  var _event: typings.xstate.libTypesMod.SCXML.Event[TEvent] = js.native
  
  @JSName("delay")
  var delay_RaiseActionObject: js.UndefOr[Double] = js.native
}
