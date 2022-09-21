package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcDsaSignature extends StObject {
  
  var r: js.typedarray.ArrayBuffer = js.native
  
  var s: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Converts ECDSA signature into X9.62 signature format
    * @param pointSize EC point size in bits
    * @returns ECDSA signature in X9.62 signature format
    */
  def toWebCryptoSignature(): js.typedarray.ArrayBuffer = js.native
  def toWebCryptoSignature(pointSize: Double): js.typedarray.ArrayBuffer = js.native
}
