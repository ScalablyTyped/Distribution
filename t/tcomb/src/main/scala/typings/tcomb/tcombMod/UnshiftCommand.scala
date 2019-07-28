package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnshiftCommand extends Command {
  @JSName("$unshift")
  var $unshift: js.Array[_]
}

object UnshiftCommand {
  @scala.inline
  def apply($unshift: js.Array[_]): UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift)
  
    __obj.asInstanceOf[UnshiftCommand]
  }
}

