package typings.tcomb.mod

import typings.tcomb.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Command extends StObject
object Command {
  
  inline def ApplyCommand($apply: js.Function): typings.tcomb.mod.ApplyCommand = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.ApplyCommand]
  }
  
  inline def MergeCommand($merge: js.Object): typings.tcomb.mod.MergeCommand = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.MergeCommand]
  }
  
  inline def PushCommand($push: js.Array[scala.Any]): typings.tcomb.mod.PushCommand = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.PushCommand]
  }
  
  inline def RemoveCommand($remove: js.Array[java.lang.String]): typings.tcomb.mod.RemoveCommand = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.RemoveCommand]
  }
  
  inline def SetCommand($set: scala.Any): typings.tcomb.mod.SetCommand = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.SetCommand]
  }
  
  inline def SpliceCommand($splice: js.Array[js.Array[scala.Any]]): typings.tcomb.mod.SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.SpliceCommand]
  }
  
  inline def SwapCommand($swap: From): typings.tcomb.mod.SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.SwapCommand]
  }
  
  inline def UnshiftCommand($unshift: js.Array[scala.Any]): typings.tcomb.mod.UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tcomb.mod.UnshiftCommand]
  }
}
