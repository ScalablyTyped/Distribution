package typings.webcryptoCore.mod

import typings.std.HkdfParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "HkdfProvider")
@js.native
abstract class HkdfProvider () extends ProviderCrypto {
  
  def checkAlgorithmParams(algorithm: HkdfParams): Unit = js.native
  
  var hashAlgorithms: js.Array[String] = js.native
  
  def onDeriveBits(algorithm: HkdfParams, baseKey: CryptoKey1, length: Double, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_HkdfProvider: KeyUsages = js.native
}
