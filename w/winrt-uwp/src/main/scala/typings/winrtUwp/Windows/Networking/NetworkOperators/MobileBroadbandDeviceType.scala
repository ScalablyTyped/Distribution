package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandDeviceType extends StObject
/** Describes different types of Mobile Broadband devices. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends StObject {
  
  /** The device is embedded in the system. */
  @js.native
  sealed trait embedded extends MobileBroadbandDeviceType
  
  /** The device is remote. For example, a tethered cellular phone modem. */
  @js.native
  sealed trait remote extends MobileBroadbandDeviceType
  
  /** The device is removable. */
  @js.native
  sealed trait removable extends MobileBroadbandDeviceType
  
  /** The device type is unknown. */
  @js.native
  sealed trait unknown extends MobileBroadbandDeviceType
}
