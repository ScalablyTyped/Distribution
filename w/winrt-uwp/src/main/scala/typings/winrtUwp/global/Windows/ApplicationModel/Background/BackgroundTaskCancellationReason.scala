package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the reasons for cancelling a background task. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
@js.native
object BackgroundTaskCancellationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason & Double
  ] = js.native
  
  /* 0 */ val abort: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort & Double = js.native
  
  /* 6 */ val conditionLoss: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.conditionLoss & Double = js.native
  
  /* 11 */ val energySaver: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.energySaver & Double = js.native
  
  /* 9 */ val executionTimeExceeded: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.executionTimeExceeded & Double = js.native
  
  /* 4 */ val idleTask: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.idleTask & Double = js.native
  
  /* 2 */ val loggingOff: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff & Double = js.native
  
  /* 8 */ val quietHoursEntered: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.quietHoursEntered & Double = js.native
  
  /* 10 */ val resourceRevocation: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.resourceRevocation & Double = js.native
  
  /* 3 */ val servicingUpdate: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate & Double = js.native
  
  /* 7 */ val systemPolicy: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.systemPolicy & Double = js.native
  
  /* 1 */ val terminating: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating & Double = js.native
  
  /* 5 */ val uninstall: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.uninstall & Double = js.native
}
