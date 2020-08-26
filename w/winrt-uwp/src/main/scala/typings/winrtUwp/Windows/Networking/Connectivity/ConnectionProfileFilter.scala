package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionProfileFilter class defines a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
@js.native
trait ConnectionProfileFilter extends js.Object {
  /** Gets or sets whether background data usage is restricted by this connection profile filter. */
  var isBackgroundDataUsageRestricted: Boolean = js.native
  /** Indicates if connection profiles that represent currently established connections are included in query results. */
  var isConnected: Boolean = js.native
  /** Gets or sets whether the data limit has been exceeded under the current connection profile filter. */
  var isOverDataLimit: Boolean = js.native
  /** Gets or sets whether roaming is active in the connection profile filter. */
  var isRoaming: Boolean = js.native
  /** Indicates if connection profiles that represent WLAN (WiFi) connections are included in query results. */
  var isWlanConnectionProfile: Boolean = js.native
  /** Indicates if connection profiles that represent WWAN (mobile) connections are included in query results. */
  var isWwanConnectionProfile: Boolean = js.native
  /** Defines a specific NetworkCostType value to query for. */
  var networkCostType: NetworkCostType = js.native
  /** Gets available data as raw data. */
  var rawData: IBuffer = js.native
  /** Indicates a specific network operator ID to query for. */
  var serviceProviderGuid: String = js.native
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
  @scala.inline
  implicit class ConnectionProfileFilterOps[Self <: ConnectionProfileFilter] (val x: Self) extends AnyVal {
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
    def setIsBackgroundDataUsageRestricted(value: Boolean): Self = this.set("isBackgroundDataUsageRestricted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOverDataLimit(value: Boolean): Self = this.set("isOverDataLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRoaming(value: Boolean): Self = this.set("isRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWlanConnectionProfile(value: Boolean): Self = this.set("isWlanConnectionProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWwanConnectionProfile(value: Boolean): Self = this.set("isWwanConnectionProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkCostType(value: NetworkCostType): Self = this.set("networkCostType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawData(value: IBuffer): Self = this.set("rawData", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceProviderGuid(value: String): Self = this.set("serviceProviderGuid", value.asInstanceOf[js.Any])
  }
  
}

