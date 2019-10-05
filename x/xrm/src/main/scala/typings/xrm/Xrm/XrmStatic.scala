package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Static xRM object.
  */
trait XrmStatic extends js.Object {
  /**
    * Provides methods to use native device capabilities of mobile devices.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
    */
  var Device: typings.xrm.Xrm.Device
  /**
    * Provides methods to encode strings.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
    */
  var Encoding: typings.xrm.Xrm.Encoding
  /**
    * Provides methods to create and manage records in the mobile clients (for phones tablets).
    * @deprecated Use {@link Xrm.WebApi} instead.
    */
  var Mobile: typings.xrm.Xrm.Mobile
  /** Provides navigation-related methods.
    */
  var Navigation: typings.xrm.Xrm.Navigation
  /**
    * Provides a namespace container for the context, data and ui objects.
    * @deprecated Deprecated in v9.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var Page: typings.xrm.Xrm.Page
  /**
    * Provides a method to display a web page in the side pane of the Customer Engagement form.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
    */
  var Panel: typings.xrm.Xrm.Panel
  /**
    * Provides a container for useful functions not directly related to the current page.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
    */
  var Utility: typings.xrm.Xrm.Utility
  /**
    * Provides properties and methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi External Link: Xrm.WebApi (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/use-microsoft-dynamics-365-web-api External Link: Use the Customer Engagement Web API}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/webapi/get-started-web-api-client-side-javascript External Link: Get started with the Customer Engagement Web API (client-side JavaScript)}
    */
  var WebApi: typings.xrm.Xrm.WebApi
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
    val __obj = js.Dynamic.literal(Device = Device, Encoding = Encoding, Mobile = Mobile, Navigation = Navigation, Page = Page, Panel = Panel, Utility = Utility, WebApi = WebApi)
  
    __obj.asInstanceOf[XrmStatic]
  }
}

