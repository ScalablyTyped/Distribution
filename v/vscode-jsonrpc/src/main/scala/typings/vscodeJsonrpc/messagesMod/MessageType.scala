package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageType extends StObject {
  
  val method: String
  
  val numberOfParams: Double
}
object MessageType {
  
  @scala.inline
  def apply(method: String, numberOfParams: Double): MessageType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], numberOfParams = numberOfParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  
  @scala.inline
  implicit class MessageTypeMutableBuilder[Self <: MessageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfParams(value: Double): Self = StObject.set(x, "numberOfParams", value.asInstanceOf[js.Any])
  }
}
