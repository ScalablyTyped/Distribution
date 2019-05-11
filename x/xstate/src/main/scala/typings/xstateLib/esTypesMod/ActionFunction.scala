package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionFunction[TContext, TEvent /* <: EventObject */] extends _Action[TContext, TEvent] {
  var name: java.lang.String = js.native
  def apply(context: TContext, event: TEvent, meta: ExecMeta[TContext, TEvent]): js.Any | scala.Unit = js.native
}

