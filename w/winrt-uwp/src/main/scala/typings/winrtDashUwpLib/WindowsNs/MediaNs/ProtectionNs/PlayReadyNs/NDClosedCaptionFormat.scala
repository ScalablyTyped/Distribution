package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDClosedCaptionFormat extends js.Object

/** Indicates the type of format used for closed captions. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDClosedCaptionFormat")
@js.native
object NDClosedCaptionFormat extends js.Object {
  /** ATSC digital television closed captions. */
  @js.native
  sealed trait atsc
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDClosedCaptionFormat
  
  /** SCTE 20 MPEG2 closed captions. */
  @js.native
  sealed trait scte20
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDClosedCaptionFormat
  
  /** Invalid format. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDClosedCaptionFormat
  
  val atsc: atsc with java.lang.String = js.native
  val scte20: scte20 with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDClosedCaptionFormat with java.lang.String
  ] = js.native
}

