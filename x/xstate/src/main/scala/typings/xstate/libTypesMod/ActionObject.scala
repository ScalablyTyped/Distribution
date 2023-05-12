package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionObject[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] extends StObject {
  
  /** @deprecated an internal signature that doesn't exist at runtime. Its existence helps TS to choose a better code path in the inference algorithm  */
  def apply(arg: TContext, ev: TExpressionEvent, meta: ActionMeta[TContext, TEvent, TAction]): Unit = js.native
  
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TExpressionEvent, BaseActionObject, TEvent]] = js.native
  
  var `type`: String = js.native
}
