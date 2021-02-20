package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Gets the value of the <Titanium.Android.BigPictureStyle.bigContentTitle> property.
    * @deprecated Access <Titanium.Android.BigPictureStyle.bigContentTitle> instead.
    */
  def getBigContentTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
    * @deprecated Access <Titanium.Android.BigPictureStyle.bigLargeIcon> instead.
    */
  def getBigLargeIcon(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
    * @deprecated Access <Titanium.Android.BigPictureStyle.bigPicture> instead.
    */
  def getBigPicture(): Double | String | Blob | File = js.native
  
  /**
    * Gets the value of the <Titanium.Android.BigPictureStyle.decodeRetries> property.
    * @deprecated Access <Titanium.Android.BigPictureStyle.decodeRetries> instead.
    */
  def getDecodeRetries(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.BigPictureStyle.summaryText> property.
    * @deprecated Access <Titanium.Android.BigPictureStyle.summaryText> instead.
    */
  def getSummaryText(): String = js.native
  
  /**
    * Sets the value of the <Titanium.Android.BigPictureStyle.bigContentTitle> property.
    * @deprecated Set the value using <Titanium.Android.BigPictureStyle.bigContentTitle> instead.
    */
  def setBigContentTitle(bigContentTitle: String): Unit = js.native
  
  def setBigLargeIcon(bigLargeIcon: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.BigPictureStyle.bigLargeIcon> property.
    * @deprecated Set the value using <Titanium.Android.BigPictureStyle.bigLargeIcon> instead.
    */
  def setBigLargeIcon(bigLargeIcon: Double): Unit = js.native
  
  def setBigPicture(bigPicture: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.BigPictureStyle.bigPicture> property.
    * @deprecated Set the value using <Titanium.Android.BigPictureStyle.bigPicture> instead.
    */
  def setBigPicture(bigPicture: Double): Unit = js.native
  def setBigPicture(bigPicture: Blob): Unit = js.native
  def setBigPicture(bigPicture: File): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.BigPictureStyle.decodeRetries> property.
    * @deprecated Set the value using <Titanium.Android.BigPictureStyle.decodeRetries> instead.
    */
  def setDecodeRetries(decodeRetries: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.BigPictureStyle.summaryText> property.
    * @deprecated Set the value using <Titanium.Android.BigPictureStyle.summaryText> instead.
    */
  def setSummaryText(summaryText: String): Unit = js.native
  
  /**
    * Set the first line of text after the detail section in the big form of the notification.
    */
  var summaryText: String = js.native
}
