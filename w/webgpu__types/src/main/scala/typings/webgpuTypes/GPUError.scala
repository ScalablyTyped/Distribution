package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUError extends StObject {
  
  /**
    * A human-readable message providing information about the error that occurred.
    * Note: This message is generally intended for application developers to debug their
    * applications and capture information for debug reports, not to be surfaced to end-users.
    * Note: User agents should not include potentially machine-parsable details in this message,
    * such as free system memory on {@link GPUErrorFilter#"out-of-memory"} or other details about the
    * conditions under which memory was exhausted.
    */
  val message: String
}
object GPUError {
  
  inline def apply(message: String): GPUError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
