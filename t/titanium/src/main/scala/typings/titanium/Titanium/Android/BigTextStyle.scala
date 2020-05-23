package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper object for generating large-format notifications that include a lot of text.
  */
@js.native
trait BigTextStyle extends Proxy {
  /**
    * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
    */
  var bigContentTitle: String = js.native
  /**
    * Sets the longer text to be displayed in the big form of the notification in place of the content text.
    */
  var bigText: String = js.native
  /**
    * Set the first line of text after the detail section in the big form of the notification.
    */
  var summaryText: String = js.native
  /**
    * Gets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
    * @deprecated Access <Titanium.Android.BigTextStyle.bigContentTitle> instead.
    */
  def getBigContentTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.Android.BigTextStyle.bigText> property.
    * @deprecated Access <Titanium.Android.BigTextStyle.bigText> instead.
    */
  def getBigText(): String = js.native
  /**
    * Gets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
    * @deprecated Access <Titanium.Android.BigTextStyle.summaryText> instead.
    */
  def getSummaryText(): String = js.native
  /**
    * Sets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
    * @deprecated Set the value using <Titanium.Android.BigTextStyle.bigContentTitle> instead.
    */
  def setBigContentTitle(bigContentTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.BigTextStyle.bigText> property.
    * @deprecated Set the value using <Titanium.Android.BigTextStyle.bigText> instead.
    */
  def setBigText(bigText: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
    * @deprecated Set the value using <Titanium.Android.BigTextStyle.summaryText> instead.
    */
  def setSummaryText(summaryText: String): Unit = js.native
}

