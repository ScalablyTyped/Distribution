package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamSourceClosedReason with Double] = js.native
  /* 2 */ @js.native
  object appReportedError extends TopLevel[appReportedError with Double]
  
  /* 0 */ @js.native
  object done extends TopLevel[done with Double]
  
  /* 6 */ @js.native
  object missingSampleRequestedEventHandler extends TopLevel[missingSampleRequestedEventHandler with Double]
  
  /* 4 */ @js.native
  object protectionSystemFailure extends TopLevel[protectionSystemFailure with Double]
  
  /* 1 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
  /* 5 */ @js.native
  object unsupportedEncodingFormat extends TopLevel[unsupportedEncodingFormat with Double]
  
  /* 3 */ @js.native
  object unsupportedProtectionSystem extends TopLevel[unsupportedProtectionSystem with Double]
  
}

