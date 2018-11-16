package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
class KeyDerivationParameters () extends IKeyDerivationParameters {
  /* CompleteClass */
  override var iterationCount: scala.Double = js.native
  /* CompleteClass */
  override var kdfGenericBinary: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
object KeyDerivationParameters extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, iterationCount: scala.Double): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationParameters = js.native
  def buildForSP800108(
    label: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    context: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationParameters = js.native
  def buildForSP80056a(
    algorithmId: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    partyUInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    partyVInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    suppPubInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    suppPrivInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationParameters = js.native
}

