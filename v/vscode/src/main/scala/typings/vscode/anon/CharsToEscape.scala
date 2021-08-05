package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharsToEscape extends StObject {
  
  /**
    * The characters to escape.
    */
  var charsToEscape: String
  
  /**
    * The escape character.
    */
  var escapeChar: String
}
object CharsToEscape {
  
  inline def apply(charsToEscape: String, escapeChar: String): CharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape.asInstanceOf[js.Any], escapeChar = escapeChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharsToEscape]
  }
  
  extension [Self <: CharsToEscape](x: Self) {
    
    inline def setCharsToEscape(value: String): Self = StObject.set(x, "charsToEscape", value.asInstanceOf[js.Any])
    
    inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
  }
}
