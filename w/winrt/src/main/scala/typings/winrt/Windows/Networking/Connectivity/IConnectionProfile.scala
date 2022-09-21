package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionProfile extends StObject {
  
  def getConnectionCost(): ConnectionCost = js.native
  
  def getDataPlanStatus(): DataPlanStatus = js.native
  
  def getLocalUsage(StartTime: js.Date, EndTime: js.Date): DataUsage = js.native
  def getLocalUsage(StartTime: js.Date, EndTime: js.Date, States: RoamingStates): DataUsage = js.native
  
  def getNetworkConnectivityLevel(): NetworkConnectivityLevel = js.native
  
  def getNetworkNames(): IVectorView[String] = js.native
  
  def getSignalBars(): IReference[Double] = js.native
  
  var networkAdapter: NetworkAdapter = js.native
  
  var networkSecuritySettings: NetworkSecuritySettings = js.native
  
  var profileName: String = js.native
}
