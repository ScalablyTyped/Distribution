package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData")
@js.native
class EncryptedAndAuthenticatedData () extends IEncryptedAndAuthenticatedData {
  /* CompleteClass */
  override var authenticationTag: IBuffer = js.native
  /* CompleteClass */
  override var encryptedData: IBuffer = js.native
}

