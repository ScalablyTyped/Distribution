package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides properties and methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement.
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/xrm-webapi External Link: Xrm.WebApi (Client API reference)}
  */
@js.native
trait WebApi
  extends StObject
     with WebApiOffline {
  
  /**
    * Returns a boolean value indicating whether an entity is offline enabled.
    * @param entityLogicalName    Logical name of the entity. For example: "account".
    * @returns true if the entity is offline enabled; otherwise false.
    */
  def isAvailableOffline(entityLogicalName: String): Boolean = js.native
  
  /**
    * Provides methods to create and manage records in the Dynamics 365 Customer Engagement mobile clients while working in the offline mode.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/xrm-webapi/offline External Link: Xrm.WebApi.offline (Client API reference)}
    */
  var offline: WebApiOffline = js.native
  
  /**
    * Provides methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement when connected to the Customer Engagement server (online mode).
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/xrm-webapi/online External Link: Xrm.WebApi.online (Client API reference)}
    */
  var online: WebApiOnline = js.native
}
