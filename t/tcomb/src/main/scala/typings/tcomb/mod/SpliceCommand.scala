package typings.tcomb.mod

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
  implicit class SpliceCommandOps[Self <: SpliceCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$spliceVarargs(value: js.Array[js.Any]*): Self = this.set("$splice", js.Array(value :_*))
    
    @scala.inline
    def set$splice(value: js.Array[js.Array[_]]): Self = this.set("$splice", value.asInstanceOf[js.Any])
  }
}
