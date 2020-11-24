package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalLink extends js.Object {
  
  /**
    * The length of the link on [TerminalLinkContext.line](#TerminalLinkContext.line]
    */
  var length: Double = js.native
  
  /**
    * The start index of the link on [TerminalLinkContext.line](#TerminalLinkContext.line].
    */
  var startIndex: Double = js.native
  
  /**
    * The tooltip text when you hover over this link.
    *
    * If a tooltip is provided, is will be displayed in a string that includes instructions on
    * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
    * depending on OS, user settings, and localization.
    */
  var tooltip: js.UndefOr[String] = js.native
}
object TerminalLink {
  
  @scala.inline
  def apply(length: Double, startIndex: Double): TerminalLink = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalLink]
  }
  
  @scala.inline
  implicit class TerminalLinkOps[Self <: TerminalLink] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
