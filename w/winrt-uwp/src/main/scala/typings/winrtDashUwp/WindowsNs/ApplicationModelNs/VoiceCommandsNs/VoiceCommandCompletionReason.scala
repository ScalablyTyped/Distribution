package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VoiceCommandCompletionReason extends js.Object

/** Specifies the possible reasons the voice command completed. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason")
@js.native
object VoiceCommandCompletionReason extends js.Object {
  /** The background app service requested that the app launch in the foreground with a call to RequestAppLaunchAsync . */
  @js.native
  sealed trait appLaunched extends VoiceCommandCompletionReason
  
  /** The user cancelled the interaction with Cortana. */
  @js.native
  sealed trait canceled extends VoiceCommandCompletionReason
  
  /** Communication with Cortana failed. */
  @js.native
  sealed trait communicationFailed extends VoiceCommandCompletionReason
  
  /** The background app service completed the interaction by calling ReportSuccessAsync or ReportFailureAsync . */
  @js.native
  sealed trait completed extends VoiceCommandCompletionReason
  
  /** The background app service exited because not enough resources were available. */
  @js.native
  sealed trait resourceLimitsExceeded extends VoiceCommandCompletionReason
  
  /** The background app service took too long to provide a response to Cortana. */
  @js.native
  sealed trait timeoutExceeded extends VoiceCommandCompletionReason
  
  /** Unknown error. */
  @js.native
  sealed trait unknown extends VoiceCommandCompletionReason
  
  /* 5 */ val appLaunched: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.appLaunched with Double = js.native
  /* 3 */ val canceled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.canceled with Double = js.native
  /* 1 */ val communicationFailed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.communicationFailed with Double = js.native
  /* 6 */ val completed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.completed with Double = js.native
  /* 2 */ val resourceLimitsExceeded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.resourceLimitsExceeded with Double = js.native
  /* 4 */ val timeoutExceeded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.timeoutExceeded with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VoiceCommandCompletionReason with Double] = js.native
}

