package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a SOAP message used in manual challenge requests. */
@js.native
trait PlayReadySoapMessage extends js.Object {
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  var messageHeaders: IPropertySet = js.native
  /** Gets the base URL of the XML Web service. */
  var uri: Uri = js.native
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  def getMessageBody(): js.Array[Double] = js.native
}

object PlayReadySoapMessage {
  @scala.inline
  def apply(getMessageBody: () => js.Array[Double], messageHeaders: IPropertySet, uri: Uri): PlayReadySoapMessage = {
    val __obj = js.Dynamic.literal(getMessageBody = js.Any.fromFunction0(getMessageBody), messageHeaders = messageHeaders.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySoapMessage]
  }
  @scala.inline
  implicit class PlayReadySoapMessageOps[Self <: PlayReadySoapMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetMessageBody(value: () => js.Array[Double]): Self = this.set("getMessageBody", js.Any.fromFunction0(value))
    @scala.inline
    def setMessageHeaders(value: IPropertySet): Self = this.set("messageHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

