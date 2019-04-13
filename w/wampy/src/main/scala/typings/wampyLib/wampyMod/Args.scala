package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var argsDict: Dict
  var argsList: js.Array[_]
}

object Args {
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_]): Args = {
    val __obj = js.Dynamic.literal(argsDict = argsDict, argsList = argsList)
  
    __obj.asInstanceOf[Args]
  }
}

