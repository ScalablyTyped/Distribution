package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/tokenStorage", JSImport.Namespace)
@js.native
object libTokenStorageMod extends js.Object {
  @js.native
  class TokenStorage () extends js.Object
  
  /* static members */
  @js.native
  object TokenStorage extends js.Object {
    val canStore: js.Any = js.native
    var getKeyName: js.Any = js.native
    val initializedFlag: js.Any = js.native
    val sessionStorage: js.Any = js.native
    val tokenStoragePrefix: js.Any = js.native
    val window: js.Any = js.native
    def clear(): Unit = js.native
    def getStoredToken(productId: String): js.Any = js.native
    def initialize(): Unit = js.native
    def storeToken(continuationToken: String, productId: String): Unit = js.native
  }
  
}

