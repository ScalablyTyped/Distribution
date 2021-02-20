package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharsToEscape extends StObject {
  
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
  implicit class CharsToEscapeMutableBuilder[Self <: CharsToEscape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharsToEscape(value: String): Self = StObject.set(x, "charsToEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
  }
}
