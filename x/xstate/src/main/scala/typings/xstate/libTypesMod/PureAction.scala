package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Pure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PureAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  def get(context: TContext, event: TEvent): js.UndefOr[
    SingleOrArray[(ActionObject[TContext, TEvent, TEvent, BaseActionObject]) | String]
  ] = js.native
  
  @JSName("type")
  var type_PureAction: Pure = js.native
}
