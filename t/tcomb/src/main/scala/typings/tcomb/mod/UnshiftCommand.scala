package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnshiftCommand extends Command {
  
  @JSName("$unshift")
  var $unshift: js.Array[_] = js.native
}
object UnshiftCommand {
  
  @scala.inline
  def apply($unshift: js.Array[_]): UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshiftCommand]
  }
  
  @scala.inline
  implicit class UnshiftCommandOps[Self <: UnshiftCommand] (val x: Self) extends AnyVal {
    
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
    def set$unshiftVarargs(value: js.Any*): Self = this.set("$unshift", js.Array(value :_*))
    
    @scala.inline
    def set$unshift(value: js.Array[_]): Self = this.set("$unshift", value.asInstanceOf[js.Any])
  }
}
