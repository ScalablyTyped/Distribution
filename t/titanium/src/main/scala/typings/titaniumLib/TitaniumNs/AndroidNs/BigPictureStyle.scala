package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Helper object for generating large-format notifications that include a large image attachment.
		 */
@js.native
trait BigPictureStyle
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
  			 */
  var bigContentTitle: java.lang.String = js.native
  /**
  			 * Override the <Titanium.Android.Notification.largeIcon> when the big notification is shown.
  			 */
  var bigLargeIcon: scala.Double | java.lang.String = js.native
  /**
  			 * Provide the bitmap to be used as the payload for the BigPicture notification.
  			 */
  var bigPicture: scala.Double | java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Number of times to retry decoding the bitmap at bigPicture URL.
  			 */
  var decodeRetries: scala.Double = js.native
  /**
  			 * Set the first line of text after the detail section in the big form of the notification.
  			 */
  var summaryText: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.bigContentTitle> property.
  			 */
  def getBigContentTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
  			 */
  def getBigLargeIcon(): scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def getBigPicture(): scala.Double | java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.decodeRetries> property.
  			 */
  def getDecodeRetries(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.BigPictureStyle.summaryText> property.
  			 */
  def getSummaryText(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigContentTitle> property.
  			 */
  def setBigContentTitle(bigContentTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
  			 */
  def setBigLargeIcon(bigLargeIcon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
  			 */
  def setBigLargeIcon(bigLargeIcon: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
  			 */
  def setBigPicture(bigPicture: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.decodeRetries> property.
  			 */
  def setDecodeRetries(decodeRetries: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.BigPictureStyle.summaryText> property.
  			 */
  def setSummaryText(summaryText: java.lang.String): scala.Unit = js.native
}

