package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

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
  sealed trait appLaunched
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  /** The user cancelled the interaction with Cortana. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  /** Communication with Cortana failed. */
  @js.native
  sealed trait communicationFailed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  /** The background app service completed the interaction by calling ReportSuccessAsync or ReportFailureAsync . */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  /** The background app service exited because not enough resources were available. */
  @js.native
  sealed trait resourceLimitsExceeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  /** The background app service took too long to provide a response to Cortana. */
  @js.native
  sealed trait timeoutExceeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  /** Unknown error. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason
  
  val appLaunched: appLaunched with java.lang.String = js.native
  val canceled: canceled with java.lang.String = js.native
  val communicationFailed: communicationFailed with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val resourceLimitsExceeded: resourceLimitsExceeded with java.lang.String = js.native
  val timeoutExceeded: timeoutExceeded with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandCompletionReason with java.lang.String
  ] = js.native
}

