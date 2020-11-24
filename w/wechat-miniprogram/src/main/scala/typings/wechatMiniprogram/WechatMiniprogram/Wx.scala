package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import typings.wechatMiniprogram.WechatMiniprogram.Component.TrivialInstance
import typings.wechatMiniprogram.WxCloud
import typings.wechatMiniprogram.anon.USERDATAPATH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wx extends js.Object {
  
  /** [wx.addCard(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/card/wx.addCard.html)
  *
  * 批量添加卡券。只有通过 [认证](https://developers.weixin.qq.com/miniprogram/product/renzheng.html) 的小程序或文化互动类目的小游戏才能使用。更多文档请参考 [微信卡券接口文档](https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2)。
  *
  * **cardExt 说明**
  *
  *
  * cardExt 是卡券的扩展参数，其值是一个 JSON 字符串。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.addCard({
    cardList: [
    {
    cardId: '',
    cardExt: '{"code": "", "openid": "", "timestamp": "", "signature":""}'
    }, {
    cardId: '',
    cardExt: '{"code": "", "openid": "", "timestamp": "", "signature":""}'
    }
    ],
    success (res) {
    console.log(res.cardList) // 卡券添加结果
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def addCard[TOption /* <: AddCardOption */](option: TOption): PromisifySuccessResult[TOption, AddCardOption] = js.native
  
  /** [wx.addPhoneContact(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/contact/wx.addPhoneContact.html)
    *
    * 添加手机通讯录联系人。用户可以选择将该表单以「新增联系人」或「添加到已有联系人」的方式，写入手机系统通讯录。
    *
    * 最低基础库： `1.2.0` */
  def addPhoneContact[TOption /* <: AddPhoneContactOption */](option: TOption): PromisifySuccessResult[TOption, AddPhoneContactOption] = js.native
  
  /** [string wx.arrayBufferToBase64(ArrayBuffer arrayBuffer)](https://developers.weixin.qq.com/miniprogram/dev/api/base/wx.arrayBufferToBase64.html)
    *
    * 将 ArrayBuffer 对象转成 Base64 字符串
    *
    * 最低基础库： `1.1.0`
    * @deprecated 基础库版本 [2.4.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃
    *  */
  def arrayBufferToBase64(/** 要转换成 Base64 字符串的 ArrayBuffer 对象 */
  arrayBuffer: ArrayBuffer): String = js.native
  
  /** [wx.authPrivateMessage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/share/wx.authPrivateMessage.html)
  *
  * 验证私密消息。用法详情见 [小程序私密消息使用指南](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share/private-message.html)
  *
  * **示例代码**
  *
  *
  * ```js
  wx.authPrivateMessage({
    shareTicket: 'xxxxxx',
    success(res) {
    console.log('authPrivateMessage success', res)
    // res
    // {
    //   errMsg: 'authPrivateMessage:ok'
    //   valid: true
    //   iv: 'xxxx',
    //   encryptedData: 'xxxxxx'
    // }
    },
    fail(res) {
    console.log('authPrivateMessage fail', res)
    }
  })
  ```
  *
  * 最低基础库： `2.13.0` */
  def authPrivateMessage(): Unit = js.native
  def authPrivateMessage(option: AuthPrivateMessageOption): Unit = js.native
  
  /** [wx.authorize(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/authorize/wx.authorize.html)
  *
  * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。更多用法详见 [用户授权](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/authorize.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  // 可以通过 wx.getSetting 先查询一下用户是否授权了 "scope.record" 这个 scope
  wx.getSetting({
    success(res) {
    if (!res.authSetting['scope.record']) {
    wx.authorize({
    scope: 'scope.record',
    success () {
    // 用户已经同意小程序使用录音功能，后续调用 wx.startRecord 接口不会弹窗询问
    wx.startRecord()
    }
    })
    }
    }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def authorize[TOption /* <: AuthorizeOption */](option: TOption): PromisifySuccessResult[TOption, AuthorizeOption] = js.native
  
  /** [ArrayBuffer wx.base64ToArrayBuffer(string base64)](https://developers.weixin.qq.com/miniprogram/dev/api/base/wx.base64ToArrayBuffer.html)
    *
    * 将 Base64 字符串转成 ArrayBuffer 对象
    *
    * 最低基础库： `1.1.0`
    * @deprecated 基础库版本 [2.4.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃
    *  */
  def base64ToArrayBuffer(/** 要转化成 ArrayBuffer 对象的 Base64 字符串 */
  base64: String): ArrayBuffer = js.native
  
  /** [boolean wx.canIUse(string schema)](https://developers.weixin.qq.com/miniprogram/dev/api/base/wx.canIUse.html)
  *
  * 判断小程序的API，回调，参数，组件等是否在当前版本可用。
  *
  * **参数说明**
  *
  *
  * - `${API}` 代表 API 名字
  * - `${method}` 代表调用方式，有效值为return, success, object, callback
  * - `${param}` 代表参数或者返回值
  * - `${option}` 代表参数的可选值或者返回值的属性
  * - `${component}` 代表组件名字
  * - `${attribute}` 代表组件属性
  * - `${option}` 代表组件属性的可选值
  *
  * **示例代码**
  *
  *
  * ```js
  // 对象的属性或方法
  wx.canIUse('console.log')
  wx.canIUse('CameraContext.onCameraFrame')
  wx.canIUse('CameraFrameListener.start')
  wx.canIUse('Image.src')
  // wx接口参数、回调或者返回值
  wx.canIUse('openBluetoothAdapter')
  wx.canIUse('getSystemInfoSync.return.safeArea.left')
  wx.canIUse('getSystemInfo.success.screenWidth')
  wx.canIUse('showToast.object.image')
  wx.canIUse('onCompassChange.callback.direction')
  wx.canIUse('request.object.method.GET')
  // 组件的属性
  wx.canIUse('live-player')
  wx.canIUse('text.selectable')
  wx.canIUse('button.open-type.contact')
  ```
  *
  * 最低基础库： `1.1.1` */
  def canIUse(
    /** 使用 `${API}.${method}.${param}.${option}` 或者 `${component}.${attribute}.${option}` 方式来调用 */
  schema: String
  ): Boolean = js.native
  
  /** [wx.canvasGetImageData(Object object, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/wx.canvasGetImageData.html)
  *
  * 获取 canvas 区域隐含的像素数据。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/yufmRjmZ7W8f)
  *
  * ```js
  wx.canvasGetImageData({
    canvasId: 'myCanvas',
    x: 0,
    y: 0,
    width: 100,
    height: 100,
    success(res) {
    console.log(res.width) // 100
    console.log(res.height) // 100
    console.log(res.data instanceof Uint8ClampedArray) // true
    console.log(res.data.length) // 100 * 100 * 4
    }
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def canvasGetImageData[TOption /* <: CanvasGetImageDataOption */](option: TOption): PromisifySuccessResult[TOption, CanvasGetImageDataOption] = js.native
  def canvasGetImageData[TOption /* <: CanvasGetImageDataOption */](
    option: TOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 */
  component: TrivialInstance
  ): PromisifySuccessResult[TOption, CanvasGetImageDataOption] = js.native
  def canvasGetImageData[TOption /* <: CanvasGetImageDataOption */](
    option: TOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): PromisifySuccessResult[TOption, CanvasGetImageDataOption] = js.native
  
  /** [wx.canvasPutImageData(Object object, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/wx.canvasPutImageData.html)
    *
    * 将像素数据绘制到画布。在自定义组件下，第二个参数传入自定义组件实例 this，以操作组件内 <canvas> 组件
    *
    * 最低基础库： `1.9.0` */
  def canvasPutImageData[TOption /* <: CanvasPutImageDataOption */](option: TOption): PromisifySuccessResult[TOption, CanvasPutImageDataOption] = js.native
  def canvasPutImageData[TOption /* <: CanvasPutImageDataOption */](
    option: TOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 */
  component: TrivialInstance
  ): PromisifySuccessResult[TOption, CanvasPutImageDataOption] = js.native
  def canvasPutImageData[TOption /* <: CanvasPutImageDataOption */](
    option: TOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): PromisifySuccessResult[TOption, CanvasPutImageDataOption] = js.native
  
  /** [wx.canvasToTempFilePath(Object object, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/wx.canvasToTempFilePath.html)
    *
    * 把当前画布指定区域的内容导出生成指定大小的图片。在 `draw()` 回调里调用该方法才能保证图片导出成功。 */
  def canvasToTempFilePath[TOption /* <: CanvasToTempFilePathOption */](option: TOption): PromisifySuccessResult[TOption, CanvasToTempFilePathOption] = js.native
  def canvasToTempFilePath[TOption /* <: CanvasToTempFilePathOption */](
    option: TOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 */
  component: TrivialInstance
  ): PromisifySuccessResult[TOption, CanvasToTempFilePathOption] = js.native
  def canvasToTempFilePath[TOption /* <: CanvasToTempFilePathOption */](
    option: TOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): PromisifySuccessResult[TOption, CanvasToTempFilePathOption] = js.native
  
  /** [wx.checkIsOpenAccessibility(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/accessibility/wx.checkIsOpenAccessibility.html)
    *
    * 检测是否开启视觉无障碍功能。
    *
    * 最低基础库： `2.13.0` */
  def checkIsOpenAccessibility[TOption /* <: CheckIsOpenAccessibilityOption */](): PromisifySuccessResult[TOption, CheckIsOpenAccessibilityOption] = js.native
  def checkIsOpenAccessibility[TOption /* <: CheckIsOpenAccessibilityOption */](option: TOption): PromisifySuccessResult[TOption, CheckIsOpenAccessibilityOption] = js.native
  
  /** [wx.checkIsSoterEnrolledInDevice(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/soter/wx.checkIsSoterEnrolledInDevice.html)
  *
  * 获取设备内是否录入如指纹等生物信息的接口
  *
  * **示例代码**
  *
  *
  * ```js
  wx.checkIsSoterEnrolledInDevice({
    checkAuthMode: 'fingerPrint',
    success(res) {
    console.log(res.isEnrolled)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def checkIsSoterEnrolledInDevice[TOption /* <: CheckIsSoterEnrolledInDeviceOption */](option: TOption): PromisifySuccessResult[TOption, CheckIsSoterEnrolledInDeviceOption] = js.native
  
  /** [wx.checkIsSupportSoterAuthentication(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/soter/wx.checkIsSupportSoterAuthentication.html)
  *
  * 获取本机支持的 SOTER 生物认证方式
  *
  * **示例代码**
  *
  *
  * ```js
  wx.checkIsSupportSoterAuthentication({
    success(res) {
    // res.supportMode = [] 不具备任何被SOTER支持的生物识别方式
    // res.supportMode = ['fingerPrint'] 只支持指纹识别
    // res.supportMode = ['fingerPrint', 'facial'] 支持指纹识别和人脸识别
    }
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def checkIsSupportSoterAuthentication[TOption /* <: CheckIsSupportSoterAuthenticationOption */](): PromisifySuccessResult[TOption, CheckIsSupportSoterAuthenticationOption] = js.native
  def checkIsSupportSoterAuthentication[TOption /* <: CheckIsSupportSoterAuthenticationOption */](option: TOption): PromisifySuccessResult[TOption, CheckIsSupportSoterAuthenticationOption] = js.native
  
  /** [wx.checkSession(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/login/wx.checkSession.html)
  *
  * 检查登录态是否过期。
  *
  * 通过 wx.login 接口获得的用户登录态拥有一定的时效性。用户越久未使用小程序，用户登录态越有可能失效。反之如果用户一直在使用小程序，则用户登录态一直保持有效。具体时效逻辑由微信维护，对开发者透明。开发者只需要调用 wx.checkSession 接口检测当前用户登录态是否有效。
  *
  * 登录态过期后开发者可以再调用 wx.login 获取新的用户登录态。调用成功说明当前 session_key 未过期，调用失败说明 session_key 已过期。更多使用方法详见 [小程序登录](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/login.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.checkSession({
    success () {
    //session_key 未过期，并且在本生命周期一直有效
    },
    fail () {
    // session_key 已经失效，需要重新执行登录流程
    wx.login() //重新登录
    }
  })
  ``` */
  def checkSession[TOption /* <: CheckSessionOption */](): PromisifySuccessResult[TOption, CheckSessionOption] = js.native
  def checkSession[TOption /* <: CheckSessionOption */](option: TOption): PromisifySuccessResult[TOption, CheckSessionOption] = js.native
  
  /** [wx.chooseAddress(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/address/wx.chooseAddress.html)
  *
  * 获取用户收货地址。调起用户编辑收货地址原生界面，并在编辑完成后返回用户选择的地址。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/024hHnmd772y)
  * ```js
  wx.chooseAddress({
    success (res) {
    console.log(res.userName)
    console.log(res.postalCode)
    console.log(res.provinceName)
    console.log(res.cityName)
    console.log(res.countyName)
    console.log(res.detailInfo)
    console.log(res.nationalCode)
    console.log(res.telNumber)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def chooseAddress[TOption /* <: ChooseAddressOption */](): PromisifySuccessResult[TOption, ChooseAddressOption] = js.native
  def chooseAddress[TOption /* <: ChooseAddressOption */](option: TOption): PromisifySuccessResult[TOption, ChooseAddressOption] = js.native
  
  /** [wx.chooseImage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.chooseImage.html)
  *
  * 从本地相册选择图片或使用相机拍照。
  *
  * ****
  *
  * ```js
  wx.chooseImage({
    count: 1,
    sizeType: ['original', 'compressed'],
    sourceType: ['album', 'camera'],
    success (res) {
    // tempFilePath可以作为img标签的src属性显示图片
    const tempFilePaths = res.tempFilePaths
    }
  })
  ``` */
  def chooseImage[TOption /* <: ChooseImageOption */](option: TOption): PromisifySuccessResult[TOption, ChooseImageOption] = js.native
  
  /** [wx.chooseInvoice(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/invoice/wx.chooseInvoice.html)
    *
    * 选择用户已有的发票。
    *
    * **通过 cardId 和 encryptCode 获得报销发票的信息**
    *
    *
    * 请参考[微信电子发票文档](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=21517918939oae3U)中，「查询报销发票信息」部分。
    * 其中 `access_token` 的获取请参考[auth.getAccessToken](https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/access-token/auth.getAccessToken.html)文档
    *
    * 最低基础库： `2.3.0` */
  def chooseInvoice[TOption /* <: ChooseInvoiceOption */](): PromisifySuccessResult[TOption, ChooseInvoiceOption] = js.native
  def chooseInvoice[TOption /* <: ChooseInvoiceOption */](option: TOption): PromisifySuccessResult[TOption, ChooseInvoiceOption] = js.native
  
  /** [wx.chooseInvoiceTitle(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/invoice/wx.chooseInvoiceTitle.html)
  *
  * 选择用户的发票抬头。当前小程序必须关联一个公众号，且这个公众号是完成了[微信认证](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1496554031_RD4xe)的，才能调用 chooseInvoiceTitle。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/GJ4S9nmQ7x2E)
  *
  * ```js
  wx.chooseInvoiceTitle({
    success(res) {}
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def chooseInvoiceTitle[TOption /* <: ChooseInvoiceTitleOption */](): PromisifySuccessResult[TOption, ChooseInvoiceTitleOption] = js.native
  def chooseInvoiceTitle[TOption /* <: ChooseInvoiceTitleOption */](option: TOption): PromisifySuccessResult[TOption, ChooseInvoiceTitleOption] = js.native
  
  /** [wx.chooseLocation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.chooseLocation.html)
    *
    * 打开地图选择位置。 */
  def chooseLocation[TOption /* <: ChooseLocationOption */](option: TOption): PromisifySuccessResult[TOption, ChooseLocationOption] = js.native
  
  /** [wx.chooseMedia(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.chooseMedia.html)
  *
  * 拍摄或从手机相册中选择图片或视频。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseMedia({
    count: 9,
    mediaType: ['image','video'],
    sourceType: ['album', 'camera'],
    maxDuration: 30,
    camera: 'back',
    success(res) {
    console.log(res.tempFiles.tempFilePath)
    console.log(res.tempFiles.size)
    }
  })
  ```
  *
  * 最低基础库： `2.10.0` */
  def chooseMedia[TOption /* <: ChooseMediaOption */](option: TOption): PromisifySuccessResult[TOption, ChooseMediaOption] = js.native
  
  /** [wx.chooseMessageFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.chooseMessageFile.html)
  *
  * 从客户端会话选择文件。
  *
  * ****
  *
  * ```js
  wx.chooseMessageFile({
    count: 10,
    type: 'image',
    success (res) {
    // tempFilePath可以作为img标签的src属性显示图片
    const tempFilePaths = res.tempFiles
    }
  })
  ```
  *
  * 最低基础库： `2.5.0` */
  def chooseMessageFile[TOption /* <: ChooseMessageFileOption */](option: TOption): PromisifySuccessResult[TOption, ChooseMessageFileOption] = js.native
  
  /** [wx.chooseVideo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.chooseVideo.html)
  *
  * 拍摄视频或从手机相册中选视频。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseVideo({
    sourceType: ['album','camera'],
    maxDuration: 60,
    camera: 'back',
    success(res) {
    console.log(res.tempFilePath)
    }
  })
  ``` */
  def chooseVideo[TOption /* <: ChooseVideoOption */](option: TOption): PromisifySuccessResult[TOption, ChooseVideoOption] = js.native
  
  /** [wx.clearStorage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.clearStorage.html)
  *
  * 清理本地数据缓存
  *
  * **示例代码**
  *
  *
  * ```js
  wx.clearStorage()
  ```
  *
  * ```js
  try {
    wx.clearStorageSync()
  } catch(e) {
    // Do something when catch error
  }
  ``` */
  def clearStorage[TOption /* <: ClearStorageOption */](): PromisifySuccessResult[TOption, ClearStorageOption] = js.native
  def clearStorage[TOption /* <: ClearStorageOption */](option: TOption): PromisifySuccessResult[TOption, ClearStorageOption] = js.native
  
  /** [wx.clearStorageSync()](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.clearStorageSync.html)
  *
  * [wx.clearStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.clearStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.clearStorage()
  ```
  *
  * ```js
  try {
    wx.clearStorageSync()
  } catch(e) {
    // Do something when catch error
  }
  ``` */
  def clearStorageSync(): Unit = js.native
  
  /** [wx.closeBLEConnection(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.closeBLEConnection.html)
  *
  * 断开与低功耗蓝牙设备的连接。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.closeBLEConnection({
    deviceId,
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def closeBLEConnection[TOption /* <: CloseBLEConnectionOption */](option: TOption): PromisifySuccessResult[TOption, CloseBLEConnectionOption] = js.native
  
  /** [wx.closeBluetoothAdapter(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.closeBluetoothAdapter.html)
  *
  * 关闭蓝牙模块。调用该方法将断开所有已建立的连接并释放系统资源。建议在使用蓝牙流程后，与 [wx.openBluetoothAdapter](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.openBluetoothAdapter.html) 成对调用。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.closeBluetoothAdapter({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def closeBluetoothAdapter[TOption /* <: CloseBluetoothAdapterOption */](): PromisifySuccessResult[TOption, CloseBluetoothAdapterOption] = js.native
  def closeBluetoothAdapter[TOption /* <: CloseBluetoothAdapterOption */](option: TOption): PromisifySuccessResult[TOption, CloseBluetoothAdapterOption] = js.native
  
  /** [wx.closeSocket(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.closeSocket.html)
  *
  * 关闭 WebSocket 连接
  *
  * **示例代码**
  *
  *
  * ```js
  wx.connectSocket({
    url: 'test.php'
  })
  //注意这里有时序问题，
  //如果 wx.connectSocket 还没回调 wx.onSocketOpen，而先调用 wx.closeSocket，那么就做不到关闭 WebSocket 的目的。
  //必须在 WebSocket 打开期间调用 wx.closeSocket 才能关闭。
  wx.onSocketOpen(function() {
    wx.closeSocket()
  })
  wx.onSocketClose(function(res) {
    console.log('WebSocket 已关闭！')
  })
  ``` */
  def closeSocket[TOption /* <: CloseSocketOption */](): PromisifySuccessResult[TOption, CloseSocketOption] = js.native
  def closeSocket[TOption /* <: CloseSocketOption */](option: TOption): PromisifySuccessResult[TOption, CloseSocketOption] = js.native
  
  /**
  小程序云开发
  */
  var cloud: WxCloud = js.native
  
  /** [wx.compressImage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.compressImage.html)
  *
  * 压缩图片接口，可选压缩质量
  *
  * **示例代码**
  *
  *
  * ```js
  wx.compressImage({
    src: '', // 图片路径
    quality: 80 // 压缩质量
  })
  ```
  *
  * 最低基础库： `2.4.0` */
  def compressImage[TOption /* <: CompressImageOption */](option: TOption): PromisifySuccessResult[TOption, CompressImageOption] = js.native
  
  /** [wx.compressVideo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.compressVideo.html)
    *
    * 压缩视频接口。开发者可指定压缩质量 `quality` 进行压缩。当需要更精细的控制时，可指定 `bitrate`、`fps`、和 `resolution`，当 `quality` 传入时，这三个参数将被忽略。原视频的相关信息可通过 [getVideoInfo](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.getVideoInfo.html) 获取。
    *
    * 最低基础库： `2.11.0` */
  def compressVideo[TOption /* <: CompressVideoOption */](option: TOption): PromisifySuccessResult[TOption, CompressVideoOption] = js.native
  
  /** [[SocketTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.html) wx.connectSocket(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.connectSocket.html)
  *
  * 创建一个 WebSocket 连接。使用前请注意阅读[相关说明](https://developers.weixin.qq.com/miniprogram/dev/framework/ability/network.html)。
  *
  * **并发数**
  *
  *
  * - 1.7.0 及以上版本，最多可以同时存在 5 个 WebSocket 连接。
  * - 1.7.0 以下版本，一个小程序同时只能有一个 WebSocket 连接，如果当前已存在一个 WebSocket 连接，会自动关闭该连接，并重新创建一个 WebSocket 连接。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.connectSocket({
    url: 'wss://example.qq.com',
    header:{
    'content-type': 'application/json'
    },
    protocols: ['protocol1']
  })
  ``` */
  def connectSocket(option: ConnectSocketOption): SocketTask = js.native
  
  /** [wx.connectWifi(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.connectWifi.html)
  *
  * 连接 Wi-Fi。若已知 Wi-Fi 信息，可以直接利用该接口连接。仅 Android 与 iOS 11 以上版本支持。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.connectWifi({
    SSID: '',
    password: '',
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def connectWifi[TOption /* <: ConnectWifiOption */](option: TOption): PromisifySuccessResult[TOption, ConnectWifiOption] = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) wx.createAnimation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/wx.createAnimation.html)
    *
    * 创建一个动画实例 [animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html)。调用实例的方法来描述动画。最后通过动画实例的 export 方法导出动画数据传递给组件的 animation 属性。 */
  def createAnimation(option: StepOption): Animation = js.native
  
  /** [[AudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.html) wx.createAudioContext(string id, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createAudioContext.html)
    *
    * 创建 [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 上下文 [AudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.html) 对象。
    * @deprecated 基础库版本 [1.6.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.createInnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html) 替换
    *  */
  def createAudioContext(
    /** [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 组件的 id */
  id: String
  ): AudioContext = js.native
  def createAudioContext(
    /** [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 组件 */
  component: TrivialInstance
  ): AudioContext = js.native
  def createAudioContext(
    /** [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): AudioContext = js.native
  
  /** [wx.createBLEConnection(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.createBLEConnection.html)
  *
  * 连接低功耗蓝牙设备。
  *
  * 若小程序在之前已有搜索过某个蓝牙设备，并成功建立连接，可直接传入之前搜索获取的 deviceId 直接尝试连接该设备，无需进行搜索操作。
  *
  * **注意**
  *
  *
  * - 请保证尽量成对的调用 `createBLEConnection` 和 `closeBLEConnection` 接口。安卓如果多次调用 `createBLEConnection` 创建连接，有可能导致系统持有同一设备多个连接的实例，导致调用 `closeBLEConnection` 的时候并不能真正的断开与设备的连接。
  * - 蓝牙连接随时可能断开，建议监听 [wx.onBLEConnectionStateChange](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.onBLEConnectionStateChange.html) 回调事件，当蓝牙设备断开时按需执行重连操作
  * - 若对未连接的设备或已断开连接的设备调用数据读写操作的接口，会返回 10006 错误，建议进行重连操作。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.createBLEConnection({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def createBLEConnection[TOption /* <: CreateBLEConnectionOption */](option: TOption): PromisifySuccessResult[TOption, CreateBLEConnectionOption] = js.native
  
  /** [wx.createBLEPeripheralServer(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/wx.createBLEPeripheralServer.html)
    *
    * 建立本地作为外围设备的服务端，可创建多个。
    *
    * 最低基础库： `2.10.3` */
  def createBLEPeripheralServer[TOption /* <: CreateBLEPeripheralServerOption */](): PromisifySuccessResult[TOption, CreateBLEPeripheralServerOption] = js.native
  def createBLEPeripheralServer[TOption /* <: CreateBLEPeripheralServerOption */](option: TOption): PromisifySuccessResult[TOption, CreateBLEPeripheralServerOption] = js.native
  
  /** [[CameraContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.html) wx.createCameraContext()](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/wx.createCameraContext.html)
    *
    * 创建 [camera](https://developers.weixin.qq.com/miniprogram/dev/component/camera.html) 上下文 [CameraContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.html) 对象。
    *
    * 最低基础库： `1.6.0` */
  def createCameraContext(): CameraContext = js.native
  
  /** [[CanvasContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.html) wx.createCanvasContext(string canvasId, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/wx.createCanvasContext.html)
    *
    * 创建 canvas 的绘图上下文 [CanvasContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.html) 对象
    * @deprecated 基础库版本 [2.9.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [Canvas](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.html) 替换
    *  */
  def createCanvasContext(
    /** 要获取上下文的 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 canvas-id 属性 */
  canvasId: String
  ): CanvasContext = js.native
  def createCanvasContext(
    /** 要获取上下文的 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 canvas-id 属性 */
  canvasId: String,
    /** 在自定义组件下，当前组件实例的this，表示在这个自定义组件下查找拥有 canvas-id 的 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) ，如果省略则不在任何自定义组件内查找 */
  component: TrivialInstance
  ): CanvasContext = js.native
  def createCanvasContext(
    /** 要获取上下文的 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件 canvas-id 属性 */
  canvasId: String,
    /** 在自定义组件下，当前组件实例的this，表示在这个自定义组件下查找拥有 canvas-id 的 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) ，如果省略则不在任何自定义组件内查找 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): CanvasContext = js.native
  
  /** [[InnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.html) wx.createInnerAudioContext()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html)
    *
    * 创建内部 [audio](https://developers.weixin.qq.com/miniprogram/dev/component/audio.html) 上下文 [InnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.html) 对象。
    *
    * 最低基础库： `1.6.0` */
  def createInnerAudioContext(): InnerAudioContext = js.native
  
  /** [[IntersectionObserver](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.html) wx.createIntersectionObserver(Object component, Object options)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/wx.createIntersectionObserver.html)
    *
    * 创建并返回一个 IntersectionObserver 对象实例。在自定义组件或包含自定义组件的页面中，应使用 `this.createIntersectionObserver([options])` 来代替。
    *
    * **示例代码**
    *
    *
    * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/LAbMxkmI7F2A)
    *
    * 最低基础库： `1.9.3` */
  def createIntersectionObserver(/** 自定义组件实例 */
  component: IAnyObject): IntersectionObserver = js.native
  def createIntersectionObserver(/** 自定义组件实例 */
  component: IAnyObject, /** 选项 */
  options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  
  /** [[InterstitialAd](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.html) wx.createInterstitialAd(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/wx.createInterstitialAd.html)
    *
    * 创建插屏广告组件。请通过 [wx.getSystemInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/base/system/system-info/wx.getSystemInfoSync.html) 返回对象的 SDKVersion 判断基础库版本号后再使用该 API。每次调用该方法创建插屏广告都会返回一个全新的实例（小程序端的插屏广告实例不允许跨页面使用）。
    *
    * 最低基础库： `2.6.0` */
  def createInterstitialAd(option: CreateInterstitialAdOption): InterstitialAd = js.native
  
  /** [[LivePlayerContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.html) wx.createLivePlayerContext(string id, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/wx.createLivePlayerContext.html)
    *
    * 创建 [live-player](https://developers.weixin.qq.com/miniprogram/dev/component/live-player.html) 上下文 [LivePlayerContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.html) 对象。
    *
    * 最低基础库： `1.7.0` */
  def createLivePlayerContext(
    /** [live-player](https://developers.weixin.qq.com/miniprogram/dev/component/live-player.html) 组件的 id */
  id: String
  ): LivePlayerContext = js.native
  def createLivePlayerContext(
    /** [live-player](https://developers.weixin.qq.com/miniprogram/dev/component/live-player.html) 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [live-player](https://developers.weixin.qq.com/miniprogram/dev/component/live-player.html) 组件 */
  component: TrivialInstance
  ): LivePlayerContext = js.native
  def createLivePlayerContext(
    /** [live-player](https://developers.weixin.qq.com/miniprogram/dev/component/live-player.html) 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [live-player](https://developers.weixin.qq.com/miniprogram/dev/component/live-player.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): LivePlayerContext = js.native
  
  /** [[LivePusherContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.html) wx.createLivePusherContext()](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/wx.createLivePusherContext.html)
    *
    * 创建 [live-pusher](https://developers.weixin.qq.com/miniprogram/dev/component/live-pusher.html) 上下文 [LivePusherContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.html) 对象。
    *
    * 最低基础库： `1.7.0` */
  def createLivePusherContext(): LivePusherContext = js.native
  
  /** [[MapContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.html) wx.createMapContext(string mapId, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/wx.createMapContext.html)
    *
    * 创建 [map](https://developers.weixin.qq.com/miniprogram/dev/component/map.html) 上下文 [MapContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.html) 对象。 */
  def createMapContext(
    /** [map](https://developers.weixin.qq.com/miniprogram/dev/component/map.html) 组件的 id */
  mapId: String
  ): MapContext = js.native
  def createMapContext(
    /** [map](https://developers.weixin.qq.com/miniprogram/dev/component/map.html) 组件的 id */
  mapId: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [map](https://developers.weixin.qq.com/miniprogram/dev/component/map.html) 组件 */
  component: TrivialInstance
  ): MapContext = js.native
  def createMapContext(
    /** [map](https://developers.weixin.qq.com/miniprogram/dev/component/map.html) 组件的 id */
  mapId: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [map](https://developers.weixin.qq.com/miniprogram/dev/component/map.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): MapContext = js.native
  
  /** [[MediaAudioPlayer](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.html) wx.createMediaAudioPlayer()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createMediaAudioPlayer.html)
  *
  * 创建媒体音频播放器对象 [MediaAudioPlayer](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/MediaAudioPlayer.html) 对象，可用于播放视频解码器 [VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html) 输出的音频。
  *
  * **示例代码**
  *
  *
  * ```js
    // 创建视频解码器，具体参数见 createVideoDecoder 文档
    const videoDecoder = wx.createVideoDecoder()
    // 创建媒体音频播放器
    const mediaAudioPlayer = wx.createMediaAudioPlayer()
    // 启动视频解码器
    videoDecoder.start()
    // 启动播放器
    mediaAudioPlayer.start().then(() => {
    // 添加播放器音频来源
    mediaAudioPlayer.addAudioSource(videoDecoder).then(res => {
    videoDecoder.getFrameData() // 建议在 requestAnimationFrame 里获取每一帧视频数据
    console.log(res)
    })
    // 移除播放器音频来源
    mediaAudioPlaye.removeAudioSource(videoDecoder).then()
    // 停止播放器
    mediaAudioPlaye.stop().then()
    // 销毁播放器
    mediaAudioPlaye.destroy().then()
    // 设置播放器音量
    mediaAudioPlayer.volume = 0.5
    })
  ```
  *
  * **完整demo（小游戏）**
  *
  *
  * - https://developers.weixin.qq.com/s/SF2duHmb7MjI
  *
  * 最低基础库： `2.13.0` */
  def createMediaAudioPlayer(): MediaAudioPlayer = js.native
  
  /** [[MediaContainer](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.html) wx.createMediaContainer()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/wx.createMediaContainer.html)
    *
    * 创建音视频处理容器，最终可将容器中的轨道合成一个视频
    *
    * 最低基础库： `2.9.0` */
  def createMediaContainer(): MediaContainer = js.native
  
  /** [[MediaRecorder](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.html) wx.createMediaRecorder(Object canvas, Object options)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/wx.createMediaRecorder.html)
    *
    * 创建 WebGL 画面录制器，可逐帧录制在 WebGL 上渲染的画面并导出视频文件
    *
    * 最低基础库： `2.11.0` */
  def createMediaRecorder(
    /** WebGL 对象，通过 [SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) 获取到的 node 对象 */
  canvas: IAnyObject,
    options: CreateMediaRecorderOption
  ): MediaRecorder = js.native
  
  /** [[OffscreenCanvas](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/OffscreenCanvas.html) wx.createOffscreenCanvas()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/wx.createOffscreenCanvas.html)
    *
    * 创建离屏 canvas 实例
    *
    * 最低基础库： `2.7.0` */
  def createOffscreenCanvas(): OffscreenCanvas = js.native
  
  /** [[RewardedVideoAd](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.html) wx.createRewardedVideoAd(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/wx.createRewardedVideoAd.html)
    *
    * 创建激励视频广告组件。请通过 [wx.getSystemInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/base/system/system-info/wx.getSystemInfoSync.html) 返回对象的 SDKVersion 判断基础库版本号后再使用该 API（小游戏端要求 >= 2.0.4， 小程序端要求 >= 2.6.0）。调用该方法创建的激励视频广告是一个单例（小游戏端是全局单例，小程序端是页面内单例，在小程序端的单例对象不允许跨页面使用）。
    *
    * 最低基础库： `2.0.4` */
  def createRewardedVideoAd(option: CreateRewardedVideoAdOption): RewardedVideoAd = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) wx.createSelectorQuery()](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/wx.createSelectorQuery.html)
  *
  * 返回一个 SelectorQuery 对象实例。在自定义组件或包含自定义组件的页面中，应使用 `this.createSelectorQuery()` 来代替。
  *
  * **示例代码**
  *
  *
  * ```js
  const query = wx.createSelectorQuery()
  query.select('#the-id').boundingClientRect()
  query.selectViewport().scrollOffset()
  query.exec(function(res){
    res[0].top       // #the-id节点的上边界坐标
    res[1].scrollTop // 显示区域的竖直滚动位置
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def createSelectorQuery(): SelectorQuery = js.native
  
  /** [[UDPSocket](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.html) wx.createUDPSocket()](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/wx.createUDPSocket.html)
    *
    * 创建一个 UDP Socket 实例。使用前请注意阅读[相关说明](https://developers.weixin.qq.com/miniprogram/dev/framework/ability/network.html)。
    *
    * 最低基础库： `2.7.0` */
  def createUDPSocket(): UDPSocket = js.native
  
  /** [[VideoContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.html) wx.createVideoContext(string id, Object this)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.createVideoContext.html)
    *
    * 创建 [video](https://developers.weixin.qq.com/miniprogram/dev/component/video.html) 上下文 [VideoContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.html) 对象。 */
  def createVideoContext(
    /** [video](https://developers.weixin.qq.com/miniprogram/dev/component/video.html) 组件的 id */
  id: String
  ): VideoContext = js.native
  def createVideoContext(
    /** [video](https://developers.weixin.qq.com/miniprogram/dev/component/video.html) 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [video](https://developers.weixin.qq.com/miniprogram/dev/component/video.html) 组件 */
  component: TrivialInstance
  ): VideoContext = js.native
  def createVideoContext(
    /** [video](https://developers.weixin.qq.com/miniprogram/dev/component/video.html) 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 [video](https://developers.weixin.qq.com/miniprogram/dev/component/video.html) 组件 */
  component: typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ): VideoContext = js.native
  
  /** [[VideoDecoder](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.html) wx.createVideoDecoder()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/wx.createVideoDecoder.html)
    *
    * 创建视频解码器，可逐帧获取解码后的数据
    *
    * 最低基础库： `2.11.0` */
  def createVideoDecoder(): VideoDecoder = js.native
  
  /** [[Worker](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.html) wx.createWorker(string scriptPath, object options)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/wx.createWorker.html)
  *
  * 创建一个 [Worker 线程](https://developers.weixin.qq.com/miniprogram/dev/framework/workers.html)
  *
  * **示例代码**
  *
  *
  * ```js
  // 创建普通worker
  wx.createWorker('workers/index.js')
  ```
  * ```js
  // 创建实验worker
  wx.createWorker('workers/index.js', {
    useExperimentalWorker: true
  })
  ```
  *
  * 最低基础库： `1.9.90` */
  def createWorker(/** worker 入口文件的**绝对路径** */
  scriptPath: String): Worker = js.native
  def createWorker(/** worker 入口文件的**绝对路径** */
  scriptPath: String, /** 可选参数 */
  options: CreateWorkerOption): Worker = js.native
  
  /** [wx.disableAlertBeforeUnload(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.disableAlertBeforeUnload.html)
    *
    * 关闭小程序页面返回询问对话框
    *
    * 最低基础库： `2.12.0` */
  def disableAlertBeforeUnload(): Unit = js.native
  def disableAlertBeforeUnload(option: DisableAlertBeforeUnloadOption): Unit = js.native
  
  /** [[DownloadTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.html) wx.downloadFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/wx.downloadFile.html)
  *
  * 下载文件资源到本地。客户端直接发起一个 HTTPS GET 请求，返回文件的本地临时路径 (本地路径)，单次下载允许的最大文件为 200MB。使用前请注意阅读[相关说明](https://developers.weixin.qq.com/miniprogram/dev/framework/ability/network.html)。
  *
  * 注意：请在服务端响应的 header 中指定合理的 `Content-Type` 字段，以保证客户端正确处理文件类型。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.downloadFile({
    url: 'https://example.com/audio/123', //仅为示例，并非真实的资源
    success (res) {
    // 只要服务器有响应数据，就会把响应内容写入文件并进入 success 回调，业务需要自行判断是否下载到了想要的内容
    if (res.statusCode === 200) {
    wx.playVoice({
    filePath: res.tempFilePath
    })
    }
    }
  })
  ``` */
  def downloadFile(option: DownloadFileOption): DownloadTask = js.native
  
  /** [wx.enableAlertBeforeUnload(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.enableAlertBeforeUnload.html)
    *
    * 开启小程序页面返回询问对话框
    *
    * 最低基础库： `2.12.0` */
  def enableAlertBeforeUnload(option: EnableAlertBeforeUnloadOption): Unit = js.native
  
  /**
  文件系统中的用户目录路径
  */
  var env: USERDATAPATH = js.native
  
  /** [wx.exitVoIPChat(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.exitVoIPChat.html)
    *
    * 退出（销毁）实时语音通话
    *
    * 最低基础库： `2.7.0` */
  def exitVoIPChat[TOption /* <: ExitVoIPChatOption */](): PromisifySuccessResult[TOption, ExitVoIPChatOption] = js.native
  def exitVoIPChat[TOption /* <: ExitVoIPChatOption */](option: TOption): PromisifySuccessResult[TOption, ExitVoIPChatOption] = js.native
  
  /** [Object wx.getAccountInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/account-info/wx.getAccountInfoSync.html)
  *
  * 获取当前帐号信息。线上小程序版本号仅支持在正式版小程序中获取，开发版和体验版中无法获取。
  *
  * **示例代码**
  *
  *
  * ```js
  const accountInfo = wx.getAccountInfoSync();
  console.log(accountInfo.miniProgram.appId) // 小程序 appId
  console.log(accountInfo.plugin.appId) // 插件 appId
  console.log(accountInfo.plugin.version) // 插件版本号， 'a.b.c' 这样的形式
  ```
  *
  * 最低基础库： `2.2.2` */
  def getAccountInfoSync(): AccountInfo = js.native
  
  /** [wx.getAvailableAudioSources(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.getAvailableAudioSources.html)
    *
    * 获取当前支持的音频输入源
    *
    * 最低基础库： `2.1.0` */
  def getAvailableAudioSources[TOption /* <: GetAvailableAudioSourcesOption */](): PromisifySuccessResult[TOption, GetAvailableAudioSourcesOption] = js.native
  def getAvailableAudioSources[TOption /* <: GetAvailableAudioSourcesOption */](option: TOption): PromisifySuccessResult[TOption, GetAvailableAudioSourcesOption] = js.native
  
  /** [wx.getBLEDeviceCharacteristics(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.getBLEDeviceCharacteristics.html)
  *
  * 获取蓝牙设备某个服务中所有特征值(characteristic)。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.getBLEDeviceCharacteristics({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    success (res) {
    console.log('device getBLEDeviceCharacteristics:', res.characteristics)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getBLEDeviceCharacteristics[TOption /* <: GetBLEDeviceCharacteristicsOption */](option: TOption): PromisifySuccessResult[TOption, GetBLEDeviceCharacteristicsOption] = js.native
  
  /** [wx.getBLEDeviceRSSI(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.getBLEDeviceRSSI.html)
    *
    * 获取蓝牙设备的信号强度。
    *
    * 最低基础库： `2.11.0` */
  def getBLEDeviceRSSI[TOption /* <: GetBLEDeviceRSSIOption */](option: TOption): PromisifySuccessResult[TOption, GetBLEDeviceRSSIOption] = js.native
  
  /** [wx.getBLEDeviceServices(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.getBLEDeviceServices.html)
  *
  * 获取蓝牙设备所有服务(service)。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.getBLEDeviceServices({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    success (res) {
    console.log('device services:', res.services)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getBLEDeviceServices[TOption /* <: GetBLEDeviceServicesOption */](option: TOption): PromisifySuccessResult[TOption, GetBLEDeviceServicesOption] = js.native
  
  /** [[BackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.html) wx.getBackgroundAudioManager()](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html)
    *
    * 获取**全局唯一**的背景音频管理器。
    * 小程序切入后台，如果音频处于播放状态，可以继续播放。但是后台状态不能通过调用API操纵音频的播放状态。
    *
    * 从微信客户端6.7.2版本开始，若需要在小程序切后台后继续播放音频，需要在 [app.json](https://developers.weixin.qq.com/miniprogram/dev/reference/configuration/app.html) 中配置 `requiredBackgroundModes` 属性。开发版和体验版上可以直接生效，正式版还需通过审核。
    *
    * 最低基础库： `1.2.0` */
  def getBackgroundAudioManager(): BackgroundAudioManager = js.native
  
  /** [wx.getBackgroundAudioPlayerState(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioPlayerState.html)
  *
  * 获取后台音乐播放状态。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getBackgroundAudioPlayerState({
    success (res) {
    const status = res.status
    const dataUrl = res.dataUrl
    const currentPosition = res.currentPosition
    const duration = res.duration
    const downloadPercent = res.downloadPercent
    }
  })
  ```
  * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
  *  */
  def getBackgroundAudioPlayerState[TOption /* <: GetBackgroundAudioPlayerStateOption */](): PromisifySuccessResult[TOption, GetBackgroundAudioPlayerStateOption] = js.native
  def getBackgroundAudioPlayerState[TOption /* <: GetBackgroundAudioPlayerStateOption */](option: TOption): PromisifySuccessResult[TOption, GetBackgroundAudioPlayerStateOption] = js.native
  
  /** [wx.getBackgroundFetchData(object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/background-fetch/wx.getBackgroundFetchData.html)
    *
    * 拉取 backgroundFetch 客户端缓存数据
    *
    * 最低基础库： `2.8.0` */
  def getBackgroundFetchData[TOption /* <: GetBackgroundFetchDataOption */](option: TOption): PromisifySuccessResult[TOption, GetBackgroundFetchDataOption] = js.native
  
  /** [wx.getBackgroundFetchToken(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/background-fetch/wx.getBackgroundFetchToken.html)
    *
    * 获取设置过的自定义登录态。若无，则返回 fail。
    *
    * 最低基础库： `2.8.0` */
  def getBackgroundFetchToken[TOption /* <: GetBackgroundFetchTokenOption */](): PromisifySuccessResult[TOption, GetBackgroundFetchTokenOption] = js.native
  def getBackgroundFetchToken[TOption /* <: GetBackgroundFetchTokenOption */](option: TOption): PromisifySuccessResult[TOption, GetBackgroundFetchTokenOption] = js.native
  
  /** [wx.getBatteryInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfo.html)
    *
    * 获取设备电量。同步 API [wx.getBatteryInfoSync](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfoSync.html) 在 iOS 上不可用。 */
  def getBatteryInfo[TOption /* <: GetBatteryInfoOption */](): PromisifySuccessResult[TOption, GetBatteryInfoOption] = js.native
  def getBatteryInfo[TOption /* <: GetBatteryInfoOption */](option: TOption): PromisifySuccessResult[TOption, GetBatteryInfoOption] = js.native
  
  /** [Object wx.getBatteryInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfoSync.html)
    *
    * [wx.getBatteryInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfo.html) 的同步版本 */
  def getBatteryInfoSync(): GetBatteryInfoSyncResult = js.native
  
  /** [wx.getBeacons(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.getBeacons.html)
    *
    * 获取所有已搜索到的 iBeacon 设备
    *
    * 最低基础库： `1.2.0` */
  def getBeacons[TOption /* <: GetBeaconsOption */](): PromisifySuccessResult[TOption, GetBeaconsOption] = js.native
  def getBeacons[TOption /* <: GetBeaconsOption */](option: TOption): PromisifySuccessResult[TOption, GetBeaconsOption] = js.native
  
  /** [wx.getBluetoothAdapterState(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.getBluetoothAdapterState.html)
  *
  * 获取本机蓝牙适配器状态。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.getBluetoothAdapterState({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getBluetoothAdapterState[TOption /* <: GetBluetoothAdapterStateOption */](): PromisifySuccessResult[TOption, GetBluetoothAdapterStateOption] = js.native
  def getBluetoothAdapterState[TOption /* <: GetBluetoothAdapterStateOption */](option: TOption): PromisifySuccessResult[TOption, GetBluetoothAdapterStateOption] = js.native
  
  /** [wx.getBluetoothDevices(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.getBluetoothDevices.html)
  *
  * 获取在蓝牙模块生效期间所有已发现的蓝牙设备。包括已经和本机处于连接状态的设备。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  *
  * ```js
  // ArrayBuffer转16进度字符串示例
  function ab2hex(buffer) {
    var hexArr = Array.prototype.map.call(
    new Uint8Array(buffer),
    function(bit) {
    return ('00' + bit.toString(16)).slice(-2)
    }
    )
    return hexArr.join('');
  }
  wx.getBluetoothDevices({
    success: function (res) {
    console.log(res)
    if (res.devices[0]) {
    console.log(ab2hex(res.devices[0].advertisData))
    }
    }
  })
  ```
  *
  * **注意事项**
  *
  *
  * - 该接口获取到的设备列表为**蓝牙模块生效期间所有搜索到的蓝牙设备**，若在蓝牙模块使用流程结束后未及时调用 [wx.closeBluetoothAdapter](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.closeBluetoothAdapter.html) 释放资源，会存在调用该接口会返回之前的蓝牙使用流程中搜索到的蓝牙设备，可能设备已经不在用户身边，无法连接。
  * - 蓝牙设备在被搜索到时，系统返回的 name 字段一般为广播包中的 LocalName 字段中的设备名称，而如果与蓝牙设备建立连接，系统返回的 name 字段会改为从蓝牙设备上获取到的 `GattName`。若需要动态改变设备名称并展示，建议使用 `localName` 字段。
  *
  * 最低基础库： `1.1.0` */
  def getBluetoothDevices[TOption /* <: GetBluetoothDevicesOption */](): PromisifySuccessResult[TOption, GetBluetoothDevicesOption] = js.native
  def getBluetoothDevices[TOption /* <: GetBluetoothDevicesOption */](option: TOption): PromisifySuccessResult[TOption, GetBluetoothDevicesOption] = js.native
  
  /** [wx.getClipboardData(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/clipboard/wx.getClipboardData.html)
  *
  * 获取系统剪贴板的内容
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getClipboardData({
    success (res){
    console.log(res.data)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getClipboardData[TOption /* <: GetClipboardDataOption */](): PromisifySuccessResult[TOption, GetClipboardDataOption] = js.native
  def getClipboardData[TOption /* <: GetClipboardDataOption */](option: TOption): PromisifySuccessResult[TOption, GetClipboardDataOption] = js.native
  
  /** [wx.getConnectedBluetoothDevices(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.getConnectedBluetoothDevices.html)
  *
  * 根据 uuid 获取处于已连接状态的设备。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.getConnectedBluetoothDevices({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getConnectedBluetoothDevices[TOption /* <: GetConnectedBluetoothDevicesOption */](option: TOption): PromisifySuccessResult[TOption, GetConnectedBluetoothDevicesOption] = js.native
  
  /** [wx.getConnectedWifi(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.getConnectedWifi.html)
    *
    * 获取已连接中的 Wi-Fi 信息。
    *
    * 最低基础库： `1.6.0` */
  def getConnectedWifi[TOption /* <: GetConnectedWifiOption */](): PromisifySuccessResult[TOption, GetConnectedWifiOption] = js.native
  def getConnectedWifi[TOption /* <: GetConnectedWifiOption */](option: TOption): PromisifySuccessResult[TOption, GetConnectedWifiOption] = js.native
  
  /** [Object wx.getEnterOptionsSync()](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/life-cycle/wx.getEnterOptionsSync.html)
    *
    * 获取本次小程序启动时的参数。如果当前是冷启动，则返回值与 [`App.onLaunch`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onLaunch-Object-object) 的回调参数一致；如果当前是热启动，则返回值与 [`App.onShow`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object) 一致。
    *
    * **返回有效 referrerInfo 的场景**
    *
    *
    * | 场景值 | 场景                            | appId含义  |
    * | ------ | ------------------------------- | ---------- |
    * | 1020   | 公众号 profile 页相关小程序列表 | 来源公众号 |
    * | 1035   | 公众号自定义菜单                | 来源公众号 |
    * | 1036   | App 分享消息卡片                | 来源App    |
    * | 1037   | 小程序打开小程序                | 来源小程序 |
    * | 1038   | 从另一个小程序返回              | 来源小程序 |
    * | 1043   | 公众号模板消息                  | 来源公众号 |
    *
    * **注意**
    *
    *
    * 部分版本在无 `referrerInfo` 的时候会返回 `undefined`，建议使用 `options.referrerInfo && options.referrerInfo.appId` 进行判断。
    *
    * 最低基础库： `2.9.4` */
  def getEnterOptionsSync(): LaunchOptionsApp = js.native
  
  /** [wx.getExtConfig(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ext/wx.getExtConfig.html)
  *
  * 获取[第三方平台](https://developers.weixin.qq.com/miniprogram/dev/devtools/ext.html)自定义的数据字段。
  *
  * **Tips**
  *
  *
  * 1. 本接口暂时无法通过 [wx.canIUse](https://developers.weixin.qq.com/miniprogram/dev/api/base/wx.canIUse.html) 判断是否兼容，开发者需要自行判断 [wx.getExtConfig](https://developers.weixin.qq.com/miniprogram/dev/api/ext/wx.getExtConfig.html) 是否存在来兼容
  *
  * ****
  *
  * ```js
  if (wx.getExtConfig) {
    wx.getExtConfig({
    success (res) {
    console.log(res.extConfig)
    }
    })
  }
  ```
  *
  * 最低基础库： `1.1.0` */
  def getExtConfig[TOption /* <: GetExtConfigOption */](): PromisifySuccessResult[TOption, GetExtConfigOption] = js.native
  def getExtConfig[TOption /* <: GetExtConfigOption */](option: TOption): PromisifySuccessResult[TOption, GetExtConfigOption] = js.native
  
  /** [Object wx.getExtConfigSync()](https://developers.weixin.qq.com/miniprogram/dev/api/ext/wx.getExtConfigSync.html)
  *
  * [wx.getExtConfig](https://developers.weixin.qq.com/miniprogram/dev/api/ext/wx.getExtConfig.html) 的同步版本。
  *
  * **Tips**
  *
  *
  * 1. 本接口暂时无法通过 [wx.canIUse](https://developers.weixin.qq.com/miniprogram/dev/api/base/wx.canIUse.html) 判断是否兼容，开发者需要自行判断 [wx.getExtConfigSync](https://developers.weixin.qq.com/miniprogram/dev/api/ext/wx.getExtConfigSync.html) 是否存在来兼容
  *
  * ****
  *
  * ```js
  let extConfig = wx.getExtConfigSync? wx.getExtConfigSync(): {}
  console.log(extConfig)
  ```
  *
  * 最低基础库： `1.1.0` */
  def getExtConfigSync(): IAnyObject = js.native
  
  /** [wx.getFileInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.getFileInfo.html)
  *
  * 获取文件信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getFileInfo({
    success (res) {
    console.log(res.size)
    console.log(res.digest)
    }
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def getFileInfo[TOption /* <: WxGetFileInfoOption */](option: TOption): PromisifySuccessResult[TOption, WxGetFileInfoOption] = js.native
  
  /** [[FileSystemManager](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.html) wx.getFileSystemManager()](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.getFileSystemManager.html)
    *
    * 获取全局唯一的文件管理器
    *
    * 最低基础库： `1.9.9` */
  def getFileSystemManager(): FileSystemManager = js.native
  
  /** [wx.getGroupEnterInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/group/wx.getGroupEnterInfo.html)
  *
  * 获取群工具小程序启动信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getGroupEnterInfo({
    success(res) {
    // res
    {
    errMsg: 'getGroupEnterInfo:ok',
    encryptedData: '',
    iv: ''
    }
    },
    fail() {
    }
  })
  ```
  *
  * 敏感数据有两种获取方式，一是使用 [加密数据解密算法]((open-ability/signature#加密数据解密算法)) 。
  * 获取得到的开放数据为以下 json 结构（其中 opengid 为当前群的唯一标识）：
  *
  * ```json
  {
    "opengid": "OPENGID"
  }
  ```
  *
  * **Tips**
  *
  *
  * - 如需要展示群名称，小程序可以使用[开放数据组件](https://developers.weixin.qq.com/miniprogram/dev/component/open-data.html)
  * - 小游戏可以通过 `wx.getGroupInfo` 接口获取群名称
  *
  * 最低基础库： `2.10.4` */
  def getGroupEnterInfo(option: GetGroupEnterInfoOption): Unit = js.native
  
  /** [wx.getHCEState(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.getHCEState.html)
  *
  * 判断当前设备是否支持 HCE 能力。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getHCEState({
    success (res) {
    console.log(res.errCode)
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def getHCEState[TOption /* <: GetHCEStateOption */](): PromisifySuccessResult[TOption, GetHCEStateOption] = js.native
  def getHCEState[TOption /* <: GetHCEStateOption */](option: TOption): PromisifySuccessResult[TOption, GetHCEStateOption] = js.native
  
  /** [wx.getImageInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.getImageInfo.html)
  *
  * 获取图片信息。网络图片需先配置download域名才能生效。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/Kd47Sbmr6yYu)
  *
  * ```js
  wx.getImageInfo({
    src: 'images/a.jpg',
    success (res) {
    console.log(res.width)
    console.log(res.height)
    }
  })
  wx.chooseImage({
    success (res) {
    wx.getImageInfo({
    src: res.tempFilePaths[0],
    success (res) {
    console.log(res.width)
    console.log(res.height)
    }
    })
    }
  })
  ``` */
  def getImageInfo[TOption /* <: GetImageInfoOption */](option: TOption): PromisifySuccessResult[TOption, GetImageInfoOption] = js.native
  
  /** [Object wx.getLaunchOptionsSync()](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/life-cycle/wx.getLaunchOptionsSync.html)
    *
    * 获取小程序启动时的参数。与 [`App.onLaunch`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onlaunchobject-object) 的回调参数一致。
    *
    * **返回有效 referrerInfo 的场景**
    *
    *
    * | 场景值 | 场景                            | appId含义  |
    * | ------ | ------------------------------- | ---------- |
    * | 1020   | 公众号 profile 页相关小程序列表 | 来源公众号 |
    * | 1035   | 公众号自定义菜单                | 来源公众号 |
    * | 1036   | App 分享消息卡片                | 来源App    |
    * | 1037   | 小程序打开小程序                | 来源小程序 |
    * | 1038   | 从另一个小程序返回              | 来源小程序 |
    * | 1043   | 公众号模板消息                  | 来源公众号 |
    * | 1069   | 移动应用                    | 来源App |
    *
    * **注意**
    *
    *
    * 部分版本在无`referrerInfo`的时候会返回 `undefined`，建议使用 `options.referrerInfo && options.referrerInfo.appId` 进行判断。
    *
    * 最低基础库： `2.1.2` */
  def getLaunchOptionsSync(): LaunchOptionsApp = js.native
  
  /** [wx.getLocation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.getLocation.html)
  *
  * 获取当前的地理位置、速度。当用户离开小程序后，此接口无法调用。开启高精度定位，接口耗时会增加，可指定 highAccuracyExpireTime 作为超时时间。地图相关使用的坐标格式应为 gcj02。
  *
  * **示例代码**
  *
  *
  *  ```js
    wx.getLocation({
    type: 'wgs84',
    success (res) {
    const latitude = res.latitude
    const longitude = res.longitude
    const speed = res.speed
    const accuracy = res.accuracy
    }
  })
    ```
  *
  * **注意**
  *
  *
  * - 工具中定位模拟使用IP定位，可能会有一定误差。且工具目前仅支持 gcj02 坐标。
  * - 使用第三方服务进行逆地址解析时，请确认第三方服务默认的坐标系，正确进行坐标转换。 */
  def getLocation[TOption /* <: GetLocationOption */](option: TOption): PromisifySuccessResult[TOption, GetLocationOption] = js.native
  
  /** [[LogManager](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/LogManager.html) wx.getLogManager(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/wx.getLogManager.html)
  *
  * 获取日志管理器对象。
  *
  * **示例代码**
  *
  *
  * ```js
  const logger = wx.getLogManager({level: 1})
  logger.log({str: 'hello world'}, 'basic log', 100, [1, 2, 3])
  logger.info({str: 'hello world'}, 'info log', 100, [1, 2, 3])
  logger.debug({str: 'hello world'}, 'debug log', 100, [1, 2, 3])
  logger.warn({str: 'hello world'}, 'warn log', 100, [1, 2, 3])
  ```
  *
  * 最低基础库： `2.1.0` */
  def getLogManager(option: GetLogManagerOption): LogManager = js.native
  
  /** [Object wx.getMenuButtonBoundingClientRect()](https://developers.weixin.qq.com/miniprogram/dev/api/ui/menu/wx.getMenuButtonBoundingClientRect.html)
    *
    * 获取菜单按钮（右上角胶囊按钮）的布局位置信息。坐标信息以屏幕左上角为原点。
    *
    * 最低基础库： `2.1.0` */
  def getMenuButtonBoundingClientRect(): Rect = js.native
  
  /** [[NFCAdapter](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.html) wx.getNFCAdapter()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.getNFCAdapter.html)
    *
    * 获取 NFC 实例
    *
    * **示例代码**
    *
    *
    * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/1WsbDwmb75ig)
    *
    * 最低基础库： `2.11.2` */
  def getNFCAdapter(): NFCAdapter = js.native
  
  /** [wx.getNetworkType(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/network/wx.getNetworkType.html)
  *
  * 获取网络类型
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getNetworkType({
    success (res) {
    const networkType = res.networkType
    }
  })
  ``` */
  def getNetworkType[TOption /* <: GetNetworkTypeOption */](): PromisifySuccessResult[TOption, GetNetworkTypeOption] = js.native
  def getNetworkType[TOption /* <: GetNetworkTypeOption */](option: TOption): PromisifySuccessResult[TOption, GetNetworkTypeOption] = js.native
  
  /** [[Performance](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/Performance.html) wx.getPerformance()](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/wx.getPerformance.html)
  *
  * 获取当前小程序性能相关的信息。
  *
  * ****
  *
  * 目前支持获取以下几类性能指标：
  *
  * | 类别 | 名称 (entryType) | 指标             |
  * | ---- | ---------------- | ---------------- |
  * | 路由 | navigation       | route, appLaunch |
  * | 渲染 | render           | firstRender      |
  * | 脚本 | script           | evaluateScript   |
  *
  *  - route: 路由性能
  *  - appLaunch: 小程序启动耗时
  *  - firstRender: 页面首次渲染耗时
  *  - evaluateScript: 注入脚本耗时
  *
  * **示例代码**
  *
  *
  * ```js
  const performance = wx.getPerformance()
  const observer = performance.createObserver((entryList) => {
    console.log(entryList.getEntries())
  })
  observer.observe({ entryTypes: ['render', 'script'] })
  ```
  *
  * 最低基础库： `2.11.0` */
  def getPerformance(): Performance = js.native
  
  /** [[RealtimeLogManager](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.html) wx.getRealtimeLogManager()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/wx.getRealtimeLogManager.html)
  *
  * 获取实时日志管理器对象。
  *
  * **示例代码**
  *
  *
  * ```js
  const logger = wx.getRealtimeLogManager()
  logger.info({str: 'hello world'}, 'info log', 100, [1, 2, 3])
  logger.error({str: 'hello world'}, 'error log', 100, [1, 2, 3])
  logger.warn({str: 'hello world'}, 'warn log', 100, [1, 2, 3])
  ```
  *
  * 最低基础库： `2.7.1` */
  def getRealtimeLogManager(): RealtimeLogManager = js.native
  
  /** [[RecorderManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.html) wx.getRecorderManager()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.getRecorderManager.html)
    *
    * 获取**全局唯一**的录音管理器 RecorderManager
    *
    * 最低基础库： `1.6.0` */
  def getRecorderManager(): RecorderManager = js.native
  
  /** [wx.getSavedFileInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.getSavedFileInfo.html)
  *
  * 获取本地文件的文件信息。此接口只能用于获取已保存到本地的文件，若需要获取临时文件信息，请使用 [wx.getFileInfo()](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.getFileInfo.html) 接口。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSavedFileList({
    success (res) {
    console.log(res.fileList)
    }
  })
  ``` */
  def getSavedFileInfo[TOption /* <: GetSavedFileInfoOption */](option: TOption): PromisifySuccessResult[TOption, GetSavedFileInfoOption] = js.native
  
  /** [wx.getSavedFileList(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.getSavedFileList.html)
  *
  * 获取该小程序下已保存的本地缓存文件列表
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSavedFileList({
    success (res) {
    console.log(res.fileList)
    }
  })
  ``` */
  def getSavedFileList[TOption /* <: WxGetSavedFileListOption */](): PromisifySuccessResult[TOption, WxGetSavedFileListOption] = js.native
  def getSavedFileList[TOption /* <: WxGetSavedFileListOption */](option: TOption): PromisifySuccessResult[TOption, WxGetSavedFileListOption] = js.native
  
  /** [wx.getScreenBrightness(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/screen/wx.getScreenBrightness.html)
    *
    * 获取屏幕亮度
    *
    * **说明**
    *
    *
    * - 若安卓系统设置中开启了自动调节亮度功能，则屏幕亮度会根据光线自动调整，该接口仅能获取自动调节亮度之前的值，而非实时的亮度值。
    *
    * 最低基础库： `1.2.0` */
  def getScreenBrightness[TOption /* <: GetScreenBrightnessOption */](): PromisifySuccessResult[TOption, GetScreenBrightnessOption] = js.native
  def getScreenBrightness[TOption /* <: GetScreenBrightnessOption */](option: TOption): PromisifySuccessResult[TOption, GetScreenBrightnessOption] = js.native
  
  /** [wx.getSelectedTextRange(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/keyboard/wx.getSelectedTextRange.html)
  *
  * 在input、textarea等focus之后，获取输入框的光标位置。注意：只有在focus的时候调用此接口才有效。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSelectedTextRange({
    complete: res => {
    console.log('getSelectedTextRange res', res.start, res.end)
    }
  })
  ```
  *
  * 最低基础库： `2.7.0` */
  def getSelectedTextRange[TOption /* <: GetSelectedTextRangeOption */](): PromisifySuccessResult[TOption, GetSelectedTextRangeOption] = js.native
  def getSelectedTextRange[TOption /* <: GetSelectedTextRangeOption */](option: TOption): PromisifySuccessResult[TOption, GetSelectedTextRangeOption] = js.native
  
  /** [wx.getSetting(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/wx.getSetting.html)
  *
  * 获取用户的当前设置。**返回值中只会出现小程序已经向用户请求过的[权限](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/authorize.html)**。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSetting({
    success (res) {
    console.log(res.authSetting)
    // res.authSetting = {
    //   "scope.userInfo": true,
    //   "scope.userLocation": true
    // }
    }
  })
  ```
  *
  * ```js
  wx.getSetting({
    withSubscriptions: true,
    success (res) {
    console.log(res.authSetting)
    // res.authSetting = {
    //   "scope.userInfo": true,
    //   "scope.userLocation": true
    // }
    console.log(res.subscriptionsSetting)
    // res.subscriptionsSetting = {
    //   mainSwitch: true, // 订阅消息总开关
    //   itemSettings: {   // 每一项开关
    //     SYS_MSG_TYPE_INTERACTIVE: 'accept', // 小游戏系统订阅消息
    //     SYS_MSG_TYPE_RANK: 'accept'
    //     zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: 'reject', // 普通一次性订阅消息
    //     ke_OZC_66gZxALLcsuI7ilCJSP2OJ2vWo2ooUPpkWrw: 'ban',
    //   }
    // }
    }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def getSetting[TOption /* <: GetSettingOption */](): PromisifySuccessResult[TOption, GetSettingOption] = js.native
  def getSetting[TOption /* <: GetSettingOption */](option: TOption): PromisifySuccessResult[TOption, GetSettingOption] = js.native
  
  /** [wx.getShareInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/share/wx.getShareInfo.html)
  *
  * 获取转发详细信息
  *
  * **示例代码**
  *
  *
  * 敏感数据有两种获取方式，一是使用 [加密数据解密算法]((open-ability/signature#加密数据解密算法)) 。
  * 获取得到的开放数据为以下 json 结构（其中 openGId 为当前群的唯一标识）：
  *
  * ```json
  {
    "openGId": "OPENGID"
  }
  ```
  *
  * **Tips**
  *
  *
  * - 如需要展示群名称，小程序可以使用[开放数据组件](https://developers.weixin.qq.com/miniprogram/dev/component/open-data.html)
  * - 小游戏可以通过 `wx.getGroupInfo` 接口获取群名称
  *
  * 最低基础库： `1.1.0` */
  def getShareInfo(option: GetShareInfoOption): Unit = js.native
  
  /** [wx.getStorage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorage.html)
  *
  * 从本地缓存中异步获取指定 key 的内容
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorage({
    key: 'key',
    success (res) {
    console.log(res.data)
    }
  })
  ```
  *
  * ```js
  try {
    var value = wx.getStorageSync('key')
    if (value) {
    // Do something with return value
    }
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorage[TOption /* <: GetStorageOption */](option: TOption): PromisifySuccessResult[TOption, GetStorageOption] = js.native
  
  /** [wx.getStorageInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageInfo.html)
  *
  * 异步获取当前storage的相关信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorageInfo({
    success (res) {
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getStorageInfoSync()
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorageInfo[TOption /* <: GetStorageInfoOption */](): PromisifySuccessResult[TOption, GetStorageInfoOption] = js.native
  def getStorageInfo[TOption /* <: GetStorageInfoOption */](option: TOption): PromisifySuccessResult[TOption, GetStorageInfoOption] = js.native
  
  /** [Object wx.getStorageInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageInfoSync.html)
  *
  * [wx.getStorageInfo](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageInfo.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorageInfo({
    success (res) {
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getStorageInfoSync()
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorageInfoSync(): GetStorageInfoSyncOption = js.native
  
  /** [any wx.getStorageSync(string key)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageSync.html)
  *
  * [wx.getStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorage({
    key: 'key',
    success (res) {
    console.log(res.data)
    }
  })
  ```
  *
  * ```js
  try {
    var value = wx.getStorageSync('key')
    if (value) {
    // Do something with return value
    }
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorageSync(/** 本地缓存中指定的 key */
  key: String): js.Any = js.native
  
  /** [wx.getSystemInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/base/system/system-info/wx.getSystemInfo.html)
  *
  * 获取系统信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSystemInfo({
    success (res) {
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getSystemInfoSync()
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getSystemInfo[TOption /* <: GetSystemInfoOption */](): PromisifySuccessResult[TOption, GetSystemInfoOption] = js.native
  def getSystemInfo[TOption /* <: GetSystemInfoOption */](option: TOption): PromisifySuccessResult[TOption, GetSystemInfoOption] = js.native
  
  /** [Object wx.getSystemInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/base/system/system-info/wx.getSystemInfoSync.html)
  *
  * [wx.getSystemInfo](https://developers.weixin.qq.com/miniprogram/dev/api/base/system/system-info/wx.getSystemInfo.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSystemInfo({
    success (res) {
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getSystemInfoSync()
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getSystemInfoSync(): GetSystemInfoSyncResult = js.native
  
  /** [[UpdateManager](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.html) wx.getUpdateManager()](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/wx.getUpdateManager.html)
    *
    * 获取**全局唯一**的版本更新管理器，用于管理小程序更新。关于小程序的更新机制，可以查看[运行机制](https://developers.weixin.qq.com/miniprogram/dev/framework/runtime/operating-mechanism.html)文档。
    *
    * 最低基础库： `1.9.90` */
  def getUpdateManager(): UpdateManager = js.native
  
  /** [wx.getUserInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/wx.getUserInfo.html)
  *
  * 获取用户信息。
  *
  * **接口调整说明**
  *
  *
  * 在用户未授权过的情况下调用此接口，将不再出现授权弹窗，会直接进入 fail 回调（详见[《公告》](https://developers.weixin.qq.com/community/develop/doc/0000a26e1aca6012e896a517556c01))。在用户已授权的情况下调用此接口，可成功获取用户信息。
  *
  * **示例代码**
  *
  *
  *
  * ```js
  // 必须是在用户已经授权的情况下调用
  wx.getUserInfo({
    success: function(res) {
    var userInfo = res.userInfo
    var nickName = userInfo.nickName
    var avatarUrl = userInfo.avatarUrl
    var gender = userInfo.gender //性别 0：未知、1：男、2：女
    var province = userInfo.province
    var city = userInfo.city
    var country = userInfo.country
    }
  })
  ```
  *
  * 敏感数据有两种获取方式，一是使用 [加密数据解密算法]((open-ability/signature#加密数据解密算法)) 。
  * 获取得到的开放数据为以下 json 结构：
  *
  * ```json
  {
    "openId": "OPENID",
    "nickName": "NICKNAME",
    "gender": GENDER,
    "city": "CITY",
    "province": "PROVINCE",
    "country": "COUNTRY",
    "avatarUrl": "AVATARURL",
    "unionId": "UNIONID",
    "watermark": {
    "appid":"APPID",
    "timestamp":TIMESTAMP
    }
  }
  ```
  *
  * **小程序用户信息组件示例代码**
  *
  *
  * ```html
  * <!-- 如果只是展示用户头像昵称，可以使用 <open-data /> 组件 -->
  * <open-data type="userAvatarUrl"></open-data>
  * <open-data type="userNickName"></open-data>
  * <!-- 需要使用 button 来授权登录 -->
  * <button wx:if="{{canIUse}}" open-type="getUserInfo" bindgetuserinfo="bindGetUserInfo">授权登录</button>
  * <view wx:else>请升级微信版本</view>
  * ```
  *
  * ```js
  Page({
    data: {
    canIUse: wx.canIUse('button.open-type.getUserInfo')
    },
    onLoad: function() {
    // 查看是否授权
    wx.getSetting({
    success (res){
    if (res.authSetting['scope.userInfo']) {
    // 已经授权，可以直接调用 getUserInfo 获取头像昵称
    wx.getUserInfo({
    success: function(res) {
    console.log(res.userInfo)
    }
    })
    }
    }
    })
    },
    bindGetUserInfo (e) {
    console.log(e.detail.userInfo)
    }
  })
  ``` */
  def getUserInfo(option: GetUserInfoOption): Unit = js.native
  
  /** [wx.getVideoInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.getVideoInfo.html)
    *
    * 获取视频详细信息。
    *
    * 最低基础库： `2.11.0` */
  def getVideoInfo[TOption /* <: GetVideoInfoOption */](option: TOption): PromisifySuccessResult[TOption, GetVideoInfoOption] = js.native
  
  /** [wx.getWeRunData(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/werun/wx.getWeRunData.html)
  *
  * 获取用户过去三十天微信运动步数。需要先调用 [wx.login](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/login/wx.login.html) 接口。步数信息会在用户主动进入小程序时更新。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getWeRunData({
    success (res) {
    // 拿 encryptedData 到开发者后台解密开放数据
    const encryptedData = res.encryptedData
    // 或拿 cloudID 通过云调用直接获取开放数据
    const cloudID = res.cloudID
    }
  })
  ```
  *
  * **开放数据 JSON 结构**
  *
  *
  *
  * 敏感数据有两种获取方式，一是使用 [加密数据解密算法]((open-ability/signature#加密数据解密算法)) 。
  * 获取得到的开放数据为以下 json 结构：
  *
  * ```json
  {
    "stepInfoList": [
    {
    "timestamp": 1445866601,
    "step": 100
    },
    {
    "timestamp": 1445876601,
    "step": 120
    }
    ]
  }
  ```
  *
  * stepInfoList 中，每一项结构如下：
  *
  * | 属性 | 类型 | 说明 |
  * | --- | ---- | --- |
  * | timestamp | number | 时间戳，表示数据对应的时间 |
  * | step | number | 微信运动步数 |
  *
  * 最低基础库： `1.2.0` */
  def getWeRunData(): Unit = js.native
  def getWeRunData(option: GetWeRunDataOption): Unit = js.native
  
  /** [wx.getWifiList(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.getWifiList.html)
    *
    * 请求获取 Wi-Fi 列表。在 `onGetWifiList` 注册的回调中返回 `wifiList` 数据。 **Android 调用前需要 [用户授权](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/authorize.html) scope.userLocation。**
    *
    * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。 iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
    *
    * 最低基础库： `1.6.0` */
  def getWifiList[TOption /* <: GetWifiListOption */](): PromisifySuccessResult[TOption, GetWifiListOption] = js.native
  def getWifiList[TOption /* <: GetWifiListOption */](option: TOption): PromisifySuccessResult[TOption, GetWifiListOption] = js.native
  
  /** [wx.hideHomeButton(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/navigation-bar/wx.hideHomeButton.html)
    *
    * 隐藏返回首页按钮。微信7.0.7版本起，当用户打开的小程序最底层页面是非首页时，默认展示“返回首页”按钮，开发者可在页面 onShow 中调用 hideHomeButton 进行隐藏。
    *
    * 最低基础库： `2.8.3` */
  def hideHomeButton[TOption /* <: HideHomeButtonOption */](): PromisifySuccessResult[TOption, HideHomeButtonOption] = js.native
  def hideHomeButton[TOption /* <: HideHomeButtonOption */](option: TOption): PromisifySuccessResult[TOption, HideHomeButtonOption] = js.native
  
  /** [wx.hideKeyboard(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/keyboard/wx.hideKeyboard.html)
  *
  * 在input、textarea等focus拉起键盘之后，手动调用此接口收起键盘
  *
  * **示例代码**
  *
  *
  * ```js
  wx.hideKeyboard({
    complete: res => {
    console.log('hideKeyboard res', res)
    }
  })
  ```
  *
  * 最低基础库： `2.8.2` */
  def hideKeyboard[TOption /* <: HideKeyboardOption */](): PromisifySuccessResult[TOption, HideKeyboardOption] = js.native
  def hideKeyboard[TOption /* <: HideKeyboardOption */](option: TOption): PromisifySuccessResult[TOption, HideKeyboardOption] = js.native
  
  /** [wx.hideLoading(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.hideLoading.html)
    *
    * 隐藏 loading 提示框
    *
    * 最低基础库： `1.1.0` */
  def hideLoading[TOption /* <: HideLoadingOption */](): PromisifySuccessResult[TOption, HideLoadingOption] = js.native
  def hideLoading[TOption /* <: HideLoadingOption */](option: TOption): PromisifySuccessResult[TOption, HideLoadingOption] = js.native
  
  /** [wx.hideNavigationBarLoading(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/navigation-bar/wx.hideNavigationBarLoading.html)
    *
    * 在当前页面隐藏导航条加载动画 */
  def hideNavigationBarLoading[TOption /* <: HideNavigationBarLoadingOption */](): PromisifySuccessResult[TOption, HideNavigationBarLoadingOption] = js.native
  def hideNavigationBarLoading[TOption /* <: HideNavigationBarLoadingOption */](option: TOption): PromisifySuccessResult[TOption, HideNavigationBarLoadingOption] = js.native
  
  /** [wx.hideShareMenu(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/share/wx.hideShareMenu.html)
  *
  * 隐藏当前页面的转发按钮
  *
  * ****
  *
  * ## 注意事项
  *  - "shareAppMessage"表示“发送给朋友”按钮，"shareTimeline"表示“分享到朋友圈”按钮
  *  - 隐藏“发送给朋友”按钮时必须同时隐藏“分享到朋友圈”按钮，隐藏“分享到朋友圈”按钮时则允许不隐藏“发送给朋友”按钮
  *
  * **示例代码**
  *
  *
  * ```js
  wx.hideShareMenu({
    menus: ['shareAppMessage', 'shareTimeline']
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def hideShareMenu[TOption /* <: HideShareMenuOption */](): PromisifySuccessResult[TOption, HideShareMenuOption] = js.native
  def hideShareMenu[TOption /* <: HideShareMenuOption */](option: TOption): PromisifySuccessResult[TOption, HideShareMenuOption] = js.native
  
  /** [wx.hideTabBar(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.hideTabBar.html)
    *
    * 隐藏 tabBar
    *
    * 最低基础库： `1.9.0` */
  def hideTabBar[TOption /* <: HideTabBarOption */](option: TOption): PromisifySuccessResult[TOption, HideTabBarOption] = js.native
  
  /** [wx.hideTabBarRedDot(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.hideTabBarRedDot.html)
    *
    * 隐藏 tabBar 某一项的右上角的红点
    *
    * 最低基础库： `1.9.0` */
  def hideTabBarRedDot[TOption /* <: HideTabBarRedDotOption */](option: TOption): PromisifySuccessResult[TOption, HideTabBarRedDotOption] = js.native
  
  /** [wx.hideToast(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.hideToast.html)
    *
    * 隐藏消息提示框 */
  def hideToast[TOption /* <: HideToastOption */](): PromisifySuccessResult[TOption, HideToastOption] = js.native
  def hideToast[TOption /* <: HideToastOption */](option: TOption): PromisifySuccessResult[TOption, HideToastOption] = js.native
  
  /** [wx.joinVoIPChat(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.joinVoIPChat.html)
    *
    * 加入 (创建) 实时语音通话，更多信息可见 [实时语音指南](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/voip-chat.html)。调用前需要用户授权 `scope.record`，若房间类型为视频房间需要用户授权 `scope.camera`。
    *
    * 最低基础库： `2.7.0` */
  def joinVoIPChat[TOption /* <: JoinVoIPChatOption */](option: TOption): PromisifySuccessResult[TOption, JoinVoIPChatOption] = js.native
  
  /** [wx.loadFontFace(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/font/wx.loadFontFace.html)
  *
  * 动态加载网络字体，文件地址需为下载类型。[2.10.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)起支持全局生效，需在 `app.js` 中调用。
  *
  * 注意：
  * 1. 字体文件返回的 contet-type 参考 [font](https://www.iana.org/assignments/media-types/media-types.xhtml#font)，格式不正确时会解析失败。
  * 2. 字体链接必须是https（ios不支持http)
  * 3. 字体链接必须是同源下的，或开启了cors支持，小程序的域名是`servicewechat.com`
  * 4. canvas等原生组件不支持使用接口添加的字体
  * 5. 工具里提示 Faild to load font可以忽略
  * 6. [2.10.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 以前仅在调用页面生效。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/b6Zrajm67R2x)
  * ```js
  wx.loadFontFace({
    family: 'Bitstream Vera Serif Bold',
    source: 'url("https://sungd.github.io/Pacifico.ttf")',
    success: console.log
  })
  ```
  *
  * 最低基础库： `2.1.0` */
  def loadFontFace[TOption /* <: LoadFontFaceOption */](option: TOption): PromisifySuccessResult[TOption, LoadFontFaceOption] = js.native
  
  /** [wx.login(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/login/wx.login.html)
  *
  * 调用接口获取登录凭证（code）。通过凭证进而换取用户登录态信息，包括用户的唯一标识（openid）及本次登录的会话密钥（session_key）等。用户数据的加解密通讯需要依赖会话密钥完成。更多使用方法详见 [小程序登录](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/login.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.login({
    success (res) {
    if (res.code) {
    //发起网络请求
    wx.request({
    url: 'https://test.com/onLogin',
    data: {
    code: res.code
    }
    })
    } else {
    console.log('登录失败！' + res.errMsg)
    }
    }
  })
  ``` */
  def login(): Unit = js.native
  def login(option: LoginOption): Unit = js.native
  
  /** [wx.makeBluetoothPair(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.makeBluetoothPair.html)
    *
    * 蓝牙配对接口，仅安卓使用。安卓上蓝牙连接时，部分设备需先配对。
    *
    * 最低基础库： `2.12.0` */
  def makeBluetoothPair[TOption /* <: MakeBluetoothPairOption */](option: TOption): PromisifySuccessResult[TOption, MakeBluetoothPairOption] = js.native
  
  /** [wx.makePhoneCall(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/phone/wx.makePhoneCall.html)
  *
  * 拨打电话
  *
  * **示例代码**
  *
  *
  * ```js
  wx.makePhoneCall({
    phoneNumber: '1340000' //仅为示例，并非真实的电话号码
  })
  ``` */
  def makePhoneCall[TOption /* <: MakePhoneCallOption */](option: TOption): PromisifySuccessResult[TOption, MakePhoneCallOption] = js.native
  
  /** [wx.navigateBack(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.navigateBack.html)
    *
    * 关闭当前页面，返回上一页面或多级页面。可通过 [getCurrentPages](https://developers.weixin.qq.com/miniprogram/dev/reference/api/getCurrentPages.html) 获取当前的页面栈，决定需要返回几层。 */
  def navigateBack[TOption /* <: NavigateBackOption */](): PromisifySuccessResult[TOption, NavigateBackOption] = js.native
  def navigateBack[TOption /* <: NavigateBackOption */](option: TOption): PromisifySuccessResult[TOption, NavigateBackOption] = js.native
  
  /** [wx.navigateBackMiniProgram(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/miniprogram-navigate/wx.navigateBackMiniProgram.html)
  *
  * 返回到上一个小程序。只有在当前小程序是被其他小程序打开时可以调用成功
  *
  * 注意：**微信客户端 iOS 6.5.9，Android 6.5.10 及以上版本支持**
  *
  * **示例代码**
  *
  *
  * ```js
  wx.navigateBackMiniProgram({
    extraData: {
    foo: 'bar'
  },
  success(res) {
    // 返回成功
  }
  })
  ```
  *
  * 最低基础库： `1.3.0` */
  def navigateBackMiniProgram[TOption /* <: NavigateBackMiniProgramOption */](option: TOption): PromisifySuccessResult[TOption, NavigateBackMiniProgramOption] = js.native
  
  /** [wx.navigateTo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.navigateTo.html)
  *
  * 保留当前页面，跳转到应用内的某个页面。但是不能跳到 tabbar 页面。使用 [wx.navigateBack](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.navigateBack.html) 可以返回到原页面。小程序中页面栈最多十层。
  *
  * **示例代码**
  *
  *
  *
  * ```js
  wx.navigateTo({
    url: 'test?id=1',
    events: {
    // 为指定事件添加一个监听器，获取被打开页面传送到当前页面的数据
    acceptDataFromOpenedPage: function(data) {
    console.log(data)
    },
    someEvent: function(data) {
    console.log(data)
    }
    ...
    },
    success: function(res) {
    // 通过eventChannel向被打开页面传送数据
    res.eventChannel.emit('acceptDataFromOpenerPage', { data: 'test' })
    }
  })
  ```
  *
  * ```javascript
  //test.js
  Page({
    onLoad: function(option){
    console.log(option.query)
    const eventChannel = this.getOpenerEventChannel()
    eventChannel.emit('acceptDataFromOpenedPage', {data: 'test'});
    eventChannel.emit('someEvent', {data: 'test'});
    // 监听acceptDataFromOpenerPage事件，获取上一页面通过eventChannel传送到当前页面的数据
    eventChannel.on('acceptDataFromOpenerPage', function(data) {
    console.log(data)
    })
    }
  })
  ``` */
  def navigateTo[TOption /* <: NavigateToOption */](option: TOption): PromisifySuccessResult[TOption, NavigateToOption] = js.native
  
  /** [wx.navigateToMiniProgram(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/miniprogram-navigate/wx.navigateToMiniProgram.html)
  *
  * 打开另一个小程序
  *
  * **使用限制**
  *
  *
  *  ##### 需要用户触发跳转
  *  从 2.3.0 版本开始，若用户未点击小程序页面任意位置，则开发者将无法调用此接口自动跳转至其他小程序。
  *  ##### 需要用户确认跳转
  *  从 2.3.0 版本开始，在跳转至其他小程序前，将统一增加弹窗，询问是否跳转，用户确认后才可以跳转其他小程序。如果用户点击取消，则回调 `fail cancel`。
  *  ##### 无需声明跳转名单，不限跳转数量（众测中）
  * 1. 从2020年4月24日起，使用跳转其他小程序功能将无需在全局配置中声明跳转名单，调用此接口时将不再校验所跳转的 AppID 是否在 navigateToMiniProgramAppIdList 中。
  * 2. 从2020年4月24日起，跳转其他小程序将不再受数量限制，使用此功能时请注意遵守运营规范。
  *
  * **运营规范**
  *
  *
  * 平台将坚决打击小程序盒子等互推行为，使用此功能时请严格遵守[《微信小程序平台运营规范》](https://developers.weixin.qq.com/miniprogram/product/#_5-10-%E4%BA%92%E6%8E%A8%E8%A1%8C%E4%B8%BA)，若发现小程序违反运营规范将被下架处理。
  *
  * **关于调试**
  *
  *
  * - 在开发者工具上调用此 API 并不会真实的跳转到另外的小程序，但是开发者工具会校验本次调用跳转是否成功。[详情](https://developers.weixin.qq.com/miniprogram/dev/devtools/different.html#跳转小程序调试支持)
  * - 开发者工具上支持被跳转的小程序处理接收参数的调试。[详情](https://developers.weixin.qq.com/miniprogram/dev/devtools/different.html#跳转小程序调试支持)
  *
  * **示例代码**
  *
  *
  * ```js
  wx.navigateToMiniProgram({
    appId: '',
    path: 'page/index/index?id=123',
    extraData: {
    foo: 'bar'
    },
    envVersion: 'develop',
    success(res) {
    // 打开成功
    }
  })
  ```
  *
  * 最低基础库： `1.3.0` */
  def navigateToMiniProgram[TOption /* <: NavigateToMiniProgramOption */](option: TOption): PromisifySuccessResult[TOption, NavigateToMiniProgramOption] = js.native
  
  /** [wx.nextTick(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/custom-component/wx.nextTick.html)
  *
  * 延迟一部分操作到下一个时间片再执行。（类似于 setTimeout）
  *
  * **说明**
  *
  *
  *
  * 因为自定义组件中的 setData 和 triggerEvent 等接口本身是同步的操作，当这几个接口被连续调用时，都是在一个同步流程中执行完的，因此若逻辑不当可能会导致出错。
  *
  * 一个极端的案例：当父组件的 setData 引发了子组件的 triggerEvent，进而使得父组件又进行了一次 setData，期间有通过 wx:if 语句对子组件进行卸载，就有可能引发奇怪的错误，所以对于不需要在一个同步流程内完成的逻辑，可以使用此接口延迟到下一个时间片再执行。
  *
  * **示例代码**
  *
  *
  * ```js
  Component({
    doSth() {
    this.setData({ number: 1 }) // 直接在当前同步流程中执行
    wx.nextTick(() => {
    this.setData({ number: 3 }) // 在当前同步流程结束后，下一个时间片执行
    })
    this.setData({ number: 2 }) // 直接在当前同步流程中执行
    }
  })
  ```
  *
  * 最低基础库： `2.2.3` */
  def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.notifyBLECharacteristicValueChange(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.notifyBLECharacteristicValueChange.html)
  *
  * 启用低功耗蓝牙设备特征值变化时的 notify 功能，订阅特征值。注意：必须设备的特征值支持 notify 或者 indicate 才可以成功调用。
  *
  * 另外，必须先启用 `notifyBLECharacteristicValueChange` 才能监听到设备 `characteristicValueChange` 事件
  *
  * **注意**
  *
  *
  * - 订阅操作成功后需要设备主动更新特征值的 value，才会触发 [wx.onBLECharacteristicValueChange](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.onBLECharacteristicValueChange.html) 回调。
  * - 安卓平台上，在调用 `notifyBLECharacteristicValueChange` 成功后立即调用 `writeBLECharacteristicValue` 接口，在部分机型上会发生 10008 系统错误
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.notifyBLECharacteristicValueChange({
    state: true, // 启用 notify 功能
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    // 这里的 characteristicId 需要在 getBLEDeviceCharacteristics 接口中获取
    characteristicId,
    success (res) {
    console.log('notifyBLECharacteristicValueChange success', res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def notifyBLECharacteristicValueChange[TOption /* <: NotifyBLECharacteristicValueChangeOption */](option: TOption): PromisifySuccessResult[TOption, NotifyBLECharacteristicValueChangeOption] = js.native
  
  /** [wx.offAccelerometerChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.offAccelerometerChange.html)
    *
    * 取消监听加速度数据事件，参数为空，则取消所有的事件监听。
    *
    * 最低基础库： `2.9.3` */
  def offAccelerometerChange(/** 加速度数据事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offAppHide(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offAppHide.html)
    *
    * 取消监听小程序切后台事件
    *
    * 最低基础库： `2.1.2` */
  def offAppHide(): Unit = js.native
  def offAppHide(/** 小程序切后台事件的回调函数 */
  callback: OffAppHideCallback): Unit = js.native
  
  /** [wx.offAppShow(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offAppShow.html)
    *
    * 取消监听小程序切前台事件
    *
    * 最低基础库： `2.1.2` */
  def offAppShow(): Unit = js.native
  def offAppShow(/** 小程序切前台事件的回调函数 */
  callback: OffAppShowCallback): Unit = js.native
  
  /** [wx.offAudioInterruptionBegin(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offAudioInterruptionBegin.html)
    *
    * 取消监听音频因为受到系统占用而被中断开始事件
    *
    * 最低基础库： `2.6.2` */
  def offAudioInterruptionBegin(): Unit = js.native
  def offAudioInterruptionBegin(/** 音频因为受到系统占用而被中断开始事件的回调函数 */
  callback: OffAudioInterruptionBeginCallback): Unit = js.native
  
  /** [wx.offAudioInterruptionEnd(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offAudioInterruptionEnd.html)
    *
    * 取消监听音频中断结束事件
    *
    * 最低基础库： `2.6.2` */
  def offAudioInterruptionEnd(): Unit = js.native
  def offAudioInterruptionEnd(/** 音频中断结束事件的回调函数 */
  callback: OffAudioInterruptionEndCallback): Unit = js.native
  
  /** [wx.offBLECharacteristicValueChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.offBLECharacteristicValueChange.html)
    *
    * 取消监听低功耗蓝牙设备的特征值变化事件。
    *
    * 最低基础库： `2.9.0` */
  def offBLECharacteristicValueChange(/** 低功耗蓝牙设备的特征值变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offBLEConnectionStateChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.offBLEConnectionStateChange.html)
    *
    * 取消监听低功耗蓝牙连接状态的改变事件
    *
    * 最低基础库： `2.9.0` */
  def offBLEConnectionStateChange(/** 低功耗蓝牙连接状态的改变事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offBLEPeripheralConnectionStateChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/wx.offBLEPeripheralConnectionStateChanged.html)
    *
    * 取消监听当前外围设备被连接或断开连接事件
    *
    * 最低基础库： `2.10.3` */
  def offBLEPeripheralConnectionStateChanged(): Unit = js.native
  def offBLEPeripheralConnectionStateChanged(/** 当前外围设备被连接或断开连接事件的回调函数 */
  callback: OffBLEPeripheralConnectionStateChangedCallback): Unit = js.native
  
  /** [wx.offBeaconServiceChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.offBeaconServiceChange.html)
    *
    * 取消监听 iBeacon 服务状态变化事件
    *
    * 最低基础库： `2.8.1` */
  def offBeaconServiceChange(): Unit = js.native
  def offBeaconServiceChange(/** iBeacon 服务状态变化事件的回调函数 */
  callback: OffBeaconServiceChangeCallback): Unit = js.native
  
  /** [wx.offBeaconUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.offBeaconUpdate.html)
    *
    * 取消监听 iBeacon 设备更新事件
    *
    * 最低基础库： `2.8.1` */
  def offBeaconUpdate(): Unit = js.native
  def offBeaconUpdate(/** iBeacon 设备更新事件的回调函数 */
  callback: OffBeaconUpdateCallback): Unit = js.native
  
  /** [wx.offBluetoothAdapterStateChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.offBluetoothAdapterStateChange.html)
    *
    * 取消监听蓝牙适配器状态变化事件。
    *
    * 最低基础库： `2.9.0` */
  def offBluetoothAdapterStateChange(/** 蓝牙适配器状态变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offBluetoothDeviceFound(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.offBluetoothDeviceFound.html)
    *
    * 取消监听寻找到新设备的事件。
    *
    * 最低基础库： `2.9.0` */
  def offBluetoothDeviceFound(/** 寻找到新设备的事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offCompassChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/compass/wx.offCompassChange.html)
    *
    * 取消监听罗盘数据变化事件，参数为空，则取消所有的事件监听。
    *
    * 最低基础库： `2.9.3` */
  def offCompassChange(/** 罗盘数据变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offDeviceMotionChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.offDeviceMotionChange.html)
    *
    * 取消监听设备方向变化事件，参数为空，则取消所有的事件监听。
    *
    * 最低基础库： `2.9.3` */
  def offDeviceMotionChange(/** 设备方向变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offError.html)
    *
    * 取消监听小程序错误事件。
    *
    * 最低基础库： `2.1.2` */
  def offError(/** 小程序错误事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offGetWifiList(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.offGetWifiList.html)
    *
    * 取消监听获取到 Wi-Fi 列表数据事件。
    *
    * 最低基础库： `2.9.0` */
  def offGetWifiList(/** 获取到 Wi-Fi 列表数据事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offGyroscopeChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.offGyroscopeChange.html)
    *
    * 取消监听陀螺仪数据变化事件。
    *
    * 最低基础库： `2.9.3` */
  def offGyroscopeChange(/** 陀螺仪数据变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offHCEMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.offHCEMessage.html)
    *
    * 接收 NFC 设备消息事件，取消事件监听。
    *
    * 最低基础库： `2.8.1` */
  def offHCEMessage(/** 接收 NFC 设备消息事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offKeyboardHeightChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/keyboard/wx.offKeyboardHeightChange.html)
    *
    * 取消监听键盘高度变化事件
    *
    * 最低基础库： `2.9.2` */
  def offKeyboardHeightChange(/** 键盘高度变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offLocalServiceDiscoveryStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.offLocalServiceDiscoveryStop.html)
    *
    * 取消监听 mDNS 服务停止搜索的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceDiscoveryStop(): Unit = js.native
  def offLocalServiceDiscoveryStop(/** mDNS 服务停止搜索的事件的回调函数 */
  callback: OffLocalServiceDiscoveryStopCallback): Unit = js.native
  
  /** [wx.offLocalServiceFound(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.offLocalServiceFound.html)
    *
    * 取消监听 mDNS 服务发现的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceFound(): Unit = js.native
  def offLocalServiceFound(/** mDNS 服务发现的事件的回调函数 */
  callback: OffLocalServiceFoundCallback): Unit = js.native
  
  /** [wx.offLocalServiceLost(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.offLocalServiceLost.html)
    *
    * 取消监听 mDNS 服务离开的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceLost(): Unit = js.native
  def offLocalServiceLost(/** mDNS 服务离开的事件的回调函数 */
  callback: OffLocalServiceLostCallback): Unit = js.native
  
  /** [wx.offLocalServiceResolveFail(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.offLocalServiceResolveFail.html)
    *
    * 取消监听 mDNS 服务解析失败的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceResolveFail(): Unit = js.native
  def offLocalServiceResolveFail(/** mDNS 服务解析失败的事件的回调函数 */
  callback: OffLocalServiceResolveFailCallback): Unit = js.native
  
  /** [wx.offLocationChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.offLocationChange.html)
    *
    * 取消监听实时地理位置变化事件
    *
    * 最低基础库： `2.8.1` */
  def offLocationChange(): Unit = js.native
  def offLocationChange(/** 实时地理位置变化事件的回调函数 */
  callback: OffLocationChangeCallback): Unit = js.native
  
  /** [wx.offMemoryWarning(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/performance/wx.offMemoryWarning.html)
    *
    * 取消监听内存不足告警事件。
    *
    * 最低基础库： `2.9.0` */
  def offMemoryWarning(/** 内存不足告警事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offNetworkStatusChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/network/wx.offNetworkStatusChange.html)
    *
    * 取消监听网络状态变化事件，参数为空，则取消所有的事件监听。
    *
    * 最低基础库： `2.9.3` */
  def offNetworkStatusChange(/** 网络状态变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offPageNotFound(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offPageNotFound.html)
    *
    * 取消监听小程序要打开的页面不存在事件
    *
    * 最低基础库： `2.1.2` */
  def offPageNotFound(): Unit = js.native
  def offPageNotFound(/** 小程序要打开的页面不存在事件的回调函数 */
  callback: OffPageNotFoundCallback): Unit = js.native
  
  /** [wx.offThemeChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offThemeChange.html)
    *
    * 取消监听系统主题改变事件
    *
    * 最低基础库： `2.11.0` */
  def offThemeChange(): Unit = js.native
  def offThemeChange(/** 系统主题改变事件的回调函数 */
  callback: OffThemeChangeCallback): Unit = js.native
  
  /** [wx.offUnhandledRejection(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.offUnhandledRejection.html)
    *
    * 取消监听未处理的 Promise 拒绝事件
    *
    * 最低基础库： `2.10.0` */
  def offUnhandledRejection(): Unit = js.native
  def offUnhandledRejection(/** 未处理的 Promise 拒绝事件的回调函数 */
  callback: OffUnhandledRejectionCallback): Unit = js.native
  
  /** [wx.offUserCaptureScreen(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/screen/wx.offUserCaptureScreen.html)
    *
    * 用户主动截屏事件。取消事件监听。
    *
    * 最低基础库： `2.9.3` */
  def offUserCaptureScreen(): Unit = js.native
  def offUserCaptureScreen(/** 用户主动截屏事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offVoIPChatInterrupted(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.offVoIPChatInterrupted.html)
    *
    * 取消监听被动断开实时语音通话事件。
    *
    * 最低基础库： `2.9.0` */
  def offVoIPChatInterrupted(/** 被动断开实时语音通话事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offVoIPChatMembersChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.offVoIPChatMembersChanged.html)
    *
    * 取消监听实时语音通话成员在线状态变化事件。
    *
    * 最低基础库： `2.9.0` */
  def offVoIPChatMembersChanged(/** 实时语音通话成员在线状态变化事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offVoIPVideoMembersChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.offVoIPVideoMembersChanged.html)
    *
    * 取消监听实时语音通话成员视频状态变化事件
    *
    * 最低基础库： `2.11.0` */
  def offVoIPVideoMembersChanged(): Unit = js.native
  def offVoIPVideoMembersChanged(/** 实时语音通话成员视频状态变化事件的回调函数 */
  callback: OffVoIPVideoMembersChangedCallback): Unit = js.native
  
  /** [wx.offWifiConnected(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.offWifiConnected.html)
    *
    * 取消监听连接上 Wi-Fi 的事件。
    *
    * 最低基础库： `2.9.0` */
  def offWifiConnected(/** 连接上 Wi-Fi 的事件的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [wx.offWindowResize(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/window/wx.offWindowResize.html)
    *
    * 取消监听窗口尺寸变化事件
    *
    * 最低基础库： `2.3.0` */
  def offWindowResize(): Unit = js.native
  def offWindowResize(/** 窗口尺寸变化事件的回调函数 */
  callback: OffWindowResizeCallback): Unit = js.native
  
  /** [wx.onAccelerometerChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.onAccelerometerChange.html)
  *
  * 监听加速度数据事件。频率根据 [wx.startAccelerometer()](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.startAccelerometer.html) 的 interval 参数, 接口调用后会自动开始监听。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onAccelerometerChange(callback)
  ``` */
  def onAccelerometerChange(/** 加速度数据事件的回调函数 */
  callback: OnAccelerometerChangeCallback): Unit = js.native
  
  /** [wx.onAppHide(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onAppHide.html)
    *
    * 监听小程序切后台事件。该事件与 [`App.onHide`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onhide) 的回调时机一致。
    *
    * 最低基础库： `2.1.2` */
  def onAppHide(/** 小程序切后台事件的回调函数 */
  callback: OnAppHideCallback): Unit = js.native
  
  /** [wx.onAppShow(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onAppShow.html)
    *
    * 监听小程序切前台事件。该事件与 [`App.onShow`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onshowobject-object) 的回调参数一致。
    *
    * **返回有效 referrerInfo 的场景**
    *
    *
    * | 场景值 | 场景                            | appId含义  |
    * | ------ | ------------------------------- | ---------- |
    * | 1020   | 公众号 profile 页相关小程序列表 | 来源公众号 |
    * | 1035   | 公众号自定义菜单                | 来源公众号 |
    * | 1036   | App 分享消息卡片                | 来源App    |
    * | 1037   | 小程序打开小程序                | 来源小程序 |
    * | 1038   | 从另一个小程序返回              | 来源小程序 |
    * | 1043   | 公众号模板消息                  | 来源公众号 |
    *
    * **注意**
    *
    *
    * 部分版本在无`referrerInfo`的时候会返回 `undefined`，建议使用 `options.referrerInfo && options.referrerInfo.appId` 进行判断。
    *
    * 最低基础库： `2.1.2` */
  def onAppShow(/** 小程序切前台事件的回调函数 */
  callback: OnAppShowCallback): Unit = js.native
  
  /** [wx.onAudioInterruptionBegin(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onAudioInterruptionBegin.html)
    *
    * 监听音频因为受到系统占用而被中断开始事件。以下场景会触发此事件：闹钟、电话、FaceTime 通话、微信语音聊天、微信视频聊天。此事件触发后，小程序内所有音频会暂停。
    *
    * 最低基础库： `2.6.2` */
  def onAudioInterruptionBegin(/** 音频因为受到系统占用而被中断开始事件的回调函数 */
  callback: OnAudioInterruptionBeginCallback): Unit = js.native
  
  /** [wx.onAudioInterruptionEnd(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onAudioInterruptionEnd.html)
    *
    * 监听音频中断结束事件。在收到 onAudioInterruptionBegin 事件之后，小程序内所有音频会暂停，收到此事件之后才可再次播放成功
    *
    * 最低基础库： `2.6.2` */
  def onAudioInterruptionEnd(/** 音频中断结束事件的回调函数 */
  callback: OnAudioInterruptionEndCallback): Unit = js.native
  
  /** [wx.onBLECharacteristicValueChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.onBLECharacteristicValueChange.html)
  *
  * 监听低功耗蓝牙设备的特征值变化事件。必须先启用 `notifyBLECharacteristicValueChange` 接口才能接收到设备推送的 notification。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  *
  * ```js
  // ArrayBuffer转16进制字符串示例
  function ab2hex(buffer) {
    let hexArr = Array.prototype.map.call(
    new Uint8Array(buffer),
    function(bit) {
    return ('00' + bit.toString(16)).slice(-2)
    }
    )
    return hexArr.join('');
  }
  wx.onBLECharacteristicValueChange(function(res) {
    console.log(`characteristic ${res.characteristicId} has changed, now is ${res.value}`)
    console.log(ab2hex(res.value))
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onBLECharacteristicValueChange(/** 低功耗蓝牙设备的特征值变化事件的回调函数 */
  callback: OnBLECharacteristicValueChangeCallback): Unit = js.native
  
  /** [wx.onBLEConnectionStateChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.onBLEConnectionStateChange.html)
  *
  * 监听低功耗蓝牙连接状态的改变事件。包括开发者主动连接或断开连接，设备丢失，连接异常断开等等
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.onBLEConnectionStateChange(function(res) {
    // 该方法回调中可以用于处理连接意外断开等异常情况
    console.log(`device ${res.deviceId} state has changed, connected: ${res.connected}`)
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onBLEConnectionStateChange(/** 低功耗蓝牙连接状态的改变事件的回调函数 */
  callback: OnBLEConnectionStateChangeCallback): Unit = js.native
  
  /** [wx.onBLEPeripheralConnectionStateChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/wx.onBLEPeripheralConnectionStateChanged.html)
    *
    * 监听当前外围设备被连接或断开连接事件
    *
    * 最低基础库： `2.10.3` */
  def onBLEPeripheralConnectionStateChanged(/** 当前外围设备被连接或断开连接事件的回调函数 */
  callback: OnBLEPeripheralConnectionStateChangedCallback): Unit = js.native
  
  /** [wx.onBackgroundAudioPause(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.onBackgroundAudioPause.html)
    *
    * 监听音乐暂停事件。
    * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
    *  */
  def onBackgroundAudioPause(/** 音乐暂停事件的回调函数 */
  callback: OnBackgroundAudioPauseCallback): Unit = js.native
  
  /** [wx.onBackgroundAudioPlay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.onBackgroundAudioPlay.html)
    *
    * 监听音乐播放事件。
    * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
    *  */
  def onBackgroundAudioPlay(/** 音乐播放事件的回调函数 */
  callback: OnBackgroundAudioPlayCallback): Unit = js.native
  
  /** [wx.onBackgroundAudioStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.onBackgroundAudioStop.html)
    *
    * 监听音乐停止事件。
    * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
    *  */
  def onBackgroundAudioStop(/** 音乐停止事件的回调函数 */
  callback: OnBackgroundAudioStopCallback): Unit = js.native
  
  /** [wx.onBackgroundFetchData(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/background-fetch/wx.onBackgroundFetchData.html)
    *
    * 监听收到 backgroundFetch 数据时的回调
    *
    * 最低基础库： `2.8.0` */
  def onBackgroundFetchData(/** 的回调函数 */
  callback: OnBackgroundFetchDataCallback): Unit = js.native
  
  /** [wx.onBeaconServiceChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.onBeaconServiceChange.html)
    *
    * 监听 iBeacon 服务状态变化事件，仅能注册一个监听
    *
    * 最低基础库： `1.2.0` */
  def onBeaconServiceChange(/** iBeacon 服务状态变化事件的回调函数 */
  callback: OnBeaconServiceChangeCallback): Unit = js.native
  
  /** [wx.onBeaconUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.onBeaconUpdate.html)
    *
    * 监听 iBeacon 设备更新事件，仅能注册一个监听
    *
    * 最低基础库： `1.2.0` */
  def onBeaconUpdate(/** iBeacon 设备更新事件的回调函数 */
  callback: OnBeaconUpdateCallback): Unit = js.native
  
  /** [wx.onBluetoothAdapterStateChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.onBluetoothAdapterStateChange.html)
  *
  * 监听蓝牙适配器状态变化事件
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.onBluetoothAdapterStateChange(function (res) {
    console.log('adapterState changed, now is', res)
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onBluetoothAdapterStateChange(/** 蓝牙适配器状态变化事件的回调函数 */
  callback: OnBluetoothAdapterStateChangeCallback): Unit = js.native
  
  /** [wx.onBluetoothDeviceFound(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.onBluetoothDeviceFound.html)
  *
  * 监听寻找到新设备的事件
  *
  * **注意**
  *
  *
  * - 若在 [wx.onBluetoothDeviceFound](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.onBluetoothDeviceFound.html) 回调了某个设备，则此设备会添加到 [wx.getBluetoothDevices](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.getBluetoothDevices.html) 接口获取到的数组中。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  *
  * ```js
  // ArrayBuffer转16进度字符串示例
  function ab2hex(buffer) {
    var hexArr = Array.prototype.map.call(
    new Uint8Array(buffer),
    function(bit) {
    return ('00' + bit.toString(16)).slice(-2)
    }
    )
    return hexArr.join('');
  }
  wx.onBluetoothDeviceFound(function(res) {
    var devices = res.devices;
    console.log('new device list has founded')
    console.dir(devices)
    console.log(ab2hex(devices[0].advertisData))
  })
  ```
  *
  * **注意**
  *
  *
  * - 安卓下部分机型需要有位置权限才能搜索到设备，需留意是否开启了位置权限
  *
  * 最低基础库： `1.1.0` */
  def onBluetoothDeviceFound(/** 寻找到新设备的事件的回调函数 */
  callback: OnBluetoothDeviceFoundCallback): Unit = js.native
  
  /** [wx.onCompassChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/compass/wx.onCompassChange.html)
    *
    * 监听罗盘数据变化事件。频率：5 次/秒，接口调用后会自动开始监听，可使用 wx.stopCompass 停止监听。
    *
    * **accuracy 在 iOS/Android 的差异**
    *
    *
    * 由于平台差异，accuracy 在 iOS/Android 的值不同。
    *
    * - iOS：accuracy 是一个 number 类型的值，表示相对于磁北极的偏差。0 表示设备指向磁北，90 表示指向东，180 表示指向南，依此类推。
    * - Android：accuracy 是一个 string 类型的枚举值。
    *
    * | 值              | 说明                                                                                   |
    * | --------------- | -------------------------------------------------------------------------------------- |
    * | high            | 高精度                                                                                 |
    * | medium          | 中等精度                                                                               |
    * | low             | 低精度                                                                                 |
    * | no-contact      | 不可信，传感器失去连接                                                                 |
    * | unreliable      | 不可信，原因未知                                                                       |
    * | unknow ${value} | 未知的精度枚举值，即该 Android 系统此时返回的表示精度的 value 不是一个标准的精度枚举值 | */
  def onCompassChange(/** 罗盘数据变化事件的回调函数 */
  callback: OnCompassChangeCallback): Unit = js.native
  
  /** [wx.onDeviceMotionChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.onDeviceMotionChange.html)
    *
    * 监听设备方向变化事件。频率根据 [wx.startDeviceMotionListening()](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.startDeviceMotionListening.html) 的 interval 参数。可以使用 [wx.stopDeviceMotionListening()](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.stopDeviceMotionListening.html) 停止监听。
    *
    * 最低基础库： `2.3.0` */
  def onDeviceMotionChange(/** 设备方向变化事件的回调函数 */
  callback: OnDeviceMotionChangeCallback): Unit = js.native
  
  /** [wx.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onError.html)
    *
    * 监听小程序错误事件。如脚本错误或 API 调用报错等。该事件与 [`App.onError`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onerrorstring-error) 的回调时机与参数一致。
    *
    * 最低基础库： `2.1.2` */
  def onError(/** 小程序错误事件的回调函数 */
  callback: OnAppErrorCallback): Unit = js.native
  
  /** [wx.onGetWifiList(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.onGetWifiList.html)
    *
    * 监听获取到 Wi-Fi 列表数据事件
    *
    * 最低基础库： `1.6.0` */
  def onGetWifiList(/** 获取到 Wi-Fi 列表数据事件的回调函数 */
  callback: OnGetWifiListCallback): Unit = js.native
  
  /** [wx.onGyroscopeChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.onGyroscopeChange.html)
    *
    * 监听陀螺仪数据变化事件。频率根据 [wx.startGyroscope()](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.startGyroscope.html) 的 interval 参数。可以使用 [wx.stopGyroscope()](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.stopGyroscope.html) 停止监听。
    *
    * 最低基础库： `2.3.0` */
  def onGyroscopeChange(/** 陀螺仪数据变化事件的回调函数 */
  callback: OnGyroscopeChangeCallback): Unit = js.native
  
  /** [wx.onHCEMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.onHCEMessage.html)
    *
    * 监听接收 NFC 设备消息事件，仅能注册一个监听
    *
    * 最低基础库： `1.7.0` */
  def onHCEMessage(/** 接收 NFC 设备消息事件的回调函数 */
  callback: OnHCEMessageCallback): Unit = js.native
  
  /** [wx.onKeyboardHeightChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/keyboard/wx.onKeyboardHeightChange.html)
  *
  * 监听键盘高度变化
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onKeyboardHeightChange(res => {
    console.log(res.height)
  })
  ```
  *
  * 最低基础库： `2.7.0` */
  def onKeyboardHeightChange(callback: OnKeyboardHeightChangeCallback): Unit = js.native
  
  /** [wx.onLocalServiceDiscoveryStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.onLocalServiceDiscoveryStop.html)
    *
    * 监听 mDNS 服务停止搜索的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceDiscoveryStop(/** mDNS 服务停止搜索的事件的回调函数 */
  callback: OnLocalServiceDiscoveryStopCallback): Unit = js.native
  
  /** [wx.onLocalServiceFound(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.onLocalServiceFound.html)
    *
    * 监听 mDNS 服务发现的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceFound(/** mDNS 服务发现的事件的回调函数 */
  callback: OnLocalServiceFoundCallback): Unit = js.native
  
  /** [wx.onLocalServiceLost(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.onLocalServiceLost.html)
    *
    * 监听 mDNS 服务离开的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceLost(/** mDNS 服务离开的事件的回调函数 */
  callback: OnLocalServiceLostCallback): Unit = js.native
  
  /** [wx.onLocalServiceResolveFail(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.onLocalServiceResolveFail.html)
    *
    * 监听 mDNS 服务解析失败的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceResolveFail(/** mDNS 服务解析失败的事件的回调函数 */
  callback: OnLocalServiceResolveFailCallback): Unit = js.native
  
  /** [wx.onLocationChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.onLocationChange.html)
  *
  * 监听实时地理位置变化事件，需结合 [wx.startLocationUpdateBackground](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.startLocationUpdateBackground.html)、[wx.startLocationUpdate](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.startLocationUpdate.html)使用。
  *
  * **示例代码**
  *
  *
  * ```js
    const _locationChangeFn = function(res) {
    console.log('location change', res)
    }
    wx.onLocationChange(_locationChangeFn)
    wx.offLocationChange(_locationChangeFn)
  ```
  *
  * 最低基础库： `2.8.1` */
  def onLocationChange(/** 实时地理位置变化事件的回调函数 */
  callback: OnLocationChangeCallback): Unit = js.native
  
  /** [wx.onMemoryWarning(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/performance/wx.onMemoryWarning.html)
    *
    * 监听内存不足告警事件。
    *
    * 当 iOS/Android 向小程序进程发出内存警告时，触发该事件。触发该事件不意味小程序被杀，大部分情况下仅仅是告警，开发者可在收到通知后回收一些不必要资源避免进一步加剧内存紧张。
    *
    * **示例代码**
    *
    *
    * ```js
    * wx.onMemoryWarning(function () {
    *   console.log('onMemoryWarningReceive')
    * })
    * ``
    *
    * 最低基础库： `2.0.2` */
  def onMemoryWarning(/** 内存不足告警事件的回调函数 */
  callback: OnMemoryWarningCallback): Unit = js.native
  
  /** [wx.onNetworkStatusChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/network/wx.onNetworkStatusChange.html)
  *
  * 监听网络状态变化事件
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onNetworkStatusChange(function (res) {
    console.log(res.isConnected)
    console.log(res.networkType)
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onNetworkStatusChange(/** 网络状态变化事件的回调函数 */
  callback: OnNetworkStatusChangeCallback): Unit = js.native
  
  /** [wx.onPageNotFound(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onPageNotFound.html)
    *
    * 监听小程序要打开的页面不存在事件。该事件与 [`App.onPageNotFound`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onpagenotfoundobject-object) 的回调时机一致。
    *
    * **注意**
    *
    *
    * - 开发者可以在回调中进行页面重定向，但必须在回调中**同步**处理，异步处理（例如 `setTimeout` 异步执行）无效。
    * - 若开发者没有调用 [wx.onPageNotFound](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onPageNotFound.html) 绑定监听，也没有声明 `App.onPageNotFound`，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * - 如果回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再第二次回调。
    *
    * 最低基础库： `2.1.2` */
  def onPageNotFound(/** 小程序要打开的页面不存在事件的回调函数 */
  callback: OnPageNotFoundCallback): Unit = js.native
  
  /** [wx.onSocketClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.onSocketClose.html)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onSocketClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: OnSocketCloseCallback): Unit = js.native
  
  /** [wx.onSocketError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.onSocketError.html)
    *
    * 监听 WebSocket 错误事件 */
  def onSocketError(/** WebSocket 错误事件的回调函数 */
  callback: OnSocketErrorCallback): Unit = js.native
  
  /** [wx.onSocketMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.onSocketMessage.html)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onSocketMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: OnSocketMessageCallback): Unit = js.native
  
  /** [wx.onSocketOpen(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.onSocketOpen.html)
    *
    * 监听 WebSocket 连接打开事件 */
  def onSocketOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnSocketOpenCallback): Unit = js.native
  
  /** [wx.onThemeChange(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onThemeChange.html)
    *
    * 监听系统主题改变事件。该事件与 [`App.onThemeChange`](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onThemeChange-Object-object) 的回调时机一致。
    *
    * **注意**
    *
    *
    * - 只有在全局配置"darkmode": true时才会触发此事件。
    *
    * 最低基础库： `2.11.0` */
  def onThemeChange(/** 系统主题改变事件的回调函数 */
  callback: OnThemeChangeCallback): Unit = js.native
  
  /** [wx.onUnhandledRejection(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)
    *
    * 监听未处理的 Promise 拒绝事件。该事件与 `App.onUnhandledRejection` 的回调时机与参数一致。
    *
    * **注意**
    *
    *
    * - 安卓平台暂时不支持该事件
    * - 所有的 unhandledRejection 都可以被这一监听捕获，但只有 Error 类型的才会在小程序后台触发报警。
    *
    * 最低基础库： `2.10.0` */
  def onUnhandledRejection(/** 未处理的 Promise 拒绝事件的回调函数 */
  callback: OnUnhandledRejectionCallback): Unit = js.native
  
  /** [wx.onUserCaptureScreen(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/screen/wx.onUserCaptureScreen.html)
  *
  * 监听用户主动截屏事件。用户使用系统截屏按键截屏时触发，只能注册一个监听
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onUserCaptureScreen(function (res) {
    console.log('用户截屏了')
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def onUserCaptureScreen(/** 用户主动截屏事件的回调函数 */
  callback: OnUserCaptureScreenCallback): Unit = js.native
  
  /** [wx.onVoIPChatInterrupted(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.onVoIPChatInterrupted.html)
    *
    * 监听被动断开实时语音通话事件。包括小游戏切入后端时断开
    *
    * 最低基础库： `2.7.0` */
  def onVoIPChatInterrupted(/** 被动断开实时语音通话事件的回调函数 */
  callback: OnVoIPChatInterruptedCallback): Unit = js.native
  
  /** [wx.onVoIPChatMembersChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.onVoIPChatMembersChanged.html)
    *
    * 监听实时语音通话成员在线状态变化事件。有成员加入/退出通话时触发回调
    *
    * 最低基础库： `2.7.0` */
  def onVoIPChatMembersChanged(/** 实时语音通话成员在线状态变化事件的回调函数 */
  callback: OnVoIPChatMembersChangedCallback): Unit = js.native
  
  /** [wx.onVoIPChatSpeakersChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.onVoIPChatSpeakersChanged.html)
    *
    * 监听实时语音通话成员通话状态变化事件。有成员开始/停止说话时触发回调
    *
    * 最低基础库： `2.7.0` */
  def onVoIPChatSpeakersChanged(/** 实时语音通话成员通话状态变化事件的回调函数 */
  callback: OnVoIPChatSpeakersChangedCallback): Unit = js.native
  
  /** [wx.onVoIPVideoMembersChanged(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.onVoIPVideoMembersChanged.html)
    *
    * 监听实时语音通话成员视频状态变化事件。
    *
    * 最低基础库： `2.11.0` */
  def onVoIPVideoMembersChanged(/** 实时语音通话成员视频状态变化事件的回调函数 */
  callback: OnVoIPVideoMembersChangedCallback): Unit = js.native
  
  /** [wx.onWifiConnected(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.onWifiConnected.html)
    *
    * 监听连接上 Wi-Fi 的事件
    *
    * 最低基础库： `1.6.0` */
  def onWifiConnected(/** 连接上 Wi-Fi 的事件的回调函数 */
  callback: OnWifiConnectedCallback): Unit = js.native
  
  /** [wx.onWindowResize(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/window/wx.onWindowResize.html)
    *
    * 监听窗口尺寸变化事件
    *
    * 最低基础库： `2.3.0` */
  def onWindowResize(/** 窗口尺寸变化事件的回调函数 */
  callback: OnWindowResizeCallback): Unit = js.native
  
  /** [wx.openBluetoothAdapter(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.openBluetoothAdapter.html)
  *
  * 初始化蓝牙模块。iOS 上开启主机/从机模式时需分别调用一次，指定对应的 `mode`。
  *
  * **object.fail 回调函数返回的 state 参数（仅 iOS）**
  *
  *
  * | 状态码 | 说明   |
  * | ------ | ------ |
  * | 0      | 未知   |
  * | 1      | 重置中 |
  * | 2      | 不支持 |
  * | 3      | 未授权 |
  * | 4      | 未开启 |
  *
  * **注意**
  *
  *
  * - 其他蓝牙相关 API 必须在 [wx.openBluetoothAdapter](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.openBluetoothAdapter.html) 调用之后使用。否则 API 会返回错误（errCode=10000）。
  * - 在用户蓝牙开关未开启或者手机不支持蓝牙功能的情况下，调用 [wx.openBluetoothAdapter](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.openBluetoothAdapter.html) 会返回错误（errCode=10001），表示手机蓝牙功能不可用。此时小程序蓝牙模块已经初始化完成，可通过 [wx.onBluetoothAdapterStateChange](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.onBluetoothAdapterStateChange.html) 监听手机蓝牙状态的改变，也可以调用蓝牙模块的所有API。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.openBluetoothAdapter({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def openBluetoothAdapter[TOption /* <: OpenBluetoothAdapterOption */](): PromisifySuccessResult[TOption, OpenBluetoothAdapterOption] = js.native
  def openBluetoothAdapter[TOption /* <: OpenBluetoothAdapterOption */](option: TOption): PromisifySuccessResult[TOption, OpenBluetoothAdapterOption] = js.native
  
  /** [wx.openCard(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/card/wx.openCard.html)
  *
  * 查看微信卡包中的卡券。只有通过 [认证](https://developers.weixin.qq.com/miniprogram/product/renzheng.html) 的小程序或文化互动类目的小游戏才能使用。更多文档请参考 [微信卡券接口文档](https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.openCard({
    cardList: [{
    cardId: '',
    code: ''
    }, {
    cardId: '',
    code: ''
    }],
    success (res) { }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def openCard[TOption /* <: OpenCardOption */](option: TOption): PromisifySuccessResult[TOption, OpenCardOption] = js.native
  
  /** [wx.openDocument(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.openDocument.html)
    *
    * 新开页面打开文档。微信客户端 `7.0.12` 版本前默认显示右上角菜单按钮，之后的版本默认不显示，需主动传入 `showMenu`。 */
  def openDocument[TOption /* <: OpenDocumentOption */](option: TOption): PromisifySuccessResult[TOption, OpenDocumentOption] = js.native
  
  /** [wx.openLocation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.openLocation.html)
  *
  * 使用微信内置地图查看位置
  *
  * **示例代码**
  *
  *
  *  ```js
    wx.getLocation({
    type: 'gcj02', //返回可以用于wx.openLocation的经纬度
    success (res) {
    const latitude = res.latitude
    const longitude = res.longitude
    wx.openLocation({
    latitude,
    longitude,
    scale: 18
    })
    }
  })
    ``` */
  def openLocation[TOption /* <: OpenLocationOption */](option: TOption): PromisifySuccessResult[TOption, OpenLocationOption] = js.native
  
  /** [wx.openSetting(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/wx.openSetting.html)
  *
  * 调起客户端小程序设置界面，返回用户设置的操作结果。**设置界面只会出现小程序已经向用户请求过的[权限](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/authorize.html)**。
  *
  * ****
  *
  * - 注意：[2.3.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 版本开始，用户发生点击行为后，才可以跳转打开设置页，管理授权信息。[详情](https://developers.weixin.qq.com/community/develop/doc/000cea2305cc5047af5733de751008)
  *
  * **示例代码**
  *
  *
  * ```js
  wx.openSetting({
    success (res) {
    console.log(res.authSetting)
    // res.authSetting = {
    //   "scope.userInfo": true,
    //   "scope.userLocation": true
    // }
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def openSetting[TOption /* <: OpenSettingOption */](): PromisifySuccessResult[TOption, OpenSettingOption] = js.native
  def openSetting[TOption /* <: OpenSettingOption */](option: TOption): PromisifySuccessResult[TOption, OpenSettingOption] = js.native
  
  /** [wx.openVideoEditor(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.openVideoEditor.html)
    *
    * 打开视频编辑器
    *
    * 最低基础库： `2.12.0` */
  def openVideoEditor(option: OpenVideoEditorOption): Unit = js.native
  
  /** [wx.pageScrollTo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/scroll/wx.pageScrollTo.html)
  *
  * 将页面滚动到目标位置，支持选择器和滚动距离两种方式定位
  *
  * **selector 语法**
  *
  *
  * selector类似于 CSS 的选择器，但仅支持下列语法。
  *
  * + ID选择器：#the-id
  * + class选择器（可以连续指定多个）：.a-class.another-class
  * + 子元素选择器：.the-parent > .the-child
  * + 后代选择器：.the-ancestor .the-descendant
  * + 跨自定义组件的后代选择器：.the-ancestor >>> .the-descendant
  * + 多选择器的并集：#a-node, .some-other-nodes
  *
  * **示例代码**
  *
  *
  * ```js
  wx.pageScrollTo({
    scrollTop: 0,
    duration: 300
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def pageScrollTo[TOption /* <: PageScrollToOption */](option: TOption): PromisifySuccessResult[TOption, PageScrollToOption] = js.native
  
  /** [wx.pauseBackgroundAudio(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.pauseBackgroundAudio.html)
  *
  * 暂停播放音乐。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.pauseBackgroundAudio()
  ```
  * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
  *  */
  def pauseBackgroundAudio[TOption /* <: PauseBackgroundAudioOption */](): PromisifySuccessResult[TOption, PauseBackgroundAudioOption] = js.native
  def pauseBackgroundAudio[TOption /* <: PauseBackgroundAudioOption */](option: TOption): PromisifySuccessResult[TOption, PauseBackgroundAudioOption] = js.native
  
  /** [wx.pauseVoice(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.pauseVoice.html)
  *
  * 暂停正在播放的语音。再次调用 [wx.playVoice](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.playVoice.html) 播放同一个文件时，会从暂停处开始播放。如果想从头开始播放，需要先调用 [wx.stopVoice](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.stopVoice.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    wx.playVoice({
    filePath: tempFilePath
    })
    setTimeout(() => { wx.pauseVoice() }, 5000)
    }
  })
  ```
  * @deprecated 基础库版本 [1.6.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.createInnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html) 替换
  *  */
  def pauseVoice[TOption /* <: PauseVoiceOption */](): PromisifySuccessResult[TOption, PauseVoiceOption] = js.native
  def pauseVoice[TOption /* <: PauseVoiceOption */](option: TOption): PromisifySuccessResult[TOption, PauseVoiceOption] = js.native
  
  /** [wx.playBackgroundAudio(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.playBackgroundAudio.html)
  *
  * 使用后台播放器播放音乐。对于微信客户端来说，只能同时有一个后台音乐在播放。当用户离开小程序后，音乐将暂停播放；当用户在其他小程序占用了音乐播放器，原有小程序内的音乐将停止播放。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.playBackgroundAudio({
    dataUrl: '',
    title: '',
    coverImgUrl: ''
  })
  ```
  * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
  *  */
  def playBackgroundAudio[TOption /* <: PlayBackgroundAudioOption */](option: TOption): PromisifySuccessResult[TOption, PlayBackgroundAudioOption] = js.native
  
  /** [wx.playVoice(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.playVoice.html)
  *
  * 开始播放语音。同时只允许一个语音文件正在播放，如果前一个语音文件还没播放完，将中断前一个语音播放。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    wx.playVoice({
    filePath: tempFilePath,
    complete () { }
    })
    }
  })
  ```
  * @deprecated 基础库版本 [1.6.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.createInnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html) 替换
  *  */
  def playVoice[TOption /* <: PlayVoiceOption */](option: TOption): PromisifySuccessResult[TOption, PlayVoiceOption] = js.native
  
  /** [wx.previewImage(Object object, boolean showmenu)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.previewImage.html)
  *
  * 在新页面中全屏预览图片。预览的过程中用户可以进行保存图片、发送给朋友等操作。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.previewImage({
    current: '', // 当前显示图片的http链接
    urls: [] // 需要预览的图片http链接列表
  })
  ``` */
  def previewImage[TOption /* <: PreviewImageOption */](option: TOption): PromisifySuccessResult[TOption, PreviewImageOption] = js.native
  def previewImage[TOption /* <: PreviewImageOption */](option: TOption, /** 是否显示长按菜单
    *
    * 最低基础库： `2.13.0` */
  showmenu: Boolean): PromisifySuccessResult[TOption, PreviewImageOption] = js.native
  
  /** [wx.previewMedia(Object object, boolean showmenu)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.previewMedia.html)
    *
    * 预览图片和视频。
    *
    * 最低基础库： `2.12.0` */
  def previewMedia[TOption /* <: PreviewMediaOption */](option: TOption): PromisifySuccessResult[TOption, PreviewMediaOption] = js.native
  def previewMedia[TOption /* <: PreviewMediaOption */](option: TOption, /** 是否显示长按菜单
    *
    * 最低基础库： `2.13.0` */
  showmenu: Boolean): PromisifySuccessResult[TOption, PreviewMediaOption] = js.native
  
  /** [wx.reLaunch(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.reLaunch.html)
  *
  * 关闭所有页面，打开到应用内的某个页面
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reLaunch({
    url: 'test?id=1'
  })
  ```
  *
  * ```html
  * // test
  * Page({
  *   onLoad (option) {
  *     console.log(option.query)
  *   }
  * })
  * ```
  *
  * 最低基础库： `1.1.0` */
  def reLaunch[TOption /* <: ReLaunchOption */](option: TOption): PromisifySuccessResult[TOption, ReLaunchOption] = js.native
  
  /** [wx.readBLECharacteristicValue(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.readBLECharacteristicValue.html)
  *
  * 读取低功耗蓝牙设备的特征值的二进制数据值。注意：必须设备的特征值支持 read 才可以成功调用。
  *
  * **注意**
  *
  *
  * - 并行调用多次会存在读失败的可能性。
  * - 接口读取到的信息需要在 `onBLECharacteristicValueChange` 方法注册的回调中获取。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  // 必须在这里的回调才能获取
  wx.onBLECharacteristicValueChange(function(characteristic) {
    console.log('characteristic value comed:', characteristic)
  })
  wx.readBLECharacteristicValue({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    // 这里的 characteristicId 需要在 getBLEDeviceCharacteristics 接口中获取
    characteristicId,
    success (res) {
    console.log('readBLECharacteristicValue:', res.errCode)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def readBLECharacteristicValue[TOption /* <: ReadBLECharacteristicValueOption */](option: TOption): PromisifySuccessResult[TOption, ReadBLECharacteristicValueOption] = js.native
  
  /** [wx.redirectTo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.redirectTo.html)
  *
  * 关闭当前页面，跳转到应用内的某个页面。但是不允许跳转到 tabbar 页面。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.redirectTo({
    url: 'test?id=1'
  })
  ``` */
  def redirectTo[TOption /* <: RedirectToOption */](option: TOption): PromisifySuccessResult[TOption, RedirectToOption] = js.native
  
  /** [wx.removeSavedFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.removeSavedFile.html)
  *
  * 删除本地缓存文件
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSavedFileList({
    success (res) {
    if (res.fileList.length > 0){
    wx.removeSavedFile({
    filePath: res.fileList[0].filePath,
    complete (res) {
    console.log(res)
    }
    })
    }
    }
  })
  ``` */
  def removeSavedFile[TOption /* <: WxRemoveSavedFileOption */](option: TOption): PromisifySuccessResult[TOption, WxRemoveSavedFileOption] = js.native
  
  /** [wx.removeStorage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.removeStorage.html)
  *
  * 从本地缓存中移除指定 key
  *
  * **示例代码**
  *
  *
  * ```js
  wx.removeStorage({
    key: 'key',
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * ```js
  try {
    wx.removeStorageSync('key')
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def removeStorage[TOption /* <: RemoveStorageOption */](option: TOption): PromisifySuccessResult[TOption, RemoveStorageOption] = js.native
  
  /** [wx.removeStorageSync(string key)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.removeStorageSync.html)
  *
  * [wx.removeStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.removeStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.removeStorage({
    key: 'key',
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * ```js
  try {
    wx.removeStorageSync('key')
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def removeStorageSync(/** 本地缓存中指定的 key */
  key: String): Unit = js.native
  
  /** [wx.removeTabBarBadge(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.removeTabBarBadge.html)
    *
    * 移除 tabBar 某一项右上角的文本
    *
    * 最低基础库： `1.9.0` */
  def removeTabBarBadge[TOption /* <: RemoveTabBarBadgeOption */](option: TOption): PromisifySuccessResult[TOption, RemoveTabBarBadgeOption] = js.native
  
  /** [wx.reportAnalytics(string eventName, Object data)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/data-analysis/wx.reportAnalytics.html)
  *
  * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reportAnalytics('purchase', {
    price: 120,
    color: 'red'
  })
  ``` */
  def reportAnalytics(/** 事件名 */
  eventName: String, /** 上报的自定义数据，key 为配置中的字段名，value 为上报的数据。 */
  data: IAnyObject): Unit = js.native
  
  /** [wx.reportMonitor(string name, number value)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/report/wx.reportMonitor.html)
  *
  * 自定义业务数据监控上报接口。
  *
  * **使用说明**
  *
  *
  * 使用前，需要在「小程序管理后台-运维中心-性能监控-业务数据监控」中新建监控事件，配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reportMonitor('1', 1)
  ```
  *
  * 最低基础库： `2.0.1` */
  def reportMonitor(/** 监控ID，在「小程序管理后台」新建数据指标后获得 */
  name: String, /** 上报数值，经处理后会在「小程序管理后台」上展示每分钟的上报总量 */
  value: Double): Unit = js.native
  
  /** [wx.reportPerformance(Number id, Number value, String|Array dimensions)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/wx.reportPerformance.html)
  *
  * 小程序测速上报。使用前，需要在小程序管理后台配置。 详情参见[小程序测速](https://developers.weixin.qq.com/miniprogram/dev/framework/performanceReport/index.html)指南。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reportPerformance(1101, 680)
  wx.reportPerformance(1101, 680, 'custom')
  ```
  *
  * 最低基础库： `2.9.2` */
  def reportPerformance(/** 指标 id */
  id: Double, /** 需要上报的数值 */
  value: Double): Unit = js.native
  def reportPerformance(/** 指标 id */
  id: Double, /** 需要上报的数值 */
  value: Double, /** 自定义维度 (选填) */
  dimensions: String): Unit = js.native
  def reportPerformance(/** 指标 id */
  id: Double, /** 需要上报的数值 */
  value: Double, /** 自定义维度 (选填) */
  dimensions: js.Array[_]): Unit = js.native
  
  /** [[RequestTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/request/RequestTask.html) wx.request(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/request/wx.request.html)
  *
  * 发起 HTTPS 网络请求。使用前请注意阅读[相关说明](https://developers.weixin.qq.com/miniprogram/dev/framework/ability/network.html)。
  *
  * **data 参数说明**
  *
  *
  * 最终发送给服务器的数据是 String 类型，如果传入的 data 不是 String 类型，会被转换成 String 。转换规则如下：
  * - 对于 `GET` 方法的数据，会将数据转换成 query string（`encodeURIComponent(k)=encodeURIComponent(v)&encodeURIComponent(k)=encodeURIComponent(v)...`）
  * - 对于 `POST` 方法且 `header['content-type']` 为 `application/json` 的数据，会对数据进行 JSON 序列化
  * - 对于 `POST` 方法且 `header['content-type']` 为 `application/x-www-form-urlencoded` 的数据，会将数据转换成 query string `（encodeURIComponent(k)=encodeURIComponent(v)&encodeURIComponent(k)=encodeURIComponent(v)...）`
  *
  * **示例代码**
  *
  *
  * ```js
  wx.request({
    url: 'test.php', //仅为示例，并非真实的接口地址
    data: {
    x: '',
    y: ''
    },
    header: {
    'content-type': 'application/json' // 默认值
    },
    success (res) {
    console.log(res.data)
    }
  })
  ``` */
  def request(option: RequestOption): RequestTask = js.native
  
  /** [wx.requestPayment(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/payment/wx.requestPayment.html)
  *
  * 发起微信支付。了解更多信息，可以参考 [微信支付开发文档](https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/pages/api.shtml)：
  * - [开发指引](https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/pay/transactions/chapter2_3.shtml)
  * - [下单接口](https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/pay/transactions/chapter3_2.shtml)
  * - [支付接口](https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/pay/transactions/chapter3_12.shtml)
  * - 旧版本 (v2)
  *   - [开发指引](https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_3&index=1)
  *   - [支付接口](https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=3)
  *
  * 如果使用[云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/getting-started.html)，则 `wx.requestPayment` 所需参数可以通过云开发微信支付统一下单接口免鉴权获取、并可免证书、免签名的安全调用微信支付服务端接口、及接收异步支付结果回调，详见[云开发微信支付](https://developers.weixin.qq.com/miniprogram/dev/wxcloud/guide/wechatpay.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.requestPayment({
    timeStamp: '',
    nonceStr: '',
    package: '',
    signType: 'MD5',
    paySign: '',
    success (res) { },
    fail (res) { }
  })
  ```
  *
  * 注：如果服务端有使用云开发，可以通过云开发微信支付[统一下单](https://developers.weixin.qq.com/miniprogram/dev/wxcloud/reference-sdk-api/open/pay/CloudPay.unifiedOrder.html)接口免鉴权获取以上所需所有参数，示例：
  *
  *
  * ```js
  // 云函数代码
  const cloud = require('wx-server-sdk')
  cloud.init({
    env: cloud.DYNAMIC_CURRENT_ENV
  })
  exports.main = async (event, context) => {
    const res = await cloud.cloudPay.unifiedOrder({
    "body" : "小秋TIT店-超市",
    "outTradeNo" : "1217752501201407033233368018",
    "spbillCreateIp" : "127.0.0.1",
    "subMchId" : "1900009231",
    "totalFee" : 1,
    "envId": "test-f0b102",
    "functionName": "pay_cb"
    })
    return res
  }
  // 小程序代码
  wx.cloud.callFunction({
    name: '函数名',
    data: {
    // ...
    },
    success: res => {
    const payment = res.result.payment
    wx.requestPayment({
    ...payment,
    success (res) {
    console.log('pay success', res)
    },
    fail (res) {
    console.error('pay fail', err)
    }
    })
    },
    fail: console.error,
  })
  ``` */
  def requestPayment[TOption /* <: RequestPaymentOption */](option: TOption): PromisifySuccessResult[TOption, RequestPaymentOption] = js.native
  
  /** [wx.requestSubscribeMessage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/subscribe-message/wx.requestSubscribeMessage.html)
  *
  * 调起客户端小程序订阅消息界面，返回用户订阅消息的操作结果。当用户勾选了订阅面板中的“总是保持以上选择，不再询问”时，模板消息会被添加到用户的小程序设置页，通过 [wx.getSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/wx.getSetting.html) 接口可获取用户对相关模板消息的订阅状态。
  *
  * ## 注意事项
  *  - 一次性模板 id 和永久模板 id 不可同时使用。
  *  - 低版本基础库2.4.4~2.8.3 已支持订阅消息接口调用，仅支持传入一个一次性 tmplId / 永久 tmplId。
  *  - [2.8.2](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 版本开始，用户发生点击行为或者发起支付回调后，才可以调起订阅消息界面。
  *  - [2.10.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 版本开始，开发版和体验版小程序将禁止使用模板消息 formId。
  *
  * **错误码**
  *
  *
  *
  * | errCode | errMsg                                                 | 说明                                                           |
  * | ------- | ------------------------------------------------------ | -------------------------------------------------------------- |
  * | 10001   | TmplIds can't be empty                                 | 参数传空了                                                     |
  * | 10002   | Request list fail                                       | 网络问题，请求消息列表失败                                     |
  * | 10003   | Request subscribe fail                                 | 网络问题，订阅请求发送失败                                     |
  * | 10004   | Invalid template id                                    | 参数类型错误                                                   |
  * | 10005   | Cannot show subscribe message UI                       | 无法展示 UI，一般是小程序这个时候退后台了导致的                |
  * | 20001   | No template data return, verify the template id exist  | 没有模板数据，一般是模板 ID 不存在 或者和模板类型不对应 导致的 |
  * | 20002   | Templates type must be same                            | 模板消息类型 既有一次性的又有永久的                            |
  * | 20003   | Templates count out of max bounds                      | 模板消息数量超过上限                                           |
  * | 20004   | The main switch is switched off                        | 用户关闭了主开关，无法进行订阅                                 |
  * | 20005   | This mini program was banned from subscribing messages | 小程序被禁封                                                   |
  *
  * **示例代码**
  *
  *
  * ```js
  wx.requestSubscribeMessage({
    tmplIds: [''],
    success (res) { }
  })
  ```
  *
  * 最低基础库： `2.4.4` */
  def requestSubscribeMessage[TOption /* <: RequestSubscribeMessageOption */](option: TOption): PromisifySuccessResult[TOption, RequestSubscribeMessageOption] = js.native
  
  /** [wx.saveFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.saveFile.html)
  *
  * 保存文件到本地。注意：**saveFile 会把临时文件移动，因此调用成功后传入的 tempFilePath 将不可用**
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseImage({
    success: function(res) {
    const tempFilePaths = res.tempFilePaths
    wx.saveFile({
    tempFilePath: tempFilePaths[0],
    success (res) {
    const savedFilePath = res.savedFilePath
    }
    })
    }
  })
  ```
  *
  * **注意**
  *
  *
  * 本地文件存储的大小限制为 10M */
  def saveFile[TOption /* <: WxSaveFileOption */](option: TOption): PromisifySuccessResult[TOption, WxSaveFileOption] = js.native
  
  /** [wx.saveFileToDisk(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.saveFileToDisk.html)
    *
    * 保存文件系统的文件到用户磁盘，仅在 PC 端支持
    *
    * 最低基础库： `2.11.0` */
  def saveFileToDisk(option: SaveFileToDiskOption): Unit = js.native
  
  /** [wx.saveImageToPhotosAlbum(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.saveImageToPhotosAlbum.html)
  *
  * 保存图片到系统相册。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.saveImageToPhotosAlbum({
    success(res) { }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def saveImageToPhotosAlbum[TOption /* <: SaveImageToPhotosAlbumOption */](option: TOption): PromisifySuccessResult[TOption, SaveImageToPhotosAlbumOption] = js.native
  
  /** [wx.saveVideoToPhotosAlbum(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.saveVideoToPhotosAlbum.html)
  *
  * 保存视频到系统相册。支持mp4视频格式。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.saveVideoToPhotosAlbum({
    filePath: 'wxfile://xxx',
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def saveVideoToPhotosAlbum[TOption /* <: SaveVideoToPhotosAlbumOption */](option: TOption): PromisifySuccessResult[TOption, SaveVideoToPhotosAlbumOption] = js.native
  
  /** [wx.scanCode(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/scan/wx.scanCode.html)
  *
  * 调起客户端扫码界面进行扫码
  *
  * **示例代码**
  *
  *
  * ```js
  // 允许从相机和相册扫码
  wx.scanCode({
    success (res) {
    console.log(res)
    }
  })
  // 只允许从相机扫码
  wx.scanCode({
    onlyFromCamera: true,
    success (res) {
    console.log(res)
    }
  })
  ``` */
  def scanCode[TOption /* <: ScanCodeOption */](option: TOption): PromisifySuccessResult[TOption, ScanCodeOption] = js.native
  
  /** [wx.seekBackgroundAudio(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.seekBackgroundAudio.html)
  *
  * 控制音乐播放进度。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.seekBackgroundAudio({
    position: 30
  })
  ```
  * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
  *  */
  def seekBackgroundAudio[TOption /* <: SeekBackgroundAudioOption */](option: TOption): PromisifySuccessResult[TOption, SeekBackgroundAudioOption] = js.native
  
  /** [wx.sendHCEMessage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.sendHCEMessage.html)
  *
  * 发送 NFC 消息。仅在安卓系统下有效。
  *
  * **示例代码**
  *
  *
  * ```js
  const buffer = new ArrayBuffer(1)
  const dataView = new DataView(buffer)
  dataView.setUint8(0, 0)
  wx.startHCE({
    success (res) {
    wx.onHCEMessage(function(res) {
    if (res.messageType === 1) {
    wx.sendHCEMessage({data: buffer})
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def sendHCEMessage[TOption /* <: SendHCEMessageOption */](option: TOption): PromisifySuccessResult[TOption, SendHCEMessageOption] = js.native
  
  /** [wx.sendSocketMessage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/wx.sendSocketMessage.html)
  *
  * 通过 WebSocket 连接发送数据。需要先 wx.connectSocket，并在 wx.onSocketOpen 回调之后才能发送。
  *
  * **示例代码**
  *
  *
  * ```js
  let socketOpen = false
  let socketMsgQueue = []
  wx.connectSocket({
    url: 'test.php'
  })
  wx.onSocketOpen(function(res) {
    socketOpen = true
    for (let i = 0; i < socketMsgQueue.length; i++){
    sendSocketMessage(socketMsgQueue[i])
    }
    socketMsgQueue = []
  })
  function sendSocketMessage(msg) {
    if (socketOpen) {
    wx.sendSocketMessage({
    data:msg
    })
    } else {
    socketMsgQueue.push(msg)
    }
  }
  ``` */
  def sendSocketMessage[TOption /* <: SendSocketMessageOption */](option: TOption): PromisifySuccessResult[TOption, SendSocketMessageOption] = js.native
  
  /** [wx.setBLEMTU(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.setBLEMTU.html)
    *
    * 设置蓝牙最大传输单元。需在 wx.createBLEConnection调用成功后调用，mtu 设置范围 (22,512)。安卓5.1以上有效。
    *
    * 最低基础库： `2.11.0` */
  def setBLEMTU[TOption /* <: SetBLEMTUOption */](option: TOption): PromisifySuccessResult[TOption, SetBLEMTUOption] = js.native
  
  /** [wx.setBackgroundColor(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/background/wx.setBackgroundColor.html)
  *
  * 动态设置窗口的背景色
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setBackgroundColor({
    backgroundColor: '#ffffff', // 窗口的背景色为白色
  })
  wx.setBackgroundColor({
    backgroundColorTop: '#ffffff', // 顶部窗口的背景色为白色
    backgroundColorBottom: '#ffffff', // 底部窗口的背景色为白色
  })
  ```
  *
  * 最低基础库： `2.1.0` */
  def setBackgroundColor[TOption /* <: SetBackgroundColorOption */](option: TOption): PromisifySuccessResult[TOption, SetBackgroundColorOption] = js.native
  
  /** [wx.setBackgroundFetchToken(object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/background-fetch/wx.setBackgroundFetchToken.html)
    *
    * 设置自定义登录态，在周期性拉取数据时带上，便于第三方服务器验证请求合法性
    *
    * 最低基础库： `2.8.0` */
  def setBackgroundFetchToken[TOption /* <: SetBackgroundFetchTokenOption */](option: TOption): PromisifySuccessResult[TOption, SetBackgroundFetchTokenOption] = js.native
  
  /** [wx.setBackgroundTextStyle(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/background/wx.setBackgroundTextStyle.html)
  *
  * 动态设置下拉背景字体、loading 图的样式
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setBackgroundTextStyle({
    textStyle: 'dark' // 下拉背景字体、loading 图的样式为dark
  })
  ```
  *
  * 最低基础库： `2.1.0` */
  def setBackgroundTextStyle[TOption /* <: SetBackgroundTextStyleOption */](option: TOption): PromisifySuccessResult[TOption, SetBackgroundTextStyleOption] = js.native
  
  /** [wx.setClipboardData(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/clipboard/wx.setClipboardData.html)
  *
  * 设置系统剪贴板的内容。调用成功后，会弹出 toast 提示"内容已复制"，持续 1.5s
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setClipboardData({
    data: 'data',
    success (res) {
    wx.getClipboardData({
    success (res) {
    console.log(res.data) // data
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def setClipboardData[TOption /* <: SetClipboardDataOption */](option: TOption): PromisifySuccessResult[TOption, SetClipboardDataOption] = js.native
  
  /** [wx.setEnableDebug(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/wx.setEnableDebug.html)
  *
  * 设置是否打开调试开关。此开关对正式版也能生效。
  *
  * **示例代码**
  *
  *
  * ```javascript
  // 打开调试
  wx.setEnableDebug({
    enableDebug: true
  })
  // 关闭调试
  wx.setEnableDebug({
    enableDebug: false
  })
  ```
  *
  * **Tips**
  *
  *
  * - 在正式版打开调试还有一种方法，就是先在开发版或体验版打开调试，再切到正式版就能看到vConsole。
  *
  * 最低基础库： `1.4.0` */
  def setEnableDebug[TOption /* <: SetEnableDebugOption */](option: TOption): PromisifySuccessResult[TOption, SetEnableDebugOption] = js.native
  
  /** [wx.setInnerAudioOption(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.setInnerAudioOption.html)
    *
    * 设置 [InnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.html) 的播放选项。设置之后对当前小程序全局生效。
    *
    * 最低基础库： `2.3.0` */
  def setInnerAudioOption[TOption /* <: SetInnerAudioOption */](option: TOption): PromisifySuccessResult[TOption, SetInnerAudioOption] = js.native
  
  /** [wx.setKeepScreenOn(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/screen/wx.setKeepScreenOn.html)
  *
  * 设置是否保持常亮状态。仅在当前小程序生效，离开小程序后设置失效。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setKeepScreenOn({
    keepScreenOn: true
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def setKeepScreenOn[TOption /* <: SetKeepScreenOnOption */](option: TOption): PromisifySuccessResult[TOption, SetKeepScreenOnOption] = js.native
  
  /** [wx.setNavigationBarColor(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/navigation-bar/wx.setNavigationBarColor.html)
    *
    * 设置页面导航条颜色
    *
    * 最低基础库： `1.4.0` */
  def setNavigationBarColor[TOption /* <: SetNavigationBarColorOption */](option: TOption): PromisifySuccessResult[TOption, SetNavigationBarColorOption] = js.native
  
  /** [wx.setNavigationBarTitle(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/navigation-bar/wx.setNavigationBarTitle.html)
  *
  * 动态设置当前页面的标题
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setNavigationBarTitle({
    title: '当前页面'
  })
  ``` */
  def setNavigationBarTitle[TOption /* <: SetNavigationBarTitleOption */](option: TOption): PromisifySuccessResult[TOption, SetNavigationBarTitleOption] = js.native
  
  /** [wx.setScreenBrightness(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/screen/wx.setScreenBrightness.html)
    *
    * 设置屏幕亮度
    *
    * 最低基础库： `1.2.0` */
  def setScreenBrightness[TOption /* <: SetScreenBrightnessOption */](option: TOption): PromisifySuccessResult[TOption, SetScreenBrightnessOption] = js.native
  
  /** [wx.setStorage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.setStorage.html)
  *
  * 将数据存储在本地缓存中指定的 key 中。会覆盖掉原来该 key 对应的内容。除非用户主动删除或因存储空间原因被系统清理，否则数据都一直可用。单个 key 允许存储的最大数据长度为 1MB，所有数据存储上限为 10MB。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setStorage({
    key:"key",
    data:"value"
  })
  ```
  * ```js
  try {
    wx.setStorageSync('key', 'value')
  } catch (e) { }
  ``` */
  def setStorage[TOption /* <: SetStorageOption */](option: TOption): PromisifySuccessResult[TOption, SetStorageOption] = js.native
  
  /** [wx.setStorageSync(string key, any data)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.setStorageSync.html)
  *
  * [wx.setStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.setStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setStorage({
    key:"key",
    data:"value"
  })
  ```
  * ```js
  try {
    wx.setStorageSync('key', 'value')
  } catch (e) { }
  ``` */
  def setStorageSync(
    /** 本地缓存中指定的 key */
  key: String,
    /** 需要存储的内容。只支持原生类型、Date、及能够通过`JSON.stringify`序列化的对象。 */
  data: js.Any
  ): Unit = js.native
  
  /** [wx.setTabBarBadge(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.setTabBarBadge.html)
  *
  * 为 tabBar 某一项的右上角添加文本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTabBarBadge({
    index: 0,
    text: '1'
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def setTabBarBadge[TOption /* <: SetTabBarBadgeOption */](option: TOption): PromisifySuccessResult[TOption, SetTabBarBadgeOption] = js.native
  
  /** [wx.setTabBarItem(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.setTabBarItem.html)
  *
  * 动态设置 tabBar 某一项的内容，`2.7.0` 起图片支持临时文件和网络文件。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTabBarItem({
    index: 0,
    text: 'text',
    iconPath: '/path/to/iconPath',
    selectedIconPath: '/path/to/selectedIconPath'
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def setTabBarItem[TOption /* <: SetTabBarItemOption */](option: TOption): PromisifySuccessResult[TOption, SetTabBarItemOption] = js.native
  
  /** [wx.setTabBarStyle(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.setTabBarStyle.html)
  *
  * 动态设置 tabBar 的整体样式
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTabBarStyle({
    color: '#FF0000',
    selectedColor: '#00FF00',
    backgroundColor: '#0000FF',
    borderStyle: 'white'
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def setTabBarStyle[TOption /* <: SetTabBarStyleOption */](): PromisifySuccessResult[TOption, SetTabBarStyleOption] = js.native
  def setTabBarStyle[TOption /* <: SetTabBarStyleOption */](option: TOption): PromisifySuccessResult[TOption, SetTabBarStyleOption] = js.native
  
  /** [wx.setTopBarText(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/sticky/wx.setTopBarText.html)
  *
  * 动态设置置顶栏文字内容。只有当前小程序被置顶时能生效，如果当前小程序没有被置顶，也能调用成功，但是不会立即生效，只有在用户将这个小程序置顶后才换上设置的文字内容.
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTopBarText({
    text: 'hello, world!'
  })
  ```
  *
  * **注意**
  *
  *
  * - 调用成功后，需间隔 5s 才能再次调用此接口，如果在 5s 内再次调用此接口，会回调 fail，errMsg："setTopBarText: fail invoke too frequently"
  *
  * 最低基础库： `1.4.3`
  * @deprecated 基础库版本 [1.9.9](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃
  *  */
  def setTopBarText[TOption /* <: SetTopBarTextOption */](option: TOption): PromisifySuccessResult[TOption, SetTopBarTextOption] = js.native
  
  /** [wx.setWifiList(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.setWifiList.html)
  *
  * 设置 `wifiList` 中 AP 的相关信息。在 `onGetWifiList` 回调后调用，**iOS特有接口**。
  *
  * **注意**
  *
  *
  * - 该接口只能在 `onGetWifiList` 回调之后才能调用。
  * - 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
  * - 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onGetWifiList(function(res) {
    if (res.wifiList.length) {
    wx.setWifiList({
    wifiList: [{
    SSID: res.wifiList[0].SSID,
    BSSID: res.wifiList[0].BSSID,
    password: '123456'
    }]
    })
    } else {
    wx.setWifiList({
    wifiList: []
    })
    }
  })
  wx.getWifiList()
  ```
  *
  * 最低基础库： `1.6.0` */
  def setWifiList[TOption /* <: SetWifiListOption */](option: TOption): PromisifySuccessResult[TOption, SetWifiListOption] = js.native
  
  /** [wx.setWindowSize(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/window/wx.setWindowSize.html)
    *
    * 设置窗口大小，该接口仅适用于 PC 平台，使用细则请参见指南
    *
    * 最低基础库： `2.10.1`
    * @deprecated 基础库版本 [2.11.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃
    *  */
  def setWindowSize(option: SetWindowSizeOption): Unit = js.native
  
  /** [wx.showActionSheet(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showActionSheet.html)
  *
  * 显示操作菜单
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showActionSheet({
    itemList: ['A', 'B', 'C'],
    success (res) {
    console.log(res.tapIndex)
    },
    fail (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * **注意**
  *
  *
  * - Android 6.7.2 以下版本，点击取消或蒙层时，回调 fail, errMsg 为 "fail cancel"；
  * - Android 6.7.2 及以上版本 和 iOS 点击蒙层不会关闭模态弹窗，所以尽量避免使用「取消」分支中实现业务逻辑 */
  def showActionSheet[TOption /* <: ShowActionSheetOption */](option: TOption): PromisifySuccessResult[TOption, ShowActionSheetOption] = js.native
  
  /** [wx.showLoading(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showLoading.html)
  *
  * 显示 loading 提示框。需主动调用 wx.hideLoading 才能关闭提示框
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showLoading({
    title: '加载中',
  })
  setTimeout(function () {
    wx.hideLoading()
  }, 2000)
  ```
  *
  * **注意**
  *
  *
  * - [wx.showLoading](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showLoading.html) 和 [wx.showToast](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showToast.html) 同时只能显示一个
  * - [wx.showLoading](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showLoading.html) 应与 [wx.hideLoading](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.hideLoading.html) 配对使用
  *
  * 最低基础库： `1.1.0` */
  def showLoading[TOption /* <: ShowLoadingOption */](option: TOption): PromisifySuccessResult[TOption, ShowLoadingOption] = js.native
  
  /** [wx.showModal(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showModal.html)
  *
  * 显示模态对话框
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showModal({
    title: '提示',
    content: '这是一个模态弹窗',
    success (res) {
    if (res.confirm) {
    console.log('用户点击确定')
    } else if (res.cancel) {
    console.log('用户点击取消')
    }
    }
  })
  ```
  *
  * **注意**
  *
  *
  * - Android 6.7.2 以下版本，点击取消或蒙层时，回调 fail, errMsg 为 "fail cancel"；
  * - Android 6.7.2 及以上版本 和 iOS 点击蒙层不会关闭模态弹窗，所以尽量避免使用「取消」分支中实现业务逻辑 */
  def showModal[TOption /* <: ShowModalOption */](option: TOption): PromisifySuccessResult[TOption, ShowModalOption] = js.native
  
  /** [wx.showNavigationBarLoading(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/navigation-bar/wx.showNavigationBarLoading.html)
    *
    * 在当前页面显示导航条加载动画 */
  def showNavigationBarLoading[TOption /* <: ShowNavigationBarLoadingOption */](): PromisifySuccessResult[TOption, ShowNavigationBarLoadingOption] = js.native
  def showNavigationBarLoading[TOption /* <: ShowNavigationBarLoadingOption */](option: TOption): PromisifySuccessResult[TOption, ShowNavigationBarLoadingOption] = js.native
  
  /** [wx.showRedPackage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/redpackage/wx.showRedPackage.html)
    *
    * 拉取h5领取红包封面页。获取参考红包封面地址参考 [微信红包封面开发平台](https://cover.weixin.qq.com/cgi-bin/mmcover-bin/readtemplate?t=page%2Fdoc%2Fguide%2Fintroduce.html)。
    *
    * 最低基础库： `2.10.0` */
  def showRedPackage[TOption /* <: ShowRedPackageOption */](option: TOption): PromisifySuccessResult[TOption, ShowRedPackageOption] = js.native
  
  /** [wx.showShareMenu(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/share/wx.showShareMenu.html)
  *
  * 显示当前页面的转发按钮
  *
  * ****
  *
  * ## 注意事项
  *  - "shareAppMessage"表示“发送给朋友”按钮，"shareTimeline"表示“分享到朋友圈”按钮
  *  - 显示“分享到朋友圈”按钮时必须同时显示“发送给朋友”按钮，显示“发送给朋友”按钮时则允许不显示“分享到朋友圈”按钮
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showShareMenu({
    withShareTicket: true,
    menus: ['shareAppMessage', 'shareTimeline']
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def showShareMenu[TOption /* <: ShowShareMenuOption */](option: TOption): PromisifySuccessResult[TOption, ShowShareMenuOption] = js.native
  
  /** [wx.showTabBar(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.showTabBar.html)
    *
    * 显示 tabBar
    *
    * 最低基础库： `1.9.0` */
  def showTabBar[TOption /* <: ShowTabBarOption */](option: TOption): PromisifySuccessResult[TOption, ShowTabBarOption] = js.native
  
  /** [wx.showTabBarRedDot(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/tab-bar/wx.showTabBarRedDot.html)
    *
    * 显示 tabBar 某一项的右上角的红点
    *
    * 最低基础库： `1.9.0` */
  def showTabBarRedDot[TOption /* <: ShowTabBarRedDotOption */](option: TOption): PromisifySuccessResult[TOption, ShowTabBarRedDotOption] = js.native
  
  /** [wx.showToast(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showToast.html)
  *
  * 显示消息提示框
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showToast({
    title: '成功',
    icon: 'success',
    duration: 2000
  })
  ```
  *
  * **注意**
  *
  *
  * - [wx.showLoading](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showLoading.html) 和 [wx.showToast](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showToast.html) 同时只能显示一个
  * - [wx.showToast](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.showToast.html) 应与 [wx.hideToast](https://developers.weixin.qq.com/miniprogram/dev/api/ui/interaction/wx.hideToast.html) 配对使用 */
  def showToast[TOption /* <: ShowToastOption */](option: TOption): PromisifySuccessResult[TOption, ShowToastOption] = js.native
  
  /** [wx.startAccelerometer(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.startAccelerometer.html)
  *
  * 开始监听加速度数据。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startAccelerometer({
    interval: 'game'
  })
  ```
  *
  * **注意**
  *
  *
  * - 根据机型性能、当前 CPU 与内存的占用情况，`interval` 的设置与实际 `wx.onAccelerometerChange()` 回调函数的执行频率会有一些出入。
  *
  * 最低基础库： `1.1.0` */
  def startAccelerometer[TOption /* <: StartAccelerometerOption */](): PromisifySuccessResult[TOption, StartAccelerometerOption] = js.native
  def startAccelerometer[TOption /* <: StartAccelerometerOption */](option: TOption): PromisifySuccessResult[TOption, StartAccelerometerOption] = js.native
  
  /** [wx.startBeaconDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.startBeaconDiscovery.html)
  *
  * 开始搜索附近的 iBeacon 设备
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startBeaconDiscovery({
    success(res) { }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def startBeaconDiscovery[TOption /* <: StartBeaconDiscoveryOption */](option: TOption): PromisifySuccessResult[TOption, StartBeaconDiscoveryOption] = js.native
  
  /** [wx.startBluetoothDevicesDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.startBluetoothDevicesDiscovery.html)
  *
  * 开始搜寻附近的蓝牙外围设备。**此操作比较耗费系统资源，请在搜索并连接到设备后调用 [wx.stopBluetoothDevicesDiscovery](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.stopBluetoothDevicesDiscovery.html) 方法停止搜索。**
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/m7klFDmZ72i1)
  *
  * ```js
  // 以微信硬件平台的蓝牙智能灯为例，主服务的 UUID 是 FEE7。传入这个参数，只搜索主服务 UUID 为 FEE7 的设备
  wx.startBluetoothDevicesDiscovery({
    services: ['FEE7'],
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def startBluetoothDevicesDiscovery[TOption /* <: StartBluetoothDevicesDiscoveryOption */](option: TOption): PromisifySuccessResult[TOption, StartBluetoothDevicesDiscoveryOption] = js.native
  
  /** [wx.startCompass(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/compass/wx.startCompass.html)
  *
  * 开始监听罗盘数据
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startCompass()
  ```
  *
  * 最低基础库： `1.1.0` */
  def startCompass[TOption /* <: StartCompassOption */](): PromisifySuccessResult[TOption, StartCompassOption] = js.native
  def startCompass[TOption /* <: StartCompassOption */](option: TOption): PromisifySuccessResult[TOption, StartCompassOption] = js.native
  
  /** [wx.startDeviceMotionListening(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.startDeviceMotionListening.html)
    *
    * 开始监听设备方向的变化。
    *
    * 最低基础库： `2.3.0` */
  def startDeviceMotionListening[TOption /* <: StartDeviceMotionListeningOption */](): PromisifySuccessResult[TOption, StartDeviceMotionListeningOption] = js.native
  def startDeviceMotionListening[TOption /* <: StartDeviceMotionListeningOption */](option: TOption): PromisifySuccessResult[TOption, StartDeviceMotionListeningOption] = js.native
  
  /** [wx.startGyroscope(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.startGyroscope.html)
    *
    * 开始监听陀螺仪数据。
    *
    * 最低基础库： `2.3.0` */
  def startGyroscope[TOption /* <: StartGyroscopeOption */](): PromisifySuccessResult[TOption, StartGyroscopeOption] = js.native
  def startGyroscope[TOption /* <: StartGyroscopeOption */](option: TOption): PromisifySuccessResult[TOption, StartGyroscopeOption] = js.native
  
  /** [wx.startHCE(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.startHCE.html)
  *
  * 初始化 NFC 模块。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startHCE({
    aid_list: ['F222222222'],
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def startHCE[TOption /* <: StartHCEOption */](option: TOption): PromisifySuccessResult[TOption, StartHCEOption] = js.native
  
  /** [wx.startLocalServiceDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.startLocalServiceDiscovery.html)
    *
    * 开始搜索局域网下的 mDNS 服务。搜索的结果会通过 wx.onLocalService* 事件返回。
    *
    * **注意**
    *
    *
    * 1. wx.startLocalServiceDiscovery 是一个消耗性能的行为，开始 30 秒后会自动 stop 并执行 wx.onLocalServiceDiscoveryStop 注册的回调函数。
    * 2. 在调用 wx.startLocalServiceDiscovery 后，在这次搜索行为停止后才能发起下次 wx.startLocalServiceDiscovery。停止本次搜索行为的操作包括调用 wx.stopLocalServiceDiscovery 和 30 秒后系统自动 stop 本次搜索。
    *
    * 最低基础库： `2.4.0` */
  def startLocalServiceDiscovery[TOption /* <: StartLocalServiceDiscoveryOption */](option: TOption): PromisifySuccessResult[TOption, StartLocalServiceDiscoveryOption] = js.native
  
  /** [wx.startLocationUpdate(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.startLocationUpdate.html)
    *
    * 开启小程序进入前台时接收位置消息
    *
    * **注意**
    *
    *
    * - 获取位置信息需配置[地理位置用途说明](https://developers.weixin.qq.com/miniprogram/dev/reference/configuration/app.html#permission)。
    *
    * 最低基础库： `2.8.0` */
  def startLocationUpdate[TOption /* <: StartLocationUpdateOption */](): PromisifySuccessResult[TOption, StartLocationUpdateOption] = js.native
  def startLocationUpdate[TOption /* <: StartLocationUpdateOption */](option: TOption): PromisifySuccessResult[TOption, StartLocationUpdateOption] = js.native
  
  /** [wx.startLocationUpdateBackground(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.startLocationUpdateBackground.html)
    *
    * 开启小程序进入前后台时均接收位置消息，需引导用户开启[授权]((open-ability/authorize#后台定位))。授权以后，小程序在运行中或进入后台均可接受位置消息变化。
    *
    * **注意**
    *
    *
    * - 安卓微信7.0.6版本，iOS 7.0.5版本起支持该接口
    * - 需在app.json中配置requiredBackgroundModes: ['location']后使用
    * - 获取位置信息需配置[地理位置用途说明](https://developers.weixin.qq.com/miniprogram/dev/reference/configuration/app.html#permission)。
    *
    * 最低基础库： `2.8.0` */
  def startLocationUpdateBackground[TOption /* <: StartLocationUpdateBackgroundOption */](): PromisifySuccessResult[TOption, StartLocationUpdateBackgroundOption] = js.native
  def startLocationUpdateBackground[TOption /* <: StartLocationUpdateBackgroundOption */](option: TOption): PromisifySuccessResult[TOption, StartLocationUpdateBackgroundOption] = js.native
  
  /** [wx.startPullDownRefresh(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/pull-down-refresh/wx.startPullDownRefresh.html)
  *
  * 开始下拉刷新。调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startPullDownRefresh()
  ```
  *
  * 最低基础库： `1.5.0` */
  def startPullDownRefresh[TOption /* <: StartPullDownRefreshOption */](): PromisifySuccessResult[TOption, StartPullDownRefreshOption] = js.native
  def startPullDownRefresh[TOption /* <: StartPullDownRefreshOption */](option: TOption): PromisifySuccessResult[TOption, StartPullDownRefreshOption] = js.native
  
  /** [wx.startRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.startRecord.html)
  *
  * 开始录音。当主动调用 [wx.stopRecord](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.stopRecord.html)，或者录音超过1分钟时自动结束录音。当用户离开小程序时，此接口无法调用。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    }
  })
  setTimeout(function () {
    wx.stopRecord() // 结束录音
  }, 10000)
  ```
  * @deprecated 基础库版本 [1.6.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getRecorderManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.getRecorderManager.html) 替换
  *  */
  def startRecord[TOption /* <: WxStartRecordOption */](option: TOption): PromisifySuccessResult[TOption, WxStartRecordOption] = js.native
  
  /** [wx.startSoterAuthentication(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/soter/wx.startSoterAuthentication.html)
  *
  * 开始 SOTER 生物认证。验证流程请参考[说明](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/bio-auth.html)。
  *
  * **resultJSON 说明**
  *
  *
  * 此数据为设备TEE中，将传入的challenge和TEE内其他安全信息组成的数据进行组装而来的JSON，对下述字段的解释如下表。例子如下：
  * | 字段名  | 说明                                                                                      |
  * |---------|-------------------------------------------------------------------------------------------|
  * | raw     | 调用者传入的challenge                                                                     |
  * | fid     | （仅Android支持）本次生物识别认证的生物信息编号（如指纹识别则是指纹信息在本设备内部编号） |
  * | counter | 防重放特征参数                                                                            |
  * | tee_n   | TEE名称（如高通或者trustonic等）                                                          |
  * | tee_v   | TEE版本号                                                                                 |
  * | fp_n    | 指纹以及相关逻辑模块提供商（如FPC等）                                                     |
  * | fp_v    | 指纹以及相关模块版本号                                                                    |
  * | cpu_id  | 机器唯一识别ID                                                                            |
  * | uid     | 概念同Android系统定义uid，即应用程序编号                                                  |
  *
  * ```json
  {
    "raw":"msg",
    "fid":"2",
    "counter":123,
    "tee_n":"TEE Name",
    "tee_v":"TEE Version",
    "fp_n":"Fingerprint Sensor Name",
    "fp_v":"Fingerprint Sensor Version",
    "cpu_id":"CPU Id",
    "uid":"21"
  }
  ```
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/q3tCKkmJ7g2e)
  * ```js
  wx.startSoterAuthentication({
    requestAuthModes: ['fingerPrint'],
    challenge: '123456',
    authContent: '请用指纹解锁',
    success(res) {
    }
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def startSoterAuthentication[TOption /* <: StartSoterAuthenticationOption */](option: TOption): PromisifySuccessResult[TOption, StartSoterAuthenticationOption] = js.native
  
  /** [wx.startWifi(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.startWifi.html)
  *
  * 初始化 Wi-Fi 模块。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/8P7zrkmd7r2n)
  * ```js
  wx.startWifi({
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def startWifi[TOption /* <: StartWifiOption */](): PromisifySuccessResult[TOption, StartWifiOption] = js.native
  def startWifi[TOption /* <: StartWifiOption */](option: TOption): PromisifySuccessResult[TOption, StartWifiOption] = js.native
  
  /** [wx.stopAccelerometer(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.stopAccelerometer.html)
  *
  * 停止监听加速度数据。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopAccelerometer()
  ```
  *
  * 最低基础库： `1.1.0` */
  def stopAccelerometer[TOption /* <: StopAccelerometerOption */](): PromisifySuccessResult[TOption, StopAccelerometerOption] = js.native
  def stopAccelerometer[TOption /* <: StopAccelerometerOption */](option: TOption): PromisifySuccessResult[TOption, StopAccelerometerOption] = js.native
  
  /** [wx.stopBackgroundAudio(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.stopBackgroundAudio.html)
  *
  * 停止播放音乐。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopBackgroundAudio()
  ```
  * @deprecated 基础库版本 [1.2.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 替换
  *  */
  def stopBackgroundAudio[TOption /* <: StopBackgroundAudioOption */](): PromisifySuccessResult[TOption, StopBackgroundAudioOption] = js.native
  def stopBackgroundAudio[TOption /* <: StopBackgroundAudioOption */](option: TOption): PromisifySuccessResult[TOption, StopBackgroundAudioOption] = js.native
  
  /** [wx.stopBeaconDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/ibeacon/wx.stopBeaconDiscovery.html)
    *
    * 停止搜索附近的 iBeacon 设备
    *
    * 最低基础库： `1.2.0` */
  def stopBeaconDiscovery[TOption /* <: StopBeaconDiscoveryOption */](): PromisifySuccessResult[TOption, StopBeaconDiscoveryOption] = js.native
  def stopBeaconDiscovery[TOption /* <: StopBeaconDiscoveryOption */](option: TOption): PromisifySuccessResult[TOption, StopBeaconDiscoveryOption] = js.native
  
  /** [wx.stopBluetoothDevicesDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth/wx.stopBluetoothDevicesDiscovery.html)
  *
  * 停止搜寻附近的蓝牙外围设备。若已经找到需要的蓝牙设备并不需要继续搜索时，建议调用该接口停止蓝牙搜索。
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  wx.stopBluetoothDevicesDiscovery({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def stopBluetoothDevicesDiscovery[TOption /* <: StopBluetoothDevicesDiscoveryOption */](): PromisifySuccessResult[TOption, StopBluetoothDevicesDiscoveryOption] = js.native
  def stopBluetoothDevicesDiscovery[TOption /* <: StopBluetoothDevicesDiscoveryOption */](option: TOption): PromisifySuccessResult[TOption, StopBluetoothDevicesDiscoveryOption] = js.native
  
  /** [wx.stopCompass(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/compass/wx.stopCompass.html)
  *
  * 停止监听罗盘数据
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopCompass()
  ```
  *
  * 最低基础库： `1.1.0` */
  def stopCompass[TOption /* <: StopCompassOption */](): PromisifySuccessResult[TOption, StopCompassOption] = js.native
  def stopCompass[TOption /* <: StopCompassOption */](option: TOption): PromisifySuccessResult[TOption, StopCompassOption] = js.native
  
  /** [wx.stopDeviceMotionListening(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.stopDeviceMotionListening.html)
    *
    * 停止监听设备方向的变化。
    *
    * 最低基础库： `2.3.0` */
  def stopDeviceMotionListening[TOption /* <: StopDeviceMotionListeningOption */](): PromisifySuccessResult[TOption, StopDeviceMotionListeningOption] = js.native
  def stopDeviceMotionListening[TOption /* <: StopDeviceMotionListeningOption */](option: TOption): PromisifySuccessResult[TOption, StopDeviceMotionListeningOption] = js.native
  
  /** [wx.stopGyroscope(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.stopGyroscope.html)
    *
    * 停止监听陀螺仪数据。
    *
    * 最低基础库： `2.3.0` */
  def stopGyroscope[TOption /* <: StopGyroscopeOption */](): PromisifySuccessResult[TOption, StopGyroscopeOption] = js.native
  def stopGyroscope[TOption /* <: StopGyroscopeOption */](option: TOption): PromisifySuccessResult[TOption, StopGyroscopeOption] = js.native
  
  /** [wx.stopHCE(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/wx.stopHCE.html)
  *
  * 关闭 NFC 模块。仅在安卓系统下有效。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopHCE({
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def stopHCE[TOption /* <: StopHCEOption */](): PromisifySuccessResult[TOption, StopHCEOption] = js.native
  def stopHCE[TOption /* <: StopHCEOption */](option: TOption): PromisifySuccessResult[TOption, StopHCEOption] = js.native
  
  /** [wx.stopLocalServiceDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/mdns/wx.stopLocalServiceDiscovery.html)
    *
    * 停止搜索 mDNS 服务
    *
    * 最低基础库： `2.4.0` */
  def stopLocalServiceDiscovery[TOption /* <: StopLocalServiceDiscoveryOption */](): PromisifySuccessResult[TOption, StopLocalServiceDiscoveryOption] = js.native
  def stopLocalServiceDiscovery[TOption /* <: StopLocalServiceDiscoveryOption */](option: TOption): PromisifySuccessResult[TOption, StopLocalServiceDiscoveryOption] = js.native
  
  /** [wx.stopLocationUpdate(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.stopLocationUpdate.html)
    *
    * 关闭监听实时位置变化，前后台都停止消息接收
    *
    * 最低基础库： `2.8.0` */
  def stopLocationUpdate[TOption /* <: StopLocationUpdateOption */](): PromisifySuccessResult[TOption, StopLocationUpdateOption] = js.native
  def stopLocationUpdate[TOption /* <: StopLocationUpdateOption */](option: TOption): PromisifySuccessResult[TOption, StopLocationUpdateOption] = js.native
  
  /** [wx.stopPullDownRefresh(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/pull-down-refresh/wx.stopPullDownRefresh.html)
  *
  * 停止当前页面下拉刷新。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    onPullDownRefresh () {
    wx.stopPullDownRefresh()
    }
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def stopPullDownRefresh[TOption /* <: StopPullDownRefreshOption */](): PromisifySuccessResult[TOption, StopPullDownRefreshOption] = js.native
  def stopPullDownRefresh[TOption /* <: StopPullDownRefreshOption */](option: TOption): PromisifySuccessResult[TOption, StopPullDownRefreshOption] = js.native
  
  /** [wx.stopRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.stopRecord.html)
  *
  * 停止录音。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    }
  })
  setTimeout(function () {
    wx.stopRecord() // 结束录音
  }, 10000)
  ```
  * @deprecated 基础库版本 [1.6.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.getRecorderManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.getRecorderManager.html) 替换
  *  */
  def stopRecord[TOption /* <: WxStopRecordOption */](): PromisifySuccessResult[TOption, WxStopRecordOption] = js.native
  def stopRecord[TOption /* <: WxStopRecordOption */](option: TOption): PromisifySuccessResult[TOption, WxStopRecordOption] = js.native
  
  /** [wx.stopVoice(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.stopVoice.html)
  *
  * 结束播放语音。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    wx.playVoice({
    filePath: tempFilePath,
    })
    setTimeout(() => { wx.stopVoice() }, 5000)
    }
  })
  ```
  * @deprecated 基础库版本 [1.6.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起已废弃，请使用 [wx.createInnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html) 替换
  *  */
  def stopVoice[TOption /* <: StopVoiceOption */](): PromisifySuccessResult[TOption, StopVoiceOption] = js.native
  def stopVoice[TOption /* <: StopVoiceOption */](option: TOption): PromisifySuccessResult[TOption, StopVoiceOption] = js.native
  
  /** [wx.stopWifi(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/wx.stopWifi.html)
  *
  * 关闭 Wi-Fi 模块。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopWifi({
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def stopWifi[TOption /* <: StopWifiOption */](): PromisifySuccessResult[TOption, StopWifiOption] = js.native
  def stopWifi[TOption /* <: StopWifiOption */](option: TOption): PromisifySuccessResult[TOption, StopWifiOption] = js.native
  
  /** [wx.subscribeVoIPVideoMembers(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.subscribeVoIPVideoMembers.html)
    *
    * 订阅视频画面成员。对于视频房间，当成员超过两人时需进行订阅，否则只能看到最先加入房间的两人画面。
    *
    * 最低基础库： `2.11.0` */
  def subscribeVoIPVideoMembers[TOption /* <: SubscribeVoIPVideoMembersOption */](option: TOption): PromisifySuccessResult[TOption, SubscribeVoIPVideoMembersOption] = js.native
  
  /** [wx.switchTab(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.switchTab.html)
  *
  * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
  *
  * **示例代码**
  *
  *
  * ```json
  {
    "tabBar": {
    "list": [{
    "pagePath": "index",
    "text": "首页"
    },{
    "pagePath": "other",
    "text": "其他"
    }]
    }
  }
  ```
  *
  * ```js
  wx.switchTab({
    url: '/index'
  })
  ``` */
  def switchTab[TOption /* <: SwitchTabOption */](option: TOption): PromisifySuccessResult[TOption, SwitchTabOption] = js.native
  
  /** [wx.updateShareMenu(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/share/wx.updateShareMenu.html)
  *
  * 更新转发属性
  *
  * **示例代码**
  *
  *
  * ```js
  wx.updateShareMenu({
    withShareTicket: true,
    success () { }
  })
  ```
  * ```js
  // 转发私密消息
  wx.updateShareMenu({
    isPrivateMessage: true,
    activityId: 'xxx',
    templateInfo: {},
    success () { },
    fail () {}
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def updateShareMenu[TOption /* <: UpdateShareMenuOption */](option: TOption): PromisifySuccessResult[TOption, UpdateShareMenuOption] = js.native
  
  /** [wx.updateVoIPChatMuteConfig(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/voip/wx.updateVoIPChatMuteConfig.html)
    *
    * 更新实时语音静音设置
    *
    * 最低基础库： `2.7.0` */
  def updateVoIPChatMuteConfig[TOption /* <: UpdateVoIPChatMuteConfigOption */](option: TOption): PromisifySuccessResult[TOption, UpdateVoIPChatMuteConfigOption] = js.native
  
  /** [wx.updateWeChatApp(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/wx.updateWeChatApp.html)
    *
    * 更新客户端版本。当判断用户小程序所在客户端版本过低时，可使用该接口跳转到更新微信页面。
    *
    * 最低基础库： `2.12.0` */
  def updateWeChatApp[TOption /* <: UpdateWeChatAppOption */](): PromisifySuccessResult[TOption, UpdateWeChatAppOption] = js.native
  def updateWeChatApp[TOption /* <: UpdateWeChatAppOption */](option: TOption): PromisifySuccessResult[TOption, UpdateWeChatAppOption] = js.native
  
  /** [[UploadTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.html) wx.uploadFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/wx.uploadFile.html)
  *
  * 将本地资源上传到服务器。客户端发起一个 HTTPS POST 请求，其中 `content-type` 为 `multipart/form-data`。使用前请注意阅读[相关说明](https://developers.weixin.qq.com/miniprogram/dev/framework/ability/network.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseImage({
    success (res) {
    const tempFilePaths = res.tempFilePaths
    wx.uploadFile({
    url: 'https://example.weixin.qq.com/upload', //仅为示例，非真实的接口地址
    filePath: tempFilePaths[0],
    name: 'file',
    formData: {
    'user': 'test'
    },
    success (res){
    const data = res.data
    //do something
    }
    })
    }
  })
  ``` */
  def uploadFile(option: UploadFileOption): UploadTask = js.native
  
  /** [wx.vibrateLong(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/vibrate/wx.vibrateLong.html)
    *
    * 使手机发生较长时间的振动（400 ms)
    *
    * 最低基础库： `1.2.0` */
  def vibrateLong[TOption /* <: VibrateLongOption */](): PromisifySuccessResult[TOption, VibrateLongOption] = js.native
  def vibrateLong[TOption /* <: VibrateLongOption */](option: TOption): PromisifySuccessResult[TOption, VibrateLongOption] = js.native
  
  /** [wx.vibrateShort(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/vibrate/wx.vibrateShort.html)
    *
    * 使手机发生较短时间的振动（15 ms）。仅在 iPhone `7 / 7 Plus` 以上及 Android 机型生效
    *
    * 最低基础库： `1.2.0` */
  def vibrateShort[TOption /* <: VibrateShortOption */](option: TOption): PromisifySuccessResult[TOption, VibrateShortOption] = js.native
  
  /** [wx.writeBLECharacteristicValue(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-ble/wx.writeBLECharacteristicValue.html)
  *
  * 向低功耗蓝牙设备特征值中写入二进制数据。注意：必须设备的特征值支持 write 才可以成功调用。
  *
  * **注意**
  *
  *
  * - 并行调用多次会存在写失败的可能性。
  * - 小程序不会对写入数据包大小做限制，但系统与蓝牙设备会限制蓝牙4.0单次传输的数据大小，超过最大字节数后会发生写入错误，建议每次写入不超过20字节。
  * - 若单次写入数据过长，iOS 上存在系统不会有任何回调的情况（包括错误回调）。
  * - 安卓平台上，在调用 `notifyBLECharacteristicValueChange` 成功后立即调用 `writeBLECharacteristicValue` 接口，在部分机型上会发生 10008 系统错误
  *
  * **示例代码**
  *
  *
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/pQU51zmz7a3K)
  * ```js
  // 向蓝牙设备发送一个0x00的16进制数据
  let buffer = new ArrayBuffer(1)
  let dataView = new DataView(buffer)
  dataView.setUint8(0, 0)
  wx.writeBLECharacteristicValue({
    // 这里的 deviceId 需要在 getBluetoothDevices 或 onBluetoothDeviceFound 接口中获取
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    // 这里的 characteristicId 需要在 getBLEDeviceCharacteristics 接口中获取
    characteristicId,
    // 这里的value是ArrayBuffer类型
    value: buffer,
    success (res) {
    console.log('writeBLECharacteristicValue success', res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def writeBLECharacteristicValue[TOption /* <: WriteBLECharacteristicValueOption */](option: TOption): PromisifySuccessResult[TOption, WriteBLECharacteristicValueOption] = js.native
}
