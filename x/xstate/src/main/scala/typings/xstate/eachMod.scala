package typings.xstate

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SingleOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachMod {
  
  @JSImport("xstate/lib/each", "each")
  @js.native
  def each[TContext, TEvent /* <: EventObject */](
    collection: /* keyof TContext */ String,
    item: /* keyof TContext */ String,
    actions: SingleOrArray[ActionObject[TContext, TEvent]]
  ): ActionObject[TContext, TEvent] = js.native
  @JSImport("xstate/lib/each", "each")
  @js.native
  def each[TContext, TEvent /* <: EventObject */](
    collection: /* keyof TContext */ String,
    item: /* keyof TContext */ String,
    index: /* keyof TContext */ String,
    actions: SingleOrArray[ActionObject[TContext, TEvent]]
  ): ActionObject[TContext, TEvent] = js.native
}
