package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a method that indicates whether a protection service has completed successfully. */
trait MediaProtectionServiceCompletion extends StObject {
  
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  def complete(success: Boolean): Unit
}
object MediaProtectionServiceCompletion {
  
  inline def apply(complete: Boolean => Unit): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
  
  extension [Self <: MediaProtectionServiceCompletion](x: Self) {
    
    inline def setComplete(value: Boolean => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
