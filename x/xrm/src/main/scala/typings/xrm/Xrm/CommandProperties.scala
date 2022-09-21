package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * <CrmParameter> used in RibbonDiffXml actions
  * @see {@link https://docs.microsoft.com/en-us/previous-versions/dynamicscrm-2016/developers-guide/gg309332(v=crm.8)}
  */
trait CommandProperties extends StObject {
  
  /**
    * A string that is sent with the command event when a button is clicked.
    */
  var CommandValueId: String
  
  /**
    * A reference from a control to the Id of a menu item.
    *
    * Most entities will not return a MenuItemId value. Only the following entities will return this value:
    * BusinessUnit
    * Connection
    * CustomerAddress
    * Equipment
    * Goal
    * InvoiceDetail
    * Mailbox
    * MailMergeTemplate
    * PartnerApplication
    * QueueItem
    * QuoteDetail
    * RoutingRuleItem
    * SalesOrderDetail
    * ServiceAppointment
    * SharePointDocumentLocation
    * SharePointSite
    * Territory
    */
  var MenuItemId: String
  
  /**
    * The Id value of the Ribbon control that initiated the event.
    */
  var SourceControlId: String
}
object CommandProperties {
  
  inline def apply(CommandValueId: String, MenuItemId: String, SourceControlId: String): CommandProperties = {
    val __obj = js.Dynamic.literal(CommandValueId = CommandValueId.asInstanceOf[js.Any], MenuItemId = MenuItemId.asInstanceOf[js.Any], SourceControlId = SourceControlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandProperties]
  }
  
  extension [Self <: CommandProperties](x: Self) {
    
    inline def setCommandValueId(value: String): Self = StObject.set(x, "CommandValueId", value.asInstanceOf[js.Any])
    
    inline def setMenuItemId(value: String): Self = StObject.set(x, "MenuItemId", value.asInstanceOf[js.Any])
    
    inline def setSourceControlId(value: String): Self = StObject.set(x, "SourceControlId", value.asInstanceOf[js.Any])
  }
}
