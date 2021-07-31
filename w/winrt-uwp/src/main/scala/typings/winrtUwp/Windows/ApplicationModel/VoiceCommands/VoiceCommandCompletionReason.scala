package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VoiceCommandCompletionReason extends StObject
/** Specifies the possible reasons the voice command completed. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason")
@js.native
object VoiceCommandCompletionReason extends StObject {
  
  /** The background app service requested that the app launch in the foreground with a call to RequestAppLaunchAsync . */
  @js.native
  sealed trait appLaunched
    extends StObject
       with VoiceCommandCompletionReason
  
  /** The user cancelled the interaction with Cortana. */
  @js.native
  sealed trait canceled
    extends StObject
       with VoiceCommandCompletionReason
  
  /** Communication with Cortana failed. */
  @js.native
  sealed trait communicationFailed
    extends StObject
       with VoiceCommandCompletionReason
  
  /** The background app service completed the interaction by calling ReportSuccessAsync or ReportFailureAsync . */
  @js.native
  sealed trait completed
    extends StObject
       with VoiceCommandCompletionReason
  
  /** The background app service exited because not enough resources were available. */
  @js.native
  sealed trait resourceLimitsExceeded
    extends StObject
       with VoiceCommandCompletionReason
  
  /** The background app service took too long to provide a response to Cortana. */
  @js.native
  sealed trait timeoutExceeded
    extends StObject
       with VoiceCommandCompletionReason
  
  /** Unknown error. */
  @js.native
  sealed trait unknown
    extends StObject
       with VoiceCommandCompletionReason
}
