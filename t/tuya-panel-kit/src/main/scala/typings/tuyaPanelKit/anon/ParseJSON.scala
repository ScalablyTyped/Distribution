package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseJSON extends js.Object {
  
  def parseJSON(value: String): js.Object = js.native
}
object ParseJSON {
  
  @scala.inline
  def apply(parseJSON: String => js.Object): ParseJSON = {
    val __obj = js.Dynamic.literal(parseJSON = js.Any.fromFunction1(parseJSON))
    __obj.asInstanceOf[ParseJSON]
  }
  
  @scala.inline
  implicit class ParseJSONOps[Self <: ParseJSON] (val x: Self) extends AnyVal {
    
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
    def setParseJSON(value: String => js.Object): Self = this.set("parseJSON", js.Any.fromFunction1(value))
  }
}
