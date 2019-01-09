package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxEnhances extends js.Object {
  def addPhoneContact(param: WechatProfileDetails): js.Promise[scala.Unit] = js.native
  def authorize(param: wepyLib.Anon_Scope): js.Promise[_] = js.native
  def canIUse(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  def canvasGetImageData(params: wepyLib.Anon_CanvasId, context: js.Any): js.Promise[wepyLib.Anon_Data] = js.native
  def canvasPutImageData(params: wepyLib.Anon_CanvasIdData, context: js.Any): js.Promise[scala.Unit] = js.native
  def canvasToTempFilePath(params: wepyLib.Anon_CanvasIdDestHeight, context: js.Any): js.Promise[wepyLib.Anon_TempFilePath] = js.native
  def checkIsSoterEnrolledInDevice(params: wepyLib.Anon_CheckAuthMode): js.Promise[wepyLib.Anon_ErrMsg] = js.native
  def checkIsSupportSoterAuthentication(): js.Promise[wepyLib.Anon_SupportMode] = js.native
  def checkSession(): js.Promise[scala.Unit] = js.native
  def chooseInvoiceTitle(): js.Promise[wepyLib.Anon_0] = js.native
  def chooseLocation(): js.Promise[wepyLib.Anon_Address] = js.native
  def chooseVideo(params: wepyLib.Anon_Compressed): js.Promise[wepyLib.Anon_Duration] = js.native
  def clearStorage(): js.Promise[scala.Unit] = js.native
  def createAnimation(params: wepyLib.Anon_Delay): js.Promise[Animation] = js.native
  def createCanvasContext(canvasId: java.lang.String, context: js.Any): js.Promise[scala.Unit] = js.native
  def createMapContext(mapId: java.lang.String, context: js.Any): MapContext = js.native
  def createSelectorQuery(): js.Promise[js.Object] = js.native
  def getLocation(params: wepyLib.Anon_Altitude): js.Promise[wepyLib.Anon_Accuracy] = js.native
  def getNetworkType(): js.Promise[wepyLib.Anon_NetworkType] = js.native
  def getSavedFileInfo(params: FilePathParam): js.Promise[wepyLib.Anon_CreateTime] = js.native
  def getSavedFileList(): js.Promise[wepyLib.Anon_ErrMsgFileList] = js.native
  def getSetting(): js.Promise[wepyLib.Anon_AuthSetting] = js.native
  def getShareInfo(params: wepyLib.Anon_ShareTicket): js.Promise[wepyLib.Anon_EncryptedData] = js.native
  def getSystemInfo(): js.Promise[wepyLib.Anon_Brand] = js.native
  def getUserInfo(params: wepyLib.Anon_Lang): js.Promise[wepyLib.Anon_EncryptedDataIv] = js.native
  def hideLoading(): js.Promise[scala.Unit] = js.native
  def hideNavigationBarLoading(): js.Promise[scala.Unit] = js.native
  def makePhoneCall(params: wepyLib.Anon_PhoneNumber): js.Promise[scala.Unit] = js.native
  def navigateTo(params: UrlParam): js.Promise[scala.Unit] = js.native
  def onUserCaptureScreen(): js.Promise[scala.Unit] = js.native
  def openLocation(params: wepyLib.Anon_AddressLatitude): js.Promise[scala.Unit] = js.native
  def pageScrollTo(params: wepyLib.Anon_DurationScrollTop): js.Promise[scala.Unit] = js.native
  def redirectTo(params: UrlParam): js.Promise[scala.Unit] = js.native
  def removeSavedFile(params: FilePathParam): js.Promise[scala.Unit] = js.native
  def removeStorage(params: wepyLib.Anon_Key): js.Promise[scala.Unit] = js.native
  def request(params: java.lang.String): js.Promise[_] = js.native
  def request(params: RequestParam): js.Promise[_] = js.native
  def requestPayment(params: wepyLib.Anon_NonceStr): js.Promise[scala.Unit] = js.native
  def scanCode(params: wepyLib.Anon_OnlyFromCamera): js.Promise[wepyLib.Anon_CharSet] = js.native
  def setNavigationBarAlpha(params: wepyLib.Anon_Alpha): js.Promise[scala.Unit] = js.native
  def setNavigationBarColor(params: wepyLib.Anon_Color): js.Promise[scala.Unit] = js.native
  def setNavigationBarTitle(params: wepyLib.Anon_Title): js.Promise[scala.Unit] = js.native
  def setStorage(params: wepyLib.Anon_DataKey): js.Promise[scala.Unit] = js.native
  def showActionSheet(params: wepyLib.Anon_ItemColor): js.Promise[scala.Unit] = js.native
  def showLoading(params: wepyLib.Anon_Title): js.Promise[scala.Unit] = js.native
  def showModal(params: wepyLib.Anon_CancelColor): js.Promise[wepyLib.Anon_Cancel] = js.native
  def showNavigationBarLoading(): js.Promise[scala.Unit] = js.native
  def showToast(params: wepyLib.Anon_DurationIcon): js.Promise[scala.Unit] = js.native
  def switchTab(params: UrlParam): js.Promise[scala.Unit] = js.native
}

