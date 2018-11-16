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

