package typings.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available options for tape assertions.
  */
@js.native
trait AssertOptions extends js.Object {
  
   // Allows the assertion to fail.
  var message: js.UndefOr[String] = js.native
  
  var skip: js.UndefOr[Boolean | String] = js.native
  
   // Skip the assertion. Can also be a message explaining why the test is skipped.
  var todo: js.UndefOr[Boolean | String] = js.native
}
object AssertOptions {
  
  @scala.inline
  def apply(): AssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertOptions]
  }
  
  @scala.inline
  implicit class AssertOptionsOps[Self <: AssertOptions] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean | String): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setTodo(value: Boolean | String): Self = this.set("todo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodo: Self = this.set("todo", js.undefined)
  }
}
