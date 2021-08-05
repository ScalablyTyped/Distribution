package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymmetricKeyAlgorithmProvider
  extends StObject
     with ISymmetricKeyAlgorithmProvider
object SymmetricKeyAlgorithmProvider {
  
  inline def apply(algorithmName: String, blockLength: Double, createSymmetricKey: IBuffer => CryptographicKey): SymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any], createSymmetricKey = js.Any.fromFunction1(createSymmetricKey))
    __obj.asInstanceOf[SymmetricKeyAlgorithmProvider]
  }
}
