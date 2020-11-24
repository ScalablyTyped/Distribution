package typings.tuyaPanelKit.mod

import typings.std.Record
import typings.tuyaPanelKit.anon.AddListener
import typings.tuyaPanelKit.anon.Back
import typings.tuyaPanelKit.anon.CheckDpExist
import typings.tuyaPanelKit.anon.Dictkey
import typings.tuyaPanelKit.anon.Emit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TYSdk")
@js.native
object TYSdk extends js.Object {
  
  var DeviceEventEmitter: AddListener = js.native
  
  var Navigator: DeprecatedNavigator = js.native
  
  var __unInitializeDps: js.UndefOr[Record[Double, _]] = js.native
  
  /**
    * @param a api name
    * @param postData api params
    * @param version - api version, default 1.0
    */
  // tslint:disable-next-line no-unnecessary-generics
  def apiRequest[T](a: String, postData: Record[String, _]): js.Promise[T] = js.native
  def apiRequest[T](a: String, postData: Record[String, _], version: String): js.Promise[T] = js.native
  
  def applyNavigator(navigator: DeprecatedNavigator): Unit = js.native
  
  var devInfo: DevInfo[Record[String, DpType]] = js.native
  
  var device: CheckDpExist = js.native
  
  var event: Emit = js.native
  
  var mobile: Back = js.native
  
  var native: Dictkey = js.native
}
