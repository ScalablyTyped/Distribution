package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An email dialog is a modal window that allows users to compose and send an email.
		 */
@js.native
trait EmailDialog extends View {
  /**
  			 * Constant for the `CANCELLED` status result. On Android, this property exists but is not used.
  			 */
  val CANCELLED: scala.Double = js.native
  /**
  			 * Constant for the `FAILED` status result.
  			 */
  val FAILED: scala.Double = js.native
  /**
  			 * Constant for the `SAVED` status result. On Android, this property exists but is not used.
  			 */
  val SAVED: scala.Double = js.native
  /**
  			 * Constant for the `SENT` status result.
  			 */
  val SENT: scala.Double = js.native
  /**
  			 * Bar color of the email dialog window, as a color name or hex triplet.
  			 */
  var barColor: java.lang.String = js.native
  /**
  			 * Recipients of the email included via the `BCC` (Blind Carbon Copy) field.
  			 */
  var bccRecipients: js.Array[java.lang.String] = js.native
  /**
  			 * Recipients of the email included via the `CC` (Carbon Copy) field.
  			 */
  var ccRecipients: js.Array[java.lang.String] = js.native
  /**
  			 * Determines whether the email message, specifically the contents of
  			 * [messageBody](Titanium.UI.EmailDialog.messageBody), should be sent as HTML content type
  			 * rather than plain text.
  			 */
  var html: scala.Boolean = js.native
  /**
  			 * Email message body.
  			 */
  var messageBody: java.lang.String = js.native
  /**
  			 * Subject line for the email.
  			 */
  var subject: java.lang.String = js.native
  /**
  			 * Recipients of the email included via the main `TO` field.
  			 */
  var toRecipients: js.Array[java.lang.String] = js.native
  /**
  			 * Adds an attachment.
  			 */
  def addAttachment(attachment: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Adds an attachment.
  			 */
  def addAttachment(attachment: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.barColor> property.
  			 */
  def getBarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.bccRecipients> property.
  			 */
  def getBccRecipients(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.ccRecipients> property.
  			 */
  def getCcRecipients(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.html> property.
  			 */
  def getHtml(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.messageBody> property.
  			 */
  def getMessageBody(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.subject> property.
  			 */
  def getSubject(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.toRecipients> property.
  			 */
  def getToRecipients(): js.Array[java.lang.String] = js.native
  /**
  			 * Indicates whether sending email is supported by the system.
  			 */
  def isSupported(): scala.Boolean = js.native
  /**
  			 * Opens this email dialog.
  			 */
  def open(properties: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.barColor> property.
  			 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.bccRecipients> property.
  			 */
  def setBccRecipients(bccRecipients: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.ccRecipients> property.
  			 */
  def setCcRecipients(ccRecipients: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.html> property.
  			 */
  def setHtml(html: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.messageBody> property.
  			 */
  def setMessageBody(messageBody: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.subject> property.
  			 */
  def setSubject(subject: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.toRecipients> property.
  			 */
  def setToRecipients(toRecipients: js.Array[java.lang.String]): scala.Unit = js.native
}

