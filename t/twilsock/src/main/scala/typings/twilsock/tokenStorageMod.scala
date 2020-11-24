package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/tokenStorage", JSImport.Namespace)
@js.native
object tokenStorageMod extends js.Object {
  
  @js.native
  class TokenStorage () extends js.Object
  /* static members */
  @js.native
  object TokenStorage extends js.Object {
    
    /* private */ def canStore: js.Any = js.native
    
    def clear(): Unit = js.native
    
    var getKeyName: js.Any = js.native
    
    def getStoredToken(productId: String): js.Any = js.native
    
    def initialize(): Unit = js.native
    
    val initializedFlag: js.Any = js.native
    
    /* private */ def sessionStorage: js.Any = js.native
    
    def storeToken(continuationToken: String, productId: String): Unit = js.native
    
    val tokenStoragePrefix: js.Any = js.native
    
    /* private */ def window: js.Any = js.native
  }
}
