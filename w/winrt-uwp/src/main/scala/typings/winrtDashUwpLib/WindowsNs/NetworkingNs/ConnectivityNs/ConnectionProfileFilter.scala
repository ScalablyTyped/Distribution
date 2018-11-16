package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionProfileFilter class defines a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
@JSGlobal("Windows.Networking.Connectivity.ConnectionProfileFilter")
@js.native
class ConnectionProfileFilter () extends js.Object {
  /** Gets or sets whether background data usage is restricted by this connection profile filter. */
  var isBackgroundDataUsageRestricted: scala.Boolean = js.native
  /** Indicates if connection profiles that represent currently established connections are included in query results. */
  var isConnected: scala.Boolean = js.native
  /** Gets or sets whether the data limit has been exceeded under the current connection profile filter. */
  var isOverDataLimit: scala.Boolean = js.native
  /** Gets or sets whether roaming is active in the connection profile filter. */
  var isRoaming: scala.Boolean = js.native
  /** Indicates if connection profiles that represent WLAN (WiFi) connections are included in query results. */
  var isWlanConnectionProfile: scala.Boolean = js.native
  /** Indicates if connection profiles that represent WWAN (mobile) connections are included in query results. */
  var isWwanConnectionProfile: scala.Boolean = js.native
  /** Defines a specific NetworkCostType value to query for. */
  var networkCostType: NetworkCostType = js.native
  /** Gets available data as raw data. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Indicates a specific network operator ID to query for. */
  var serviceProviderGuid: java.lang.String = js.native
}

