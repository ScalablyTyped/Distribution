package typings.subsume.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseResults extends js.Object {
  
  var data: Map[String, String] = js.native
  
  var rest: String = js.native
}
object ParseResults {
  
  @scala.inline
  def apply(data: Map[String, String], rest: String): ParseResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResults]
  }
  
  @scala.inline
  implicit class ParseResultsOps[Self <: ParseResults] (val x: Self) extends AnyVal {
    
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
    def setData(value: Map[String, String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest(value: String): Self = this.set("rest", value.asInstanceOf[js.Any])
  }
}
