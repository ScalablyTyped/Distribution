package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyAssignAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent, TEvent, BaseActionObject] {
  
  var assignment: Any = js.native
  
  @JSName("type")
  var type_AnyAssignAction: Assign = js.native
}
