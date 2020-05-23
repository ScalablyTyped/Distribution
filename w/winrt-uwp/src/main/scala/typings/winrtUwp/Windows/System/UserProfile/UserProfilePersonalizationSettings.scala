package typings.winrtUwp.Windows.System.UserProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
trait UserProfilePersonalizationSettings extends js.Object {
  /**
    * Attempts to set the specified image file as the lock screen background image.
    * @param imageFile The image to set as the lock screen background.
    * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
    */
  def trySetLockScreenImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Attempts to set the specified image file as the desktop wallpaper image.
    * @param imageFile The image to set as the desktop background.
    * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
    */
  def trySetWallpaperImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean]
}

object UserProfilePersonalizationSettings {
  @scala.inline
  def apply(
    trySetLockScreenImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean],
    trySetWallpaperImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean]
  ): UserProfilePersonalizationSettings = {
    val __obj = js.Dynamic.literal(trySetLockScreenImageAsync = js.Any.fromFunction1(trySetLockScreenImageAsync), trySetWallpaperImageAsync = js.Any.fromFunction1(trySetWallpaperImageAsync))
    __obj.asInstanceOf[UserProfilePersonalizationSettings]
  }
}

