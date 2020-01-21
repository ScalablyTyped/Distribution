package typings.wepy.wxEnhancedMod

import typings.wepy.Anon0
import typings.wepy.AnonAccuracy
import typings.wepy.AnonAddress
import typings.wepy.AnonAddressLatitude
import typings.wepy.AnonAlpha
import typings.wepy.AnonAltitude
import typings.wepy.AnonAuthSetting
import typings.wepy.AnonBrand
import typings.wepy.AnonCancel
import typings.wepy.AnonCancelColor
import typings.wepy.AnonCanvasId
import typings.wepy.AnonCanvasIdData
import typings.wepy.AnonCanvasIdDestHeight
import typings.wepy.AnonCharSet
import typings.wepy.AnonCheckAuthMode
import typings.wepy.AnonColor
import typings.wepy.AnonCompressed
import typings.wepy.AnonCreateTime
import typings.wepy.AnonData
import typings.wepy.AnonDataKey
import typings.wepy.AnonDelay
import typings.wepy.AnonDuration
import typings.wepy.AnonDurationIcon
import typings.wepy.AnonDurationScrollTop
import typings.wepy.AnonEncryptedData
import typings.wepy.AnonEncryptedDataIv
import typings.wepy.AnonErrMsg
import typings.wepy.AnonErrMsgFileList
import typings.wepy.AnonItemColor
import typings.wepy.AnonKey
import typings.wepy.AnonLang
import typings.wepy.AnonNetworkType
import typings.wepy.AnonNonceStr
import typings.wepy.AnonOnlyFromCamera
import typings.wepy.AnonPhoneNumber
import typings.wepy.AnonScope
import typings.wepy.AnonShareTicket
import typings.wepy.AnonSupportMode
import typings.wepy.AnonTempFilePath
import typings.wepy.AnonTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxEnhances extends js.Object {
  def addPhoneContact(param: WechatProfileDetails): js.Promise[Unit] = js.native
  def authorize(param: AnonScope): js.Promise[_] = js.native
  def canIUse(name: String): js.Promise[Boolean] = js.native
  def canvasGetImageData(params: AnonCanvasId, context: js.Any): js.Promise[AnonData] = js.native
  def canvasPutImageData(params: AnonCanvasIdData, context: js.Any): js.Promise[Unit] = js.native
  def canvasToTempFilePath(params: AnonCanvasIdDestHeight, context: js.Any): js.Promise[AnonTempFilePath] = js.native
  def checkIsSoterEnrolledInDevice(params: AnonCheckAuthMode): js.Promise[AnonErrMsg] = js.native
  def checkIsSupportSoterAuthentication(): js.Promise[AnonSupportMode] = js.native
  def checkSession(): js.Promise[Unit] = js.native
  def chooseInvoiceTitle(): js.Promise[Anon0] = js.native
  def chooseLocation(): js.Promise[AnonAddress] = js.native
  def chooseVideo(params: AnonCompressed): js.Promise[AnonDuration] = js.native
  def clearStorage(): js.Promise[Unit] = js.native
  def createAnimation(params: AnonDelay): js.Promise[Animation] = js.native
  def createCanvasContext(canvasId: String, context: js.Any): js.Promise[Unit] = js.native
  def createMapContext(mapId: String, context: js.Any): MapContext = js.native
  def createSelectorQuery(): js.Promise[js.Object] = js.native
  def getLocation(params: AnonAltitude): js.Promise[AnonAccuracy] = js.native
  def getNetworkType(): js.Promise[AnonNetworkType] = js.native
  def getSavedFileInfo(params: FilePathParam): js.Promise[AnonCreateTime] = js.native
  def getSavedFileList(): js.Promise[AnonErrMsgFileList] = js.native
  def getSetting(): js.Promise[AnonAuthSetting] = js.native
  def getShareInfo(params: AnonShareTicket): js.Promise[AnonEncryptedData] = js.native
  def getSystemInfo(): js.Promise[AnonBrand] = js.native
  def getUserInfo(params: AnonLang): js.Promise[AnonEncryptedDataIv] = js.native
  def hideLoading(): js.Promise[Unit] = js.native
  def hideNavigationBarLoading(): js.Promise[Unit] = js.native
  def makePhoneCall(params: AnonPhoneNumber): js.Promise[Unit] = js.native
  def navigateTo(params: UrlParam): js.Promise[Unit] = js.native
  def onUserCaptureScreen(): js.Promise[Unit] = js.native
  def openLocation(params: AnonAddressLatitude): js.Promise[Unit] = js.native
  def pageScrollTo(params: AnonDurationScrollTop): js.Promise[Unit] = js.native
  def redirectTo(params: UrlParam): js.Promise[Unit] = js.native
  def removeSavedFile(params: FilePathParam): js.Promise[Unit] = js.native
  def removeStorage(params: AnonKey): js.Promise[Unit] = js.native
  def request(params: String): js.Promise[_] = js.native
  def request(params: RequestParam): js.Promise[_] = js.native
  def requestPayment(params: AnonNonceStr): js.Promise[Unit] = js.native
  def scanCode(params: AnonOnlyFromCamera): js.Promise[AnonCharSet] = js.native
  def setNavigationBarAlpha(params: AnonAlpha): js.Promise[Unit] = js.native
  def setNavigationBarColor(params: AnonColor): js.Promise[Unit] = js.native
  def setNavigationBarTitle(params: AnonTitle): js.Promise[Unit] = js.native
  def setStorage(params: AnonDataKey): js.Promise[Unit] = js.native
  def showActionSheet(params: AnonItemColor): js.Promise[Unit] = js.native
  def showLoading(params: AnonTitle): js.Promise[Unit] = js.native
  def showModal(params: AnonCancelColor): js.Promise[AnonCancel] = js.native
  def showNavigationBarLoading(): js.Promise[Unit] = js.native
  def showToast(params: AnonDurationIcon): js.Promise[Unit] = js.native
  def switchTab(params: UrlParam): js.Promise[Unit] = js.native
}

