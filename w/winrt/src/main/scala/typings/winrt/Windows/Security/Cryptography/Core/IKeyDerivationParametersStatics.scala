package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationParametersStatics extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): KeyDerivationParameters
  def buildForSP800108(label: IBuffer, context: IBuffer): KeyDerivationParameters
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): KeyDerivationParameters
}

object IKeyDerivationParametersStatics {
  @scala.inline
  def apply(
    buildForPbkdf2: (IBuffer, Double) => KeyDerivationParameters,
    buildForSP800108: (IBuffer, IBuffer) => KeyDerivationParameters,
    buildForSP80056a: (IBuffer, IBuffer, IBuffer, IBuffer, IBuffer) => KeyDerivationParameters
  ): IKeyDerivationParametersStatics = {
    val __obj = js.Dynamic.literal(buildForPbkdf2 = js.Any.fromFunction2(buildForPbkdf2), buildForSP800108 = js.Any.fromFunction2(buildForSP800108), buildForSP80056a = js.Any.fromFunction5(buildForSP80056a))
  
    __obj.asInstanceOf[IKeyDerivationParametersStatics]
  }
}

