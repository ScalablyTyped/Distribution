package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsHubspotMod {
  
  @JSImport("@typeform/embed/types/utils/hubspot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHubspotCookieValue(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubspotCookieValue")().asInstanceOf[js.UndefOr[String]]
  
  inline def getHubspotHiddenFields(): HubspotFieldsType = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubspotHiddenFields")().asInstanceOf[HubspotFieldsType]
  
  trait HubspotFieldsType extends StObject {
    
    var hubspot_page_name: String
    
    var hubspot_page_url: String
    
    var hubspot_utk: js.UndefOr[String] = js.undefined
  }
  object HubspotFieldsType {
    
    inline def apply(hubspot_page_name: String, hubspot_page_url: String): HubspotFieldsType = {
      val __obj = js.Dynamic.literal(hubspot_page_name = hubspot_page_name.asInstanceOf[js.Any], hubspot_page_url = hubspot_page_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HubspotFieldsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HubspotFieldsType] (val x: Self) extends AnyVal {
      
      inline def setHubspot_page_name(value: String): Self = StObject.set(x, "hubspot_page_name", value.asInstanceOf[js.Any])
      
      inline def setHubspot_page_url(value: String): Self = StObject.set(x, "hubspot_page_url", value.asInstanceOf[js.Any])
      
      inline def setHubspot_utk(value: String): Self = StObject.set(x, "hubspot_utk", value.asInstanceOf[js.Any])
      
      inline def setHubspot_utkUndefined: Self = StObject.set(x, "hubspot_utk", js.undefined)
    }
  }
}
