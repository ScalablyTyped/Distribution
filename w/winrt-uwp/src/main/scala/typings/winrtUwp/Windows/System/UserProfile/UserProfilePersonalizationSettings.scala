package typings.winrtUwp.Windows.System.UserProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
@JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings")
@js.native
abstract class UserProfilePersonalizationSettings () extends js.Object {
  /**
    * Attempts to set the specified image file as the lock screen background image.
    * @param imageFile The image to set as the lock screen background.
    * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
    */
  def trySetLockScreenImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Attempts to set the specified image file as the desktop wallpaper image.
    * @param imageFile The image to set as the desktop background.
    * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
    */
  def trySetWallpaperImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
}

/* static members */
@JSGlobal("Windows.System.UserProfile.UserProfilePersonalizationSettings")
@js.native
object UserProfilePersonalizationSettings extends js.Object {
  /** Gets the current instance of UserProfilePersonalizationSettings . */
  var current: UserProfilePersonalizationSettings = js.native
  /**
    * Gets a value that indicates whether changing the desktop and lock screen images is supported on the current device.
    * @return true if changing the desktop and lock screen images is supported; otherwise, false.
    */
  def isSupported(): Boolean = js.native
}

