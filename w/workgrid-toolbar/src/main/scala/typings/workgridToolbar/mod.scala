package typings.workgridToolbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workgrid-toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def showWorkgridToolbar(options: WorkgridToolbarOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkgridToolbar")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait WorkgridToolbarOptions extends StObject {
    
    var authorizerUrl: String
    
    var clientId: String
    
    // Required
    var companyCode: String
    
    // Optional
    var confirmUser: js.UndefOr[Boolean] = js.undefined
    
    var cssRules: js.UndefOr[js.Array[String]] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var deferDisplay: js.UndefOr[Boolean] = js.undefined
    
    var htmlDisplay: js.UndefOr[String | Null] = js.undefined
    
    var listener: js.UndefOr[js.Function1[/* event */ String, Unit | Null]] = js.undefined
    
    var msIdToken: js.UndefOr[String | Null] = js.undefined
    
    var preventPageHide: js.UndefOr[Boolean] = js.undefined
    
    var spaceId: String
    
    var tenantId: String
    
    var toolbarId: js.UndefOr[String | Null] = js.undefined
    
    var version: js.UndefOr[String | Null] = js.undefined
  }
  object WorkgridToolbarOptions {
    
    inline def apply(authorizerUrl: String, clientId: String, companyCode: String, spaceId: String, tenantId: String): WorkgridToolbarOptions = {
      val __obj = js.Dynamic.literal(authorizerUrl = authorizerUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], companyCode = companyCode.asInstanceOf[js.Any], spaceId = spaceId.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkgridToolbarOptions]
    }
    
    extension [Self <: WorkgridToolbarOptions](x: Self) {
      
      inline def setAuthorizerUrl(value: String): Self = StObject.set(x, "authorizerUrl", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCompanyCode(value: String): Self = StObject.set(x, "companyCode", value.asInstanceOf[js.Any])
      
      inline def setConfirmUser(value: Boolean): Self = StObject.set(x, "confirmUser", value.asInstanceOf[js.Any])
      
      inline def setConfirmUserUndefined: Self = StObject.set(x, "confirmUser", js.undefined)
      
      inline def setCssRules(value: js.Array[String]): Self = StObject.set(x, "cssRules", value.asInstanceOf[js.Any])
      
      inline def setCssRulesUndefined: Self = StObject.set(x, "cssRules", js.undefined)
      
      inline def setCssRulesVarargs(value: String*): Self = StObject.set(x, "cssRules", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDeferDisplay(value: Boolean): Self = StObject.set(x, "deferDisplay", value.asInstanceOf[js.Any])
      
      inline def setDeferDisplayUndefined: Self = StObject.set(x, "deferDisplay", js.undefined)
      
      inline def setHtmlDisplay(value: String): Self = StObject.set(x, "htmlDisplay", value.asInstanceOf[js.Any])
      
      inline def setHtmlDisplayNull: Self = StObject.set(x, "htmlDisplay", null)
      
      inline def setHtmlDisplayUndefined: Self = StObject.set(x, "htmlDisplay", js.undefined)
      
      inline def setListener(value: /* event */ String => Unit | Null): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setMsIdToken(value: String): Self = StObject.set(x, "msIdToken", value.asInstanceOf[js.Any])
      
      inline def setMsIdTokenNull: Self = StObject.set(x, "msIdToken", null)
      
      inline def setMsIdTokenUndefined: Self = StObject.set(x, "msIdToken", js.undefined)
      
      inline def setPreventPageHide(value: Boolean): Self = StObject.set(x, "preventPageHide", value.asInstanceOf[js.Any])
      
      inline def setPreventPageHideUndefined: Self = StObject.set(x, "preventPageHide", js.undefined)
      
      inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setToolbarId(value: String): Self = StObject.set(x, "toolbarId", value.asInstanceOf[js.Any])
      
      inline def setToolbarIdNull: Self = StObject.set(x, "toolbarId", null)
      
      inline def setToolbarIdUndefined: Self = StObject.set(x, "toolbarId", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
