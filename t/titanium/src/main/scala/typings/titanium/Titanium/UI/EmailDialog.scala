package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.complete
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Adds an attachment.
    */
  def addAttachment(attachment: Blob): Unit = js.native
  def addAttachment(attachment: File): Unit = js.native
  
  @JSName("addEventListener")
  def addEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ EmailDialogCompleteEvent, Unit]
  ): Unit = js.native
  
  /**
    * Bar color of the email dialog window, as a color name or hex triplet.
    */
  var barColor: String | Color = js.native
  
  /**
    * Recipients of the email included via the `BCC` (Blind Carbon Copy) field.
    */
  var bccRecipients: js.Array[String] = js.native
  
  /**
    * Recipients of the email included via the `CC` (Carbon Copy) field.
    */
  var ccRecipients: js.Array[String] = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: EmailDialogClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete, event: EmailDialogCompleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: EmailDialogDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: EmailDialogDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: EmailDialogFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: EmailDialogKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: EmailDialogLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: EmailDialogLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: EmailDialogPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: EmailDialogPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: EmailDialogSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: EmailDialogSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: EmailDialogTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: EmailDialogTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: EmailDialogTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: EmailDialogTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: EmailDialogTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.barColor> property.
    * @deprecated Access <Titanium.UI.EmailDialog.barColor> instead.
    */
  def getBarColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.bccRecipients> property.
    * @deprecated Access <Titanium.UI.EmailDialog.bccRecipients> instead.
    */
  def getBccRecipients(): js.Array[String] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.ccRecipients> property.
    * @deprecated Access <Titanium.UI.EmailDialog.ccRecipients> instead.
    */
  def getCcRecipients(): js.Array[String] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.html> property.
    * @deprecated Access <Titanium.UI.EmailDialog.html> instead.
    */
  def getHtml(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.messageBody> property.
    * @deprecated Access <Titanium.UI.EmailDialog.messageBody> instead.
    */
  def getMessageBody(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.subject> property.
    * @deprecated Access <Titanium.UI.EmailDialog.subject> instead.
    */
  def getSubject(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.EmailDialog.toRecipients> property.
    * @deprecated Access <Titanium.UI.EmailDialog.toRecipients> instead.
    */
  def getToRecipients(): js.Array[String] = js.native
  
  /**
    * Determines whether the email message, specifically the contents of
    * [messageBody](Titanium.UI.EmailDialog.messageBody), should be sent as HTML content type
    * rather than plain text.
    */
  var html: Boolean = js.native
  
  /**
    * Indicates whether sending email is supported by the system.
    */
  def isSupported(): Boolean = js.native
  
  /**
    * Email message body.
    */
  var messageBody: String = js.native
  
  /**
    * Opens this email dialog.
    */
  def open(): Unit = js.native
  def open(options: AnimatedOptions): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ EmailDialogCompleteEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.barColor> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.barColor> instead.
    */
  def setBarColor(barColor: String): Unit = js.native
  def setBarColor(barColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.bccRecipients> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.bccRecipients> instead.
    */
  def setBccRecipients(bccRecipients: js.Array[String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.ccRecipients> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.ccRecipients> instead.
    */
  def setCcRecipients(ccRecipients: js.Array[String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.html> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.html> instead.
    */
  def setHtml(html: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.messageBody> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.messageBody> instead.
    */
  def setMessageBody(messageBody: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.subject> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.subject> instead.
    */
  def setSubject(subject: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.EmailDialog.toRecipients> property.
    * @deprecated Set the value using <Titanium.UI.EmailDialog.toRecipients> instead.
    */
  def setToRecipients(toRecipients: js.Array[String]): Unit = js.native
  
  /**
    * Subject line for the email.
    */
  var subject: String = js.native
  
  /**
    * Recipients of the email included via the main `TO` field.
    */
  var toRecipients: js.Array[String] = js.native
}
