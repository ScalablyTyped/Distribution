package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use to complete an update asynchronously. */
@js.native
trait FileUpdateRequestDeferral extends StObject {
  
  /** Signals that the response to a FileUpdateRequested event is finished. */
  def complete(): Unit = js.native
}
object FileUpdateRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): FileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[FileUpdateRequestDeferral]
  }
  
  @scala.inline
  implicit class FileUpdateRequestDeferralMutableBuilder[Self <: FileUpdateRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
