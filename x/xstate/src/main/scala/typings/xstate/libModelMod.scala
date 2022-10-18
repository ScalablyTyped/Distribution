package typings.xstate

import typings.xstate.libModelDottypesMod.Model
import typings.xstate.libModelDottypesMod.ModelCreators
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.Cast
import typings.xstate.libTypesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelMod {
  
  @JSImport("xstate/lib/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModel[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */](initialContext: TContext): Model[TContext, TEvent, TAction, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(initialContext.asInstanceOf[js.Any]).asInstanceOf[Model[TContext, TEvent, TAction, Unit]]
  inline def createModel[TContext, TModelCreators /* <: ModelCreators[TModelCreators] */, TFinalModelCreators, TComputedEvent, TComputedAction](initialContext: TContext, creators: TModelCreators): Model[
    TContext, 
    Cast[TComputedEvent, EventObject], 
    /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.IsNever<TComputedAction> extends true ? xstate.xstate/lib/types.BaseActionObject : xstate.xstate/lib/types.Cast<TComputedAction, xstate.xstate/lib/types.BaseActionObject> */ js.Any, 
    TFinalModelCreators
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(initialContext.asInstanceOf[js.Any], creators.asInstanceOf[js.Any])).asInstanceOf[Model[
    TContext, 
    Cast[TComputedEvent, EventObject], 
    /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.IsNever<TComputedAction> extends true ? xstate.xstate/lib/types.BaseActionObject : xstate.xstate/lib/types.Cast<TComputedAction, xstate.xstate/lib/types.BaseActionObject> */ js.Any, 
    TFinalModelCreators
  ]]
}
