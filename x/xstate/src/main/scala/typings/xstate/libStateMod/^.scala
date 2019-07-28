package typings.xstate.libStateMod

import typings.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/State", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def stateValuesEqual(): Boolean = js.native
  def stateValuesEqual(a: js.UndefOr[StateValue], b: StateValue): Boolean = js.native
  def stateValuesEqual(a: StateValue): Boolean = js.native
}

