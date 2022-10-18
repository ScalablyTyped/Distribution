package typings.twit.mod

import typings.twit.twitStrings.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickReply extends StObject {
  
  var options: js.Array[QuickReplyOption]
  
  var `type`: options
}
object QuickReply {
  
  inline def apply(options: js.Array[QuickReplyOption]): QuickReply = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("options")
    __obj.asInstanceOf[QuickReply]
  }
  
  extension [Self <: QuickReply](x: Self) {
    
    inline def setOptions(value: js.Array[QuickReplyOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: QuickReplyOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: options): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
