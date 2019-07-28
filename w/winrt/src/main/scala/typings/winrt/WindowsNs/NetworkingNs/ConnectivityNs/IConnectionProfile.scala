package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.std.Date
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionProfile extends js.Object {
  var networkAdapter: NetworkAdapter = js.native
  var networkSecuritySettings: NetworkSecuritySettings = js.native
  var profileName: String = js.native
  def getConnectionCost(): ConnectionCost = js.native
  def getDataPlanStatus(): DataPlanStatus = js.native
  def getLocalUsage(StartTime: Date, EndTime: Date): DataUsage = js.native
  def getLocalUsage(StartTime: Date, EndTime: Date, States: RoamingStates): DataUsage = js.native
  def getNetworkConnectivityLevel(): NetworkConnectivityLevel = js.native
  def getNetworkNames(): IVectorView[String] = js.native
  def getSignalBars(): IReference[Double] = js.native
}

