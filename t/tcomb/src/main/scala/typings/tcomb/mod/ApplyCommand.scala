package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyCommand extends Command {
  @JSName("$apply")
  var $apply: js.Function
}

object ApplyCommand {
  @scala.inline
  def apply($apply: js.Function): ApplyCommand = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyCommand]
  }
}

