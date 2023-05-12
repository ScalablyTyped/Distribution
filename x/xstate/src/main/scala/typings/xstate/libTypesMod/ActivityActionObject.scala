package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Start
import typings.xstate.libTypesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityActionObject[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent, TEvent, BaseActionObject] {
  
  var activity: js.UndefOr[ActivityDefinition[TContext, TEvent]] = js.native
  
  @JSName("type")
  var type_ActivityActionObject: Start | Stop = js.native
}
