package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializationFailedResponse extends TypingInstallerResponse {
  
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed = js.native
  
  val message: String = js.native
  
  val stack: js.UndefOr[String] = js.native
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
