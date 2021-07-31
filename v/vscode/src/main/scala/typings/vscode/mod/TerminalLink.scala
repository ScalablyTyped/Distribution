package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalLink extends StObject {
  
  /**
    * The length of the link on [TerminalLinkContext.line](#TerminalLinkContext.line]
    */
  var length: Double
  
  /**
    * The start index of the link on [TerminalLinkContext.line](#TerminalLinkContext.line].
    */
  var startIndex: Double
  
  /**
    * The tooltip text when you hover over this link.
    *
    * If a tooltip is provided, is will be displayed in a string that includes instructions on
    * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
    * depending on OS, user settings, and localization.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}
object TerminalLink {
  
  @scala.inline
  def apply(length: Double, startIndex: Double): TerminalLink = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalLink]
  }
  
  @scala.inline
  implicit class TerminalLinkMutableBuilder[Self <: TerminalLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
