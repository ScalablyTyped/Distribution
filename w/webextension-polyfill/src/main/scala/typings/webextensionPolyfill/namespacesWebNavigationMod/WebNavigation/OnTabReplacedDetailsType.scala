package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnTabReplacedDetailsType extends StObject {
  
  /**
    * The ID of the tab that was replaced.
    */
  var replacedTabId: Double
  
  /**
    * The ID of the tab that replaced the old tab.
    */
  var tabId: Double
  
  /**
    * The time when the replacement happened, in milliseconds since the epoch.
    */
  var timeStamp: Double
}
object OnTabReplacedDetailsType {
  
  inline def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): OnTabReplacedDetailsType = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnTabReplacedDetailsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnTabReplacedDetailsType] (val x: Self) extends AnyVal {
    
    inline def setReplacedTabId(value: Double): Self = StObject.set(x, "replacedTabId", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
