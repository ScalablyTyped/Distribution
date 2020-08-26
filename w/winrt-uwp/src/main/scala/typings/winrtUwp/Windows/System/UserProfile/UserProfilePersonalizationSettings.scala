package typings.winrtUwp.Windows.System.UserProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
@js.native
trait UserProfilePersonalizationSettings extends js.Object {
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

object UserProfilePersonalizationSettings {
  @scala.inline
  def apply(
    trySetLockScreenImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean],
    trySetWallpaperImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean]
  ): UserProfilePersonalizationSettings = {
    val __obj = js.Dynamic.literal(trySetLockScreenImageAsync = js.Any.fromFunction1(trySetLockScreenImageAsync), trySetWallpaperImageAsync = js.Any.fromFunction1(trySetWallpaperImageAsync))
    __obj.asInstanceOf[UserProfilePersonalizationSettings]
  }
  @scala.inline
  implicit class UserProfilePersonalizationSettingsOps[Self <: UserProfilePersonalizationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrySetLockScreenImageAsync(value: StorageFile => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("trySetLockScreenImageAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setTrySetWallpaperImageAsync(value: StorageFile => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("trySetWallpaperImageAsync", js.Any.fromFunction1(value))
  }
  
}

