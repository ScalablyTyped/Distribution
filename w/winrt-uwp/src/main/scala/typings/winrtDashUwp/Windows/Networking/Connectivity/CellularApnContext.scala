package typings.winrtDashUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
@JSGlobal("Windows.Networking.Connectivity.CellularApnContext")
@js.native
/** Creates an instance of CellularApnContext . */
class CellularApnContext () extends js.Object {
  /** Indicates the name of the access point to establish a connection with. */
  var accessPointName: String = js.native
  /** Indicates the authentication method, as defined by CellularApnAuthenticationType , that is used by the access point. */
  var authenticationType: CellularApnAuthenticationType = js.native
  /** Indicates if data compression will be used at the data link for header and data transfer. */
  var isCompressionEnabled: Boolean = js.native
  /** Indicates the password used to authenticate when connecting to the access point. */
  var password: String = js.native
  /** Indicates the provider ID associated with the access point. */
  var providerId: String = js.native
  /** Indicates the user name used to authenticate when connecting to the access point. */
  var userName: String = js.native
}

