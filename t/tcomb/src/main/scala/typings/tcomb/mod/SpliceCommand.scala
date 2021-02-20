package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpliceCommand extends Command {
  
  @JSName("$splice")
  var $splice: js.Array[js.Array[_]] = js.native
}
object SpliceCommand {
  
  @scala.inline
  def apply($splice: js.Array[js.Array[_]]): SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpliceCommand]
  }
  
  @scala.inline
  implicit class SpliceCommandMutableBuilder[Self <: SpliceCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$splice(value: js.Array[js.Array[_]]): Self = StObject.set(x, "$splice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$spliceVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "$splice", js.Array(value :_*))
  }
}
