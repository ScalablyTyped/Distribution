package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Choose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  var conds: js.Array[ChooseCondition[TContext, TEvent, TEvent]] = js.native
  
  @JSName("type")
  var type_ChooseAction: Choose = js.native
}
