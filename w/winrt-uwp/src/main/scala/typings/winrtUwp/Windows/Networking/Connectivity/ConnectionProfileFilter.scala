package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionProfileFilter class defines a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
trait ConnectionProfileFilter extends js.Object {
  /** Gets or sets whether background data usage is restricted by this connection profile filter. */
  var isBackgroundDataUsageRestricted: Boolean
  /** Indicates if connection profiles that represent currently established connections are included in query results. */
  var isConnected: Boolean
  /** Gets or sets whether the data limit has been exceeded under the current connection profile filter. */
  var isOverDataLimit: Boolean
  /** Gets or sets whether roaming is active in the connection profile filter. */
  var isRoaming: Boolean
  /** Indicates if connection profiles that represent WLAN (WiFi) connections are included in query results. */
  var isWlanConnectionProfile: Boolean
  /** Indicates if connection profiles that represent WWAN (mobile) connections are included in query results. */
  var isWwanConnectionProfile: Boolean
  /** Defines a specific NetworkCostType value to query for. */
  var networkCostType: NetworkCostType
  /** Gets available data as raw data. */
  var rawData: IBuffer
  /** Indicates a specific network operator ID to query for. */
  var serviceProviderGuid: String
}

object ConnectionProfileFilter {
  @scala.inline
  def apply(
    isBackgroundDataUsageRestricted: Boolean,
    isConnected: Boolean,
    isOverDataLimit: Boolean,
    isRoaming: Boolean,
    isWlanConnectionProfile: Boolean,
    isWwanConnectionProfile: Boolean,
    networkCostType: NetworkCostType,
    rawData: IBuffer,
    serviceProviderGuid: String
  ): ConnectionProfileFilter = {
    val __obj = js.Dynamic.literal(isBackgroundDataUsageRestricted = isBackgroundDataUsageRestricted.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isOverDataLimit = isOverDataLimit.asInstanceOf[js.Any], isRoaming = isRoaming.asInstanceOf[js.Any], isWlanConnectionProfile = isWlanConnectionProfile.asInstanceOf[js.Any], isWwanConnectionProfile = isWwanConnectionProfile.asInstanceOf[js.Any], networkCostType = networkCostType.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProfileFilter]
  }
}

