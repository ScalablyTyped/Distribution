package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends _Payload {
  var argsDict: Dict
  var argsList: js.Array[_]
}

object Args {
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_]): Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argsDict")(argsDict)
    __obj.updateDynamic("argsList")(argsList)
    __obj.asInstanceOf[Args]
  }
}

