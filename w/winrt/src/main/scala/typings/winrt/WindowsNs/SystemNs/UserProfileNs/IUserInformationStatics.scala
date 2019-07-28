package typings.winrt.WindowsNs.SystemNs.UserProfileNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserInformationStatics extends js.Object {
  var accountPictureChangeEnabled: Boolean
  var nameAccessAllowed: Boolean
  var onaccountpicturechanged: js.Any
  def getAccountPicture(kind: AccountPictureKind): IStorageFile
  def getDisplayNameAsync(): IAsyncOperation[String]
  def getDomainNameAsync(): IAsyncOperation[String]
  def getFirstNameAsync(): IAsyncOperation[String]
  def getLastNameAsync(): IAsyncOperation[String]
  def getPrincipalNameAsync(): IAsyncOperation[String]
  def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri]
  def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult]
  def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult]
  def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult]
  def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult]
}

object IUserInformationStatics {
  @scala.inline
  def apply(
    accountPictureChangeEnabled: Boolean,
    getAccountPicture: AccountPictureKind => IStorageFile,
    getDisplayNameAsync: () => IAsyncOperation[String],
    getDomainNameAsync: () => IAsyncOperation[String],
    getFirstNameAsync: () => IAsyncOperation[String],
    getLastNameAsync: () => IAsyncOperation[String],
    getPrincipalNameAsync: () => IAsyncOperation[String],
    getSessionInitiationProtocolUriAsync: () => IAsyncOperation[Uri],
    nameAccessAllowed: Boolean,
    onaccountpicturechanged: js.Any,
    setAccountPictureAsync: IStorageFile => IAsyncOperation[SetAccountPictureResult],
    setAccountPictureFromStreamAsync: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesAsync: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesFromStreamsAsync: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
  ): IUserInformationStatics = {
    val __obj = js.Dynamic.literal(accountPictureChangeEnabled = accountPictureChangeEnabled, getAccountPicture = js.Any.fromFunction1(getAccountPicture), getDisplayNameAsync = js.Any.fromFunction0(getDisplayNameAsync), getDomainNameAsync = js.Any.fromFunction0(getDomainNameAsync), getFirstNameAsync = js.Any.fromFunction0(getFirstNameAsync), getLastNameAsync = js.Any.fromFunction0(getLastNameAsync), getPrincipalNameAsync = js.Any.fromFunction0(getPrincipalNameAsync), getSessionInitiationProtocolUriAsync = js.Any.fromFunction0(getSessionInitiationProtocolUriAsync), nameAccessAllowed = nameAccessAllowed, onaccountpicturechanged = onaccountpicturechanged, setAccountPictureAsync = js.Any.fromFunction1(setAccountPictureAsync), setAccountPictureFromStreamAsync = js.Any.fromFunction1(setAccountPictureFromStreamAsync), setAccountPicturesAsync = js.Any.fromFunction3(setAccountPicturesAsync), setAccountPicturesFromStreamsAsync = js.Any.fromFunction3(setAccountPicturesFromStreamsAsync))
  
    __obj.asInstanceOf[IUserInformationStatics]
  }
}

