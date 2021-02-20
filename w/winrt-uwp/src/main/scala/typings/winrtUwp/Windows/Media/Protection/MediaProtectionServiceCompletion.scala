package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a method that indicates whether a protection service has completed successfully. */
@js.native
trait MediaProtectionServiceCompletion extends StObject {
  
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  def complete(success: Boolean): Unit = js.native
}
object MediaProtectionServiceCompletion {
  
  @scala.inline
  def apply(complete: Boolean => Unit): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
  
  @scala.inline
  implicit class MediaProtectionServiceCompletionMutableBuilder[Self <: MediaProtectionServiceCompletion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: Boolean => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
