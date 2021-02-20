package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
@js.native
trait UssdMessage extends StObject {
  
  /** Gets or sets the encoding scheme of the payload of this UssdMessage . */
  var dataCodingScheme: Double = js.native
  
  /**
    * Gets the raw payload of this UssdMessage .
    * @return The raw payload of this UssdMessage .
    */
  def getPayload(): js.Array[Double] = js.native
  
  /** Gets or sets the payload of this UssdMessage as text. */
  var payloadAsText: String = js.native
  
  /**
    * Sets the raw payload of this UssdMessage .
    * @param value The raw payload of this UssdMessage .
    */
  def setPayload(value: js.Array[Double]): Unit = js.native
}
object UssdMessage {
  
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => js.Array[Double],
    payloadAsText: String,
    setPayload: js.Array[Double] => Unit
  ): UssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[UssdMessage]
  }
  
  @scala.inline
  implicit class UssdMessageMutableBuilder[Self <: UssdMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCodingScheme(value: Double): Self = StObject.set(x, "dataCodingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPayload(value: () => js.Array[Double]): Self = StObject.set(x, "getPayload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPayloadAsText(value: String): Self = StObject.set(x, "payloadAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPayload(value: js.Array[Double] => Unit): Self = StObject.set(x, "setPayload", js.Any.fromFunction1(value))
  }
}
