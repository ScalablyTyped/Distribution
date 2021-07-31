package typings.twilsock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    @scala.inline
    def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.getKeyName")
    @js.native
    def getKeyName: js.Any = js.native
    @scala.inline
    def getKeyName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKeyName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @scala.inline
    def getStoredToken(productId: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoredToken")(productId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    @scala.inline
    def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.initializedFlag")
    @js.native
    val initializedFlag: js.Any = js.native
    
    /* static member */
    @scala.inline
    def storeToken(continuationToken: String, productId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storeToken")(continuationToken.asInstanceOf[js.Any], productId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("twilsock/lib/tokenStorage", "TokenStorage.tokenStoragePrefix")
    @js.native
    val tokenStoragePrefix: js.Any = js.native
  }
}
