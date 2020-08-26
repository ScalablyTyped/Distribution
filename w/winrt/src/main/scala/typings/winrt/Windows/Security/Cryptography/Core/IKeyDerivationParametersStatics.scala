package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationParametersStatics extends js.Object {
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
  @scala.inline
  implicit class IKeyDerivationParametersStaticsOps[Self <: IKeyDerivationParametersStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuildForPbkdf2(value: (IBuffer, Double) => KeyDerivationParameters): Self = this.set("buildForPbkdf2", js.Any.fromFunction2(value))
    @scala.inline
    def setBuildForSP800108(value: (IBuffer, IBuffer) => KeyDerivationParameters): Self = this.set("buildForSP800108", js.Any.fromFunction2(value))
    @scala.inline
    def setBuildForSP80056a(value: (IBuffer, IBuffer, IBuffer, IBuffer, IBuffer) => KeyDerivationParameters): Self = this.set("buildForSP80056a", js.Any.fromFunction5(value))
  }
  
}

