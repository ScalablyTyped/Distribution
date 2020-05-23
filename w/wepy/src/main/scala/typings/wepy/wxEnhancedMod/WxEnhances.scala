package typings.wepy.wxEnhancedMod

import typings.wepy.anon.Accuracy
import typings.wepy.anon.Address
import typings.wepy.anon.Alpha
import typings.wepy.anon.Altitude
import typings.wepy.anon.AuthSetting
import typings.wepy.anon.BankAccount
import typings.wepy.anon.Brand
import typings.wepy.anon.Cancel
import typings.wepy.anon.CancelColor
import typings.wepy.anon.CanvasId
import typings.wepy.anon.CharSet
import typings.wepy.anon.CheckAuthMode
import typings.wepy.anon.Color
import typings.wepy.anon.Compressed
import typings.wepy.anon.CreateTime
import typings.wepy.anon.Data
import typings.wepy.anon.DataKey
import typings.wepy.anon.Delay
import typings.wepy.anon.DestHeight
import typings.wepy.anon.Duration
import typings.wepy.anon.EncryptedData
import typings.wepy.anon.ErrMsg
import typings.wepy.anon.FileList
import typings.wepy.anon.Height
import typings.wepy.anon.Icon
import typings.wepy.anon.ItemColor
import typings.wepy.anon.Iv
import typings.wepy.anon.Key
import typings.wepy.anon.Lang
import typings.wepy.anon.Latitude
import typings.wepy.anon.NetworkType
import typings.wepy.anon.NonceStr
import typings.wepy.anon.OnlyFromCamera
import typings.wepy.anon.PhoneNumber
import typings.wepy.anon.Scope
import typings.wepy.anon.ScrollTop
import typings.wepy.anon.ShareTicket
import typings.wepy.anon.SupportMode
import typings.wepy.anon.TempFilePath
import typings.wepy.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxEnhances extends js.Object {
  def addPhoneContact(param: WechatProfileDetails): js.Promise[Unit] = js.native
  def authorize(param: Scope): js.Promise[_] = js.native
  def canIUse(name: String): js.Promise[Boolean] = js.native
  def canvasGetImageData(params: CanvasId, context: js.Any): js.Promise[Data] = js.native
  def canvasPutImageData(params: Height, context: js.Any): js.Promise[Unit] = js.native
  def canvasToTempFilePath(params: DestHeight, context: js.Any): js.Promise[TempFilePath] = js.native
  def checkIsSoterEnrolledInDevice(params: CheckAuthMode): js.Promise[ErrMsg] = js.native
  def checkIsSupportSoterAuthentication(): js.Promise[SupportMode] = js.native
  def checkSession(): js.Promise[Unit] = js.native
  def chooseInvoiceTitle(): js.Promise[BankAccount] = js.native
  def chooseLocation(): js.Promise[Address] = js.native
  def chooseVideo(params: Compressed): js.Promise[Duration] = js.native
  def clearStorage(): js.Promise[Unit] = js.native
  def createAnimation(params: Delay): js.Promise[Animation] = js.native
  def createCanvasContext(canvasId: String, context: js.Any): js.Promise[Unit] = js.native
  def createMapContext(mapId: String, context: js.Any): MapContext = js.native
  def createSelectorQuery(): js.Promise[js.Object] = js.native
  def getLocation(params: Altitude): js.Promise[Accuracy] = js.native
  def getNetworkType(): js.Promise[NetworkType] = js.native
  def getSavedFileInfo(params: FilePathParam): js.Promise[CreateTime] = js.native
  def getSavedFileList(): js.Promise[FileList] = js.native
  def getSetting(): js.Promise[AuthSetting] = js.native
  def getShareInfo(params: ShareTicket): js.Promise[EncryptedData] = js.native
  def getSystemInfo(): js.Promise[Brand] = js.native
  def getUserInfo(params: Lang): js.Promise[Iv] = js.native
  def hideLoading(): js.Promise[Unit] = js.native
  def hideNavigationBarLoading(): js.Promise[Unit] = js.native
  def makePhoneCall(params: PhoneNumber): js.Promise[Unit] = js.native
  def navigateTo(params: UrlParam): js.Promise[Unit] = js.native
  def onUserCaptureScreen(): js.Promise[Unit] = js.native
  def openLocation(params: Latitude): js.Promise[Unit] = js.native
  def pageScrollTo(params: ScrollTop): js.Promise[Unit] = js.native
  def redirectTo(params: UrlParam): js.Promise[Unit] = js.native
  def removeSavedFile(params: FilePathParam): js.Promise[Unit] = js.native
  def removeStorage(params: Key): js.Promise[Unit] = js.native
  def request(params: String): js.Promise[_] = js.native
  def request(params: RequestParam): js.Promise[_] = js.native
  def requestPayment(params: NonceStr): js.Promise[Unit] = js.native
  def scanCode(params: OnlyFromCamera): js.Promise[CharSet] = js.native
  def setNavigationBarAlpha(params: Alpha): js.Promise[Unit] = js.native
  def setNavigationBarColor(params: Color): js.Promise[Unit] = js.native
  def setNavigationBarTitle(params: Title): js.Promise[Unit] = js.native
  def setStorage(params: DataKey): js.Promise[Unit] = js.native
  def showActionSheet(params: ItemColor): js.Promise[Unit] = js.native
  def showLoading(params: Title): js.Promise[Unit] = js.native
  def showModal(params: CancelColor): js.Promise[Cancel] = js.native
  def showNavigationBarLoading(): js.Promise[Unit] = js.native
  def showToast(params: Icon): js.Promise[Unit] = js.native
  def switchTab(params: UrlParam): js.Promise[Unit] = js.native
}

