package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
@JSGlobal("Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData")
@js.native
abstract class EncryptedAndAuthenticatedData () extends js.Object {
  /** Gets the authentication tag. */
  var authenticationTag: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the encrypted data. */
  var encryptedData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

