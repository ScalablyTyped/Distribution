package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred asynchronous change request. */
@js.native
trait ChatMessageChangedDeferral extends StObject {
  
  /** Fires to indicate that the deferred change request has completed. */
  def complete(): Unit = js.native
}
object ChatMessageChangedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): ChatMessageChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ChatMessageChangedDeferral]
  }
  
  @scala.inline
  implicit class ChatMessageChangedDeferralMutableBuilder[Self <: ChatMessageChangedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
