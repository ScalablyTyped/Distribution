package typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.appLaunched
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.canceled
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.communicationFailed
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.completed
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.resourceLimitsExceeded
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.timeoutExceeded
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VoiceCommandCompletionReason with Double] = js.native
  /* 5 */ @js.native
  object appLaunched extends TopLevel[appLaunched with Double]
  
  /* 3 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 1 */ @js.native
  object communicationFailed extends TopLevel[communicationFailed with Double]
  
  /* 6 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object resourceLimitsExceeded extends TopLevel[resourceLimitsExceeded with Double]
  
  /* 4 */ @js.native
  object timeoutExceeded extends TopLevel[timeoutExceeded with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

