package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocalizableStrings extends js.Object {
  
  /**
    * The aria label for the underlying input textarea for the terminal.
    */
  var promptLabel: String = js.native
  
  /**
    * Announcement for when line reading is suppressed due to too many lines
    * being printed to the terminal when `screenReaderMode` is enabled.
    */
  var tooMuchOutput: String = js.native
}
object ILocalizableStrings {
  
  @scala.inline
  def apply(promptLabel: String, tooMuchOutput: String): ILocalizableStrings = {
    val __obj = js.Dynamic.literal(promptLabel = promptLabel.asInstanceOf[js.Any], tooMuchOutput = tooMuchOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalizableStrings]
  }
  
  @scala.inline
  implicit class ILocalizableStringsOps[Self <: ILocalizableStrings] (val x: Self) extends AnyVal {
    
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
    def setPromptLabel(value: String): Self = this.set("promptLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooMuchOutput(value: String): Self = this.set("tooMuchOutput", value.asInstanceOf[js.Any])
  }
}
