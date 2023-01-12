package typings.webextensionPolyfill.namespacesRuntimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConnectInfoType extends StObject {
  
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the connection
    * event.
    * Optional.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will be passed into onConnect for processes that are listening for the connection event.
    * Optional.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ConnectConnectInfoType {
  
  inline def apply(): ConnectConnectInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConnectInfoType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectConnectInfoType] (val x: Self) extends AnyVal {
    
    inline def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    inline def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
