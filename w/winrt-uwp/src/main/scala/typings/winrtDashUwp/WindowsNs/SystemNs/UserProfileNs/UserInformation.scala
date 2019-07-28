package typings.winrtDashUwp.WindowsNs.SystemNs.UserProfileNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.accountpicturechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about the user, such as name and account picture. */
@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
abstract class UserInformation () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.UserInformation")
@js.native
object UserInformation extends js.Object {
  /** Determines if the user's account picture can be changed. */
  var accountPictureChangeEnabled: Boolean = js.native
  /** Allows you to see if your app is allowed to access the user's information. */
  var nameAccessAllowed: Boolean = js.native
  /** Occurs when the user's image or name changes. */
  @JSName("onaccountpicturechanged")
  var onaccountpicturechanged_Original: EventHandler[_] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[_]): Unit = js.native
  /**
    * Gets the account picture for the user.
    * @param kind An enumeration that you can use to determine what type of image you want (small, large, and so on).
    * @return An object that contains the image.
    */
  def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
  /**
    * Gets the display name for the user account.
    * @return The display name for the user account.
    */
  def getDisplayNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the domain name for the user.
    * @return A string that represents the domain name for the user.
    */
  def getDomainNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the user's first name.
    * @return The user's first name.
    */
  def getFirstNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the user's last name.
    * @return The user's last name.
    */
  def getLastNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the principal name for the user. This name is the User Principal Name (typically the user's address, although this is not always true.)
    * @return The user's principal name.
    */
  def getPrincipalNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the Uniform Resource Identifier (URI) of the session initiation protocol for the user.
    * @return The URI of the session initiation protocol.
    */
  def getSessionInitiationProtocolUriAsync(): IPromiseWithIAsyncOperation[Uri] = js.native
  /** Occurs when the user's image or name changes. */
  def onaccountpicturechanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountpicturechanged(`type`: accountpicturechanged, listener: EventHandler[_]): Unit = js.native
  /**
    * Sets the picture for the user's account using an IStorageFile object.
    * @param image A file that contains the image.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPictureAsync(image: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
  /**
    * Sets the picture for the user's account using an IRandomAccessStream object.
    * @param image The image.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
  /**
    * Sets the pictures for the user's account using an IStorageFile object. Supports adding a small image, large image, and video.
    * @param smallImage A small version of the image.
    * @param largeImage A large version of the image.
    * @param video A video.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
  /**
    * Sets the pictures for the user's account using an IRandomAccessStream object. Supports adding a small image, large image, and video.
    * @param smallImage A small version of the image.
    * @param largeImage A large version of the image.
    * @param video A video.
    * @return A value that indicates the success or failure of the operation.
    */
  def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IPromiseWithIAsyncOperation[SetAccountPictureResult] = js.native
}

