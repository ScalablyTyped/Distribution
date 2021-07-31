package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationFailedResponse
  extends StObject
     with TypingInstallerResponse {
  
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed
  
  val message: String
  
  val stack: js.UndefOr[String] = js.undefined
}
object InitializationFailedResponse {
  
  @scala.inline
  def apply(kind: EventInitializationFailed, message: String): InitializationFailedResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationFailedResponse]
  }
  
  @scala.inline
  implicit class InitializationFailedResponseMutableBuilder[Self <: InitializationFailedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: EventInitializationFailed): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
