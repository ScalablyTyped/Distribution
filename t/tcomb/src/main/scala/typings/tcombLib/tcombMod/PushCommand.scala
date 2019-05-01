package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushCommand extends Command {
  @JSName("$push")
  var $push: js.Array[_]
}

object PushCommand {
  @scala.inline
  def apply($push: js.Array[_]): PushCommand = {
    val __obj = js.Dynamic.literal($push = $push)
  
    __obj.asInstanceOf[PushCommand]
  }
}

