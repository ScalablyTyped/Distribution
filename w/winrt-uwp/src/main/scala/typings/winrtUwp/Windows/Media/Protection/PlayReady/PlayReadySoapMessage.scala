package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a SOAP message used in manual challenge requests. */
trait PlayReadySoapMessage extends StObject {
  
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  def getMessageBody(): js.Array[Double]
  
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  var messageHeaders: IPropertySet
  
  /** Gets the base URL of the XML Web service. */
  var uri: Uri
}
object PlayReadySoapMessage {
  
  inline def apply(getMessageBody: () => js.Array[Double], messageHeaders: IPropertySet, uri: Uri): PlayReadySoapMessage = {
    val __obj = js.Dynamic.literal(getMessageBody = js.Any.fromFunction0(getMessageBody), messageHeaders = messageHeaders.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySoapMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayReadySoapMessage] (val x: Self) extends AnyVal {
    
    inline def setGetMessageBody(value: () => js.Array[Double]): Self = StObject.set(x, "getMessageBody", js.Any.fromFunction0(value))
    
    inline def setMessageHeaders(value: IPropertySet): Self = StObject.set(x, "messageHeaders", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
