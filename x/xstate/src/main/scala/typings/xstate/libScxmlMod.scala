package typings.xstate

import typings.xstate.libScxmlMod.ScxmlToMachineOptions
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.OmniEventObject
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/scxml", JSImport.Namespace)
@js.native
object libScxmlMod extends js.Object {
  @js.native
  trait ScxmlToMachineOptions extends js.Object {
    var delimiter: js.UndefOr[String] = js.native
    def evalCond(expr: String): (js.Function2[/* extState */ js.Any, /* event */ EventObject, Boolean]) | js.Function = js.native
    def evalCond(expr: String, extState: js.Object): (js.Function2[/* extState */ js.Any, /* event */ EventObject, Boolean]) | js.Function = js.native
  }
  
  def toMachine(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, OmniEventObject[EventObject]] = js.native
}

