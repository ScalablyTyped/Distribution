package typings.tcomb.tcombMod

import typings.tcomb.Anon_From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tcomb.tcombMod.ApplyCommand
  - typings.tcomb.tcombMod.PushCommand
  - typings.tcomb.tcombMod.RemoveCommand
  - typings.tcomb.tcombMod.SetCommand
  - typings.tcomb.tcombMod.SpliceCommand
  - typings.tcomb.tcombMod.SwapCommand
  - typings.tcomb.tcombMod.UnshiftCommand
  - typings.tcomb.tcombMod.MergeCommand
*/
trait Command extends js.Object

object Command {
  @scala.inline
  def PushCommand($push: js.Array[_]): Command = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def RemoveCommand($remove: js.Array[java.lang.String]): Command = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def SwapCommand($swap: Anon_From): Command = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def UnshiftCommand($unshift: js.Array[_]): Command = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def MergeCommand($merge: js.Object): Command = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def SpliceCommand($splice: js.Array[js.Array[_]]): Command = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def ApplyCommand($apply: js.Function): Command = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  def SetCommand($set: js.Any): Command = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Command]
  }
}

