package typings.twilsock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenStorageMod {
  
  @JSImport("twilsock/lib/tokenStorage", "TokenStorage")
  @js.native
  class TokenStorage () extends StObject
  object TokenStorage {
    
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.clear")
    @js.native
    def clear(): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.getKeyName")
    @js.native
    def getKeyName: js.Any = js.native
    @scala.inline
    def getKeyName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKeyName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.getStoredToken")
    @js.native
    def getStoredToken(productId: String): js.Any = js.native
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.initialize")
    @js.native
    def initialize(): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.initializedFlag")
    @js.native
    val initializedFlag: js.Any = js.native
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.storeToken")
    @js.native
    def storeToken(continuationToken: String, productId: String): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.tokenStoragePrefix")
    @js.native
    val tokenStoragePrefix: js.Any = js.native
  }
}
