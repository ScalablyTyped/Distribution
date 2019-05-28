package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionFunction[TContext, TEvent /* <: EventObject */] extends _Action[TContext, TEvent] {
  var name: java.lang.String = js.native
  def apply(context: TContext, event: TEvent, meta: ActionMeta[TContext, TEvent]): js.Any | scala.Unit = js.native
}

