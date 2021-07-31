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
  
  @scala.inline
  def apply(): AppProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProperties]
  }
  
  @scala.inline
  implicit class AppPropertiesMutableBuilder[Self <: AppProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWebResourceId(value: String): Self = StObject.set(x, "webResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResourceIdUndefined: Self = StObject.set(x, "webResourceId", js.undefined)
    
    @scala.inline
    def setWebResourceName(value: String): Self = StObject.set(x, "webResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResourceNameUndefined: Self = StObject.set(x, "webResourceName", js.undefined)
    
    @scala.inline
    def setWelcomePageId(value: String): Self = StObject.set(x, "welcomePageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomePageIdUndefined: Self = StObject.set(x, "welcomePageId", js.undefined)
    
    @scala.inline
    def setWelcomePageName(value: String): Self = StObject.set(x, "welcomePageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomePageNameUndefined: Self = StObject.set(x, "welcomePageName", js.undefined)
  }
}
