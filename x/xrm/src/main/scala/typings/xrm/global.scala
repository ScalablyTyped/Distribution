package typings.xrm

import org.scalablytyped.runtime.Shortcut
import typings.xrm.Xrm.GlobalContext
import typings.xrm.Xrm.XrmStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Gets the global context.
    * The method provides access to the global context without going through the form context.
    *
    * It is preferreed to use {@link Xrm.Utility.getGlobalContext Xrm.Utility.getGlobalContext()} instead.
    * @see {@link Xrm.Utility.getGlobalContext}
    */
  @JSGlobal("GetGlobalContext")
  @js.native
  def GetGlobalContext(): GlobalContext = js.native
  
  /**
    * Xrm Namespace
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference External Link: Client API Reference}
    */
  object Xrm extends Shortcut {
    
    @JSGlobal("Xrm")
    @js.native
    val ^ : XrmStatic = js.native
    
    /**
      *  A definition module for asynchronous interface declarations.
      */
    object Async
    
    /**
      * A collection of types and methods for working with formContext attributes.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/attributes External Link: Attributes (Client API reference)}
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    object Attributes
    
    /**
      * A definition module for collection interface declarations.
      */
    object Collection
    
    /**
      * A collection of types and methods for working with formContext controls.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    object Controls
    
    /**
      * Namespace to hold Xrm.Device related types
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
      */
    object Device
    
    /**
      * Namespace to hold the Metadata types
      */
    object Metadata
    
    /**
      * Namespace to hold Xrm.Navigation related types
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-navigation External Link: Xrm.Navigation (Client API reference)}
      */
    object Navigation
    
    /**
      * Xrm.Page namespace has been deprecated
      * @deprecated Use {@link Xrm.Events.EventContext.getFormContext formContext} instead.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
      */
    object Page {
      
      /**
        * Module for the Xrm.Page.data API.
        * @deprecated Use {@link Xrm.Form.data formContext.data} has been deprecated.
        */
      object data
      
      /**
        * Contains properties and methods to retrieve information about the user interface as well as collections for several subcomponents of the form.
        * @deprecated Use {@link Xrm.Form.ui formContext.ui} instead.
        */
      object ui
    }
    
    /**
      * An definition module for URL-based, CRM component parameters.
      * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
      */
    object Url
    
    /**
      * The Xrm.Utility API
      *
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
      */
    object Utility
    
    type _To = XrmStatic
    
    /* This means you don't have to write `^`, but can instead just say `Xrm.foo` */
    override def _to: XrmStatic = ^
  }
}
