package typings
package winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs

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
  var originalImageFile: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Gets the current lock screen image as a data stream.
    * @return The stream that contains the lock screen image data.
    */
  def getImageStream(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /**
    * Registers an RSS image feed to be used as a lock screen slideshow. (Windows 8.1 only)
    * @param syndicationFeedUri The URI of the RSS image feed.
    * @return One of the SetImageFeedResult values.
    */
  def requestSetImageFeedAsync(syndicationFeedUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetImageFeedResult] = js.native
  /**
    * Sets the lock screen image from a StorageFile object.
    * @param value The StorageFile object that contains the new image for the lock screen.
    * @return The object used to set the image for the lock screen.
    */
  def setImageFileAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Sets the lock screen image from a data stream.
    * @param value The stream that contains the image data.
    * @return The object used to set the lock screen image.
    */
  def setImageStreamAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Unregisters the image feed being used in the lock screen slideshow, stopping the slideshow. (Windows 8.1 only)
    * @return true if the image feed was disabled; otherwise, false.
    */
  def tryRemoveImageFeed(): scala.Boolean = js.native
}

