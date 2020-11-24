package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellQuotedString extends js.Object {
  
  /**
    * The quoting style to use.
    */
  var quoting: ShellQuoting = js.native
  
  /**
    * The actual string value.
    */
  var value: String = js.native
}
object ShellQuotedString {
  
  @scala.inline
  def apply(quoting: ShellQuoting, value: String): ShellQuotedString = {
    val __obj = js.Dynamic.literal(quoting = quoting.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellQuotedString]
  }
  
  @scala.inline
  implicit class ShellQuotedStringOps[Self <: ShellQuotedString] (val x: Self) extends AnyVal {
    
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
    def setQuoting(value: ShellQuoting): Self = this.set("quoting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
