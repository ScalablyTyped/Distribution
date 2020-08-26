package typings.wechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WechatMiniprogram {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AccessCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type AccessFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.AccessFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type AccessSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AddCardCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type AddCardFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type AddCardSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.AddCardSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AddPhoneContactCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type AddPhoneContactFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type AddPhoneContactSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AddServiceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type AddServiceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type AddServiceSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AppendFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type AppendFileFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.AppendFileFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type AppendFileSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AuthorizeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type AuthorizeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type AuthorizeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 背景音频播放错误事件的回调函数 */
  type BackgroundAudioManagerOnErrorCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type BlurCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type BlurFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type BlurSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，节点信息会在 `callback` 中返回。 */
  type BoundingClientRectCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.BoundingClientRectCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CameraContextStartRecordSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CameraContextStopRecordSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StopRecordSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CanvasGetImageDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CanvasGetImageDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CanvasGetImageDataSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CanvasGetImageDataSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CanvasPutImageDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CanvasPutImageDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CanvasPutImageDataSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CanvasToTempFilePathCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CanvasToTempFilePathFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CanvasToTempFilePathSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CanvasToTempFilePathSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CheckIsSoterEnrolledInDeviceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CheckIsSoterEnrolledInDeviceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CheckIsSoterEnrolledInDeviceSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CheckIsSoterEnrolledInDeviceSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CheckIsSupportSoterAuthenticationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CheckIsSupportSoterAuthenticationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CheckIsSupportSoterAuthenticationSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CheckIsSupportSoterAuthenticationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CheckSessionCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CheckSessionFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CheckSessionSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseAddressCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseAddressFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseAddressSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseAddressSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseImageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseImageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseImageSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseImageSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseInvoiceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseInvoiceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseInvoiceSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseInvoiceSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseInvoiceTitleCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseInvoiceTitleFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseInvoiceTitleSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseInvoiceTitleSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseLocationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseLocationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseLocationSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseLocationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseMediaCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseMediaFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseMediaSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseMediaSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseMessageFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseMessageFileFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseMessageFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseMessageFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ChooseVideoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ChooseVideoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ChooseVideoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ChooseVideoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ClearCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ClearFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ClearStorageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ClearStorageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ClearStorageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ClearSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseBLEConnectionCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CloseBLEConnectionFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CloseBLEConnectionSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseBluetoothAdapterCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CloseBluetoothAdapterFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CloseBluetoothAdapterSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CloseFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CloseSocketCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CloseSocketFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CloseSocketSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CloseSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CompressImageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CompressImageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CompressImageSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CompressImageSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CompressVideoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CompressVideoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CompressVideoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CompressVideoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ConnectCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ConnectFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ConnectSocketCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ConnectSocketFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ConnectSocketSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ConnectSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ConnectWifiCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ConnectWifiFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ConnectWifiSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，返回节点信息。 */
  type ContextCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ContextCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CopyFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CopyFileFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CopyFileFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CopyFileSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CreateBLEConnectionCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type CreateBLEConnectionFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type CreateBLEConnectionSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type CreateBLEPeripheralServerCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type CreateBLEPeripheralServerFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type CreateBLEPeripheralServerSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.CreateBLEPeripheralServerSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type DownloadFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type DownloadFileFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type DownloadFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.DownloadFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 下载进度变化事件的回调函数 */
  type DownloadTaskOnProgressUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.DownloadTaskOnProgressUpdateCallbackResult, 
    scala.Unit
  ]
  /** 事件监听函数 */
  type EventCallback = js.Function1[/* args */ js.Any, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ExitFullScreenCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ExitFullScreenFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ExitFullScreenSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ExitPictureInPictureCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ExitPictureInPictureFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ExitPictureInPictureSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ExitVoIPChatCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ExitVoIPChatFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ExitVoIPChatSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 回调函数 */
  type FieldsCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, scala.Unit]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerGetFileInfoFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetFileInfoFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerGetFileInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.FileSystemManagerGetFileInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerGetSavedFileListSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.FileSystemManagerGetSavedFileListSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerRemoveSavedFileFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RemoveSavedFileFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type FileSystemManagerSaveFileFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SaveFileFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type FileSystemManagerSaveFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.FileSystemManagerSaveFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetAtqaCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetAtqaFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetAtqaSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetAtqaSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetAvailableAudioSourcesCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetAvailableAudioSourcesFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetAvailableAudioSourcesSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetAvailableAudioSourcesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBLEDeviceCharacteristicsCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBLEDeviceCharacteristicsFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBLEDeviceCharacteristicsSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBLEDeviceCharacteristicsSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBLEDeviceRSSICompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetBLEDeviceRSSIFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetBLEDeviceRSSISuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBLEDeviceRSSISuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBLEDeviceServicesCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBLEDeviceServicesFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBLEDeviceServicesSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBLEDeviceServicesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBackgroundAudioPlayerStateCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetBackgroundAudioPlayerStateFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBackgroundAudioPlayerStateSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBackgroundFetchDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetBackgroundFetchDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetBackgroundFetchDataSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBackgroundFetchTokenCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetBackgroundFetchTokenFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetBackgroundFetchTokenSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBatteryInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetBatteryInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetBatteryInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBatteryInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBeaconsCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBeaconsFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBeaconsSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBeaconsSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBluetoothAdapterStateCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBluetoothAdapterStateFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBluetoothAdapterStateSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBluetoothAdapterStateSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetBluetoothDevicesCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetBluetoothDevicesFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetBluetoothDevicesSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetBluetoothDevicesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetCenterLocationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetCenterLocationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetCenterLocationSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetCenterLocationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetClipboardDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetClipboardDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetClipboardDataSuccessCallback = js.Function1[
    /* option */ typings.wechatMiniprogram.WechatMiniprogram.GetClipboardDataSuccessCallbackOption, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetConnectedBluetoothDevicesCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetConnectedBluetoothDevicesFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetConnectedBluetoothDevicesSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetConnectedBluetoothDevicesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetConnectedWifiCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetConnectedWifiFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetConnectedWifiSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetConnectedWifiSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetContentsCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetContentsFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetContentsSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetContentsSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetExtConfigCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetExtConfigFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetExtConfigSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetExtConfigSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetFileInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetHCEStateCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetHCEStateFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetHCEStateSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetHistoricalBytesCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetHistoricalBytesFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetHistoricalBytesSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetHistoricalBytesSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetImageInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetImageInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetImageInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetImageInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetLocationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetLocationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetLocationSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetLocationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetMaxTransceiveLengthCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetMaxTransceiveLengthFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetMaxTransceiveLengthSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetMaxTransceiveLengthSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetNetworkTypeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetNetworkTypeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetNetworkTypeSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetNetworkTypeSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetRegionCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetRegionFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetRegionSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetRegionSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetRotateCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetRotateFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetRotateSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetRotateSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSakCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSakFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSakSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSakSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSavedFileInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSavedFileInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSavedFileInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSavedFileInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSavedFileListCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSavedFileListFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetScaleCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetScaleFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetScaleSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetScaleSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetScreenBrightnessCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetScreenBrightnessFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetScreenBrightnessSuccessCallback = js.Function1[
    /* option */ typings.wechatMiniprogram.WechatMiniprogram.GetScreenBrightnessSuccessCallbackOption, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSelectedTextRangeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSelectedTextRangeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSelectedTextRangeSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSelectedTextRangeSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSelectionTextCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSelectionTextFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSelectionTextSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSelectionTextSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSettingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSettingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSettingSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSettingSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetShareInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetShareInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetShareInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetShareInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSkewCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSkewFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSkewSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSkewSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetStorageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetStorageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetStorageInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetStorageInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetStorageInfoSuccessCallback = js.Function1[
    /* option */ typings.wechatMiniprogram.WechatMiniprogram.GetStorageInfoSuccessCallbackOption, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetStorageSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetStorageSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetSystemInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetSystemInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetSystemInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetSystemInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetUserInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetUserInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetUserInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetUserInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetVideoInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetVideoInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetVideoInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetVideoInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetWeRunDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type GetWeRunDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type GetWeRunDataSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetWeRunDataSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type GetWifiListCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type GetWifiListFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type GetWifiListSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideHomeButtonCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideHomeButtonFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideHomeButtonSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideKeyboardCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideKeyboardFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideKeyboardSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideLoadingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideLoadingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideLoadingSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideNavigationBarLoadingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideNavigationBarLoadingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideNavigationBarLoadingSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideShareMenuCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideShareMenuFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideShareMenuSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideTabBarCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideTabBarFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideTabBarRedDotCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideTabBarRedDotFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideTabBarRedDotSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideTabBarSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type HideToastCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type HideToastFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type HideToastSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type IAnyObject = typings.std.Record[java.lang.String, js.Any]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type IncludePointsCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type IncludePointsFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type IncludePointsSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频播放错误事件的回调函数 */
  type InnerAudioContextOnErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.InnerAudioContextOnErrorCallbackResult, 
    scala.Unit
  ]
  type InnerAudioContextOnStopCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type InsertDividerCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type InsertDividerFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type InsertDividerSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type InsertImageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type InsertImageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type InsertImageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type InsertTextCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type InsertTextFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type InsertTextSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 监听相交状态变化的回调函数 */
  type IntersectionObserverObserveCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.IntersectionObserverObserveCallbackResult, 
    scala.Unit
  ]
  /** 插屏错误事件的回调函数 */
  type InterstitialAdOnErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.InterstitialAdOnErrorCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type IsConnectedCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type IsConnectedFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type IsConnectedSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.IsConnectedSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type JoinVoIPChatCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.JoinVoIPChatError, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type JoinVoIPChatFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.JoinVoIPChatError, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type JoinVoIPChatSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.JoinVoIPChatSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LoadFontFaceCompleteCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.LoadFontFaceCompleteCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type LoadFontFaceFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.LoadFontFaceCompleteCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type LoadFontFaceSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.LoadFontFaceCompleteCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type LoginCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type LoginFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type LoginSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.LoginSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MakePhoneCallCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type MakePhoneCallFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type MakePhoneCallSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 监听 media query 状态变化的回调函数 */
  type MediaQueryObserverObserveCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.MediaQueryObserverObserveCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MkdirCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type MkdirFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.MkdirFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type MkdirSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MoveToLocationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type MoveToLocationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type MoveToLocationSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MuteCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type MuteFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type MuteSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateBackCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type NavigateBackFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateBackMiniProgramCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type NavigateBackMiniProgramFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type NavigateBackMiniProgramSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type NavigateBackSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateToCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type NavigateToFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NavigateToMiniProgramCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type NavigateToMiniProgramFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type NavigateToMiniProgramSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type NavigateToSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.NavigateToSuccessCallbackResult, 
    scala.Unit
  ]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，返回节点信息。 */
  type NodeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.NodeCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type NotifyBLECharacteristicValueChangeCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type NotifyBLECharacteristicValueChangeFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type NotifyBLECharacteristicValueChangeSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 小程序切后台事件的回调函数 */
  type OffAppHideCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 小程序切前台事件的回调函数 */
  type OffAppShowCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频因为受到系统占用而被中断开始事件的回调函数 */
  type OffAudioInterruptionBeginCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频中断结束事件的回调函数 */
  type OffAudioInterruptionEndCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 当前外围设备被连接或断开连接事件的回调函数 */
  type OffBLEPeripheralConnectionStateChangedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** iBeacon 服务状态变化事件的回调函数 */
  type OffBeaconServiceChangeCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** iBeacon 设备更新事件的回调函数 */
  type OffBeaconUpdateCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频进入可以播放状态的事件的回调函数 */
  type OffCanplayCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 已连接的设备请求读当前外围设备的特征值事件的回调函数 */
  type OffCharacteristicReadRequestCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 已连接的设备请求写当前外围设备的特征值事件的回调函数 */
  type OffCharacteristicWriteRequestCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OffCloseCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频自然播放至结束的事件的回调函数 */
  type OffEndedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OffErrorCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** HTTP Response Header 事件的回调函数 */
  type OffHeadersReceivedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 开始监听数据包消息的事件的回调函数 */
  type OffListeningCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OffLoadCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务停止搜索的事件的回调函数 */
  type OffLocalServiceDiscoveryStopCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务发现的事件的回调函数 */
  type OffLocalServiceFoundCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务离开的事件的回调函数 */
  type OffLocalServiceLostCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务解析失败的事件的回调函数 */
  type OffLocalServiceResolveFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 实时地理位置变化事件的回调函数 */
  type OffLocationChangeCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 收到消息的事件的回调函数 */
  type OffMessageCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 实时语音通话成员视频状态变化事件的回调函数 */
  type OffOnVoIPVideoMembersChangedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 小程序要打开的页面不存在事件的回调函数 */
  type OffPageNotFoundCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频暂停事件的回调函数 */
  type OffPauseCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频播放事件的回调函数 */
  type OffPlayCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OffProgressUpdateCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频完成跳转操作的事件的回调函数 */
  type OffSeekedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频进行跳转操作的事件的回调函数 */
  type OffSeekingCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频停止事件的回调函数 */
  type OffStopCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 系统主题改变事件的回调函数 */
  type OffThemeChangeCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频播放进度更新事件的回调函数 */
  type OffTimeUpdateCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 未处理的 Promise 拒绝事件的回调函数 */
  type OffUnhandledRejectionCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频加载中事件的回调函数 */
  type OffWaitingCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 窗口尺寸变化事件的回调函数 */
  type OffWindowResizeCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 加速度数据事件的回调函数 */
  type OnAccelerometerChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnAccelerometerChangeCallbackResult, 
    scala.Unit
  ]
  /** 小程序错误事件的回调函数 */
  type OnAppErrorCallback = js.Function1[/* error */ java.lang.String, scala.Unit]
  /** 小程序切后台事件的回调函数 */
  type OnAppHideCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 小程序切前台事件的回调函数 */
  type OnAppShowCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnAppShowCallbackResult, 
    scala.Unit
  ]
  /** 音频因为受到系统占用而被中断开始事件的回调函数 */
  type OnAudioInterruptionBeginCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音频中断结束事件的回调函数 */
  type OnAudioInterruptionEndCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 低功耗蓝牙设备的特征值变化事件的回调函数 */
  type OnBLECharacteristicValueChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBLECharacteristicValueChangeCallbackResult, 
    scala.Unit
  ]
  /** 低功耗蓝牙连接状态的改变事件的回调函数 */
  type OnBLEConnectionStateChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBLEConnectionStateChangeCallbackResult, 
    scala.Unit
  ]
  /** 当前外围设备被连接或断开连接事件的回调函数 */
  type OnBLEPeripheralConnectionStateChangedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBLEPeripheralConnectionStateChangedCallbackResult, 
    scala.Unit
  ]
  /** 音乐暂停事件的回调函数 */
  type OnBackgroundAudioPauseCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音乐播放事件的回调函数 */
  type OnBackgroundAudioPlayCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 音乐停止事件的回调函数 */
  type OnBackgroundAudioStopCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OnBackgroundFetchDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type OnBackgroundFetchDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type OnBackgroundFetchDataSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** iBeacon 服务状态变化事件的回调函数 */
  type OnBeaconServiceChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBeaconServiceChangeCallbackResult, 
    scala.Unit
  ]
  /** iBeacon 设备更新事件的回调函数 */
  type OnBeaconUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBeaconUpdateCallbackResult, 
    scala.Unit
  ]
  /** 蓝牙适配器状态变化事件的回调函数 */
  type OnBluetoothAdapterStateChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBluetoothAdapterStateChangeCallbackResult, 
    scala.Unit
  ]
  /** 寻找到新设备的事件的回调函数 */
  type OnBluetoothDeviceFoundCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBluetoothDeviceFoundCallbackResult, 
    scala.Unit
  ]
  /** 回调函数 */
  type OnCameraFrameCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCameraFrameCallbackResult, 
    scala.Unit
  ]
  type OnCanplayCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 已连接的设备请求读当前外围设备的特征值事件的回调函数 */
  type OnCharacteristicReadRequestCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicReadRequestCallbackResult, 
    scala.Unit
  ]
  /** 已连接的设备请求写当前外围设备的特征值事件的回调函数 */
  type OnCharacteristicWriteRequestCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicWriteRequestCallbackResult, 
    scala.Unit
  ]
  /** 向微信后台请求检查更新结果事件的回调函数 */
  type OnCheckForUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCheckForUpdateCallbackResult, 
    scala.Unit
  ]
  /** 罗盘数据变化事件的回调函数 */
  type OnCompassChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCompassChangeCallbackResult, 
    scala.Unit
  ]
  /** 设备方向变化事件的回调函数 */
  type OnDeviceMotionChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnDeviceMotionChangeCallbackResult, 
    scala.Unit
  ]
  type OnEndedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 已录制完指定帧大小的文件事件的回调函数 */
  type OnFrameRecordedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnFrameRecordedCallbackResult, 
    scala.Unit
  ]
  /** 获取到 Wi-Fi 列表数据事件的回调函数 */
  type OnGetWifiListCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnGetWifiListCallbackResult, 
    scala.Unit
  ]
  /** 陀螺仪数据变化事件的回调函数 */
  type OnGyroscopeChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnGyroscopeChangeCallbackResult, 
    scala.Unit
  ]
  /** 接收 NFC 设备消息事件的回调函数 */
  type OnHCEMessageCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnHCEMessageCallbackResult, 
    scala.Unit
  ]
  /** HTTP Response Header 事件的回调函数 */
  type OnHeadersReceivedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnHeadersReceivedCallbackResult, 
    scala.Unit
  ]
  /** 录音因为受到系统占用而被中断开始事件的回调函数 */
  type OnInterruptionBeginCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 录音中断结束事件的回调函数 */
  type OnInterruptionEndCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OnKeyboardHeightChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnKeyboardHeightChangeCallbackResult, 
    scala.Unit
  ]
  /** 开始监听数据包消息的事件的回调函数 */
  type OnListeningCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OnLoadCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务停止搜索的事件的回调函数 */
  type OnLocalServiceDiscoveryStopCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务发现的事件的回调函数 */
  type OnLocalServiceFoundCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocalServiceFoundCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务离开的事件的回调函数 */
  type OnLocalServiceLostCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocalServiceLostCallbackResult, 
    scala.Unit
  ]
  /** mDNS 服务解析失败的事件的回调函数 */
  type OnLocalServiceResolveFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocalServiceLostCallbackResult, 
    scala.Unit
  ]
  /** 实时地理位置变化事件的回调函数 */
  type OnLocationChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocationChangeCallbackResult, 
    scala.Unit
  ]
  /** 内存不足告警事件的回调函数 */
  type OnMemoryWarningCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnMemoryWarningCallbackResult, 
    scala.Unit
  ]
  /** 网络状态变化事件的回调函数 */
  type OnNetworkStatusChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnNetworkStatusChangeCallbackResult, 
    scala.Unit
  ]
  /** 用户在系统音乐播放面板点击下一曲事件的回调函数 */
  type OnNextCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 实时语音通话成员视频状态变化事件的回调函数 */
  type OnOnVoIPVideoMembersChangedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnOnVoIPVideoMembersChangedCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 连接打开事件的回调函数 */
  type OnOpenCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnOpenCallbackResult, 
    scala.Unit
  ]
  /** 小程序要打开的页面不存在事件的回调函数 */
  type OnPageNotFoundCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnPageNotFoundCallbackResult, 
    scala.Unit
  ]
  type OnPauseCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OnPlayCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 用户在系统音乐播放面板点击上一曲事件的回调函数 */
  type OnPrevCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 录音继续事件的回调函数 */
  type OnResumeCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OnSeekedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type OnSeekingCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 连接关闭事件的回调函数 */
  type OnSocketCloseCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SocketTaskOnCloseCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 错误事件的回调函数 */
  type OnSocketErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UDPSocketOnErrorCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 接受到服务器的消息事件的回调函数 */
  type OnSocketMessageCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SocketTaskOnMessageCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 连接打开事件的回调函数 */
  type OnSocketOpenCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnSocketOpenCallbackResult, 
    scala.Unit
  ]
  /** 录音开始事件的回调函数 */
  type OnStartCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 系统主题改变事件的回调函数 */
  type OnThemeChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult, 
    scala.Unit
  ]
  type OnTimeUpdateCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 未处理的 Promise 拒绝事件的回调函数 */
  type OnUnhandledRejectionCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult, 
    scala.Unit
  ]
  /** 小程序更新失败事件的回调函数 */
  type OnUpdateFailedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 小程序有版本更新事件的回调函数 */
  type OnUpdateReadyCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 用户主动截屏事件的回调函数 */
  type OnUserCaptureScreenCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 被动断开实时语音通话事件的回调函数 */
  type OnVoIPChatInterruptedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnVoIPChatInterruptedCallbackResult, 
    scala.Unit
  ]
  /** 实时语音通话成员在线状态变化事件的回调函数 */
  type OnVoIPChatMembersChangedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnVoIPChatMembersChangedCallbackResult, 
    scala.Unit
  ]
  /** 实时语音通话成员通话状态变化事件的回调函数 */
  type OnVoIPChatSpeakersChangedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnVoIPChatSpeakersChangedCallbackResult, 
    scala.Unit
  ]
  /** 音频加载中事件的回调函数 */
  type OnWaitingCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 连接上 Wi-Fi 的事件的回调函数 */
  type OnWifiConnectedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnWifiConnectedCallbackResult, 
    scala.Unit
  ]
  /** 窗口尺寸变化事件的回调函数 */
  type OnWindowResizeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnWindowResizeCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenBluetoothAdapterCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type OpenBluetoothAdapterFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type OpenBluetoothAdapterSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenCardCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type OpenCardFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type OpenCardSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenDocumentCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type OpenDocumentFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type OpenDocumentSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenLocationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type OpenLocationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type OpenLocationSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenSettingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type OpenSettingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type OpenSettingSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OpenSettingSuccessCallbackResult, 
    scala.Unit
  ]
  type Optional[F] = F | (js.Function1[/* arg */ js.UndefOr[js.Any], js.Any])
  type OptionalInterface[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: wechat-miniprogram.WechatMiniprogram.Optional<T[K]>}
    */ typings.wechatMiniprogram.wechatMiniprogramStrings.OptionalInterface with org.scalablytyped.runtime.TopLevel[T]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PageScrollToCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PageScrollToFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PageScrollToSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseBGMCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PauseBGMFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PauseBGMSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseBackgroundAudioCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PauseBackgroundAudioFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PauseBackgroundAudioSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PauseFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PauseSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PauseVoiceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PauseVoiceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PauseVoiceSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayBGMCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PlayBGMFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PlayBGMSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayBackgroundAudioCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PlayBackgroundAudioFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PlayBackgroundAudioSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PlayFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PlaySuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PlayVoiceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PlayVoiceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PlayVoiceSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PreviewImageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type PreviewImageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type PreviewImageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type PromisifySuccessResult[P, T /* <: typings.wechatMiniprogram.WechatMiniprogram.AsyncMethodOptionLike */] = (js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Exclude<T['success'], undefined>>[0] */ js.Any
  ]) | scala.Unit
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReLaunchCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ReLaunchFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ReLaunchSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReadBLECharacteristicValueCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type ReadBLECharacteristicValueFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type ReadBLECharacteristicValueSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReadFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ReadFileFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ReadFileFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ReadFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ReadFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ReaddirCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ReaddirFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ReaddirFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ReaddirSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ReaddirSuccessCallbackResult, 
    scala.Unit
  ]
  /** 录音结束事件的回调函数 */
  type RecorderManagerOnStopCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnStopCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RedirectToCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RedirectToFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RedirectToSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RedoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RedoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RedoSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveFormatCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RemoveFormatFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RemoveFormatSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveSavedFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RemoveSavedFileSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveServiceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RemoveServiceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RemoveServiceSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveStorageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RemoveStorageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RemoveStorageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RemoveTabBarBadgeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RemoveTabBarBadgeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RemoveTabBarBadgeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RenameCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RenameFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RenameFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RenameSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RequestFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestFullScreenCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RequestFullScreenFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RequestFullScreenSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestPaymentCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RequestPaymentFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RequestPaymentSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RequestSubscribeMessageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RequestSubscribeMessageFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RequestSubscribeMessageFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RequestSubscribeMessageSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RequestSubscribeMessageSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RequestSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RequestSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ResumeBGMCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ResumeBGMFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ResumeBGMSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ResumeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ResumeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ResumeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 用户点击 `关闭广告` 按钮的事件的回调函数 */
  type RewardedVideoAdOnCloseCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RewardedVideoAdOnCloseCallbackResult, 
    scala.Unit
  ]
  /** 激励视频错误事件的回调函数 */
  type RewardedVideoAdOnErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RewardedVideoAdOnErrorCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type RmdirCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type RmdirFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RmdirFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type RmdirSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SaveFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SaveFileToDiskCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SaveFileToDiskFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SaveFileToDiskSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SaveImageToPhotosAlbumCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SaveImageToPhotosAlbumFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SaveImageToPhotosAlbumSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SaveVideoToPhotosAlbumCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SaveVideoToPhotosAlbumFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SaveVideoToPhotosAlbumSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ScanCodeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ScanCodeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ScanCodeSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ScanCodeSuccessCallbackResult, 
    scala.Unit
  ]
  /** 回调函数，在执行 `SelectorQuery.exec` 方法后，节点信息会在 `callback` 中返回。 */
  type ScrollOffsetCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ScrollOffsetCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SeekBackgroundAudioCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SeekBackgroundAudioFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SeekBackgroundAudioSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SendCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SendFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SendHCEMessageCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SendHCEMessageFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SendHCEMessageSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SendSocketMessageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SendSocketMessageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SendSocketMessageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SendSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBGMVolumeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetBGMVolumeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetBGMVolumeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBLEMTUCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetBLEMTUFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetBLEMTUSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBackgroundColorCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetBackgroundColorFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetBackgroundColorSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBackgroundFetchTokenCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetBackgroundFetchTokenFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetBackgroundFetchTokenSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetBackgroundTextStyleCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetBackgroundTextStyleFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetBackgroundTextStyleSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetCenterOffsetCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetCenterOffsetFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetCenterOffsetSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetClipboardDataCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetClipboardDataFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetClipboardDataSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetContentsCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetContentsFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetContentsSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetEnableDebugCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetEnableDebugFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetEnableDebugSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetInnerAudioOptionCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetInnerAudioOptionFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetInnerAudioOptionSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetKeepScreenOnCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetKeepScreenOnFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetKeepScreenOnSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetMICVolumeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetMICVolumeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetMICVolumeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetNavigationBarColorCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetNavigationBarColorFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetNavigationBarColorSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetNavigationBarTitleCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetNavigationBarTitleFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetNavigationBarTitleSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetScreenBrightnessCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetScreenBrightnessFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetScreenBrightnessSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetStorageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetStorageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetStorageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTabBarBadgeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetTabBarBadgeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetTabBarBadgeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTabBarItemCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetTabBarItemFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetTabBarItemSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTabBarStyleCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetTabBarStyleFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetTabBarStyleSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTimeoutCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetTimeoutFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetTimeoutSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetTopBarTextCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetTopBarTextFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetTopBarTextSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetWifiListCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type SetWifiListFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type SetWifiListSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetWindowSizeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetWindowSizeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetWindowSizeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SetZoomCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SetZoomFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SetZoomSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SetZoomSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowActionSheetCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowActionSheetFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowActionSheetSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ShowActionSheetSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowLoadingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowLoadingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowLoadingSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowModalCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowModalFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowModalSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.ShowModalSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowNavigationBarLoadingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowNavigationBarLoadingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowNavigationBarLoadingSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowRedPackageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowRedPackageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowRedPackageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowShareMenuCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowShareMenuFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowShareMenuSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowTabBarCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowTabBarFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowTabBarRedDotCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowTabBarRedDotFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowTabBarRedDotSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowTabBarSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ShowToastCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ShowToastFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ShowToastSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 连接关闭事件的回调函数 */
  type SocketTaskOnCloseCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SocketTaskOnCloseCallbackResult, 
    scala.Unit
  ]
  /** WebSocket 接受到服务器的消息事件的回调函数 */
  type SocketTaskOnMessageCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SocketTaskOnMessageCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartAccelerometerCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartAccelerometerFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartAccelerometerSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartBeaconDiscoveryCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartBeaconDiscoveryFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartBeaconDiscoverySuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartBluetoothDevicesDiscoveryCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartBluetoothDevicesDiscoveryFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartBluetoothDevicesDiscoverySuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartCompassCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartCompassFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartCompassSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartDeviceMotionListeningCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartDeviceMotionListeningFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartDeviceMotionListeningSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartDiscoveryCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartDiscoveryFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartDiscoverySuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartGyroscopeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartGyroscopeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartGyroscopeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartHCECompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartHCEFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartHCESuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartLocalServiceDiscoveryCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartLocalServiceDiscoveryFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StartLocalServiceDiscoveryFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartLocalServiceDiscoverySuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartLocationUpdateBackgroundCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartLocationUpdateBackgroundFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartLocationUpdateBackgroundSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartLocationUpdateCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartLocationUpdateFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartLocationUpdateSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartPreviewCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartPreviewFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartPreviewSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartPullDownRefreshCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartPullDownRefreshFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartPullDownRefreshSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartRecordCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartRecordFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 超过30s或页面 `onHide` 时会结束录像 */
  type StartRecordTimeoutCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StartRecordTimeoutCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartSoterAuthenticationCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StartSoterAuthenticationFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartSoterAuthenticationSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StartSoterAuthenticationSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StartSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StartWifiCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StartWifiFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StartWifiSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StatCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StatFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StatFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StatSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StatSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopAccelerometerCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopAccelerometerFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopAccelerometerSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopAdvertisingCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopAdvertisingFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopAdvertisingSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBGMCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopBGMFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopBGMSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBackgroundAudioCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopBackgroundAudioFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopBackgroundAudioSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBeaconDiscoveryCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopBeaconDiscoveryFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopBeaconDiscoverySuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.IBeaconError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopBluetoothDevicesDiscoveryCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopBluetoothDevicesDiscoveryFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopBluetoothDevicesDiscoverySuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopCompassCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopCompassFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopCompassSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopDeviceMotionListeningCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopDeviceMotionListeningFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopDeviceMotionListeningSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopDiscoveryCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopDiscoveryFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopDiscoverySuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopGyroscopeCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopGyroscopeFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopGyroscopeSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopHCECompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopHCEFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopHCESuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.NFCError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopLocalServiceDiscoveryCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopLocalServiceDiscoveryFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StopLocalServiceDiscoveryFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopLocalServiceDiscoverySuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopLocationUpdateCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopLocationUpdateFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopLocationUpdateSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopPreviewCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopPreviewFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopPreviewSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopPullDownRefreshCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopPullDownRefreshFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopPullDownRefreshSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopRecordCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopRecordFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopVoiceCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type StopVoiceFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type StopVoiceSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type StopWifiCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type StopWifiFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type StopWifiSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.WifiError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SubscribeVoIPVideoMembersCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SubscribeVoIPVideoMembersFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SubscribeVoIPVideoMembersSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SwitchCameraCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SwitchCameraFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SwitchCameraSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type SwitchTabCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type SwitchTabFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type SwitchTabSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type TakePhotoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type TakePhotoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type TakePhotoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.TakePhotoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type ToggleTorchCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type ToggleTorchFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type ToggleTorchSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type TransceiveCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type TransceiveFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type TransceiveSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.TransceiveSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type TranslateMarkerCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type TranslateMarkerFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type TranslateMarkerSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type UDPSocketOnCloseCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  type UDPSocketOnErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UDPSocketOnErrorCallbackResult, 
    scala.Unit
  ]
  /** 收到消息的事件的回调函数 */
  type UDPSocketOnMessageCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UDPSocketOnMessageCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UndoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type UndoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type UndoSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UnlinkCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type UnlinkFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UnlinkFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type UnlinkSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UnzipCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type UnzipFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UnzipFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type UnzipSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UpdateShareMenuCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type UpdateShareMenuFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type UpdateShareMenuSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UpdateVoIPChatMuteConfigCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type UpdateVoIPChatMuteConfigFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type UpdateVoIPChatMuteConfigSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type UploadFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type UploadFileFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type UploadFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UploadFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 上传进度变化事件的回调函数 */
  type UploadTaskOnProgressUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UploadTaskOnProgressUpdateCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type VibrateLongCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type VibrateLongFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type VibrateLongSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type VibrateShortCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type VibrateShortFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type VibrateShortSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 主线程/Worker 线程向当前线程发送的消息的事件的回调函数 */
  type WorkerOnMessageCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.WorkerOnMessageCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WriteBLECharacteristicValueCompleteCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用失败的回调函数 */
  type WriteBLECharacteristicValueFailCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用成功的回调函数 */
  type WriteBLECharacteristicValueSuccessCallback = js.Function1[/* res */ typings.wechatMiniprogram.WechatMiniprogram.BluetoothError, scala.Unit]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WriteFileCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type WriteFileFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.WriteFileFailCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WriteFileSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type WriteNdefMessageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type WriteNdefMessageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WriteNdefMessageSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type WxGetFileInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WxGetFileInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.WxGetFileInfoSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WxGetSavedFileListSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.WxGetSavedFileListSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type WxRemoveSavedFileFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用失败的回调函数 */
  type WxSaveFileFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WxSaveFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.WxSaveFileSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WxStartRecordSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.StartRecordSuccessCallbackResult, 
    scala.Unit
  ]
  /** 接口调用成功的回调函数 */
  type WxStopRecordSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
}
