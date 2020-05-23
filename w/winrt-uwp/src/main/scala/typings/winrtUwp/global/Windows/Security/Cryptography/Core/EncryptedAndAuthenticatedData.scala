package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
@JSGlobal("Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData")
@js.native
abstract class EncryptedAndAuthenticatedData ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData {
  /** Gets the authentication tag. */
  /* CompleteClass */
  override var authenticationTag: IBuffer = js.native
  /** Gets the encrypted data. */
  /* CompleteClass */
  override var encryptedData: IBuffer = js.native
}

