package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the frame to retrieve information about.
  */
trait GetFrameDetailsType extends StObject {
  
  /**
    * The ID of the frame in the given tab.
    */
  var frameId: Double
  
  /**
    * The ID of the process runs the renderer for this tab.
    * Optional.
    */
  var processId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the tab in which the frame is.
    */
  var tabId: Double
}
object GetFrameDetailsType {
  
  inline def apply(frameId: Double, tabId: Double): GetFrameDetailsType = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameDetailsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFrameDetailsType] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}
