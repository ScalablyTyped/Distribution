package typings.winrtUwp.global.Windows.UI.Notifications

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the content, associated metadata and events, and expiration time of a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastNotification")
@js.native
class ToastNotification protected ()
  extends typings.winrtUwp.Windows.UI.Notifications.ToastNotification {
  /**
    * Creates and initializes a new instance of the ToastNotification .
    * @param content The XML content that defines the toast notification.
    */
  def this(content: XmlDocument) = this()
}
