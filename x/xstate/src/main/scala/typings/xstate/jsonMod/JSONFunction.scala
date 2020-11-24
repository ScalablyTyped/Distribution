package typings.xstate.jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONFunction extends js.Object {
  
  @JSName("$function")
  var $function: String = js.native
}
object JSONFunction {
  
  @scala.inline
  def apply($function: String): JSONFunction = {
    val __obj = js.Dynamic.literal($function = $function.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFunction]
  }
  
  @scala.inline
  implicit class JSONFunctionOps[Self <: JSONFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$function(value: String): Self = this.set("$function", value.asInstanceOf[js.Any])
  }
}
