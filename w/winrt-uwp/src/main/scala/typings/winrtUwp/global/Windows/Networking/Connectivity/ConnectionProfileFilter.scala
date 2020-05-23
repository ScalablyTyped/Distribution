package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionProfileFilter class defines a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
@JSGlobal("Windows.Networking.Connectivity.ConnectionProfileFilter")
@js.native
/** Creates an instance of ConnectionProfileFilter , which contains a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
class ConnectionProfileFilter ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfileFilter {
  /** Gets or sets whether background data usage is restricted by this connection profile filter. */
  /* CompleteClass */
  override var isBackgroundDataUsageRestricted: Boolean = js.native
  /** Indicates if connection profiles that represent currently established connections are included in query results. */
  /* CompleteClass */
  override var isConnected: Boolean = js.native
  /** Gets or sets whether the data limit has been exceeded under the current connection profile filter. */
  /* CompleteClass */
  override var isOverDataLimit: Boolean = js.native
  /** Gets or sets whether roaming is active in the connection profile filter. */
  /* CompleteClass */
  override var isRoaming: Boolean = js.native
  /** Indicates if connection profiles that represent WLAN (WiFi) connections are included in query results. */
  /* CompleteClass */
  override var isWlanConnectionProfile: Boolean = js.native
  /** Indicates if connection profiles that represent WWAN (mobile) connections are included in query results. */
  /* CompleteClass */
  override var isWwanConnectionProfile: Boolean = js.native
  /** Defines a specific NetworkCostType value to query for. */
  /* CompleteClass */
  override var networkCostType: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType = js.native
  /** Gets available data as raw data. */
  /* CompleteClass */
  override var rawData: IBuffer = js.native
  /** Indicates a specific network operator ID to query for. */
  /* CompleteClass */
  override var serviceProviderGuid: String = js.native
}

