package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCommand extends Command {
  @JSName("$merge")
  var $merge: js.Object
}

object MergeCommand {
  @scala.inline
  def apply($merge: js.Object): MergeCommand = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeCommand]
  }
}

