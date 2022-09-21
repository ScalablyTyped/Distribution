package typings.webcryptoCore.mod

import typings.std.EcdhKeyDeriveParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "EcdhProvider")
@js.native
abstract class EcdhProvider () extends EllipticProvider {
  
  def checkAlgorithmParams(algorithm: EcdhKeyDeriveParams): Unit = js.native
  
  def onDeriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey1, length: Double, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
