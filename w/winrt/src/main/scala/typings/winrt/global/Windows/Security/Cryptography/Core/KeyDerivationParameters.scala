package typings.winrt.global.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
class KeyDerivationParameters ()
  extends typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters {
  /* CompleteClass */
  override var iterationCount: Double = js.native
  /* CompleteClass */
  override var kdfGenericBinary: IBuffer = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
object KeyDerivationParameters extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  def buildForSP800108(label: IBuffer, context: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
}

