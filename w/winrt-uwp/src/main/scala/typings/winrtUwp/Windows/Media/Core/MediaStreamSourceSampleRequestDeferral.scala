package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed retrieving the MediaStreamSample . */
trait MediaStreamSourceSampleRequestDeferral extends StObject {
  
  /** Reports that the application has completed retrieving the MediaStreamSample . */
  def complete(): Unit
}
object MediaStreamSourceSampleRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceSampleRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceSampleRequestDeferral]
  }
  
  @scala.inline
  implicit class MediaStreamSourceSampleRequestDeferralMutableBuilder[Self <: MediaStreamSourceSampleRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
