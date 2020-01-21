package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandPinFormat extends js.Object

/** Describes the possible formats for a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinFormat")
@js.native
object MobileBroadbandPinFormat extends js.Object {
  /** The PIN is alphanumeric. */
  @js.native
  sealed trait alphanumeric extends MobileBroadbandPinFormat
  
  /** The PIN is numeric. */
  @js.native
  sealed trait numeric extends MobileBroadbandPinFormat
  
  /** No PIN format has been defined. This is normally not used. */
  @js.native
  sealed trait unknown extends MobileBroadbandPinFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandPinFormat with Double] = js.native
  /* 2 */ @js.native
  object alphanumeric extends TopLevel[alphanumeric with Double]
  
  /* 1 */ @js.native
  object numeric extends TopLevel[numeric with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

