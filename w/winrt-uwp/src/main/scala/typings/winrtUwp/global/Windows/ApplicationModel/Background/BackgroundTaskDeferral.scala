package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task deferral returned by the IBackgroundTaskInstance.GetDeferral method. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskDeferral")
@js.native
open class BackgroundTaskDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskDeferral {
  
  /** Informs the system that an asynchronous operation associated with a background task has finished. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
