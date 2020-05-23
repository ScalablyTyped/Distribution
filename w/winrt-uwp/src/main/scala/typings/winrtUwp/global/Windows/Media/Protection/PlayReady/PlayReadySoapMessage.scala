package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a SOAP message used in manual challenge requests. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySoapMessage")
@js.native
abstract class PlayReadySoapMessage ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySoapMessage {
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  /* CompleteClass */
  override var messageHeaders: IPropertySet = js.native
  /** Gets the base URL of the XML Web service. */
  /* CompleteClass */
  override var uri: Uri = js.native
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  /* CompleteClass */
  override def getMessageBody(): js.Array[Double] = js.native
}

