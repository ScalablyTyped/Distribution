package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandPinFormat extends StObject
/** Describes the possible formats for a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinFormat")
@js.native
object MobileBroadbandPinFormat extends StObject {
  
  /** The PIN is alphanumeric. */
  @js.native
  sealed trait alphanumeric
    extends StObject
       with MobileBroadbandPinFormat
  
  /** The PIN is numeric. */
  @js.native
  sealed trait numeric
    extends StObject
       with MobileBroadbandPinFormat
  
  /** No PIN format has been defined. This is normally not used. */
  @js.native
  sealed trait unknown
    extends StObject
       with MobileBroadbandPinFormat
}
