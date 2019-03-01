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

object IKeyDerivationParametersStatics {
  @scala.inline
  def apply(
    buildForPbkdf2: js.Function2[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      scala.Double, 
      KeyDerivationParameters
    ],
    buildForSP800108: js.Function2[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      KeyDerivationParameters
    ],
    buildForSP80056a: js.Function5[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      KeyDerivationParameters
    ]
  ): IKeyDerivationParametersStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildForPbkdf2")(buildForPbkdf2)
    __obj.updateDynamic("buildForSP800108")(buildForSP800108)
    __obj.updateDynamic("buildForSP80056a")(buildForSP80056a)
    __obj.asInstanceOf[IKeyDerivationParametersStatics]
  }
}

