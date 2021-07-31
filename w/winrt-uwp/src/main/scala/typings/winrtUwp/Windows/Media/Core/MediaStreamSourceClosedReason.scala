package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaStreamSourceClosedReason extends StObject
/** Specifies the reason why a MediaStreamSource was closed. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceClosedReason")
@js.native
object MediaStreamSourceClosedReason extends StObject {
  
  /** The app reported an error by calling the NotifyError method on the MediaStreamSource . */
  @js.native
  sealed trait appReportedError
    extends StObject
       with MediaStreamSourceClosedReason
  
  /** No error has occurred. */
  @js.native
  sealed trait done
    extends StObject
       with MediaStreamSourceClosedReason
  
  /** The MediaStreamSource object does not have an event handler for the SampleRequested event. */
  @js.native
  sealed trait missingSampleRequestedEventHandler
    extends StObject
       with MediaStreamSourceClosedReason
  
  /** A failure occurred while initializing the protection system */
  @js.native
  sealed trait protectionSystemFailure
    extends StObject
       with MediaStreamSourceClosedReason
  
  /** An unspecified error has occurred. */
  @js.native
  sealed trait unknownError
    extends StObject
       with MediaStreamSourceClosedReason
  
  /** One or more media streams use an encoding format which cannot be handled by the media pipeline. */
  @js.native
  sealed trait unsupportedEncodingFormat
    extends StObject
       with MediaStreamSourceClosedReason
  
  /** Components needed to implement the protection system are missing. */
  @js.native
  sealed trait unsupportedProtectionSystem
    extends StObject
       with MediaStreamSourceClosedReason
}
