package typings.stylelint.mod

import typings.postcss.libResultMod.Message
import typings.stylelint.anon.Nodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyResult extends StObject {
  
  var messages: js.Array[Message]
  
  var opts: Unit
  
  var root: Nodes
}
object EmptyResult {
  
  inline def apply(messages: js.Array[Message], opts: Unit, root: Nodes): EmptyResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmptyResult] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setOpts(value: Unit): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Nodes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
