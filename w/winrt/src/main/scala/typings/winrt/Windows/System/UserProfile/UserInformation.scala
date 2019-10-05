package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
class UserInformation () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
object UserInformation extends js.Object {
  var accountPictureChangeEnabled: Boolean = js.native
  var nameAccessAllowed: Boolean = js.native
  var onaccountpicturechanged: js.Any = js.native
  def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
  def getDisplayNameAsync(): IAsyncOperation[String] = js.native
  def getDomainNameAsync(): IAsyncOperation[String] = js.native
  def getFirstNameAsync(): IAsyncOperation[String] = js.native
  def getLastNameAsync(): IAsyncOperation[String] = js.native
  def getPrincipalNameAsync(): IAsyncOperation[String] = js.native
  def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri] = js.native
  def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
  def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
}

