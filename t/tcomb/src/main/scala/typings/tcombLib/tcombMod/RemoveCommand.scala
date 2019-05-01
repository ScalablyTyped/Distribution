package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveCommand extends Command {
  @JSName("$remove")
  var $remove: js.Array[java.lang.String]
}

object RemoveCommand {
  @scala.inline
  def apply($remove: js.Array[java.lang.String]): RemoveCommand = {
    val __obj = js.Dynamic.literal($remove = $remove)
  
    __obj.asInstanceOf[RemoveCommand]
  }
}

