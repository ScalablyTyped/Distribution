package typings.tuyaPanelKit.mod

import typings.std.Record
import typings.tuyaPanelKit.anon.AddListener
import typings.tuyaPanelKit.anon.Back
import typings.tuyaPanelKit.anon.CheckDpExist
import typings.tuyaPanelKit.anon.Dictkey
import typings.tuyaPanelKit.anon.Emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TYSdk {
  
  @JSImport("tuya-panel-kit", "TYSdk")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "TYSdk.DeviceEventEmitter")
  @js.native
  def DeviceEventEmitter: AddListener = js.native
  @scala.inline
  def DeviceEventEmitter_=(x: AddListener): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceEventEmitter")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSdk.Navigator")
  @js.native
  def Navigator: DeprecatedNavigator = js.native
  @scala.inline
  def Navigator_=(x: DeprecatedNavigator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Navigator")(x.asInstanceOf[js.Any])
  
  /**
    * @param a api name
    * @param postData api params
    * @param version - api version, default 1.0
    */
  // tslint:disable-next-line no-unnecessary-generics
  @JSImport("tuya-panel-kit", "TYSdk.apiRequest")
  @js.native
  def apiRequest[T](a: String, postData: Record[String, _]): js.Promise[T] = js.native
  @JSImport("tuya-panel-kit", "TYSdk.apiRequest")
  @js.native
  def apiRequest[T](a: String, postData: Record[String, _], version: String): js.Promise[T] = js.native
  
  @JSImport("tuya-panel-kit", "TYSdk.applyNavigator")
  @js.native
  def applyNavigator(navigator: DeprecatedNavigator): Unit = js.native
  
  @JSImport("tuya-panel-kit", "TYSdk.devInfo")
  @js.native
  def devInfo: DevInfo[Record[String, DpType]] = js.native
  @scala.inline
  def devInfo_=(x: DevInfo[Record[String, DpType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSdk.device")
  @js.native
  def device: CheckDpExist = js.native
  @scala.inline
  def device_=(x: CheckDpExist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("device")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSdk.event")
  @js.native
  def event: Emit = js.native
  @scala.inline
  def event_=(x: Emit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("event")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSdk.mobile")
  @js.native
  def mobile: Back = js.native
  @scala.inline
  def mobile_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mobile")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSdk.native")
  @js.native
  def native: Dictkey = js.native
  @scala.inline
  def native_=(x: Dictkey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("native")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSdk.__unInitializeDps")
  @js.native
  def unInitializeDps: js.UndefOr[Record[Double, js.Any]] = js.native
  
  @scala.inline
  def unInitializeDps_=(x: js.UndefOr[Record[Double, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__unInitializeDps")(x.asInstanceOf[js.Any])
}
