package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollOptions extends StObject {
  
  var position: Double
  
  var text: String
}
object PollOptions {
  
  @scala.inline
  def apply(position: Double, text: String): PollOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOptions]
  }
  
  @scala.inline
  implicit class PollOptionsMutableBuilder[Self <: PollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
