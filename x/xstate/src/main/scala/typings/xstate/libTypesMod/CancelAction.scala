package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  var sendId: String | Double = js.native
  
  @JSName("type")
  var type_CancelAction: Cancel = js.native
}
