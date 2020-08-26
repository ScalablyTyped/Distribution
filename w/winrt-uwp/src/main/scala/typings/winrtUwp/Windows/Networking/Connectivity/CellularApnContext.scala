package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
@js.native
trait CellularApnContext extends js.Object {
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
  @scala.inline
  implicit class CellularApnContextOps[Self <: CellularApnContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPointName(value: String): Self = this.set("accessPointName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationType(value: CellularApnAuthenticationType): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompressionEnabled(value: Boolean): Self = this.set("isCompressionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
  
}

