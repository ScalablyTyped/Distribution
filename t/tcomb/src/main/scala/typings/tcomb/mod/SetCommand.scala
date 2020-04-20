package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCommand extends Command {
  @JSName("$set")
  var $set: js.Any
}

object SetCommand {
  @scala.inline
  def apply($set: js.Any): SetCommand = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCommand]
  }
}

