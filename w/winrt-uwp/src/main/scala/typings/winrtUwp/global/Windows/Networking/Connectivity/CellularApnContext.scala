package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
@JSGlobal("Windows.Networking.Connectivity.CellularApnContext")
@js.native
/** Creates an instance of CellularApnContext . */
class CellularApnContext ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.CellularApnContext {
  /** Indicates the name of the access point to establish a connection with. */
  /* CompleteClass */
  override var accessPointName: String = js.native
  /** Indicates the authentication method, as defined by CellularApnAuthenticationType , that is used by the access point. */
  /* CompleteClass */
  override var authenticationType: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType = js.native
  /** Indicates if data compression will be used at the data link for header and data transfer. */
  /* CompleteClass */
  override var isCompressionEnabled: Boolean = js.native
  /** Indicates the password used to authenticate when connecting to the access point. */
  /* CompleteClass */
  override var password: String = js.native
  /** Indicates the provider ID associated with the access point. */
  /* CompleteClass */
  override var providerId: String = js.native
  /** Indicates the user name used to authenticate when connecting to the access point. */
  /* CompleteClass */
  override var userName: String = js.native
}

