package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task deferral returned by the IBackgroundTaskInstance.GetDeferral method. */
trait BackgroundTaskDeferral extends StObject {
  
  /** Informs the system that an asynchronous operation associated with a background task has finished. */
  def complete(): Unit
}
object BackgroundTaskDeferral {
  
  inline def apply(complete: () => Unit): BackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[BackgroundTaskDeferral]
  }
  
  extension [Self <: BackgroundTaskDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
