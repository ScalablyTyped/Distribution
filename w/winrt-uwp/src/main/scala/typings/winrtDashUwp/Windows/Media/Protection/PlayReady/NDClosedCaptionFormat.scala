package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDClosedCaptionFormat with Double] = js.native
  /* 0 */ @js.native
  object atsc extends TopLevel[atsc with Double]
  
  /* 1 */ @js.native
  object scte20 extends TopLevel[scte20 with Double]
  
  /* 2 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

