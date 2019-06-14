package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait appReportedError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /** No error has occurred. */
  @js.native
  sealed trait done
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /** The MediaStreamSource object does not have an event handler for the SampleRequested event. */
  @js.native
  sealed trait missingSampleRequestedEventHandler
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /** A failure occurred while initializing the protection system */
  @js.native
  sealed trait protectionSystemFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /** An unspecified error has occurred. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /** One or more media streams use an encoding format which cannot be handled by the media pipeline. */
  @js.native
  sealed trait unsupportedEncodingFormat
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /** Components needed to implement the protection system are missing. */
  @js.native
  sealed trait unsupportedProtectionSystem
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason
  
  /* 2 */ val appReportedError: appReportedError with scala.Double = js.native
  /* 0 */ val done: done with scala.Double = js.native
  /* 6 */ val missingSampleRequestedEventHandler: missingSampleRequestedEventHandler with scala.Double = js.native
  /* 4 */ val protectionSystemFailure: protectionSystemFailure with scala.Double = js.native
  /* 1 */ val unknownError: unknownError with scala.Double = js.native
  /* 5 */ val unsupportedEncodingFormat: unsupportedEncodingFormat with scala.Double = js.native
  /* 3 */ val unsupportedProtectionSystem: unsupportedProtectionSystem with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceClosedReason with scala.Double
  ] = js.native
}

