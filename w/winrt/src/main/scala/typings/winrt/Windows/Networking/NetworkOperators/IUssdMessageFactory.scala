package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdMessageFactory extends StObject {
  
  def createMessage(messageText: String): UssdMessage
}
object IUssdMessageFactory {
  
  inline def apply(createMessage: String => UssdMessage): IUssdMessageFactory = {
    val __obj = js.Dynamic.literal(createMessage = js.Any.fromFunction1(createMessage))
    __obj.asInstanceOf[IUssdMessageFactory]
  }
  
  extension [Self <: IUssdMessageFactory](x: Self) {
    
    inline def setCreateMessage(value: String => UssdMessage): Self = StObject.set(x, "createMessage", js.Any.fromFunction1(value))
  }
}
