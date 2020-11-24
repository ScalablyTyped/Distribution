package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.MobileInfo
import typings.tuyaPanelKit.mod.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back extends js.Object {
  
  /**
    * 返回到 app 列表页面
    */
  def back(): Unit = js.native
  
  def bottomListDialog(itemList: js.Any, selected: js.Any, onConfirmed: js.Any): Unit = js.native
  
  def disablePopGesture(): Unit = js.native
  
  def enablePopGesture(): Unit = js.native
  
  def getMobileInfo(): js.Promise[MobileInfo] = js.native
  
  def getNetworkState(): NetworkType = js.native
  
  /**
    * @platform IOS only
    */
  def getWiFiSsid(): String = js.native
  
  /**
    * 隐藏 app 原生 loading UI 框
    */
  def hideLoading(): Unit = js.native
  
  def is24Hour(): Boolean = js.native
  
  /**
    * @desc 根据 uiId 跳转二级页面
    */
  def jumpSubPage(uiIdParams: UiId, pageParams: js.Any): Unit = js.native
  
  /**
    * @desc 跳转到 app 内置路由页面或网页
    * @param routeId app 路由 url 或网页链接
    */
  def jumpTo(routeId: String): Unit = js.native
  
  var mobileInfo: MobileInfo = js.native
  
  def shareMsg(map: js.Any): Unit = js.native
  
  def showEditDialog(
    title: String,
    editString: String,
    onConfirmed: js.Function1[/* value */ String, Unit],
    onCanceled: js.Function0[Unit]
  ): Unit = js.native
  
  /**
    * 显示 app 原生 loading UI 框
    */
  def showLoading(): Unit = js.native
  
  def showPromptDialog(
    confirmText: String,
    cancelText: String,
    title: String,
    message: String,
    defaultValue: String,
    onConfirmed: js.Function1[/* value */ String, Unit],
    onCanceled: js.Function0[Unit]
  ): Unit = js.native
  def showPromptDialog(
    confirmText: String,
    cancelText: String,
    title: String,
    message: String,
    defaultValue: Double,
    onConfirmed: js.Function1[/* value */ String, Unit],
    onCanceled: js.Function0[Unit]
  ): Unit = js.native
  
  def simpleConfirmDialog(title: String, subTitle: String, confirm: js.Function0[Unit], cancel: js.Function0[Unit]): Unit = js.native
  
  def simpleTipDialog(title: String, callback: js.Function0[Unit]): Unit = js.native
  
  def verSupported(): Boolean = js.native
}
