package typings
package winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about the user, such as name and account picture. */
@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
abstract class UserInformation () extends js.Object

/** Represents information about the user, such as name and account picture. */
@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
object UserInformation extends js.Object {
  /** Determines if the user's account picture can be changed. */
  var accountPictureChangeEnabled: scala.Boolean = js.native
  /** Allows you to see if your app is allowed to access the user's information. */
  var nameAccessAllowed: scala.Boolean = js.native
  /** Occurs when the user's image or name changes. */
  @JSName("onaccountpicturechanged")
  var onaccountpicturechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountpicturechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountpicturechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Gets the account picture for the user.
    * @param kind An enumeration that you can use to determine what type of image you want (small, large, and so on).
    * @return An object that contains the image.
    */
  def getAccountPicture(kind: winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind): winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile = js.native
  /**
    * Gets the display name for the user account.
    * @return The display name for the user account.
    */
  def getDisplayNameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Gets the domain name for the user.
    * @return A string that represents the domain name for the user.
    */
  def getDomainNameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Gets the user's first name.
    * @return The user's first name.
    */
  def getFirstNameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Gets the user's last name.
    * @return The user's last name.
    */
  def getLastNameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Gets the principal name for the user. This name is the User Principal Name (typically the user's address, although this is not always true.)
    * @return The user's principal name.
    */
  def getPrincipalNameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Gets the Uniform Resource Identifier (URI) of the session initiation protocol for the user.
    * @return The URI of the session initiation protocol.
    */
  def getSessionInitiationProtocolUriAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.Uri] = js.native
  /** Occurs when the user's image or name changes. */
  def onaccountpicturechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountpicturechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountpicturechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Sets the picture for the user's account using an IStorageFile object.
    * @param image A file that contains the image.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPictureAsync(image: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
  /**
    * Sets the picture for the user's account using an IRandomAccessStream object.
    * @param image The image.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPictureFromStreamAsync(image: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
  /**
    * Sets the pictures for the user's account using an IStorageFile object. Supports adding a small image, large image, and video.
    * @param smallImage A small version of the image.
    * @param largeImage A large version of the image.
    * @param video A video.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPicturesAsync(
    smallImage: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    largeImage: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    video: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
  /**
    * Sets the pictures for the user's account using an IRandomAccessStream object. Supports adding a small image, large image, and video.
    * @param smallImage A small version of the image.
    * @param largeImage A large version of the image.
    * @param video A video.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPicturesFromStreamsAsync(
    smallImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    largeImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    video: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult] = js.native
}

