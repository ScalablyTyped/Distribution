package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
class KeyDerivationParameters () extends IKeyDerivationParameters {
  /* CompleteClass */
  override var iterationCount: Double = js.native
  /* CompleteClass */
  override var kdfGenericBinary: IBuffer = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
object KeyDerivationParameters extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): KeyDerivationParameters = js.native
  def buildForSP800108(label: IBuffer, context: IBuffer): KeyDerivationParameters = js.native
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): KeyDerivationParameters = js.native
}

