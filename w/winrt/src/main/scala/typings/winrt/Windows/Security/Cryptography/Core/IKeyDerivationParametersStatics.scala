package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyDerivationParametersStatics extends StObject {
  
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
  implicit class IKeyDerivationParametersStaticsMutableBuilder[Self <: IKeyDerivationParametersStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildForPbkdf2(value: (IBuffer, Double) => KeyDerivationParameters): Self = StObject.set(x, "buildForPbkdf2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildForSP800108(value: (IBuffer, IBuffer) => KeyDerivationParameters): Self = StObject.set(x, "buildForSP800108", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildForSP80056a(value: (IBuffer, IBuffer, IBuffer, IBuffer, IBuffer) => KeyDerivationParameters): Self = StObject.set(x, "buildForSP80056a", js.Any.fromFunction5(value))
  }
}
