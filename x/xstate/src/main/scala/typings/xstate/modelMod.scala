package typings.xstate

import typings.xstate.modelTypesMod.Model
import typings.xstate.modelTypesMod.ModelCreators
import typings.xstate.typesMod.BaseActionObject
import typings.xstate.typesMod.Cast
import typings.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("xstate/lib/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModel[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */](initialContext: TContext): Model[TContext, TEvent, TAction, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(initialContext.asInstanceOf[js.Any]).asInstanceOf[Model[TContext, TEvent, TAction, Unit]]
  inline def createModel[TContext, TModelCreators /* <: ModelCreators[TModelCreators] */, TFinalModelCreators, TComputedEvent, TComputedAction](initialContext: TContext, creators: TModelCreators): Model[
    TContext, 
    Cast[TComputedEvent, EventObject], 
    (Cast[TComputedAction, BaseActionObject]) | BaseActionObject, 
    TFinalModelCreators
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(initialContext.asInstanceOf[js.Any], creators.asInstanceOf[js.Any])).asInstanceOf[Model[
    TContext, 
    Cast[TComputedEvent, EventObject], 
    (Cast[TComputedAction, BaseActionObject]) | BaseActionObject, 
    TFinalModelCreators
  ]]
}
