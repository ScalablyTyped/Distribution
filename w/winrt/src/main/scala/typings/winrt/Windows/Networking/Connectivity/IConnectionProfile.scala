package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionProfile extends js.Object {
  
  def getConnectionCost(): ConnectionCost = js.native
  
  def getDataPlanStatus(): DataPlanStatus = js.native
  
  def getLocalUsage(StartTime: Date, EndTime: Date): DataUsage = js.native
  def getLocalUsage(StartTime: Date, EndTime: Date, States: RoamingStates): DataUsage = js.native
  
  def getNetworkConnectivityLevel(): NetworkConnectivityLevel = js.native
  
  def getNetworkNames(): IVectorView[String] = js.native
  
  def getSignalBars(): IReference[Double] = js.native
  
  var networkAdapter: NetworkAdapter = js.native
  
  var networkSecuritySettings: NetworkSecuritySettings = js.native
  
  var profileName: String = js.native
}
