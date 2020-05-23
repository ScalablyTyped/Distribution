package typings.tcomb.mod

import typings.tcomb.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tcomb.mod.ApplyCommand
  - typings.tcomb.mod.PushCommand
  - typings.tcomb.mod.RemoveCommand
  - typings.tcomb.mod.SetCommand
  - typings.tcomb.mod.SpliceCommand
  - typings.tcomb.mod.SwapCommand
  - typings.tcomb.mod.UnshiftCommand
  - typings.tcomb.mod.MergeCommand
*/
trait Command extends js.Object

object Command {
  @scala.inline
  def MergeCommand($merge: js.Object): Command = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def UnshiftCommand($unshift: js.Array[_]): Command = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def ApplyCommand($apply: js.Function): Command = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def SwapCommand($swap: From): Command = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def SetCommand($set: js.Any): Command = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def PushCommand($push: js.Array[_]): Command = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def SpliceCommand($splice: js.Array[js.Array[_]]): Command = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def RemoveCommand($remove: js.Array[java.lang.String]): Command = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

