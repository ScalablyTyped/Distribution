package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserInformationStatics extends js.Object {
  var accountPictureChangeEnabled: scala.Boolean
  var nameAccessAllowed: scala.Boolean
  var onaccountpicturechanged: js.Any
  def getAccountPicture(kind: AccountPictureKind): winrtLib.WindowsNs.StorageNs.IStorageFile
  def getDisplayNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getDomainNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getFirstNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getLastNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getPrincipalNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getSessionInitiationProtocolUriAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.Uri]
  def setAccountPictureAsync(image: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult]
  def setAccountPictureFromStreamAsync(image: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult]
  def setAccountPicturesAsync(
    smallImage: winrtLib.WindowsNs.StorageNs.IStorageFile,
    largeImage: winrtLib.WindowsNs.StorageNs.IStorageFile,
    video: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult]
  def setAccountPicturesFromStreamsAsync(
    smallImage: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    largeImage: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    video: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult]
}

object IUserInformationStatics {
  @scala.inline
  def apply(
    accountPictureChangeEnabled: scala.Boolean,
    getAccountPicture: AccountPictureKind => winrtLib.WindowsNs.StorageNs.IStorageFile,
    getDisplayNameAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    getDomainNameAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    getFirstNameAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    getLastNameAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    getPrincipalNameAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    getSessionInitiationProtocolUriAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.Uri],
    nameAccessAllowed: scala.Boolean,
    onaccountpicturechanged: js.Any,
    setAccountPictureAsync: winrtLib.WindowsNs.StorageNs.IStorageFile => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult],
    setAccountPictureFromStreamAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesAsync: (winrtLib.WindowsNs.StorageNs.IStorageFile, winrtLib.WindowsNs.StorageNs.IStorageFile, winrtLib.WindowsNs.StorageNs.IStorageFile) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult],
    setAccountPicturesFromStreamsAsync: (winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SetAccountPictureResult]
  ): IUserInformationStatics = {
    val __obj = js.Dynamic.literal(accountPictureChangeEnabled = accountPictureChangeEnabled, getAccountPicture = js.Any.fromFunction1(getAccountPicture), getDisplayNameAsync = js.Any.fromFunction0(getDisplayNameAsync), getDomainNameAsync = js.Any.fromFunction0(getDomainNameAsync), getFirstNameAsync = js.Any.fromFunction0(getFirstNameAsync), getLastNameAsync = js.Any.fromFunction0(getLastNameAsync), getPrincipalNameAsync = js.Any.fromFunction0(getPrincipalNameAsync), getSessionInitiationProtocolUriAsync = js.Any.fromFunction0(getSessionInitiationProtocolUriAsync), nameAccessAllowed = nameAccessAllowed, onaccountpicturechanged = onaccountpicturechanged, setAccountPictureAsync = js.Any.fromFunction1(setAccountPictureAsync), setAccountPictureFromStreamAsync = js.Any.fromFunction1(setAccountPictureFromStreamAsync), setAccountPicturesAsync = js.Any.fromFunction3(setAccountPicturesAsync), setAccountPicturesFromStreamsAsync = js.Any.fromFunction3(setAccountPicturesFromStreamsAsync))
  
    __obj.asInstanceOf[IUserInformationStatics]
  }
}

