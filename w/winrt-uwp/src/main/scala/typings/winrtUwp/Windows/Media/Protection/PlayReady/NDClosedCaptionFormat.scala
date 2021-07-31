package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDClosedCaptionFormat extends StObject
/** Indicates the type of format used for closed captions. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDClosedCaptionFormat")
@js.native
object NDClosedCaptionFormat extends StObject {
  
  /** ATSC digital television closed captions. */
  @js.native
  sealed trait atsc
    extends StObject
       with NDClosedCaptionFormat
  
  /** SCTE 20 MPEG2 closed captions. */
  @js.native
  sealed trait scte20
    extends StObject
       with NDClosedCaptionFormat
  
  /** Invalid format. */
  @js.native
  sealed trait unknown
    extends StObject
       with NDClosedCaptionFormat
}
