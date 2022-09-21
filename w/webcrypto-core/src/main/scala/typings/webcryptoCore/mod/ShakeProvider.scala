package typings.webcryptoCore.mod

import typings.webcryptoCore.anon.RequiredShakeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "ShakeProvider")
@js.native
abstract class ShakeProvider () extends ProviderCrypto {
  
  def checkDigest(algorithm: ShakeParams, data: js.typedarray.ArrayBuffer): Unit = js.native
  
  var defaultLength: Double = js.native
  
  def onDigest(algorithm: RequiredShakeParams, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_ShakeProvider: js.Array[scala.Nothing] = js.native
}
