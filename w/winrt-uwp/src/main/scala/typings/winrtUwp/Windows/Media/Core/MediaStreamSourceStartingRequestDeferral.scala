package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
trait MediaStreamSourceStartingRequestDeferral extends StObject {
  
  /** Reports that the application has completed processing the Starting event. */
  def complete(): Unit
}
object MediaStreamSourceStartingRequestDeferral {
  
  inline def apply(complete: () => Unit): MediaStreamSourceStartingRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceStartingRequestDeferral]
  }
  
  extension [Self <: MediaStreamSourceStartingRequestDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
