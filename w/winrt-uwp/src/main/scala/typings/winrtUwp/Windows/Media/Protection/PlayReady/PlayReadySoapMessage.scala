package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a SOAP message used in manual challenge requests. */
trait PlayReadySoapMessage extends js.Object {
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  var messageHeaders: IPropertySet
  /** Gets the base URL of the XML Web service. */
  var uri: Uri
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  def getMessageBody(): js.Array[Double]
}

object PlayReadySoapMessage {
  @scala.inline
  def apply(getMessageBody: () => js.Array[Double], messageHeaders: IPropertySet, uri: Uri): PlayReadySoapMessage = {
    val __obj = js.Dynamic.literal(getMessageBody = js.Any.fromFunction0(getMessageBody), messageHeaders = messageHeaders.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySoapMessage]
  }
}

