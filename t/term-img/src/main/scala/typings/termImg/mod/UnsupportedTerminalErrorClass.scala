package typings.termImg.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsupportedTerminalErrorClass extends Error {
  
  @JSName("name")
  val name_UnsupportedTerminalErrorClass: typings.termImg.termImgStrings.UnsupportedTerminalError = js.native
}
object UnsupportedTerminalErrorClass {
  
  @scala.inline
  def apply(message: String, name: typings.termImg.termImgStrings.UnsupportedTerminalError): UnsupportedTerminalErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedTerminalErrorClass]
  }
  
  @scala.inline
  implicit class UnsupportedTerminalErrorClassOps[Self <: UnsupportedTerminalErrorClass] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.termImg.termImgStrings.UnsupportedTerminalError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
