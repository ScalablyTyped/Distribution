package typings.xrm

import org.scalablytyped.runtime.TopLevel
import typings.xrm.Xrm.GlobalContext
import typings.xrm.Xrm.XrmStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Gets the global context.
    * The method provides access to the global context without going through the form context.
    *
    * It is preferreed to use {@link Xrm.Utility.getGlobalContext Xrm.Utility.getGlobalContext()} instead.
    * @see {@link Xrm.Utility.getGlobalContext}
    */
  def GetGlobalContext(): GlobalContext = js.native
  
  /**
    * Xrm Namespace
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference External Link: Client API Reference}
    */
  @js.native
  object Xrm extends TopLevel[XrmStatic] {
    
    /**
      *  A definition module for asynchronous interface declarations.
      */
    @js.native
    object Async extends js.Object
    
    /**
      * A collection of types and methods for working with formContext attributes.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/attributes External Link: Attributes (Client API reference)}
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @js.native
    object Attributes extends js.Object
    
    /**
      * A definition module for collection interface declarations.
      */
    @js.native
    object Collection extends js.Object
    
    /**
      * A collection of types and methods for working with formContext controls.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @js.native
    object Controls extends js.Object
    
    /**
      * Namespace to hold Xrm.Device related types
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
      */
    @js.native
    object Device extends js.Object
    
    /**
      * Namespace to hold the Metadata types
      */
    @js.native
    object Metadata extends js.Object
    
    /**
      * Namespace to hold Xrm.Navigation related types
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-navigation External Link: Xrm.Navigation (Client API reference)}
      */
    @js.native
    object Navigation extends js.Object
    
    /**
      * Xrm.Page namespace has been deprecated
      * @deprecated Use {@link Xrm.Events.EventContext.getFormContext formContext} instead.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
      */
    @js.native
    object Page extends js.Object {
      
      /**
        * Module for the Xrm.Page.data API.
        * @deprecated Use {@link Xrm.Form.data formContext.data} has been deprecated.
        */
      @js.native
      object data extends js.Object
      
      /**
        * Contains properties and methods to retrieve information about the user interface as well as collections for several subcomponents of the form.
        * @deprecated Use {@link Xrm.Form.ui formContext.ui} instead.
        */
      @js.native
      object ui extends js.Object
    }
    
    /**
      * An definition module for URL-based, CRM component parameters.
      * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
      */
    @js.native
    object Url extends js.Object
    
    /**
      * The Xrm.Utility API
      *
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
      */
    @js.native
    object Utility extends js.Object
  }
}
