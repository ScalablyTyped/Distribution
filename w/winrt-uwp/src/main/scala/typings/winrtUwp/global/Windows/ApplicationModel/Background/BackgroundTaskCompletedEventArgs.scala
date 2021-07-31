package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents completion information for a task at the time a completion notification is sent. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs")
@js.native
abstract class BackgroundTaskCompletedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs {
  
  /** Throws an exception if the background task completed event has reported an error. */
  /* CompleteClass */
  override def checkResult(): Unit = js.native
  
  /** Gets the identifier of the background task instance for this completion status notification. */
  /* CompleteClass */
  var instanceId: String = js.native
}
