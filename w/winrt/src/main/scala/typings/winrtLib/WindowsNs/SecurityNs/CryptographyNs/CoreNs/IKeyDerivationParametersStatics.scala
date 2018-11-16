package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IKeyDerivationParametersStatics extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, iterationCount: scala.Double): KeyDerivationParameters
  def buildForSP800108(
    label: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    context: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): KeyDerivationParameters
  def buildForSP80056a(
    algorithmId: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    partyUInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    partyVInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    suppPubInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    suppPrivInfo: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): KeyDerivationParameters
}

