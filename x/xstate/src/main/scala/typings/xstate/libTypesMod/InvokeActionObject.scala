package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeActionObject[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActivityActionObject[TContext, TEvent] {
  
  /** @deprecated an internal signature that doesn't exist at runtime. Its existence helps TS to choose a better code path in the inference algorithm  */
  @JSName("activity")
  def activity_MInvokeActionObject(arg: TContext, ev: TEvent, meta: ActionMeta[TContext, TEvent, BaseActionObject]): Unit = js.native
  @JSName("activity")
  var activity_Original: InvokeDefinition[TContext, TEvent] = js.native
}
