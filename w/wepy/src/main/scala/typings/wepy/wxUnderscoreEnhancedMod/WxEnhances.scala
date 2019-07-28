package typings.wepy.wxUnderscoreEnhancedMod

import typings.wepy.Anon_0
import typings.wepy.Anon_Accuracy
import typings.wepy.Anon_Address
import typings.wepy.Anon_AddressLatitude
import typings.wepy.Anon_Alpha
import typings.wepy.Anon_Altitude
import typings.wepy.Anon_AuthSetting
import typings.wepy.Anon_Brand
import typings.wepy.Anon_Cancel
import typings.wepy.Anon_CancelColor
import typings.wepy.Anon_CanvasId
import typings.wepy.Anon_CanvasIdData
import typings.wepy.Anon_CanvasIdDestHeight
import typings.wepy.Anon_CharSet
import typings.wepy.Anon_CheckAuthMode
import typings.wepy.Anon_Color
import typings.wepy.Anon_Compressed
import typings.wepy.Anon_CreateTime
import typings.wepy.Anon_Data
import typings.wepy.Anon_DataKey
import typings.wepy.Anon_Delay
import typings.wepy.Anon_Duration
import typings.wepy.Anon_DurationIcon
import typings.wepy.Anon_DurationScrollTop
import typings.wepy.Anon_EncryptedData
import typings.wepy.Anon_EncryptedDataIv
import typings.wepy.Anon_ErrMsg
import typings.wepy.Anon_ErrMsgFileList
import typings.wepy.Anon_ItemColor
import typings.wepy.Anon_Key
import typings.wepy.Anon_Lang
import typings.wepy.Anon_NetworkType
import typings.wepy.Anon_NonceStr
import typings.wepy.Anon_OnlyFromCamera
import typings.wepy.Anon_PhoneNumber
import typings.wepy.Anon_Scope
import typings.wepy.Anon_ShareTicket
import typings.wepy.Anon_SupportMode
import typings.wepy.Anon_TempFilePath
import typings.wepy.Anon_Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxEnhances extends js.Object {
  def addPhoneContact(param: WechatProfileDetails): js.Promise[Unit] = js.native
  def authorize(param: Anon_Scope): js.Promise[_] = js.native
  def canIUse(name: String): js.Promise[Boolean] = js.native
  def canvasGetImageData(params: Anon_CanvasId, context: js.Any): js.Promise[Anon_Data] = js.native
  def canvasPutImageData(params: Anon_CanvasIdData, context: js.Any): js.Promise[Unit] = js.native
  def canvasToTempFilePath(params: Anon_CanvasIdDestHeight, context: js.Any): js.Promise[Anon_TempFilePath] = js.native
  def checkIsSoterEnrolledInDevice(params: Anon_CheckAuthMode): js.Promise[Anon_ErrMsg] = js.native
  def checkIsSupportSoterAuthentication(): js.Promise[Anon_SupportMode] = js.native
  def checkSession(): js.Promise[Unit] = js.native
  def chooseInvoiceTitle(): js.Promise[Anon_0] = js.native
  def chooseLocation(): js.Promise[Anon_Address] = js.native
  def chooseVideo(params: Anon_Compressed): js.Promise[Anon_Duration] = js.native
  def clearStorage(): js.Promise[Unit] = js.native
  def createAnimation(params: Anon_Delay): js.Promise[Animation] = js.native
  def createCanvasContext(canvasId: String, context: js.Any): js.Promise[Unit] = js.native
  def createMapContext(mapId: String, context: js.Any): MapContext = js.native
  def createSelectorQuery(): js.Promise[js.Object] = js.native
  def getLocation(params: Anon_Altitude): js.Promise[Anon_Accuracy] = js.native
  def getNetworkType(): js.Promise[Anon_NetworkType] = js.native
  def getSavedFileInfo(params: FilePathParam): js.Promise[Anon_CreateTime] = js.native
  def getSavedFileList(): js.Promise[Anon_ErrMsgFileList] = js.native
  def getSetting(): js.Promise[Anon_AuthSetting] = js.native
  def getShareInfo(params: Anon_ShareTicket): js.Promise[Anon_EncryptedData] = js.native
  def getSystemInfo(): js.Promise[Anon_Brand] = js.native
  def getUserInfo(params: Anon_Lang): js.Promise[Anon_EncryptedDataIv] = js.native
  def hideLoading(): js.Promise[Unit] = js.native
  def hideNavigationBarLoading(): js.Promise[Unit] = js.native
  def makePhoneCall(params: Anon_PhoneNumber): js.Promise[Unit] = js.native
  def navigateTo(params: UrlParam): js.Promise[Unit] = js.native
  def onUserCaptureScreen(): js.Promise[Unit] = js.native
  def openLocation(params: Anon_AddressLatitude): js.Promise[Unit] = js.native
  def pageScrollTo(params: Anon_DurationScrollTop): js.Promise[Unit] = js.native
  def redirectTo(params: UrlParam): js.Promise[Unit] = js.native
  def removeSavedFile(params: FilePathParam): js.Promise[Unit] = js.native
  def removeStorage(params: Anon_Key): js.Promise[Unit] = js.native
  def request(params: String): js.Promise[_] = js.native
  def request(params: RequestParam): js.Promise[_] = js.native
  def requestPayment(params: Anon_NonceStr): js.Promise[Unit] = js.native
  def scanCode(params: Anon_OnlyFromCamera): js.Promise[Anon_CharSet] = js.native
  def setNavigationBarAlpha(params: Anon_Alpha): js.Promise[Unit] = js.native
  def setNavigationBarColor(params: Anon_Color): js.Promise[Unit] = js.native
  def setNavigationBarTitle(params: Anon_Title): js.Promise[Unit] = js.native
  def setStorage(params: Anon_DataKey): js.Promise[Unit] = js.native
  def showActionSheet(params: Anon_ItemColor): js.Promise[Unit] = js.native
  def showLoading(params: Anon_Title): js.Promise[Unit] = js.native
  def showModal(params: Anon_CancelColor): js.Promise[Anon_Cancel] = js.native
  def showNavigationBarLoading(): js.Promise[Unit] = js.native
  def showToast(params: Anon_DurationIcon): js.Promise[Unit] = js.native
  def switchTab(params: UrlParam): js.Promise[Unit] = js.native
}

