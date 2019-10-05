package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Media.saveToPhotoGallery")
@js.native
object saveToPhotoGallery extends js.Object {
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def apply(media: Blob, callbacks: js.Any): Unit = js.native
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def apply(media: File, callbacks: js.Any): Unit = js.native
}

