package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConnectInfoType extends StObject {
  
  /**
    * Open a port to a specific $(topic:frame_ids)[frame] identified by <code>frameId</code> instead of all frames in the tab.
    * Optional.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will be passed into onConnect for content scripts that are listening for the connection event.
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
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
