package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpliceCommand extends Command {
  @JSName("$splice")
  var $splice: js.Array[js.Array[_]]
}

object SpliceCommand {
  @scala.inline
  def apply($splice: js.Array[js.Array[_]]): SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpliceCommand]
  }
}

