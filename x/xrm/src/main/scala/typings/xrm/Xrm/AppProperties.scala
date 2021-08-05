package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * properties of the current business app in Customer Engagement.
  */
trait AppProperties extends StObject {
  
  var appId: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var uniqueName: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var webResourceId: js.UndefOr[String] = js.undefined
  
  var webResourceName: js.UndefOr[String] = js.undefined
  
  var welcomePageId: js.UndefOr[String] = js.undefined
  
  var welcomePageName: js.UndefOr[String] = js.undefined
}
object AppProperties {
  
  inline def apply(): AppProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProperties]
  }
  
  extension [Self <: AppProperties](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWebResourceId(value: String): Self = StObject.set(x, "webResourceId", value.asInstanceOf[js.Any])
    
    inline def setWebResourceIdUndefined: Self = StObject.set(x, "webResourceId", js.undefined)
    
    inline def setWebResourceName(value: String): Self = StObject.set(x, "webResourceName", value.asInstanceOf[js.Any])
    
    inline def setWebResourceNameUndefined: Self = StObject.set(x, "webResourceName", js.undefined)
    
    inline def setWelcomePageId(value: String): Self = StObject.set(x, "welcomePageId", value.asInstanceOf[js.Any])
    
    inline def setWelcomePageIdUndefined: Self = StObject.set(x, "welcomePageId", js.undefined)
    
    inline def setWelcomePageName(value: String): Self = StObject.set(x, "welcomePageName", value.asInstanceOf[js.Any])
    
    inline def setWelcomePageNameUndefined: Self = StObject.set(x, "welcomePageName", js.undefined)
  }
}
