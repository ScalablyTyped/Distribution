package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeCommand extends Command {
  
  @JSName("$merge")
  var $merge: js.Object = js.native
}
object MergeCommand {
  
  @scala.inline
  def apply($merge: js.Object): MergeCommand = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeCommand]
  }
  
  @scala.inline
  implicit class MergeCommandMutableBuilder[Self <: MergeCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$merge(value: js.Object): Self = StObject.set(x, "$merge", value.asInstanceOf[js.Any])
  }
}
