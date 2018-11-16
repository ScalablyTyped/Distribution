package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
class UserInformation () extends js.Object

@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
object UserInformation extends js.Object {
  var accountPictureChangeEnabled: scala.Boolean = js.native
  var nameAccessAllowed: scala.Boolean = js.native
  var onaccountpicturechanged: js.Any = js.native
  def getAccountPicture(kind: winrtLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind): winrtLib.WindowsNs.StorageNs.IStorageFile = js.native
  def getDisplayNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getDomainNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getFirstNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getLastNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getPrincipalNameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getSessionInitiationProtocolUriAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.Uri] = js.native
  def setAccountPictureAsync(image: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
  def setAccountPictureFromStreamAsync(image: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
  def setAccountPicturesAsync(
    smallImage: winrtLib.WindowsNs.StorageNs.IStorageFile,
    largeImage: winrtLib.WindowsNs.StorageNs.IStorageFile,
    video: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
  def setAccountPicturesFromStreamsAsync(
    smallImage: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    largeImage: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    video: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
}

