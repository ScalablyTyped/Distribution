package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpliceCommand extends js.Object {
  @JSName("$splice")
  var $splice: js.Array[js.Array[_]]
}

object SpliceCommand {
  @scala.inline
  def apply($splice: js.Array[js.Array[_]]): SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice)
  
    __obj.asInstanceOf[SpliceCommand]
  }
}

