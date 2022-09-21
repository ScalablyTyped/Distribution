package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageOptionsType extends StObject {
  
  /**
    * Send a message to a specific $(topic:frame_ids)[frame] identified by <code>frameId</code>
    * instead of all frames in the tab.
    * Optional.
    */
  var frameId: js.UndefOr[Double] = js.undefined
}
object SendMessageOptionsType {
  
  inline def apply(): SendMessageOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptionsType]
  }
  
  extension [Self <: SendMessageOptionsType](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
