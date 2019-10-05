package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Helper object for generating large-format notifications that include a large image attachment.
		 */
@js.native
trait BigPictureStyle extends Proxy {
  /**
  			 * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
  			 */
  var bigContentTitle: String = js.native
  /**
  			 * Override the <Titanium.Android.Notification.largeIcon> when the big notification is shown.
  			 */
  var bigLargeIcon: Double | String = js.native
  /**
  			 * Provide the bitmap to be used as the payload for the BigPicture notification.
  			 */
  var bigPicture: Double | String | Blob | File = js.native
  /**
  			 * Number of times to retry decoding the bitmap at bigPicture URL.
  			 */
  var decodeRetries: Double = js.native
  /**
  			 * Set the first line of text after the detail section in the big form of the notification.
  			 */
  var summaryText: String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.bigContentTitle> property.
  			 */
  def getBigContentTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
  			 */
  def getBigLargeIcon(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def getBigPicture(): Double | String | Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.decodeRetries> property.
  			 */
  def getDecodeRetries(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.summaryText> property.
  			 */
  def getSummaryText(): String = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigContentTitle> property.
  			 */
  def setBigContentTitle(bigContentTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
  			 */
  def setBigLargeIcon(bigLargeIcon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
  			 */
  def setBigLargeIcon(bigLargeIcon: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.decodeRetries> property.
  			 */
  def setDecodeRetries(decodeRetries: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.summaryText> property.
  			 */
  def setSummaryText(summaryText: String): Unit = js.native
}

