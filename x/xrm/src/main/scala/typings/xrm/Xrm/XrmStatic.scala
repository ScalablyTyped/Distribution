package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Static xRM object.
  */
@js.native
trait XrmStatic extends StObject {
  
  /**
    * Provides methods to use native device capabilities of mobile devices.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
    */
  var Device: typings.xrm.Xrm.Device = js.native
  
  /**
    * Provides methods to encode strings.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
    */
  var Encoding: typings.xrm.Xrm.Encoding = js.native
  
  /**
    * Provides methods to create and manage records in the mobile clients (for phones tablets).
    * @deprecated Use {@link Xrm.WebApi} instead.
    */
  var Mobile: typings.xrm.Xrm.Mobile = js.native
  
  /** Provides navigation-related methods.
    */
  var Navigation: typings.xrm.Xrm.Navigation = js.native
  
  /**
    * Provides a namespace container for the context, data and ui objects.
    * @deprecated Deprecated in v9.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var Page: typings.xrm.Xrm.Page = js.native
  
  /**
    * Provides a method to display a web page in the side pane of the Customer Engagement form.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
    */
  var Panel: typings.xrm.Xrm.Panel = js.native
  
  /**
    * Provides a container for useful functions not directly related to the current page.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
    */
  var Utility: typings.xrm.Xrm.Utility = js.native
  
  /**
    * Provides properties and methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi External Link: Xrm.WebApi (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/use-microsoft-dynamics-365-web-api External Link: Use the Customer Engagement Web API}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/webapi/get-started-web-api-client-side-javascript External Link: Get started with the Customer Engagement Web API (client-side JavaScript)}
    */
  var WebApi: typings.xrm.Xrm.WebApi = js.native
}
object XrmStatic {
  
  @scala.inline
  def apply(
    Device: Device,
    Encoding: Encoding,
    Mobile: Mobile,
    Navigation: Navigation,
    Page: Page,
    Panel: Panel,
    Utility: Utility,
    WebApi: WebApi
  ): XrmStatic = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Navigation = Navigation.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Utility = Utility.asInstanceOf[js.Any], WebApi = WebApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[XrmStatic]
  }
  
  @scala.inline
  implicit class XrmStaticMutableBuilder[Self <: XrmStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: Encoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Mobile): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: Navigation): Self = StObject.set(x, "Navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Page): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: Panel): Self = StObject.set(x, "Panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtility(value: Utility): Self = StObject.set(x, "Utility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApi(value: WebApi): Self = StObject.set(x, "WebApi", value.asInstanceOf[js.Any])
  }
}
