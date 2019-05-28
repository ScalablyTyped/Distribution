package typings
package xstateLib.libActorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actor[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */]
  extends xstateLib.libTypesMod.Subscribable[TContext] {
  var id: java.lang.String = js.native
  var stop: js.UndefOr[js.Function0[js.UndefOr[_]]] = js.native
  def send(event: TEvent): js.Any = js.native
  def toJSON(): xstateLib.Anon_Id = js.native
}

