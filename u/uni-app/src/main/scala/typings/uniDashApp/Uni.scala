package typings.uniDashApp

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Uni")
@js.native
class Uni () extends js.Object {
  /**
    * 触发自定义事件，附加的参数会传递给事件监听器。
    *
    * 参考: [http://uniapp.dcloud.io/api/window/communication?id=emit](http://uniapp.dcloud.io/api/window/communication?id=emit)
    */
  @JSName("$emit")
  def $emit(): Unit = js.native
  @JSName("$emit")
  def $emit(eventName: String): Unit = js.native
  @JSName("$emit")
  def $emit(eventName: String, param: js.Any): Unit = js.native
  /**
    * 移除自定义事件监听器。如果没有指定事件名，则移除所有事件监听器。如果提供事件名，则移除该事件的所有监听器。如果提供了事件名和回调，则只移除这个回调的监听器。
    *
    * 参考: [http://uniapp.dcloud.io/api/window/communication?id=off](http://uniapp.dcloud.io/api/window/communication?id=off)
    */
  @JSName("$off")
  def $off(): Unit = js.native
  @JSName("$off")
  def $off(eventName: String): Unit = js.native
  @JSName("$off")
  def $off(eventName: String, callback: js.Function0[Unit]): Unit = js.native
  @JSName("$off")
  def $off(eventName: js.Array[_]): Unit = js.native
  @JSName("$off")
  def $off(eventName: js.Array[_], callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听自定义事件。事件可以由 uni.$emit 触发。回调函数会接收 uni.$emit 传递的参数。
    *
    * 参考: [http://uniapp.dcloud.io/api/window/communication?id=on](http://uniapp.dcloud.io/api/window/communication?id=on)
    */
  @JSName("$on")
  def $on(): Unit = js.native
  @JSName("$on")
  def $on(eventName: String): Unit = js.native
  @JSName("$on")
  def $on(eventName: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听一个自定义事件。事件只触发一次，在第一次触发之后移除事件监听器。
    *
    * 参考: [http://uniapp.dcloud.io/api/window/communication?id=once](http://uniapp.dcloud.io/api/window/communication?id=once)
    */
  @JSName("$once")
  def $once(): Unit = js.native
  @JSName("$once")
  def $once(eventName: String): Unit = js.native
  @JSName("$once")
  def $once(eventName: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * 手机通讯录联系人和联系方式的增加
    *
    * 参考: [http://uniapp.dcloud.io/api/system/contact?id=addphonecontact](http://uniapp.dcloud.io/api/system/contact?id=addphonecontact)
    */
  def addPhoneContact(): Unit = js.native
  def addPhoneContact(options: AddPhoneContactOptions): Unit = js.native
  /**
    * 将 ArrayBuffer 对象转成 Base64 字符串
    *
    * 参考: [http://uniapp.dcloud.io/api/arrayBufferToBase64?id=arraybuffertobase64](http://uniapp.dcloud.io/api/arrayBufferToBase64?id=arraybuffertobase64)
    */
  def arrayBufferToBase64(): String = js.native
  def arrayBufferToBase64(arrayBuffer: ArrayBuffer): String = js.native
  /**
    * 提前向用户发起授权请求
    *
    * 参考: [http://uniapp.dcloud.io/api/other/authorize?id=authorize](http://uniapp.dcloud.io/api/other/authorize?id=authorize)
    */
  def authorize(): Unit = js.native
  def authorize(options: AuthorizeOptions): Unit = js.native
  /**
    * 将 Base64 字符串转成 ArrayBuffer 对象
    *
    * 参考: [http://uniapp.dcloud.io/api/base64ToArrayBuffer?id=base64toarraybuffer](http://uniapp.dcloud.io/api/base64ToArrayBuffer?id=base64toarraybuffer)
    */
  def base64ToArrayBuffer(): ArrayBuffer = js.native
  def base64ToArrayBuffer(base64: String): ArrayBuffer = js.native
  /**
    * 判断uni-app的API，回调，参数，组件等是否在当前版本可用
    *
    * 参考: [http://uniapp.dcloud.io/api/system/info?id=caniuse](http://uniapp.dcloud.io/api/system/info?id=caniuse)
    */
  def canIUse(): Boolean = js.native
  def canIUse(options: String): Boolean = js.native
  /**
    * 描述 canvas 区域隐含的像素数据
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/canvas?id=canvasgetimagedata](http://uniapp.dcloud.io/api/ui/canvas?id=canvasgetimagedata)
    */
  def canvasGetImageData(): Unit = js.native
  def canvasGetImageData(options: CanvasGetImageDataOptions): Unit = js.native
  /**
    * 将像素数据绘制到画布
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/canvas?id=canvasputimagedata](http://uniapp.dcloud.io/api/ui/canvas?id=canvasputimagedata)
    */
  def canvasPutImageData(): Unit = js.native
  def canvasPutImageData(options: CanvasPutImageDataOptions): Unit = js.native
  /**
    * 把当前画布指定区域的内容导出生成指定大小的图片
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/canvas?id=canvastotempfilepath](http://uniapp.dcloud.io/api/ui/canvas?id=canvastotempfilepath)
    */
  def canvasToTempFilePath(): Unit = js.native
  def canvasToTempFilePath(options: CanvasToTempFilePathOptions): Unit = js.native
  /**
    * 登录
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/login?id=unichecksession](http://uniapp.dcloud.io/api/plugins/login?id=unichecksession)
    */
  def checkSession(): Unit = js.native
  def checkSession(options: CheckSessionOptions): Unit = js.native
  /**
    * 获取用户收货地址。调起用户编辑收货地址原生界面，并在编辑完成后返回用户选择的地址，需要用户授权 scope.address
    *
    * 参考: [http://uniapp.dcloud.io/api/other/choose-address?id=chooseaddress](http://uniapp.dcloud.io/api/other/choose-address?id=chooseaddress)
    */
  def chooseAddress(): Unit = js.native
  def chooseAddress(options: ChooseAddressOptions): Unit = js.native
  /**
    * 从本地相册选择图片或使用相机拍照
    *
    * 参考: [http://uniapp.dcloud.io/api/media/image?id=chooseimage](http://uniapp.dcloud.io/api/media/image?id=chooseimage)
    */
  def chooseImage(): Unit = js.native
  def chooseImage(options: ChooseImageOptions): Unit = js.native
  /**
    * 选择用户的发票抬头，需要用户授权 scope.invoiceTitle
    *
    * 参考: [http://uniapp.dcloud.io/api/other/invoice-title?id=chooseinvoicetitle](http://uniapp.dcloud.io/api/other/invoice-title?id=chooseinvoicetitle)
    */
  def chooseInvoiceTitle(): Unit = js.native
  def chooseInvoiceTitle(options: ChooseInvoiceTitleOptions): Unit = js.native
  /**
    * 打开地图选择位置。
    *
    * 参考: [http://uniapp.dcloud.io/api/location/location?id=chooselocation](http://uniapp.dcloud.io/api/location/location?id=chooselocation)
    */
  def chooseLocation(): Unit = js.native
  def chooseLocation(options: ChooseLocationOptions): Unit = js.native
  /**
    * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
    *
    * 参考: [http://uniapp.dcloud.io/api/media/video?id=choosevideo](http://uniapp.dcloud.io/api/media/video?id=choosevideo)
    */
  def chooseVideo(): Unit = js.native
  def chooseVideo(options: ChooseVideoOptions): Unit = js.native
  /**
    * 清理本地数据缓存
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=clearstorage](http://uniapp.dcloud.io/api/storage/storage?id=clearstorage)
    */
  def clearStorage(): Unit = js.native
  /**
    * 同步清理本地数据缓存
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=clearstoragesync](http://uniapp.dcloud.io/api/storage/storage?id=clearstoragesync)
    */
  def clearStorageSync(): Unit = js.native
  /**
    * 断开与低功耗蓝牙设备的连接
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=closebleconnection](http://uniapp.dcloud.io/api/system/ble?id=closebleconnection)
    */
  def closeBLEConnection(): Unit = js.native
  def closeBLEConnection(options: CloseBLEConnectionOptions): Unit = js.native
  /**
    * 关闭蓝牙模块
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=closebluetoothadapter](http://uniapp.dcloud.io/api/system/bluetooth?id=closebluetoothadapter)
    */
  def closeBluetoothAdapter(): Unit = js.native
  def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): Unit = js.native
  /**
    * 关闭 WebSocket 连接
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=closesocket](http://uniapp.dcloud.io/api/request/websocket?id=closesocket)
    */
  def closeSocket(): Unit = js.native
  def closeSocket(options: CloseSocketOptions): Unit = js.native
  /**
    * 压缩图片
    *
    * 参考: [http://uniapp.dcloud.io/api/media/image?id=compressimage](http://uniapp.dcloud.io/api/media/image?id=compressimage)
    */
  def compressImage(): Unit = js.native
  def compressImage(options: CompressImageOptions): Unit = js.native
  /**
    * 创建一个 WebSocket 连接
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=connectsocket](http://uniapp.dcloud.io/api/request/websocket?id=connectsocket)
    */
  def connectSocket(): SocketTask = js.native
  def connectSocket(options: ConnectSocketOption): SocketTask = js.native
  /**
    * 创建一个动画实例
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/animation?id=createanimation](http://uniapp.dcloud.io/api/ui/animation?id=createanimation)
    */
  def createAnimation(): Animation = js.native
  def createAnimation(options: CreateAnimationOptions): Animation = js.native
  /**
    * 连接低功耗蓝牙设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=createbleconnection](http://uniapp.dcloud.io/api/system/ble?id=createbleconnection)
    */
  def createBLEConnection(): Unit = js.native
  def createBLEConnection(options: CreateBLEConnectionOptions): Unit = js.native
  /**
    * 创建 canvas 绘图上下文
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/canvas?id=createcanvascontext](http://uniapp.dcloud.io/api/ui/canvas?id=createcanvascontext)
    */
  def createCanvasContext(): CanvasContext = js.native
  def createCanvasContext(canvasId: String): CanvasContext = js.native
  def createCanvasContext(canvasId: String, componentInstance: js.Any): CanvasContext = js.native
  /**
    * 创建并返回 audio 上下文 audioContext 对象
    *
    * 参考: [http://uniapp.dcloud.io/api/media/audio-context?id=createinneraudiocontext](http://uniapp.dcloud.io/api/media/audio-context?id=createinneraudiocontext)
    */
  def createInnerAudioContext(): CreateInnerAudioContext = js.native
  /**
    * 创建并返回一个 IntersectionObserver 对象实例
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/intersection-observer?id=createintersectionobserver](http://uniapp.dcloud.io/api/ui/intersection-observer?id=createintersectionobserver)
    */
  def createIntersectionObserver(): IntersectionObserver = js.native
  def createIntersectionObserver(options: CreateIntersectionObserverOptions): IntersectionObserver = js.native
  /**
    * 创建并返回 map 上下文 mapContext 对象
    *
    * 参考: [http://uniapp.dcloud.io/api/location/map?id=createmapcontext](http://uniapp.dcloud.io/api/location/map?id=createmapcontext)
    */
  def createMapContext(): MapContext = js.native
  def createMapContext(mapId: String): MapContext = js.native
  def createMapContext(mapId: String, currentComponent: js.Any): MapContext = js.native
  /**
    * 返回一个SelectorQuery对象实例
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/nodes-info?id=createselectorquery](http://uniapp.dcloud.io/api/ui/nodes-info?id=createselectorquery)
    */
  def createSelectorQuery(): SelectorQuery = js.native
  /**
    * 创建并返回 video 上下文 videoContext 对象
    *
    * 参考: [http://uniapp.dcloud.io/api/media/video-context?id=createvideocontext](http://uniapp.dcloud.io/api/media/video-context?id=createvideocontext)
    */
  def createVideoContext(): VideoContext = js.native
  def createVideoContext(videoId: String): VideoContext = js.native
  def createVideoContext(videoId: String, currentComponent: js.Any): VideoContext = js.native
  /**
    * 下载文件
    *
    * 参考: [http://uniapp.dcloud.io/api/request/network-file?id=downloadfile](http://uniapp.dcloud.io/api/request/network-file?id=downloadfile)
    */
  def downloadFile(): DownloadTask = js.native
  def downloadFile(options: DownloadFileOption): DownloadTask = js.native
  /**
    * 获取蓝牙设备指定服务中所有特征值
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=getbledevicecharacteristics](http://uniapp.dcloud.io/api/system/ble?id=getbledevicecharacteristics)
    */
  def getBLEDeviceCharacteristics(): Unit = js.native
  def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): Unit = js.native
  /**
    * 获取蓝牙设备的所有服务
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=getbledeviceservices](http://uniapp.dcloud.io/api/system/ble?id=getbledeviceservices)
    */
  def getBLEDeviceServices(): Unit = js.native
  def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): Unit = js.native
  /**
    * 获取全局唯一的背景音频管理器 backgroundAudioManager
    *
    * 参考: [http://uniapp.dcloud.io/api/media/background-audio-manager?id=getbackgroundaudiomanager](http://uniapp.dcloud.io/api/media/background-audio-manager?id=getbackgroundaudiomanager)
    */
  def getBackgroundAudioManager(): BackgroundAudioManager = js.native
  /**
    * 获取已搜索到的iBeacon设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ibeacon?id=getbeacons](http://uniapp.dcloud.io/api/system/ibeacon?id=getbeacons)
    */
  def getBeacons(): Unit = js.native
  def getBeacons(options: GetBeaconsOptions): Unit = js.native
  /**
    * 获取本机蓝牙适配器状态
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=getbluetoothadapterstate](http://uniapp.dcloud.io/api/system/bluetooth?id=getbluetoothadapterstate)
    */
  def getBluetoothAdapterState(): Unit = js.native
  def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): Unit = js.native
  /**
    * 获取已搜索到的蓝牙设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=getbluetoothdevices](http://uniapp.dcloud.io/api/system/bluetooth?id=getbluetoothdevices)
    */
  def getBluetoothDevices(): Unit = js.native
  def getBluetoothDevices(options: GetBluetoothDevicesOptions): Unit = js.native
  /**
    * 获得系统剪贴板的内容
    *
    * 参考: [http://uniapp.dcloud.io/api/system/clipboard?id=getclipboarddata](http://uniapp.dcloud.io/api/system/clipboard?id=getclipboarddata)
    */
  def getClipboardData(): Unit = js.native
  def getClipboardData(options: GetClipboardDataOptions): Unit = js.native
  /**
    * 根据uuid获取处于已连接的设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=getconnectedbluetoothdevices](http://uniapp.dcloud.io/api/system/bluetooth?id=getconnectedbluetoothdevices)
    */
  def getConnectedBluetoothDevices(): Unit = js.native
  def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): Unit = js.native
  /**
    * 获取当前 subNVues 原生子窗体的实例
    *
    * 参考: [http://uniapp.dcloud.io/api/window/subNVues?id=app-getsubnvuebyid](http://uniapp.dcloud.io/api/window/subNVues?id=app-getsubnvuebyid)
    */
  def getCurrentSubNVue(): SubNVue = js.native
  /**
    * 获取第三方平台自定义的数据字段
    *
    * 参考: [http://uniapp.dcloud.io/api/other/get-extconfig?id=getextconfig](http://uniapp.dcloud.io/api/other/get-extconfig?id=getextconfig)
    */
  def getExtConfig(): GetExtConfigRes = js.native
  def getExtConfig(options: GetExtConfigOptions): GetExtConfigRes = js.native
  /**
    * uni.getExtConfig() 的同步版本
    *
    * 参考: [http://uniapp.dcloud.io/api/other/get-extconfig?id=getextconfigsync](http://uniapp.dcloud.io/api/other/get-extconfig?id=getextconfigsync)
    */
  def getExtConfigSync(): GetExtConfigSyncRes = js.native
  /**
    * 获取文件信息
    */
  def getFileInfo(): Unit = js.native
  def getFileInfo(options: GetFileInfoOptions): Unit = js.native
  /**
    * 预览图片
    *
    * 参考: [http://uniapp.dcloud.io/api/media/image?id=getimageinfo](http://uniapp.dcloud.io/api/media/image?id=getimageinfo)
    */
  def getImageInfo(): Unit = js.native
  def getImageInfo(options: GetImageInfoOptions): Unit = js.native
  /**
    * 获取当前的地理位置、速度
    *
    * 参考: [http://uniapp.dcloud.io/api/location/location?id=getlocation](http://uniapp.dcloud.io/api/location/location?id=getlocation)
    */
  def getLocation(): Unit = js.native
  def getLocation(options: GetLocationOptions): Unit = js.native
  /**
    * 获取网络类型
    *
    * 参考: [http://uniapp.dcloud.io/api/system/network?id=getnetworktype](http://uniapp.dcloud.io/api/system/network?id=getnetworktype)
    */
  def getNetworkType(): Unit = js.native
  def getNetworkType(options: GetNetworkTypeOptions): Unit = js.native
  /**
    * 获取服务供应商
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/provider?id=getprovider](http://uniapp.dcloud.io/api/plugins/provider?id=getprovider)
    */
  def getProvider(): Unit = js.native
  def getProvider(options: GetProviderOptions): Unit = js.native
  /**
    * 录音管理
    *
    * 参考: [http://uniapp.dcloud.io/api/media/record-manager?id=getrecordermanager](http://uniapp.dcloud.io/api/media/record-manager?id=getrecordermanager)
    */
  def getRecorderManager(): RecorderManager = js.native
  /**
    * 获取本地文件的文件信息
    *
    * 参考: [http://uniapp.dcloud.io/api/file/file?id=getsavedfileinfo](http://uniapp.dcloud.io/api/file/file?id=getsavedfileinfo)
    */
  def getSavedFileInfo(): Unit = js.native
  def getSavedFileInfo(options: GetSavedFileInfoOptions): Unit = js.native
  /**
    * 获取本地已保存的文件列表
    *
    * 参考: [http://uniapp.dcloud.io/api/file/file?id=getsavedfilelist](http://uniapp.dcloud.io/api/file/file?id=getsavedfilelist)
    */
  def getSavedFileList(): Unit = js.native
  def getSavedFileList(options: GetSavedFileListOptions): Unit = js.native
  /**
    * 获取屏幕亮度
    *
    * 参考: [http://uniapp.dcloud.io/api/system/brightness?id=getscreenbrightness](http://uniapp.dcloud.io/api/system/brightness?id=getscreenbrightness)
    */
  def getScreenBrightness(): Unit = js.native
  def getScreenBrightness(options: GetScreenBrightnessOptions): Unit = js.native
  /**
    * 获取用户的当前设置
    *
    * 参考: [http://uniapp.dcloud.io/api/other/setting?id=getsetting](http://uniapp.dcloud.io/api/other/setting?id=getsetting)
    */
  def getSetting(): Unit = js.native
  def getSetting(options: GetSettingOptions): Unit = js.native
  /**
    * 从本地缓存中异步获取指定 key 对应的内容
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=getstorage](http://uniapp.dcloud.io/api/storage/storage?id=getstorage)
    */
  def getStorage(): Unit = js.native
  def getStorage(options: GetStorageOptions): Unit = js.native
  /**
    * 异步获取当前 storage 的相关信息
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=getstorageinfo](http://uniapp.dcloud.io/api/storage/storage?id=getstorageinfo)
    */
  def getStorageInfo(): Unit = js.native
  def getStorageInfo(options: GetStorageInfoOptions): Unit = js.native
  /**
    * 同步获取当前 storage 的相关信息
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=getstorageinfosync](http://uniapp.dcloud.io/api/storage/storage?id=getstorageinfosync)
    */
  def getStorageInfoSync(): GetStorageInfoSuccess = js.native
  /**
    * 从本地缓存中同步获取指定 key 对应的内容
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=getstoragesync](http://uniapp.dcloud.io/api/storage/storage?id=getstoragesync)
    */
  def getStorageSync(): js.Any = js.native
  def getStorageSync(key: String): js.Any = js.native
  /**
    * 通过id 获取 subNVues 原生子窗体的实例
    *
    * 参考: [http://uniapp.dcloud.io/api/window/subNVues?id=app-getsubnvuebyid](http://uniapp.dcloud.io/api/window/subNVues?id=app-getsubnvuebyid)
    */
  def getSubNVueById(): SubNVue = js.native
  def getSubNVueById(subNvueId: String): SubNVue = js.native
  /**
    * 异步获取系统信息
    *
    * 参考: [http://uniapp.dcloud.io/api/system/info?id=getsysteminfo](http://uniapp.dcloud.io/api/system/info?id=getsysteminfo)
    */
  def getSystemInfo(): Unit = js.native
  def getSystemInfo(options: GetSystemInfoOptions): Unit = js.native
  /**
    * 同步获取系统信息
    *
    * 参考: [http://uniapp.dcloud.io/api/system/info?id=getsysteminfosync](http://uniapp.dcloud.io/api/system/info?id=getsysteminfosync)
    */
  def getSystemInfoSync(): GetSystemInfoResult = js.native
  /**
    * 返回全局唯一的版本更新管理器对象： updateManager，用于管理小程序更新
    *
    * 参考: [http://uniapp.dcloud.io/api/other/update?id=getupdatemanager](http://uniapp.dcloud.io/api/other/update?id=getupdatemanager)
    */
  def getUpdateManager(): UpdateManager = js.native
  /**
    * 获取用户信息
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/login?id=getuserinfo](http://uniapp.dcloud.io/api/plugins/login?id=getuserinfo)
    */
  def getUserInfo(): Unit = js.native
  def getUserInfo(options: GetUserInfoOptions): Unit = js.native
  /**
    * 隐藏软键盘
    *
    * 参考: [http://uniapp.dcloud.io/api/key?id=hidekeyboard](http://uniapp.dcloud.io/api/key?id=hidekeyboard)
    */
  def hideKeyboard(): Unit = js.native
  /**
    * 隐藏 loading 提示框
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/prompt?id=hideloading](http://uniapp.dcloud.io/api/ui/prompt?id=hideloading)
    */
  def hideLoading(): Unit = js.native
  /**
    * 隐藏导航条加载动画
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/navigationbar?id=hidenavigationbarloading](http://uniapp.dcloud.io/api/ui/navigationbar?id=hidenavigationbarloading)
    */
  def hideNavigationBarLoading(): Unit = js.native
  /**
    * 隐藏分享按钮
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/share?id=hidesharemenu](http://uniapp.dcloud.io/api/plugins/share?id=hidesharemenu)
    */
  def hideShareMenu(): Unit = js.native
  def hideShareMenu(options: HideShareMenuOptions): Unit = js.native
  /**
    * 隐藏 tabBar
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=hidetabbar](http://uniapp.dcloud.io/api/ui/tabbar?id=hidetabbar)
    */
  def hideTabBar(): Unit = js.native
  def hideTabBar(options: HideTabBarOptions): Unit = js.native
  /**
    * 隐藏 tabBar 某一项的右上角的红点
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=hidetabbarreddot](http://uniapp.dcloud.io/api/ui/tabbar?id=hidetabbarreddot)
    */
  def hideTabBarRedDot(): Unit = js.native
  def hideTabBarRedDot(options: HideTabBarRedDotOptions): Unit = js.native
  /**
    * 隐藏消息提示框
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/prompt?id=hidetoast](http://uniapp.dcloud.io/api/ui/prompt?id=hidetoast)
    */
  def hideToast(): Unit = js.native
  /**
    * 动态加载网络字体
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/font?id=loadfontface](http://uniapp.dcloud.io/api/ui/font?id=loadfontface)
    */
  def loadFontFace(): Unit = js.native
  def loadFontFace(options: LoadFontFaceOptions): Unit = js.native
  /**
    * 登录
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/login?id=login](http://uniapp.dcloud.io/api/plugins/login?id=login)
    */
  def login(): Unit = js.native
  def login(options: LoginOptions): Unit = js.native
  /**
    * 拨打电话
    *
    * 参考: [http://uniapp.dcloud.io/api/system/phone?id=makephonecall](http://uniapp.dcloud.io/api/system/phone?id=makephonecall)
    */
  def makePhoneCall(): Unit = js.native
  def makePhoneCall(options: MakePhoneCallOptions): Unit = js.native
  /**
    * 关闭当前页面，返回上一页面或多级页面
    *
    * 参考: [http://uniapp.dcloud.io/api/router?id=navigateback](http://uniapp.dcloud.io/api/router?id=navigateback)
    */
  def navigateBack(): Unit = js.native
  def navigateBack(options: NavigateBackOptions): Unit = js.native
  /**
    * 跳转回上一个小程序，只有当另一个小程序跳转到当前小程序时才会能调用成功
    *
    * 参考: [http://uniapp.dcloud.io/api/other/open-miniprogram?id=navigatebackminiprogram](http://uniapp.dcloud.io/api/other/open-miniprogram?id=navigatebackminiprogram)
    */
  def navigateBackMiniProgram(): Unit = js.native
  def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = js.native
  /**
    * 保留当前页面，跳转到应用内的某个页面
    *
    * 参考: [http://uniapp.dcloud.io/api/router?id=navigateto](http://uniapp.dcloud.io/api/router?id=navigateto)
    */
  def navigateTo(): Unit = js.native
  def navigateTo(options: NavigateToOptions): Unit = js.native
  /**
    * 调起客户端小程序设置界面，返回用户设置的操作结果
    *
    * 参考: [http://uniapp.dcloud.io/api/other/open-miniprogram?id=navigatetominiprogram](http://uniapp.dcloud.io/api/other/open-miniprogram?id=navigatetominiprogram)
    */
  def navigateToMiniProgram(): Unit = js.native
  def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = js.native
  /**
    * 启用低功耗蓝牙设备特征值变化时的notify功能，订阅特征值
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=notifyblecharacteristicvaluechange](http://uniapp.dcloud.io/api/system/ble?id=notifyblecharacteristicvaluechange)
    */
  def notifyBLECharacteristicValueChange(): Unit = js.native
  def notifyBLECharacteristicValueChange(options: NotifyBLECharacteristicValueChangeOptions): Unit = js.native
  /**
    * 取消监听窗口尺寸变化事件
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/window?id=offwindowresize](http://uniapp.dcloud.io/api/ui/window?id=offwindowresize)
    */
  def offWindowResize(): Unit = js.native
  def offWindowResize(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听加速度数据，频率：5次/秒，接口调用后会自动开始监听，可使用 uni.stopAccelerometer 停止监听
    *
    * 参考: [http://uniapp.dcloud.io/api/system/accelerometer?id=onaccelerometerchange](http://uniapp.dcloud.io/api/system/accelerometer?id=onaccelerometerchange)
    */
  def onAccelerometerChange(): Unit = js.native
  def onAccelerometerChange(callback: js.Function1[/* result */ OnAccelerometerChangeSuccess, Unit]): Unit = js.native
  /**
    * 监听低功耗蓝牙设备的特征值变化事件
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=onblecharacteristicvaluechange](http://uniapp.dcloud.io/api/system/ble?id=onblecharacteristicvaluechange)
    */
  def onBLECharacteristicValueChange(): Unit = js.native
  def onBLECharacteristicValueChange(callback: js.Function1[/* result */ OnBLECharacteristicValueChangeSuccess, Unit]): Unit = js.native
  /**
    * 监听低功耗蓝牙设备连接状态变化事件
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=onbleconnectionstatechange](http://uniapp.dcloud.io/api/system/ble?id=onbleconnectionstatechange)
    */
  def onBLEConnectionStateChange(): Unit = js.native
  def onBLEConnectionStateChange(callback: js.Function1[/* result */ OnBLEConnectionStateChangeSuccess, Unit]): Unit = js.native
  /**
    * 监听iBeacon服务状态变化
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ibeacon?id=onbeaconservicechange](http://uniapp.dcloud.io/api/system/ibeacon?id=onbeaconservicechange)
    */
  def onBeaconServiceChange(): Unit = js.native
  def onBeaconServiceChange(callback: js.Function1[/* result */ BeaconService, Unit]): Unit = js.native
  /**
    * 监听iBeacon设备更新
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ibeacon?id=onbeaconupdate](http://uniapp.dcloud.io/api/system/ibeacon?id=onbeaconupdate)
    */
  def onBeaconUpdate(): Unit = js.native
  def onBeaconUpdate(callback: js.Function1[/* result */ GetBeaconsRes, Unit]): Unit = js.native
  /**
    * 监听蓝牙适配器状态变化事件
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=onbluetoothadapterstatechange](http://uniapp.dcloud.io/api/system/bluetooth?id=onbluetoothadapterstatechange)
    */
  def onBluetoothAdapterStateChange(): Unit = js.native
  def onBluetoothAdapterStateChange(callback: js.Function1[/* result */ OnBluetoothAdapterStateChangeResult, Unit]): Unit = js.native
  /**
    * 监听搜索到新设备的事件
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=onbluetoothdevicefound](http://uniapp.dcloud.io/api/system/bluetooth?id=onbluetoothdevicefound)
    */
  def onBluetoothDeviceFound(): Unit = js.native
  def onBluetoothDeviceFound(callback: js.Function1[/* result */ OnBluetoothDeviceFoundResult, Unit]): Unit = js.native
  /**
    * 监听罗盘数据，频率：5次/秒，接口调用后会自动开始监听，可使用uni.stopCompass停止监听
    *
    * 参考: [http://uniapp.dcloud.io/api/system/compass?id=oncompasschange](http://uniapp.dcloud.io/api/system/compass?id=oncompasschange)
    */
  def onCompassChange(): Unit = js.native
  def onCompassChange(callback: js.Function1[/* result */ OnCompassChangeSuccess, Unit]): Unit = js.native
  /**
    * 监听陀螺仪数据变化事件
    *
    * 参考: [http://uniapp.dcloud.io/api/system/gyroscope?id=ongyroscopechange](http://uniapp.dcloud.io/api/system/gyroscope?id=ongyroscopechange)
    */
  def onGyroscopeChange(): Unit = js.native
  def onGyroscopeChange(callback: js.Function1[/* result */ OnGyroscopeChangeSuccess, Unit]): Unit = js.native
  /**
    * 监听键盘高度变化
    *
    * 参考: [http://uniapp.dcloud.io/api/key?id=onkeyboardheightchange](http://uniapp.dcloud.io/api/key?id=onkeyboardheightchange)
    */
  def onKeyboardHeightChange(): Unit = js.native
  def onKeyboardHeightChange(callback: js.Function1[/* result */ OnKeyboardHeightChangeResult, Unit]): Unit = js.native
  /**
    * 监听网络状态变化
    *
    * 参考: [http://uniapp.dcloud.io/api/system/network?id=onnetworkstatuschange](http://uniapp.dcloud.io/api/system/network?id=onnetworkstatuschange)
    */
  def onNetworkStatusChange(): Unit = js.native
  def onNetworkStatusChange(callback: js.Function1[/* result */ OnNetworkStatusChangeSuccess, Unit]): Unit = js.native
  /**
    * 监听WebSocket关闭
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=onsocketclose](http://uniapp.dcloud.io/api/request/websocket?id=onsocketclose)
    */
  def onSocketClose(): Unit = js.native
  def onSocketClose(callback: js.Function1[/* result */ GeneralCallbackResult, Unit]): Unit = js.native
  /**
    * 监听WebSocket错误
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=onsocketerror](http://uniapp.dcloud.io/api/request/websocket?id=onsocketerror)
    */
  def onSocketError(): Unit = js.native
  def onSocketError(callback: js.Function1[/* result */ GeneralCallbackResult, Unit]): Unit = js.native
  /**
    * 监听WebSocket接受到服务器的消息事件
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=onsocketmessage](http://uniapp.dcloud.io/api/request/websocket?id=onsocketmessage)
    */
  def onSocketMessage(): Unit = js.native
  def onSocketMessage(callback: js.Function1[/* result */ OnSocketMessageCallbackResult, Unit]): Unit = js.native
  /**
    * 监听WebSocket连接打开事件
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=onsocketopen](http://uniapp.dcloud.io/api/request/websocket?id=onsocketopen)
    */
  def onSocketOpen(): Unit = js.native
  def onSocketOpen(options: js.Function1[/* result */ OnSocketOpenCallbackResult, Unit]): Unit = js.native
  /**
    * 监听窗口尺寸变化事件
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/window?id=onwindowresize](http://uniapp.dcloud.io/api/ui/window?id=onwindowresize)
    */
  def onWindowResize(): Unit = js.native
  def onWindowResize(callback: js.Function1[/* result */ WindowResizeResult, Unit]): Unit = js.native
  /**
    * 初始化蓝牙模块
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=openbluetoothadapter](http://uniapp.dcloud.io/api/system/bluetooth?id=openbluetoothadapter)
    */
  def openBluetoothAdapter(): Unit = js.native
  def openBluetoothAdapter(options: OpenBluetoothAdapterOptions): Unit = js.native
  /**
    * 新开页面打开文档，支持格式：doc, xls, ppt, pdf, docx, xlsx, pptx
    *
    * 参考: [http://uniapp.dcloud.io/api/file/file?id=opendocument](http://uniapp.dcloud.io/api/file/file?id=opendocument)
    */
  def openDocument(): Unit = js.native
  def openDocument(options: OpenDocumentOptions): Unit = js.native
  /**
    * 使用地图查看位置
    *
    * 参考: [http://uniapp.dcloud.io/api/location/open-location?id=openlocation](http://uniapp.dcloud.io/api/location/open-location?id=openlocation)
    */
  def openLocation(): Unit = js.native
  def openLocation(options: OpenLocationOptions): Unit = js.native
  /**
    * 调起客户端小程序设置界面，返回用户设置的操作结果
    *
    * 参考: [http://uniapp.dcloud.io/api/other/authorize?id=opensetting](http://uniapp.dcloud.io/api/other/authorize?id=opensetting)
    */
  def openSetting(): Unit = js.native
  def openSetting(options: OpenSettingOptions): Unit = js.native
  /**
    * 将页面滚动到目标位置
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/scroll?id=pagescrollto](http://uniapp.dcloud.io/api/ui/scroll?id=pagescrollto)
    */
  def pageScrollTo(): Unit = js.native
  def pageScrollTo(options: PageScrollToOptions): Unit = js.native
  /**
    * 预览图片
    *
    * 参考: [http://uniapp.dcloud.io/api/media/image?id=previewimage](http://uniapp.dcloud.io/api/media/image?id=previewimage)
    */
  def previewImage(): Unit = js.native
  def previewImage(options: PreviewImageOptions): Unit = js.native
  /**
    * 关闭所有页面，打开到应用内的某个页面
    *
    * 参考: [http://uniapp.dcloud.io/api/router?id=relaunch](http://uniapp.dcloud.io/api/router?id=relaunch)
    */
  def reLaunch(): Unit = js.native
  def reLaunch(options: ReLaunchOptions): Unit = js.native
  /**
    * 读取低功耗蓝牙设备指定特征值的二进制数据值
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=readblecharacteristicvalue](http://uniapp.dcloud.io/api/system/ble?id=readblecharacteristicvalue)
    */
  def readBLECharacteristicValue(): Unit = js.native
  def readBLECharacteristicValue(options: ReadBLECharacteristicValueOptions): Unit = js.native
  /**
    * 关闭当前页面，跳转到应用内的某个页面
    *
    * 参考: [http://uniapp.dcloud.io/api/router?id=redirectto](http://uniapp.dcloud.io/api/router?id=redirectto)
    */
  def redirectTo(): Unit = js.native
  def redirectTo(options: RedirectToOptions): Unit = js.native
  /**
    * 删除本地存储的文件
    *
    * 参考: [http://uniapp.dcloud.io/api/file/file?id=removesavedfile](http://uniapp.dcloud.io/api/file/file?id=removesavedfile)
    */
  def removeSavedFile(): Unit = js.native
  def removeSavedFile(options: RemoveSavedFileOptions): Unit = js.native
  /**
    * 从本地缓存中异步移除指定 key
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=removestorage](http://uniapp.dcloud.io/api/storage/storage?id=removestorage)
    */
  def removeStorage(): Unit = js.native
  def removeStorage(options: RemoveStorageOptions): Unit = js.native
  /**
    * 从本地缓存中同步移除指定 key
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=removestoragesync](http://uniapp.dcloud.io/api/storage/storage?id=removestoragesync)
    */
  def removeStorageSync(): Unit = js.native
  def removeStorageSync(key: String): Unit = js.native
  /**
    * 移除 tabBar 某一项右上角的文本
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=removetabbarbadge](http://uniapp.dcloud.io/api/ui/tabbar?id=removetabbarbadge)
    */
  def removeTabBarBadge(): Unit = js.native
  def removeTabBarBadge(options: RemoveTabBarBadgeOptions): Unit = js.native
  /**
    * 发起网络请求
    *
    * 参考: [http://uniapp.dcloud.io/api/request/request?id=request](http://uniapp.dcloud.io/api/request/request?id=request)
    */
  def request(): RequestTask = js.native
  def request(options: RequestOptions): RequestTask = js.native
  /**
    * 支付
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/payment?id=requestpayment](http://uniapp.dcloud.io/api/plugins/payment?id=requestpayment)
    */
  def requestPayment(): Unit = js.native
  def requestPayment(options: RequestPaymentOptions): Unit = js.native
  /**
    * 导入原生插件
    *
    * 参考: [http://uniapp.dcloud.io/api/request/network-file?id=downloadfile](http://uniapp.dcloud.io/api/request/network-file?id=downloadfile)
    */
  def requireNativePlugin(): Unit = js.native
  def requireNativePlugin(moduleName: String): Unit = js.native
  /**
    * 保存文件到本地
    *
    * 参考: [http://uniapp.dcloud.io/api/file/file?id=savefile](http://uniapp.dcloud.io/api/file/file?id=savefile)
    */
  def saveFile(): Unit = js.native
  def saveFile(options: SaveFileOptions): Unit = js.native
  /**
    * 保存图片到系统相册
    *
    * 参考: [http://uniapp.dcloud.io/api/media/image?id=saveimagetophotosalbum](http://uniapp.dcloud.io/api/media/image?id=saveimagetophotosalbum)
    */
  def saveImageToPhotosAlbum(): Unit = js.native
  def saveImageToPhotosAlbum(options: SaveImageToPhotosAlbumOptions): Unit = js.native
  /**
    * 保存视频到系统相册
    *
    * 参考: [http://uniapp.dcloud.io/api/media/video?id=savevideotophotosalbum](http://uniapp.dcloud.io/api/media/video?id=savevideotophotosalbum)
    */
  def saveVideoToPhotosAlbum(): Unit = js.native
  def saveVideoToPhotosAlbum(options: SaveVideoToPhotosAlbumOptions): Unit = js.native
  /**
    * 调用扫码界面，扫码成功后返回对应的结果
    *
    * 参考: [http://uniapp.dcloud.io/api/system/barcode?id=scancode](http://uniapp.dcloud.io/api/system/barcode?id=scancode)
    */
  def scanCode(): Unit = js.native
  def scanCode(options: ScanCodeOptions): Unit = js.native
  /**
    * 通过 WebSocket 连接发送数据
    *
    * 参考: [http://uniapp.dcloud.io/api/request/websocket?id=sendsocketmessage](http://uniapp.dcloud.io/api/request/websocket?id=sendsocketmessage)
    */
  def sendSocketMessage(): Unit = js.native
  def sendSocketMessage(options: SendSocketMessageOptions): Unit = js.native
  /**
    * 动态设置窗口的背景色
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/bgcolor?id=setbackgroundcolor](http://uniapp.dcloud.io/api/ui/bgcolor?id=setbackgroundcolor)
    */
  def setBackgroundColor(): Unit = js.native
  def setBackgroundColor(options: SetBackgroundColorOptions): Unit = js.native
  /**
    * 动态设置窗口的背景色
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/bgcolor?id=setbackgroundtextstyle](http://uniapp.dcloud.io/api/ui/bgcolor?id=setbackgroundtextstyle)
    */
  def setBackgroundTextStyle(): Unit = js.native
  def setBackgroundTextStyle(options: SetBackgroundTextStyleOptions): Unit = js.native
  /**
    * 设置系统剪贴板的内容
    *
    * 参考: [http://uniapp.dcloud.io/api/system/clipboard?id=setclipboarddata](http://uniapp.dcloud.io/api/system/clipboard?id=setclipboarddata)
    */
  def setClipboardData(): Unit = js.native
  def setClipboardData(options: SetClipboardDataOptions): Unit = js.native
  /**
    * 设置是否打开调试开关。此开关对正式版也能生效
    *
    * 参考: [http://uniapp.dcloud.io/api/other/set-enable-debug?id=setenabledebug](http://uniapp.dcloud.io/api/other/set-enable-debug?id=setenabledebug)
    */
  def setEnableDebug(): Unit = js.native
  def setEnableDebug(options: SetEnableDebugOptions): Unit = js.native
  /**
    * 设置是否保持常亮状态
    *
    * 参考: [http://uniapp.dcloud.io/api/system/brightness?id=setkeepscreenon](http://uniapp.dcloud.io/api/system/brightness?id=setkeepscreenon)
    */
  def setKeepScreenOn(): Unit = js.native
  def setKeepScreenOn(options: SetKeepScreenOnOptions): Unit = js.native
  /**
    * 设置导航条颜色
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/navigationbar?id=setnavigationbarcolor](http://uniapp.dcloud.io/api/ui/navigationbar?id=setnavigationbarcolor)
    */
  def setNavigationBarColor(): Unit = js.native
  def setNavigationBarColor(options: SetNavigationbarColorOptions): Unit = js.native
  /**
    * 动态设置当前页面的标题
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/navigationbar?id=setnavigationbartitle](http://uniapp.dcloud.io/api/ui/navigationbar?id=setnavigationbartitle)
    */
  def setNavigationBarTitle(): Unit = js.native
  def setNavigationBarTitle(options: SetNavigationBarTitleOptions): Unit = js.native
  /**
    * 设置屏幕亮度
    *
    * 参考: [http://uniapp.dcloud.io/api/system/brightness?id=setscreenbrightness](http://uniapp.dcloud.io/api/system/brightness?id=setscreenbrightness)
    */
  def setScreenBrightness(): Unit = js.native
  def setScreenBrightness(options: SetScreenBrightnessOptions): Unit = js.native
  /**
    * 将数据存储在本地缓存中指定的 key 中，会覆盖掉原来该 key 对应的内容，这是一个异步接口
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=setstorage](http://uniapp.dcloud.io/api/storage/storage?id=setstorage)
    */
  def setStorage(): Unit = js.native
  def setStorage(options: SetStorageOptions): Unit = js.native
  /**
    * 将 data 存储在本地缓存中指定的 key 中，会覆盖掉原来该 key 对应的内容，这是一个同步接口
    *
    * 参考: [http://uniapp.dcloud.io/api/storage/storage?id=setstoragesync](http://uniapp.dcloud.io/api/storage/storage?id=setstoragesync)
    */
  def setStorageSync(): Unit = js.native
  def setStorageSync(key: String): Unit = js.native
  def setStorageSync(key: String, value: js.Any): Unit = js.native
  /**
    * 为 tabBar 某一项的右上角添加文本
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=settabbarbadge](http://uniapp.dcloud.io/api/ui/tabbar?id=settabbarbadge)
    */
  def setTabBarBadge(): Unit = js.native
  def setTabBarBadge(options: SetTabBarBadgeOptions): Unit = js.native
  /**
    * 动态设置 tabBar 某一项的内容
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=settabbaritem](http://uniapp.dcloud.io/api/ui/tabbar?id=settabbaritem)
    */
  def setTabBarItem(): Unit = js.native
  def setTabBarItem(options: SetTabBarItemOptions): Unit = js.native
  /**
    * 动态设置 tabBar 的整体样式
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=settabbarstyle](http://uniapp.dcloud.io/api/ui/tabbar?id=settabbarstyle)
    */
  def setTabBarStyle(): Unit = js.native
  def setTabBarStyle(options: SetTabBarStyleOptions): Unit = js.native
  /**
    * 分享
    *
    * 参考: [http://uniapp.dcloud.io/api/plugins/share?id=share](http://uniapp.dcloud.io/api/plugins/share?id=share)
    */
  def share(): Unit = js.native
  def share(options: ShareOptions): Unit = js.native
  /**
    * 显示操作菜单
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/prompt?id=showactionsheet](http://uniapp.dcloud.io/api/ui/prompt?id=showactionsheet)
    */
  def showActionSheet(): Unit = js.native
  def showActionSheet(options: ShowActionSheetOptions): Unit = js.native
  /**
    * 显示 loading 提示框
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/prompt?id=showloading](http://uniapp.dcloud.io/api/ui/prompt?id=showloading)
    */
  def showLoading(): Unit = js.native
  def showLoading(options: ShowLoadingOptions): Unit = js.native
  /**
    * 显示模态弹窗
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/prompt?id=showmodal](http://uniapp.dcloud.io/api/ui/prompt?id=showmodal)
    */
  def showModal(): Unit = js.native
  def showModal(options: ShowModalOptions): Unit = js.native
  /**
    * 在当前页面显示导航条加载动画
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/navigationbar?id=shownavigationbarloading](http://uniapp.dcloud.io/api/ui/navigationbar?id=shownavigationbarloading)
    */
  def showNavigationBarLoading(): Unit = js.native
  /**
    * 显示 tabBar
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=showtabbar](http://uniapp.dcloud.io/api/ui/tabbar?id=showtabbar)
    */
  def showTabBar(): Unit = js.native
  def showTabBar(options: ShowTabBarOptions): Unit = js.native
  /**
    * 显示 tabBar 某一项的右上角的红点
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/tabbar?id=showtabbarreddot](http://uniapp.dcloud.io/api/ui/tabbar?id=showtabbarreddot)
    */
  def showTabBarRedDot(): Unit = js.native
  def showTabBarRedDot(options: ShowTabBarRedDotOptions): Unit = js.native
  /**
    * 显示消息提示框
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/prompt?id=showtoast](http://uniapp.dcloud.io/api/ui/prompt?id=showtoast)
    */
  def showToast(): Unit = js.native
  def showToast(options: ShowToastOptions): Unit = js.native
  /**
    * 开始监听加速度数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/accelerometer?id=startaccelerometer](http://uniapp.dcloud.io/api/system/accelerometer?id=startaccelerometer)
    */
  def startAccelerometer(): Unit = js.native
  def startAccelerometer(options: StartAccelerometerOptions): Unit = js.native
  /**
    * 开始搜索附近的iBeacon设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ibeacon?id=startbeacondiscovery](http://uniapp.dcloud.io/api/system/ibeacon?id=startbeacondiscovery)
    */
  def startBeaconDiscovery(): Unit = js.native
  def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): Unit = js.native
  /**
    * 开始搜索附近的蓝牙设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=startbluetoothdevicesdiscovery](http://uniapp.dcloud.io/api/system/bluetooth?id=startbluetoothdevicesdiscovery)
    */
  def startBluetoothDevicesDiscovery(): Unit = js.native
  def startBluetoothDevicesDiscovery(options: StartBluetoothDevicesDiscoveryOptions): Unit = js.native
  /**
    * 开始监听罗盘数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/compass?id=startcompass](http://uniapp.dcloud.io/api/system/compass?id=startcompass)
    */
  def startCompass(): Unit = js.native
  def startCompass(options: StartCompassOptions): Unit = js.native
  /**
    * 开始监听陀螺仪数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/gyroscope?id=startgyroscope](http://uniapp.dcloud.io/api/system/gyroscope?id=startgyroscope)
    */
  def startGyroscope(): Unit = js.native
  def startGyroscope(options: StartGyroscopeOptions): Unit = js.native
  /**
    * 开始下拉刷新
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/pulldown?id=startpulldownrefresh](http://uniapp.dcloud.io/api/ui/pulldown?id=startpulldownrefresh)
    */
  def startPullDownRefresh(): Unit = js.native
  def startPullDownRefresh(options: StartPullDownRefreshOptions): Unit = js.native
  /**
    * 停止监听加速度数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/accelerometer?id=stopaccelerometer](http://uniapp.dcloud.io/api/system/accelerometer?id=stopaccelerometer)
    */
  def stopAccelerometer(): Unit = js.native
  def stopAccelerometer(options: StopAccelerometerOptions): Unit = js.native
  /**
    * 停止搜索附近的iBeacon设备
    *
    * 参考: [http://uniapp.dcloud.io//api/system/ibeacon?id=stopbeacondiscovery](http://uniapp.dcloud.io//api/system/ibeacon?id=stopbeacondiscovery)
    */
  def stopBeaconDiscovery(): Unit = js.native
  def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): Unit = js.native
  /**
    * 停止搜寻附近的蓝牙外围设备
    *
    * 参考: [http://uniapp.dcloud.io/api/system/bluetooth?id=stopbluetoothdevicesdiscovery](http://uniapp.dcloud.io/api/system/bluetooth?id=stopbluetoothdevicesdiscovery)
    */
  def stopBluetoothDevicesDiscovery(): Unit = js.native
  def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): Unit = js.native
  /**
    * 停止监听罗盘数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/compass?id=stopcompass](http://uniapp.dcloud.io/api/system/compass?id=stopcompass)
    */
  def stopCompass(): Unit = js.native
  def stopCompass(options: StopCompassOptions): Unit = js.native
  /**
    * 停止监听陀螺仪数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/gyroscope?id=stopgyroscope](http://uniapp.dcloud.io/api/system/gyroscope?id=stopgyroscope)
    */
  def stopGyroscope(): Unit = js.native
  def stopGyroscope(options: StopGyroscopeOptions): Unit = js.native
  /**
    * 停止当前页面下拉刷新
    *
    * 参考: [http://uniapp.dcloud.io/api/ui/pulldown?id=stoppulldownrefresh](http://uniapp.dcloud.io/api/ui/pulldown?id=stoppulldownrefresh)
    */
  def stopPullDownRefresh(): Unit = js.native
  /**
    * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
    *
    * 参考: [http://uniapp.dcloud.io/api/router?id=switchtab](http://uniapp.dcloud.io/api/router?id=switchtab)
    */
  def switchTab(): Unit = js.native
  def switchTab(options: SwitchTabOptions): Unit = js.native
  /**
    * 上传文件
    *
    * 参考: [http://uniapp.dcloud.io/api/request/network-file?id=uploadfile](http://uniapp.dcloud.io/api/request/network-file?id=uploadfile)
    */
  def uploadFile(): UploadTask = js.native
  def uploadFile(options: UploadFileOption): UploadTask = js.native
  /**
    * upx 换算为 px
    *
    * 参考: [http://uniapp.dcloud.io/frame?id=upx2px](http://uniapp.dcloud.io/frame?id=upx2px)
    */
  def upx2px(): Double = js.native
  def upx2px(upx: Double): Double = js.native
  /**
    * 使手机发生较长时间的振动（400ms）
    *
    * 参考: [http://uniapp.dcloud.io/api/system/vibrate?id=vibratelong](http://uniapp.dcloud.io/api/system/vibrate?id=vibratelong)
    */
  def vibrateLong(): Unit = js.native
  def vibrateLong(options: VibrateLongOptions): Unit = js.native
  /**
    * 使手机发生较短时间的振动（15ms）
    *
    * 参考: [http://uniapp.dcloud.io/api/system/vibrate?id=vibrateshort](http://uniapp.dcloud.io/api/system/vibrate?id=vibrateshort)
    */
  def vibrateShort(): Unit = js.native
  def vibrateShort(options: VibrateShortOptions): Unit = js.native
  /**
    * 向低功耗蓝牙设备指定特征值写入二进制数据
    *
    * 参考: [http://uniapp.dcloud.io/api/system/ble?id=writeblecharacteristicvalue](http://uniapp.dcloud.io/api/system/ble?id=writeblecharacteristicvalue)
    */
  def writeBLECharacteristicValue(): Unit = js.native
  def writeBLECharacteristicValue(options: WriteBLECharacteristicValueOptions): Unit = js.native
}

@JSGlobal("uni")
@js.native
object uni extends TopLevel[Uni]

