package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed the MediaStreamSource.SwitchStreamsRequested event. */
@js.native
trait MediaStreamSourceSwitchStreamsRequestDeferral extends StObject {
  
  /** Reports that the application has completed processing the MediaStreamSource.SwitchStreamsRequested event. */
  def complete(): Unit = js.native
}
object MediaStreamSourceSwitchStreamsRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceSwitchStreamsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestDeferral]
  }
  
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestDeferralMutableBuilder[Self <: MediaStreamSourceSwitchStreamsRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
