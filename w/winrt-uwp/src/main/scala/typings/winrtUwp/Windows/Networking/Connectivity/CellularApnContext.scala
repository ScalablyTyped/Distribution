package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
trait CellularApnContext extends js.Object {
  /** Indicates the name of the access point to establish a connection with. */
  var accessPointName: String
  /** Indicates the authentication method, as defined by CellularApnAuthenticationType , that is used by the access point. */
  var authenticationType: CellularApnAuthenticationType
  /** Indicates if data compression will be used at the data link for header and data transfer. */
  var isCompressionEnabled: Boolean
  /** Indicates the password used to authenticate when connecting to the access point. */
  var password: String
  /** Indicates the provider ID associated with the access point. */
  var providerId: String
  /** Indicates the user name used to authenticate when connecting to the access point. */
  var userName: String
}

object CellularApnContext {
  @scala.inline
  def apply(
    accessPointName: String,
    authenticationType: CellularApnAuthenticationType,
    isCompressionEnabled: Boolean,
    password: String,
    providerId: String,
    userName: String
  ): CellularApnContext = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], authenticationType = authenticationType.asInstanceOf[js.Any], isCompressionEnabled = isCompressionEnabled.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularApnContext]
  }
}

