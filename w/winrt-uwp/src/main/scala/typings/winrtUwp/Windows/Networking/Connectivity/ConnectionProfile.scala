package typings.winrtUwp.Windows.Networking.Connectivity

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a network connection, which includes either the currently connected network or prior network connections. Provides information about the connection status and connectivity statistics. */
@js.native
trait ConnectionProfile extends StObject {
  
  /**
    * Gets network usage data for each individual application. This method is only supported in a Windows Phone Store app.
    * @param startTime The start time of the usage window.
    * @param endTime The end time of the usage window.
    * @param states The state of the connection profile for which usage data should be returned.
    * @return When the method completes, it returns a list of AttributedNetworkUsage objects, which indicate the sent and received values, in bytes, and the total amount of time the app was connected during the corresponding time interval.
    */
  def getAttributedNetworkUsageAsync(startTime: Date, endTime: Date, states: NetworkUsageStates): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
  
  /**
    * Gets the cost information for the connection.
    * @return The cost information for the connection.
    */
  def getConnectionCost(): ConnectionCost = js.native
  
  /**
    * Gets a list of ConnectivityInterval objects, which indicate the timestamp for when the network connection began, and a time-span for the duration of that connection.
    * @param startTime The start time over which to retrieve data. Can be no more than 60 days prior to the current time.
    * @param endTime The end time over which to retrieve data.
    * @param states The state of the connection profile for which usage data should be returned.
    * @return When the method completes, it returns a list of ConnectivityInterval objects, which indicate the start time and duration for the current or prior connections.
    */
  def getConnectivityIntervalsAsync(startTime: Date, endTime: Date, states: NetworkUsageStates): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
  
  /**
    * Gets the current status of the data plan associated with the connection.
    * @return Current data plan status information.
    */
  def getDataPlanStatus(): DataPlanStatus = js.native
  
  /**
    * Gets the current domain authentication status for a network connection. Possible values are defined by DomainConnectivityLevel .
    * @return A value indicating the authentication status for a connection to a network domain.
    */
  def getDomainConnectivityLevel(): DomainConnectivityLevel = js.native
  
  /**
    * Gets the estimated data usage for a connection during over a specific period of time.
    * @param StartTime The start date/time for the usage data request.
    * @param EndTime The end date/time for the usage data request.
    * @return The requested local data usage information.
    */
  def getLocalUsage(StartTime: Date, EndTime: Date): DataUsage = js.native
  /**
    * Gets the estimated data usage for a connection over a specific period of time and roaming state.
    * @param StartTime The start date/time for the usage data request.
    * @param EndTime The end date/time for the usage data request.
    * @param States The roaming state to scope the request to.
    * @return The requested local data usage information.
    */
  def getLocalUsage(StartTime: Date, EndTime: Date, States: RoamingStates): DataUsage = js.native
  
  /**
    * Gets the network connectivity level for this connection. This value indicates what network resources, if any, are currently available.
    * @return The level of network connectivity.
    */
  def getNetworkConnectivityLevel(): NetworkConnectivityLevel = js.native
  
  /**
    * Retrieves names associated with the network with which the connection is currently established.
    * @return An array of string values representing friendly names used to identify the local endpoint.
    */
  def getNetworkNames(): IVectorView[String] = js.native
  
  /**
    * Gets a list of the estimated data traffic and connection duration over a specified period of time, for a specific network usage state.
    * @param startTime The start time over which to retrieve data. Can be no more than 60 days prior to the current time. If the specified granularity is PerMinute, the start time can be no more than 120 minutes prior to the current time.
    * @param endTime The end time over which to retrieve data.
    * @param granularity The desired granularity of the returned usage statistics. Each elements in the list corresponds to the network usage per the specified granularity, e.g., usage per hour.
    * @param states The state of the connection profile for which usage data should be returned.
    * @return When the method completes, it returns a list of NetworkUsage objects, which indicate the sent and received values, in bytes, and the total amount of time the profile was connected during the corresponding time interval.
    */
  def getNetworkUsageAsync(startTime: Date, endTime: Date, granularity: DataUsageGranularity, states: NetworkUsageStates): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
  
  /**
    * Gets a value that indicates the current number of signal bars displayed by the Windows UI for the connection.
    * @return An integer value within a range of 0-5 that corresponds to the number of signal bars displayed by the UI.
    */
  def getSignalBars(): Double = js.native
  
  /** Gets a value that indicates if connection profile is a WLAN (WiFi) connection. This determines whether or not WlanConnectionProfileDetails is null. */
  var isWlanConnectionProfile: Boolean = js.native
  
  /** Gets a value that indicates if connection profile is a WWAN (mobile) connection. This determines whether or not WwanConnectionProfileDetails is null. */
  var isWwanConnectionProfile: Boolean = js.native
  
  /** Gets the object representing the network adapter providing connectivity for the connection. */
  var networkAdapter: NetworkAdapter = js.native
  
  /** Retrieves the security settings for the network. */
  var networkSecuritySettings: NetworkSecuritySettings = js.native
  
  /** Gets the name of the connection profile. */
  var profileName: String = js.native
  
  /** Gets the ID of the network operator who provisioned the connection profile. */
  var serviceProviderGuid: String = js.native
  
  /** Gets a WlanConnectionProfileDetails object that provides a method for retrieving information specific to a WLAN (WiFi) connection. */
  var wlanConnectionProfileDetails: WlanConnectionProfileDetails = js.native
  
  /** Gets a WwanConnectionProfileDetails object containing the properties and methods used to retrieve information specific to mobile broadband connections. */
  var wwanConnectionProfileDetails: WwanConnectionProfileDetails = js.native
}
