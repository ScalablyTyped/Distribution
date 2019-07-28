package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaStreamSourceClosedReason extends js.Object

/** Specifies the reason why a MediaStreamSource was closed. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceClosedReason")
@js.native
object MediaStreamSourceClosedReason extends js.Object {
  /** The app reported an error by calling the NotifyError method on the MediaStreamSource . */
  @js.native
  sealed trait appReportedError extends MediaStreamSourceClosedReason
  
  /** No error has occurred. */
  @js.native
  sealed trait done extends MediaStreamSourceClosedReason
  
  /** The MediaStreamSource object does not have an event handler for the SampleRequested event. */
  @js.native
  sealed trait missingSampleRequestedEventHandler extends MediaStreamSourceClosedReason
  
  /** A failure occurred while initializing the protection system */
  @js.native
  sealed trait protectionSystemFailure extends MediaStreamSourceClosedReason
  
  /** An unspecified error has occurred. */
  @js.native
  sealed trait unknownError extends MediaStreamSourceClosedReason
  
  /** One or more media streams use an encoding format which cannot be handled by the media pipeline. */
  @js.native
  sealed trait unsupportedEncodingFormat extends MediaStreamSourceClosedReason
  
  /** Components needed to implement the protection system are missing. */
  @js.native
  sealed trait unsupportedProtectionSystem extends MediaStreamSourceClosedReason
  
  /* 2 */ val appReportedError: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.appReportedError with Double = js.native
  /* 0 */ val done: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.done with Double = js.native
  /* 6 */ val missingSampleRequestedEventHandler: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.missingSampleRequestedEventHandler with Double = js.native
  /* 4 */ val protectionSystemFailure: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.protectionSystemFailure with Double = js.native
  /* 1 */ val unknownError: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.unknownError with Double = js.native
  /* 5 */ val unsupportedEncodingFormat: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.unsupportedEncodingFormat with Double = js.native
  /* 3 */ val unsupportedProtectionSystem: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason.unsupportedProtectionSystem with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamSourceClosedReason with Double] = js.native
}

