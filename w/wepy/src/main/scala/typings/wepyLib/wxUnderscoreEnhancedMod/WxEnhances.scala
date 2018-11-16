package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxEnhances extends js.Object {
  def addPhoneContact(param: WechatProfileDetails): stdLib.Promise[scala.Unit] = js.native
  def authorize(param: wepyLib.Anon_Scope): stdLib.Promise[_] = js.native
  def canIUse(name: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def canvasGetImageData(params: wepyLib.Anon_X, context: js.Any): stdLib.Promise[wepyLib.Anon_Data] = js.native
  def canvasPutImageData(params: wepyLib.Anon_XY, context: js.Any): stdLib.Promise[scala.Unit] = js.native
  def canvasToTempFilePath(params: wepyLib.Anon_DestWidth, context: js.Any): stdLib.Promise[wepyLib.Anon_TempFilePath] = js.native
  def checkIsSoterEnrolledInDevice(params: wepyLib.Anon_CheckAuthMode): stdLib.Promise[wepyLib.Anon_ErrMsg] = js.native
  def checkIsSupportSoterAuthentication(): stdLib.Promise[wepyLib.Anon_SupportMode] = js.native
  def checkSession(): stdLib.Promise[scala.Unit] = js.native
  def chooseInvoiceTitle(): stdLib.Promise[wepyLib.Anon_BankName] = js.native
  def chooseLocation(): stdLib.Promise[wepyLib.Anon_Address] = js.native
  def chooseVideo(params: wepyLib.Anon_Compressed): stdLib.Promise[wepyLib.Anon_DurationSize] = js.native
  def clearStorage(): stdLib.Promise[scala.Unit] = js.native
  def createAnimation(params: wepyLib.Anon_TimingFunction): stdLib.Promise[Animation] = js.native
  def createCanvasContext(canvasId: java.lang.String, context: js.Any): stdLib.Promise[scala.Unit] = js.native
  def createMapContext(mapId: java.lang.String, context: js.Any): MapContext = js.native
  def createSelectorQuery(): stdLib.Promise[js.Object] = js.native
  def getLocation(params: wepyLib.Anon_Type): stdLib.Promise[wepyLib.Anon_Altitude] = js.native
  def getNetworkType(): stdLib.Promise[wepyLib.Anon_NetworkType] = js.native
  def getSavedFileInfo(params: FilePathParam): stdLib.Promise[wepyLib.Anon_ErrMsgSize] = js.native
  def getSavedFileList(): stdLib.Promise[wepyLib.Anon_ErrMsgFileList] = js.native
  def getSetting(): stdLib.Promise[wepyLib.Anon_AuthSetting] = js.native
  def getShareInfo(params: wepyLib.Anon_ShareTicket): stdLib.Promise[wepyLib.Anon_ErrMsgEncryptedData] = js.native
  def getSystemInfo(): stdLib.Promise[wepyLib.Anon_PixelRatio] = js.native
  def getUserInfo(params: wepyLib.Anon_WithCredentials): stdLib.Promise[wepyLib.Anon_EncryptedData] = js.native
  def hideLoading(): stdLib.Promise[scala.Unit] = js.native
  def hideNavigationBarLoading(): stdLib.Promise[scala.Unit] = js.native
  def makePhoneCall(params: wepyLib.Anon_PhoneNumber): stdLib.Promise[scala.Unit] = js.native
  def navigateTo(params: UrlParam): stdLib.Promise[scala.Unit] = js.native
  def onUserCaptureScreen(): stdLib.Promise[scala.Unit] = js.native
  def openLocation(params: wepyLib.Anon_Name): stdLib.Promise[scala.Unit] = js.native
  def pageScrollTo(params: wepyLib.Anon_ScrollTop): stdLib.Promise[scala.Unit] = js.native
  def redirectTo(params: UrlParam): stdLib.Promise[scala.Unit] = js.native
  def removeSavedFile(params: FilePathParam): stdLib.Promise[scala.Unit] = js.native
  def removeStorage(params: wepyLib.Anon_Key): stdLib.Promise[scala.Unit] = js.native
  def request(params: java.lang.String): stdLib.Promise[_] = js.native
  def request(params: RequestParam): stdLib.Promise[_] = js.native
  def requestPayment(params: wepyLib.Anon_NonceStr): stdLib.Promise[scala.Unit] = js.native
  def scanCode(params: wepyLib.Anon_OnlyFromCamera): stdLib.Promise[wepyLib.Anon_Result] = js.native
  def setNavigationBarAlpha(params: wepyLib.Anon_Alpha): stdLib.Promise[scala.Unit] = js.native
  def setNavigationBarColor(params: wepyLib.Anon_Color): stdLib.Promise[scala.Unit] = js.native
  def setNavigationBarTitle(params: wepyLib.Anon_Title): stdLib.Promise[scala.Unit] = js.native
  def setStorage(params: wepyLib.Anon_KeyData): stdLib.Promise[scala.Unit] = js.native
  def showActionSheet(params: wepyLib.Anon_ItemColor): stdLib.Promise[scala.Unit] = js.native
  def showLoading(params: wepyLib.Anon_Title): stdLib.Promise[scala.Unit] = js.native
  def showModal(params: wepyLib.Anon_ShowCancel): stdLib.Promise[wepyLib.Anon_Cancel] = js.native
  def showNavigationBarLoading(): stdLib.Promise[scala.Unit] = js.native
  def showToast(params: wepyLib.Anon_DurationMask): stdLib.Promise[scala.Unit] = js.native
  def switchTab(params: UrlParam): stdLib.Promise[scala.Unit] = js.native
}

