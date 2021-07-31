package typings.xstate.anon

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.PureAction
import typings.xstate.typesMod.SingleOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallGetActions extends StObject {
  
  def apply[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
}
