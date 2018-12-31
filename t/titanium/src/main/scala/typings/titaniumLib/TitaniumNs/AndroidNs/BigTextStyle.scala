package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Helper object for generating large-format notifications that include a lot of text.
		 */
trait BigTextStyle
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
  			 */
  var bigContentTitle: java.lang.String
  /**
  			 * Sets the longer text to be displayed in the big form of the notification in place of the content text.
  			 */
  var bigText: java.lang.String
  /**
  			 * Set the first line of text after the detail section in the big form of the notification.
  			 */
  var summaryText: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def getBigContentTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def getBigText(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def getSummaryText(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def setBigContentTitle(bigContentTitle: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def setBigText(bigText: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def setSummaryText(summaryText: java.lang.String): scala.Unit
}

