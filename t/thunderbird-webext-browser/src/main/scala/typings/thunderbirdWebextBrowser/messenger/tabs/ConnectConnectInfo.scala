package typings.thunderbirdWebextBrowser.messenger.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConnectInfo extends StObject {
  
  /**
    * Open a port to a specific frame identified by `frameId` instead of all
    * frames in the tab.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will be passed into onConnect for content scripts that are listening
    * for the connection event.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ConnectConnectInfo {
  
  inline def apply(): ConnectConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConnectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectConnectInfo] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
