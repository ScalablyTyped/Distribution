package typings.winrtDashUwp.WindowsNs.SystemNs.UserProfileNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to manage the full-screen image used as the lock screen background. */
@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
abstract class LockScreen () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
object LockScreen extends js.Object {
  /** Gets the current lock screen image. */
  var originalImageFile: Uri = js.native
  /**
    * Gets the current lock screen image as a data stream.
    * @return The stream that contains the lock screen image data.
    */
  def getImageStream(): IRandomAccessStream = js.native
  /**
    * Registers an RSS image feed to be used as a lock screen slideshow. (Windows 8.1 only)
    * @param syndicationFeedUri The URI of the RSS image feed.
    * @return One of the SetImageFeedResult values.
    */
  def requestSetImageFeedAsync(syndicationFeedUri: Uri): IPromiseWithIAsyncOperation[SetImageFeedResult] = js.native
  /**
    * Sets the lock screen image from a StorageFile object.
    * @param value The StorageFile object that contains the new image for the lock screen.
    * @return The object used to set the image for the lock screen.
    */
  def setImageFileAsync(value: IStorageFile): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the lock screen image from a data stream.
    * @param value The stream that contains the image data.
    * @return The object used to set the lock screen image.
    */
  def setImageStreamAsync(value: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
  /**
    * Unregisters the image feed being used in the lock screen slideshow, stopping the slideshow. (Windows 8.1 only)
    * @return true if the image feed was disabled; otherwise, false.
    */
  def tryRemoveImageFeed(): Boolean = js.native
}

