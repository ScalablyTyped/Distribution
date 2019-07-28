package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a SOAP message used in manual challenge requests. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySoapMessage")
@js.native
abstract class PlayReadySoapMessage () extends js.Object {
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

