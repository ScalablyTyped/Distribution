package typings.xstate

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SingleOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/each", JSImport.Namespace)
@js.native
object eachMod extends js.Object {
  def each[TContext, TEvent /* <: EventObject */](collection: String, item: String, actions: SingleOrArray[ActionObject[TContext, TEvent]]): ActionObject[TContext, TEvent] = js.native
  def each[TContext, TEvent /* <: EventObject */](
    collection: String,
    item: String,
    index: String,
    actions: SingleOrArray[ActionObject[TContext, TEvent]]
  ): ActionObject[TContext, TEvent] = js.native
}

