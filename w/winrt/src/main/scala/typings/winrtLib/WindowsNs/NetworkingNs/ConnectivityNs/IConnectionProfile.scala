package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionProfile extends js.Object {
  var networkAdapter: NetworkAdapter = js.native
  var networkSecuritySettings: NetworkSecuritySettings = js.native
  var profileName: java.lang.String = js.native
  def getConnectionCost(): ConnectionCost = js.native
  def getDataPlanStatus(): DataPlanStatus = js.native
  def getLocalUsage(StartTime: stdLib.Date, EndTime: stdLib.Date): DataUsage = js.native
  def getLocalUsage(StartTime: stdLib.Date, EndTime: stdLib.Date, States: RoamingStates): DataUsage = js.native
  def getNetworkConnectivityLevel(): NetworkConnectivityLevel = js.native
  def getNetworkNames(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  def getSignalBars(): winrtLib.WindowsNs.FoundationNs.IReference[scala.Double] = js.native
}

