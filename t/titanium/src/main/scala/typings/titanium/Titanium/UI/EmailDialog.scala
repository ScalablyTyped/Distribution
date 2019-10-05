package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
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
  val CANCELLED: Double = js.native
  /**
  			 * Constant for the `FAILED` status result.
  			 */
  val FAILED: Double = js.native
  /**
  			 * Constant for the `SAVED` status result. On Android, this property exists but is not used.
  			 */
  val SAVED: Double = js.native
  /**
  			 * Constant for the `SENT` status result.
  			 */
  val SENT: Double = js.native
  /**
  			 * Bar color of the email dialog window, as a color name or hex triplet.
  			 */
  var barColor: String = js.native
  /**
  			 * Recipients of the email included via the `BCC` (Blind Carbon Copy) field.
  			 */
  var bccRecipients: js.Array[String] = js.native
  /**
  			 * Recipients of the email included via the `CC` (Carbon Copy) field.
  			 */
  var ccRecipients: js.Array[String] = js.native
  /**
  			 * Determines whether the email message, specifically the contents of
  			 * [messageBody](Titanium.UI.EmailDialog.messageBody), should be sent as HTML content type
  			 * rather than plain text.
  			 */
  var html: Boolean = js.native
  /**
  			 * Email message body.
  			 */
  var messageBody: String = js.native
  /**
  			 * Subject line for the email.
  			 */
  var subject: String = js.native
  /**
  			 * Recipients of the email included via the main `TO` field.
  			 */
  var toRecipients: js.Array[String] = js.native
  /**
  			 * Adds an attachment.
  			 */
  def addAttachment(attachment: Blob): Unit = js.native
  /**
  			 * Adds an attachment.
  			 */
  def addAttachment(attachment: File): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.barColor> property.
  			 */
  def getBarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.bccRecipients> property.
  			 */
  def getBccRecipients(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.ccRecipients> property.
  			 */
  def getCcRecipients(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.html> property.
  			 */
  def getHtml(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.messageBody> property.
  			 */
  def getMessageBody(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.subject> property.
  			 */
  def getSubject(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.EmailDialog.toRecipients> property.
  			 */
  def getToRecipients(): js.Array[String] = js.native
  /**
  			 * Indicates whether sending email is supported by the system.
  			 */
  def isSupported(): Boolean = js.native
  /**
  			 * Opens this email dialog.
  			 */
  def open(properties: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.barColor> property.
  			 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.bccRecipients> property.
  			 */
  def setBccRecipients(bccRecipients: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.ccRecipients> property.
  			 */
  def setCcRecipients(ccRecipients: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.html> property.
  			 */
  def setHtml(html: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.messageBody> property.
  			 */
  def setMessageBody(messageBody: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.subject> property.
  			 */
  def setSubject(subject: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.EmailDialog.toRecipients> property.
  			 */
  def setToRecipients(toRecipients: js.Array[String]): Unit = js.native
}

