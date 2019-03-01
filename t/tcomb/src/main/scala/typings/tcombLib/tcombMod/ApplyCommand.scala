package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyCommand extends js.Object {
  @JSName("$apply")
  var $apply: js.Function
}

object ApplyCommand {
  @scala.inline
  def apply($apply: js.Function): ApplyCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$apply")($apply)
    __obj.asInstanceOf[ApplyCommand]
  }
}

