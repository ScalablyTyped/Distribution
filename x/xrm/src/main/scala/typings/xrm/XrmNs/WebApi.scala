package typings.xrm.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides properties and methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi External Link: Xrm.WebApi (Client API reference)}
  */
@js.native
trait WebApi extends WebApiOffline {
  /**
    * Provides methods to create and manage records in the Dynamics 365 Customer Engagement mobile clients while working in the offline mode.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/offline}
    */
  var offline: WebApiOffline = js.native
  /**
    * Provides methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement when connected to the Customer Engagement server (online mode).
    */
  var online: WebApiOnline = js.native
  /**
    * Returns a boolean value indicating whether an entity is offline enabled.
    * @param entityLogicalName    Logical name of the entity. For example: "account".
    * @returns true if the entity is offline enabled; otherwise false.
    */
  def isAvailableOffline(entityLogicalName: String): Boolean = js.native
}

