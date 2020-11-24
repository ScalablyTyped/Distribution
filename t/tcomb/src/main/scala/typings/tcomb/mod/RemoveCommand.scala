package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveCommand extends Command {
  
  @JSName("$remove")
  var $remove: js.Array[java.lang.String] = js.native
}
object RemoveCommand {
  
  @scala.inline
  def apply($remove: js.Array[java.lang.String]): RemoveCommand = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCommand]
  }
  
  @scala.inline
  implicit class RemoveCommandOps[Self <: RemoveCommand] (val x: Self) extends AnyVal {
    
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
    def set$removeVarargs(value: java.lang.String*): Self = this.set("$remove", js.Array(value :_*))
    
    @scala.inline
    def set$remove(value: js.Array[java.lang.String]): Self = this.set("$remove", value.asInstanceOf[js.Any])
  }
}
