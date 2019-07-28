package typings.winrtDashUwp.WindowsNs.SystemNs.ProfileNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to obtain a hardware identifier that represents the current hardware. */
@JSGlobal("Windows.System.Profile.HardwareIdentification")
@js.native
abstract class HardwareIdentification () extends js.Object

/* static members */
@JSGlobal("Windows.System.Profile.HardwareIdentification")
@js.native
object HardwareIdentification extends js.Object {
  /**
    * Gets a hardware identifier ( ASHWID) that represents the current hardware. The returned ASHWID will be different for each application package. In other words, this API will return different identifiers when called by two apps from different packages. It will return the same identifier when called by two apps that are part of the same package.
    * @param nonce The cryptographic nonce is optional. The nonce is recommended when ASHWID needs to be verified on the cloud against replay attacks. In the scenarios where nonce is desired, the remote server should generate a random nonce and pass it to the client app, and then verify that the signature has the expected nonce once the ASHWID is received from the client system.
    * @return The hardware Id information.
    */
  def getPackageSpecificToken(nonce: IBuffer): HardwareToken = js.native
}

