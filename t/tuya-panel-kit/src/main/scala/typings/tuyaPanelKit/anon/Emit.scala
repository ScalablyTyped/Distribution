package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.AnyFunction
import typings.tuyaPanelKit.tuyaPanelKitStrings.bluetoothChange
import typings.tuyaPanelKit.tuyaPanelKitStrings.deviceDataChange
import typings.tuyaPanelKit.tuyaPanelKitStrings.deviceLocalStateChange
import typings.tuyaPanelKit.tuyaPanelKitStrings.linkageTimeUpdate
import typings.tuyaPanelKit.tuyaPanelKitStrings.networkStateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emit extends StObject {
  
  def emit(event: String, data: Any): Unit = js.native
  
  def fire(event: String, data: Any): Unit = js.native
  
  /**
    * 存在 callback 则移除指定 listener，不存在则移除所有 listeners
    */
  def off(event: String): Unit = js.native
  def off(event: String, callback: AnyFunction): Unit = js.native
  
  def on(event: String, callback: AnyFunction): Unit = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def on[T](event: String, callback: js.Function1[/* args */ T, Unit]): Unit = js.native
  /**
    * @desc 蓝牙状态变更通知
    */
  @JSName("on")
  def on_bluetoothChange(event: bluetoothChange, callback: js.Function1[/* value */ Boolean, Unit]): Unit = js.native
  /**
    * @desc
    * type: dpData 设备状态变更通知，payload 为更新的 DP 状态
    * type: devInfo 设备信息变更通知，payload 为 devInfo
    * type: deviceOnline 设备是否在线通知，payload 为 boolean
    */
  @JSName("on")
  def on_deviceDataChange(event: deviceDataChange, callback: js.Function1[/* data */ PayloadType, Unit]): Unit = js.native
  /**
    * @desc 设备局域网在线状态变更通知
    */
  @JSName("on")
  def on_deviceLocalStateChange(event: deviceLocalStateChange, callback: js.Function1[/* data */ StateBoolean, Unit]): Unit = js.native
  /**
    * @desc 云定时状态变更通知
    */
  @JSName("on")
  def on_linkageTimeUpdate(event: linkageTimeUpdate, callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
  /**
    * @desc app 网络状态变更通知
    */
  @JSName("on")
  def on_networkStateChange(event: networkStateChange, callback: js.Function1[/* data */ AppOnline, Unit]): Unit = js.native
  
  def once(event: String, callback: AnyFunction): Unit = js.native
  
  def remove(event: String, callback: AnyFunction): Unit = js.native
}
