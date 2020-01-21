package typings.utility.mod

import typings.node.NodeJS.Immediate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "setImmediate")
@js.native
object setImmediate extends js.Object {
  /**
    * -------------------0_0---------------------
    * @description Defines For Polyfill Methods
    * @see https://github.com/node-modules/utility#timers
    * -------------------0^0-------------------
    */
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
}

