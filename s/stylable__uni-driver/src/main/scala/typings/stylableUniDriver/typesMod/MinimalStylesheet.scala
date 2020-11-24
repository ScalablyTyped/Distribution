package typings.stylableUniDriver.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalStylesheet extends js.Object {
  
  def cssStates(states: Record[String, StateValue]): String = js.native
}
object MinimalStylesheet {
  
  @scala.inline
  def apply(cssStates: Record[String, StateValue] => String): MinimalStylesheet = {
    val __obj = js.Dynamic.literal(cssStates = js.Any.fromFunction1(cssStates))
    __obj.asInstanceOf[MinimalStylesheet]
  }
  
  @scala.inline
  implicit class MinimalStylesheetOps[Self <: MinimalStylesheet] (val x: Self) extends AnyVal {
    
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
    def setCssStates(value: Record[String, StateValue] => String): Self = this.set("cssStates", js.Any.fromFunction1(value))
  }
}
