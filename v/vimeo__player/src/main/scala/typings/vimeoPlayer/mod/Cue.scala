package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cue extends StObject {
  
  /**
    * The `html` property contains the HTML that the Player renders for that cue.
    */
  var html: String
  
  /**
    * The `text` property of each cue is the raw value parsed from the caption or subtitle file.
    */
  var text: String
}
object Cue {
  
  inline def apply(html: String, text: String): Cue = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cue]
  }
  
  extension [Self <: Cue](x: Self) {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
