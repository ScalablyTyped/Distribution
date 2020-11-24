package typings.taskGraphRunner.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results[Item, Result] extends js.Object {
  
  var safe: Boolean = js.native
  
  var values: Map[Item, Result] = js.native
}
object Results {
  
  @scala.inline
  def apply[Item, Result](safe: Boolean, values: Map[Item, Result]): Results[Item, Result] = {
    val __obj = js.Dynamic.literal(safe = safe.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[Item, Result]]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results[_, _], Item, Result] (val x: Self with (Results[Item, Result])) extends AnyVal {
    
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
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Map[Item, Result]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
