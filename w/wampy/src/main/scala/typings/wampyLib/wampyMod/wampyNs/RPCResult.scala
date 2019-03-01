package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCResult extends Args {
  var options: RPCOptions
}

object RPCResult {
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_], options: RPCOptions): RPCResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argsDict")(argsDict)
    __obj.updateDynamic("argsList")(argsList)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[RPCResult]
  }
}

