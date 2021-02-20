package typings.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * 广告关闭的回调
    *
    * 最低基础库: 2.6.5
    */
  type AdClose = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 广告加载失败的回调，event.detail = {errCode: 1002}
    *
    * `tip`: 监听到error回调后，开发者可以针对性的处理，比如隐藏广告组件的父容器，以保证用户体验，但不要移除广告组件，否则将无法收到bindload的回调。
    *
    * 最低基础库: 2.2.1
    */
  type AdError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.ErrCodeNumber, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 广告加载成功的回调
    *
    * 最低基础库: 2.2.1
    */
  type AdLoad = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
  type AddMarkersCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type AddMarkersFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type AddMarkersSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
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
  
  /** 当播放到末尾时触发 ended 事件 */
  type AudioEnded = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 当发生错误时触发 error 事件
    *
    * detail = {errMsg:MediaError.code}
    */
  type AudioError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.ErrMsg, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 当暂停播放时触发 pause 事件 */
  type AudioPause = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 当开始/继续播放时触发play事件 */
  type AudioPlay = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 当播放进度改变时触发 timeupdate 事件
    *
    * detail = {currentTime, duration}
    */
  type AudioTimeUpdate = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.CurrentTime, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type AuthPrivateMessageCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type AuthPrivateMessageFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type AuthPrivateMessageSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.AuthPrivateMessageSuccessCallbackResult, 
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
  
  /**
    * 客服消息回调，`open-type="contact"` 时有效
    *
    * 最低基础库: 1.5.0
    */
  type ButtonContact = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 当使用开放能力时，发生错误的回调，`open-type=launchApp` 时有效
    *
    * 最低基础库: 1.9.5
    */
  type ButtonError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 获取用户手机号回调，`open-type=getPhoneNumber` 时有效
    *
    * 最低基础库: 1.2.0
    */
  type ButtonGetPhoneNumber = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.GeneralCallbackResultPart, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 用户点击该按钮时，会返回获取到的用户信息，回调的 detail 数据与 `wx. getUserInfo` 返回的一致，`open-type="getUserInfo"` 时有效
    *
    * 最低基础库: 1.3.0
    */
  type ButtonGetUserInfo = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult with typings.wechatMiniprogram.WechatMiniprogram.GetUserInfoSuccessCallbackResult, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 打开 APP 成功的回调，`open-type=launchApp` 时有效
    *
    * 最低基础库: 2.4.4
    */
  type ButtonLaunchApp = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 在打开授权设置页后回调，`open-type=openSetting` 时有效
    *
    * 最低基础库: 2.0.7
    */
  type ButtonOpenSetting = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult with typings.wechatMiniprogram.WechatMiniprogram.OpenSettingSuccessCallbackResult, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 点击 label 时触发
    *
    * e.detail = {markerId}
    *
    * 最低基础库: 1.2.0
    */
  type CalloutTap = typings.wechatMiniprogram.WechatMiniprogram.MarkerTap
  
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
  
  /** 用户不允许使用摄像头时触发 */
  type CameraError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 相机初始化完成时触发
    *
    * 最低基础库: 2.7.0
    */
  type CameraInitDone = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 在扫码识别成功时触发，仅在 mode="scanCode" 时生效
    *
    * 最低基础库: 2.1.0
    */
  type CameraScanCode = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 摄像头在非正常终止时触发，如退出后台等情况 */
  type CameraStop = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
  type CheckIsOpenAccessibilityCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type CheckIsOpenAccessibilityFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type CheckIsOpenAccessibilitySuccessCallback = js.Function1[
    /* option */ typings.wechatMiniprogram.WechatMiniprogram.CheckIsOpenAccessibilitySuccessCallbackOption, 
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
  
  /**
    * checkbox-group 中选中项发生改变时触发 change 事件
    *
    * detail = { value: ['选中的checkbox 的 value 的数组'] }
    */
  type CheckboxGroupChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Value, Mark, TargetDataset, TargetDataset]
  
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
  
  /**
    * 点击控件时触发
    *
    * e.detail = {controlId}
    */
  type ControlTap = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.ControlId, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
  
  /**
    * 图片加载失败时触发
    *
    * 最低基础库: 2.1.0
    */
  type CoverImageError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 图片加载成功时触发
    *
    * 最低基础库: 2.1.0
    */
  type CoverImageLoad[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Height, Mark, TargetDataset, TargetDataset]
  
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
  type DisableAlertBeforeUnloadCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type DisableAlertBeforeUnloadFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type DisableAlertBeforeUnloadSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
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
  type DownloadTaskOffProgressUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.DownloadTaskOnProgressUpdateCallbackResult, 
    scala.Unit
  ]
  
  /** 下载进度变化事件的回调函数 */
  type DownloadTaskOnProgressUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.DownloadTaskOnProgressUpdateCallbackResult, 
    scala.Unit
  ]
  
  /**
    * 编辑器失去焦点时触发
    *
    * detail = {html, text, delta}
    *
    * 最低基础库: 2.7.0
    */
  type EditorBlur[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.EditorFocus[Mark, TargetDataset]
  
  /**
    * 编辑器聚焦时触发
    *
    * event.detail = {html, text, delta}
    *
    * 最低基础库: 2.7.0
    */
  type EditorFocus[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Delta, Mark, TargetDataset, TargetDataset]
  
  /**
    * 编辑器内容改变时触发
    *
    * detail = {html, text, delta}
    *
    * 最低基础库: 2.7.0
    */
  type EditorInput[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.EditorFocus[Mark, TargetDataset]
  
  /**
    * 编辑器初始化完成时触发
    *
    * 最低基础库: 2.7.0
    */
  type EditorReady[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  /**
    * 通过 Context 方法改变编辑器内样式时触发，返回选区已设置的样式
    *
    * 最低基础库: 2.7.0
    */
  type EditorStatusChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Partialalignleftcenterrig, 
    Mark, 
    TargetDataset, 
    TargetDataset
  ]
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type EnableAlertBeforeUnloadCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type EnableAlertBeforeUnloadFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type EnableAlertBeforeUnloadSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
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
  
  /** 表单重置时会触发 reset 事件 */
  type FormReset[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Target, Mark, TargetDataset, TargetDataset]
  
  /**
    * 携带 form 中的数据触发 submit 事件
    *
    * event.detail = {value : {'name': 'value'} , formId: ''}
    */
  type FormSubmit[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.FormId, Mark, TargetDataset, TargetDataset]
  
  /**
    * 功能页返回，且操作失败时触发， detail 格式与具体功能页相关
    *
    * 最低基础库: 2.1.0
    */
  type FunctionalNavigatorFail[Detail /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[Detail, scala.Nothing, scala.Nothing, scala.Nothing]
  
  /**
    * 功能页返回，且操作成功时触发， detail 格式与具体功能页相关
    *
    * 最低基础库: 2.1.0
    */
  type FunctionalNavigatorSuccess[Detail /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[Detail, scala.Nothing, scala.Nothing, scala.Nothing]
  
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
  type GetGroupEnterInfoCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type GetGroupEnterInfoFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type GetGroupEnterInfoSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetGroupEnterInfoSuccessCallbackResult, 
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
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.GetGroupEnterInfoSuccessCallbackResult, 
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
  
  /** 当错误发生时触发，event.detail = {errMsg} */
  type ImageError = typings.wechatMiniprogram.WechatMiniprogram.CoverImageError
  
  /** 当图片载入完毕时触发，event.detail = {height, width} */
  type ImageLoad = typings.wechatMiniprogram.WechatMiniprogram.CoverImageLoad[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
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
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type InitMarkerClusterCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type InitMarkerClusterFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type InitMarkerClusterSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 音频播放错误事件的回调函数 */
  type InnerAudioContextOffErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.InnerAudioContextOnErrorCallbackResult, 
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
  
  /** 键盘输入时触发
    *
    * event.detail = {value, cursor, keyCode}
    *
    * 处理函数可以直接 return 一个字符串，将替换输入框的内容。
    */
  type Input[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Cursor, Mark, TargetDataset, TargetDataset]
  
  /**
    * 输入框失去焦点时触发
    *
    * event.detail = {value: value}
    */
  type InputBlur[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ValueString, Mark, TargetDataset, TargetDataset]
  
  /**
    * 点击完成按钮时触发
    *
    * event.detail = {value: value}
    */
  type InputConfirm[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ValueString, Mark, TargetDataset, TargetDataset]
  
  /**
    * 输入框聚焦时触发
    *
    * event.detail = { value, height }
    */
  type InputFocus[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.HeightValue, Mark, TargetDataset, TargetDataset]
  
  /**
    * 键盘高度发生变化的时候触发此事件
    *
    * event.detail = {height: height, duration: duration}
    *
    * **tip**: 键盘高度发生变化，keyboardheightchange 事件可能会多次触发，开发者对于相同的 height 值应该忽略掉
    *
    * 最低基础库: `2.7.0`
    */
  type InputKeyboardHeightChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Duration, Mark, TargetDataset, TargetDataset]
  
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
  type InterstitialAdOffErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.InterstitialAdOnErrorCallbackResult, 
    scala.Unit
  ]
  
  /** 插屏错误事件的回调函数 */
  type InterstitialAdOnErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.InterstitialAdOnErrorCallbackResult, 
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
  
  /**
    * 点击 label 时触发
    *
    * e.detail = {markerId}
    *
    * 最低基础库: 2.9.0
    */
  type LabelTap = typings.wechatMiniprogram.WechatMiniprogram.MarkerTap
  
  /**
    * 全屏变化事件，detail = {direction, fullScreen}
    *
    * 最低基础库 1.7.0
    */
  type LivePlayerFullScreenChange = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.FullScreen, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 网络状态通知，detail = {info}
    *
    * 最低基础库 1.9.0
    */
  type LivePlayerNetStatus = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Info, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 播放状态变化事件，detail = {code}
    *
    * 最低基础库 1.7.0
    */
  type LivePlayerStateChange = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.CodeNumber, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 背景音播放完成时触发
    *
    * 最低基础库: 2.4.0
    */
  type LivePusherBgmComplete = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 背景音进度变化时触发，detail = {progress, duration}
    *
    * 最低基础库: 2.4.0
    */
  type LivePusherBgmProgress = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Progress, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 背景音开始播放时触发
    *
    * 最低基础库: 2.4.0
    */
  type LivePusherBgmStart = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 渲染错误事件，detail = {errMsg, errCode}
    *
    * `tip`: 开发者工具上暂不支持 live-pusher
    *
    * 最低基础库: 1.7.4
    */
  type LivePusherError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.ErrCode, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 网络状态通知，detail = {info}
    *
    * 最低基础库: 1.9.0
    */
  type LivePusherNetStatus = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Info, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 状态变化事件，detail = {code}
    *
    * 最低基础库: 1.7.0
    */
  type LivePusherStateChange = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.CodeNumber, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
  type MakeBluetoothPairCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type MakeBluetoothPairFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type MakeBluetoothPairSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
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
  
  /**
    * 点击地图时触发
    *
    * 2.9.0 起返回经纬度信息
    */
  type MapTap = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Latitude, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 在地图渲染更新完成时触发
    *
    * 最低基础库: 1.6.0
    */
  type MapUpdated = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 点击标记点时触发
    *
    * e.detail = {markerId}
    */
  type MarkerTap = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.MarkerId, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
  
  /**
    * 拖动过程中触发的事件，event.detail = {x, y, source}
    *
    * 最低基础库: 1.9.90
    */
  type MovableViewChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Source, Mark, TargetDataset, TargetDataset]
  
  /**
    * 缩放过程中触发的事件
    *
    * event.detail = {x, y, scale}
    *
    * x 和 y 字段在 2.1.0 之后支持
    *
    * 最低基础库: 1.9.90
    */
  type MovableViewScale[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Scale, Mark, TargetDataset, TargetDataset]
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type MoveAlongCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type MoveAlongFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type MoveAlongSuccessCallback = js.Function1[
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
  
  /**
    * 当 `target="miniProgram"` 时有效，跳转小程序完成
    *
    * 最低基础库: 2.0.7
    */
  type NavigatorComplete = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 当 `target="miniProgram"` 时有效，跳转小程序失败
    *
    * `tips`: 需要用户确认跳转 从 2.3.0 版本开始，在跳转至其他小程序前，将统一增加弹窗，询问是否跳转，用户确认后才可以跳转其他小程序。如果用户点击取消，则回调 fail cancel。
    *
    * 最低基础库: 2.0.7
    */
  type NavigatorFail = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 当 `target="miniProgram"` 时有效，跳转小程序成功
    *
    * 最低基础库: 2.0.7
    */
  type NavigatorSuccess = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnAppShowCallbackResult, 
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
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBLEPeripheralConnectionStateChangedCallbackResult, 
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
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicReadRequestCallbackResult, 
    scala.Unit
  ]
  
  /** 特征值订阅事件的回调函数 */
  type OffCharacteristicSubscribedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicSubscribedCallbackResult, 
    scala.Unit
  ]
  
  /** 取消特征值订阅事件的回调函数 */
  type OffCharacteristicUnsubscribedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicSubscribedCallbackResult, 
    scala.Unit
  ]
  
  /** 已连接的设备请求写当前外围设备的特征值事件的回调函数 */
  type OffCharacteristicWriteRequestCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicWriteRequestCallbackResult, 
    scala.Unit
  ]
  
  /** 的回调函数 */
  type OffDiscoveredCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnDiscoveredCallbackResult, 
    scala.Unit
  ]
  
  /** 音频自然播放至结束的事件的回调函数 */
  type OffEndedCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** HTTP Response Header 事件的回调函数 */
  type OffHeadersReceivedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnHeadersReceivedCallbackResult, 
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
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocalServiceFoundCallbackResult, 
    scala.Unit
  ]
  
  /** mDNS 服务离开的事件的回调函数 */
  type OffLocalServiceLostCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocalServiceLostCallbackResult, 
    scala.Unit
  ]
  
  /** mDNS 服务解析失败的事件的回调函数 */
  type OffLocalServiceResolveFailCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocalServiceLostCallbackResult, 
    scala.Unit
  ]
  
  /** 实时地理位置变化事件的回调函数 */
  type OffLocationChangeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnLocationChangeCallbackResult, 
    scala.Unit
  ]
  
  /** 收到消息的事件的回调函数 */
  type OffMessageCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UDPSocketOnMessageCallbackResult, 
    scala.Unit
  ]
  
  /** 小程序要打开的页面不存在事件的回调函数 */
  type OffPageNotFoundCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnPageNotFoundCallbackResult, 
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
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult, 
    scala.Unit
  ]
  
  /** 音频播放进度更新事件的回调函数 */
  type OffTimeUpdateCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 未处理的 Promise 拒绝事件的回调函数 */
  type OffUnhandledRejectionCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult, 
    scala.Unit
  ]
  
  /** 实时语音通话成员视频状态变化事件的回调函数 */
  type OffVoIPVideoMembersChangedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnVoIPVideoMembersChangedCallbackResult, 
    scala.Unit
  ]
  
  /** 音频加载中事件的回调函数 */
  type OffWaitingCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 窗口尺寸变化事件的回调函数 */
  type OffWindowResizeCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnWindowResizeCallbackResult, 
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
  
  /** 的回调函数 */
  type OnBackgroundFetchDataCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnBackgroundFetchDataCallbackResult, 
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
  
  /** 特征值订阅事件的回调函数 */
  type OnCharacteristicSubscribedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicSubscribedCallbackResult, 
    scala.Unit
  ]
  
  /** 取消特征值订阅事件的回调函数 */
  type OnCharacteristicUnsubscribedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnCharacteristicSubscribedCallbackResult, 
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
  
  /** 的回调函数 */
  type OnDiscoveredCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnDiscoveredCallbackResult, 
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
  
  /** 实时语音通话成员视频状态变化事件的回调函数 */
  type OnVoIPVideoMembersChangedCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OnVoIPVideoMembersChangedCallbackResult, 
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
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type OpenVideoEditorCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type OpenVideoEditorFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type OpenVideoEditorSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.OpenVideoEditorSuccessCallbackResult, 
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
  
  /**
    * 取消选择时触发
    *
    * 最低基础库: 1.9.90
    */
  type PickerCancel[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  /**
    * value 改变时触发 change 事件
    *
    * event.detail = {value}
    *
    * 当 mode = region 时 (最低基础库: 1.4.0)
    *
    * value 改变时触发 change 事件，event.detail = {value, code, postcode}，其中字段 code 是统计用区划代码，postcode 是邮政编码
    */
  type PickerChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Code, Mark, TargetDataset, TargetDataset]
  
  /** 列改变时触发 当 `mode = multiSelector` 时有效 */
  type PickerColumnChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Column, Mark, TargetDataset, TargetDataset]
  
  /**
    * 滚动选择时触发 change 事件
    *
    * event.detail = {value}
    */
  type PickerViewChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ValueArray, Mark, TargetDataset, TargetDataset]
  
  /**
    * 当滚动选择结束时候触发事件
    *
    * 最低基础库: 2.3.1
    */
  type PickerViewPickEnd[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  /**
    * 当滚动选择开始时候触发事件
    *
    * 最低基础库: 2.3.1
    */
  type PickerViewPickStart[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
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
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  type PreviewMediaCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type PreviewMediaFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type PreviewMediaSuccessCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /**
    * progress 动画完成事件
    *
    * 最低基础库 2.4.1
    */
  type ProgressActiveEnd[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.CurPercent, Mark, TargetDataset, TargetDataset]
  
  type PromisifySuccessResult[P, T /* <: typings.wechatMiniprogram.WechatMiniprogram.AsyncMethodOptionLike */] = (js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Exclude<T['success'], undefined>>[0] */ js.Any
  ]) | scala.Unit
  
  /** radio-group 切换事件 */
  type RadioGroupChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ValueString, Mark, TargetDataset, TargetDataset]
  
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
  
  /**
    * 在地图渲染更新完成时触发
    *
    * 最低基础库: 1.6.0
    */
  type RegionChange = (typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Rotate, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]) with (typings.wechatMiniprogram.anon.CausedBy | typings.wechatMiniprogram.anon.Type)
  
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
  type RemoveMarkersCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type RemoveMarkersFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type RemoveMarkersSuccessCallback = js.Function1[
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
  type RewardedVideoAdOffCloseCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RewardedVideoAdOnCloseCallbackResult, 
    scala.Unit
  ]
  
  /** 激励视频错误事件的回调函数 */
  type RewardedVideoAdOffErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.RewardedVideoAdOnErrorCallbackResult, 
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
  
  /** 接口调用成功的回调函数 */
  type SaveFileSuccessCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.SaveFileSuccessCallbackResult, 
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
  
  /**
    * 滑动结束事件 (同时开启 enhanced 属性后生效)
    *
    * detail { scrollTop, scrollLeft }
    *
    * 最低基础库: 2.12.0
    */
  type ScrollViewDragEnd[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ScrollLeft, Mark, TargetDataset, TargetDataset]
  
  /**
    * 滑动开始事件 (同时开启 enhanced 属性后生效)
    *
    * detail { scrollTop, scrollLeft }
    *
    * 最低基础库: 2.12.0
    */
  type ScrollViewDragStart[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ScrollLeft, Mark, TargetDataset, TargetDataset]
  
  /**
    * 滑动事件 (同时开启 enhanced 属性后生效)
    *
    * detail { scrollTop, scrollLeft }
    *
    * 最低基础库: 2.12.0
    */
  type ScrollViewDragging[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ScrollLeft, Mark, TargetDataset, TargetDataset]
  
  type ScrollViewRefresherAbort[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  type ScrollViewRefresherPulling[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  type ScrollViewRefresherRefresh[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  type ScrollViewRefresherRestore[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[scala.Nothing, Mark, TargetDataset, TargetDataset]
  
  /**
    * 滚动时触发
    *
    * event.detail = {scrollLeft, scrollTop, scrollHeight, scrollWidth, deltaX, deltaY}
    */
  type ScrollViewScroll[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.DeltaX, Mark, TargetDataset, TargetDataset]
  
  /** 滚动到底部/右边时触发 */
  type ScrollViewScrollToLower[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.`0`, Mark, TargetDataset, TargetDataset]
  
  /** 滚动到顶部/左边时触发 */
  type ScrollViewScrollToUpper[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Direction, Mark, TargetDataset, TargetDataset]
  
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
  
  /**
    * 完成一次拖动后触发的事件
    *
    * event.detail = {value}
    */
  type SliderChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ValueNumber, Mark, TargetDataset, TargetDataset]
  
  /**
    * 拖动过程中触发的事件
    *
    * event.detail = {value}
    *
    * 最低基础库: 1.7.0
    */
  type SliderChanging[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.SliderChange[Mark, TargetDataset]
  
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
  
  /**
    * 动画结束时会触发 animationfinish 事件
    *
    * 最低基础库: 1.9.0
    */
  type SwiperAnimationFinish[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.SwiperChange[Mark, TargetDataset]
  
  /**
    * current 改变时会触发 change 事件
    *
    * event.detail = {current, source}
    *
    * **Tip**: 如果在 bindchange 的事件回调函数中使用 setData 改变 current 值，则有可能导致 setData 被不停地调用，因而通常情况下请在改变 current 值前检测 source 字段来判断是否是由于用户触摸引起。
    */
  type SwiperChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Current, Mark, TargetDataset, TargetDataset]
  
  /**
    * swiper-item 的位置发生改变时会触发 transition 事件
    *
    * event.detail = {dx: dx, dy: dy}
    *
    * 最低基础库: 2.4.3
    */
  type SwiperTransition[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.Dx, Mark, TargetDataset, TargetDataset]
  
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
  
  /**
    * checked 改变时触发 change 事件
    *
    * event.detail={ value}
    */
  type SwitchChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.ValueBoolean, Mark, TargetDataset, TargetDataset]
  
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
  
  /**
    * 输入框失去焦点时触发
    *
    * event.detail = {value, cursor}
    *
    * **tip**: textarea 的 blur 事件会晚于页面上的 tap 事件，如果需要在 button 的点击事件获取 textarea，可以使用 form 的 bindsubmit。
    */
  type TextareaBlur[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.InputBlur[Mark, TargetDataset]
  
  /**
    * 点击完成时， 触发 confirm 事件
    *
    * event.detail = {value: value}
    */
  type TextareaConfirm[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.InputConfirm[Mark, TargetDataset]
  
  /**
    * 输入框聚焦时触发
    *
    * event.detail = { value, height }，height 为键盘高度
    *
    * 在基础库 1.9.90 起支持
    */
  type TextareaFocus[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.InputFocus[Mark, TargetDataset]
  
  /**
    * 当键盘输入时，触发 input 事件
    *
    * event.detail = {value, cursor, keyCode}
    *
    * keyCode 为键值，目前工具还不支持返回 keyCode 参数。
    *
    * **tip**: 不建议在多行文本上对用户的输入进行修改，所以 **bindinput 处理函数的返回值并不会反映到 textarea 上**
    */
  type TextareaInput[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.Input[Mark, TargetDataset]
  
  /**
    * 键盘高度发生变化的时候触发此事件
    *
    * event.detail = {height: height, duration: duration}
    *
    * **tip**: 键盘高度发生变化，keyboardheightchange事件可能会多次触发，开发者对于相同的height值应该忽略掉
    *
    * 最低基础库: 2.7.0
    */
  type TextareaKeyboardHeightChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.InputKeyboardHeightChange[Mark, TargetDataset]
  
  /**
    * 输入框行数变化时调用
    *
    * event.detail = {height: 0, heightRpx: 0, lineCount: 0}
    */
  type TextareaLineChange[Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[typings.wechatMiniprogram.anon.HeightRpx, Mark, TargetDataset, TargetDataset]
  
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
  
  /** 触摸事件响应 */
  type TouchEvent[Detail /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, Mark /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, CurrentTargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TargetDataset /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.Touch[
    Detail, 
    typings.wechatMiniprogram.WechatMiniprogram.TouchDetail, 
    Mark, 
    CurrentTargetDataset, 
    TargetDataset
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
  
  type UDPSocketOffCloseCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 错误事件的回调函数 */
  type UDPSocketOffErrorCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UDPSocketOnErrorCallbackResult, 
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
  type UpdateWeChatAppCompleteCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用失败的回调函数 */
  type UpdateWeChatAppFailCallback = js.Function1[
    /* res */ typings.wechatMiniprogram.WechatMiniprogram.GeneralCallbackResult, 
    scala.Unit
  ]
  
  /** 接口调用成功的回调函数 */
  type UpdateWeChatAppSuccessCallback = js.Function1[
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
  type UploadTaskOffProgressUpdateCallback = js.Function1[
    /* result */ typings.wechatMiniprogram.WechatMiniprogram.UploadTaskOnProgressUpdateCallbackResult, 
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
  
  /** 当播放到末尾时触发 ended 事件 */
  type VideoEnded = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 视频播放出错时触发
    *
    * 最低基础库: 1.7.0
    */
  type VideoError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 视频进入和退出全屏时触发，event.detail = {fullScreen, direction}
    *
    * 最低基础库: 1.4.0
    */
  type VideoFullScreenChange = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.DirectionFullScreen, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 当暂停播放时触发 pause 事件 */
  type VideoPause = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 当开始/继续播放时触发play事件 */
  type VideoPlay = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 加载进度变化时触发，只支持一段加载。
    *
    * 最低基础库: 2.4.0
    */
  type VideoPregress = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Buffered, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /** 播放进度变化时触发，event.detail = {currentTime, duration} 。触发频率 250ms 一次 */
  type VideoTimeUpdate = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.CurrentTime, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 视频出现缓冲时触发
    *
    * 最低基础库: 1.7.0
    */
  type VideoWaiting = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 加载进度变化时触发，只支持一段加载。
    *
    * 最低基础库: 2.4.0
    */
  type VoipRoomError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 网页加载失败的时候触发此事件。e.detail = { src }
    *
    * 最低基础库: 1.6.4
    */
  type WebviewError = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Src, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 网页加载成功时候触发此事件。e.detail = { src }
    *
    * 最低基础库: 1.6.4
    */
  type WebviewLoad = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.Src, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  
  /**
    * 网页向小程序 postMessage 时，会在特定时机 (小程序后退、组件销毁、分享) 触发并收到消息。e.detail = { data }
    *
    * 最低基础库: 1.6.4
    */
  type WebviewMessage = typings.wechatMiniprogram.WechatMiniprogram.CustomEvent[
    typings.wechatMiniprogram.anon.DataArray, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
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
