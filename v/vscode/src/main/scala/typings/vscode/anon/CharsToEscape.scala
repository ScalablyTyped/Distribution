package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharsToEscape extends js.Object {
  
  /**
    * The characters to escape.
    */
  var charsToEscape: String = js.native
  
  /**
    * The escape character.
    */
  var escapeChar: String = js.native
}
object CharsToEscape {
  
  @scala.inline
  def apply(charsToEscape: String, escapeChar: String): CharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape.asInstanceOf[js.Any], escapeChar = escapeChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharsToEscape]
  }
  
  @scala.inline
  implicit class CharsToEscapeOps[Self <: CharsToEscape] (val x: Self) extends AnyVal {
    
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
    def setCharsToEscape(value: String): Self = this.set("charsToEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
  }
}
