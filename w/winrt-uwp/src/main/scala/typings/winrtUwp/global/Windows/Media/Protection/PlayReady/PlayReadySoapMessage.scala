package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a SOAP message used in manual challenge requests. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySoapMessage")
@js.native
open class PlayReadySoapMessage ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySoapMessage {
  
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  /* CompleteClass */
  override def getMessageBody(): js.Array[Double] = js.native
  
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  /* CompleteClass */
  var messageHeaders: IPropertySet = js.native
  
  /** Gets the base URL of the XML Web service. */
  /* CompleteClass */
  var uri: Uri = js.native
}
