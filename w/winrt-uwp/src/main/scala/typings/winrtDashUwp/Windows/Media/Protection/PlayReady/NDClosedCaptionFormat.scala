package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

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
  sealed trait atsc extends NDClosedCaptionFormat
  
  /** SCTE 20 MPEG2 closed captions. */
  @js.native
  sealed trait scte20 extends NDClosedCaptionFormat
  
  /** Invalid format. */
  @js.native
  sealed trait unknown extends NDClosedCaptionFormat
  
  /* 0 */ val atsc: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDClosedCaptionFormat.atsc with Double = js.native
  /* 1 */ val scte20: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDClosedCaptionFormat.scte20 with Double = js.native
  /* 2 */ val unknown: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDClosedCaptionFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDClosedCaptionFormat with Double] = js.native
}

