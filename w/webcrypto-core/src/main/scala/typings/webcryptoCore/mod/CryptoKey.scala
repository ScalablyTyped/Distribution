package typings.webcryptoCore.mod

import typings.std.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "CryptoKey")
@js.native
open class CryptoKey ()
  extends StObject
     with CryptoKey1 {
  
  /* CompleteClass */
  var algorithm: KeyAlgorithm = js.native
  
  /* CompleteClass */
  var extractable: Boolean = js.native
  
  /* CompleteClass */
  var `type`: KeyType = js.native
  
  /* CompleteClass */
  var usages: KeyUsages = js.native
}
object CryptoKey {
  
  @JSImport("webcrypto-core", "CryptoKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create[T /* <: CryptoKey1 */](algorithm: KeyAlgorithm, `type`: KeyType, extractable: Boolean, usages: KeyUsages): T = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(algorithm.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extractable.asInstanceOf[js.Any], usages.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* static member */
  inline def isKeyType(data: Any): /* is std.KeyType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyType")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.KeyType */ Boolean]
}
