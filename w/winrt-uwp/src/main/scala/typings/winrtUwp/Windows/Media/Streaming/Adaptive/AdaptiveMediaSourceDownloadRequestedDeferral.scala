package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
trait AdaptiveMediaSourceDownloadRequestedDeferral extends StObject {
  
  /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
  def complete(): Unit
}
object AdaptiveMediaSourceDownloadRequestedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): AdaptiveMediaSourceDownloadRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedDeferral]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadRequestedDeferralMutableBuilder[Self <: AdaptiveMediaSourceDownloadRequestedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
