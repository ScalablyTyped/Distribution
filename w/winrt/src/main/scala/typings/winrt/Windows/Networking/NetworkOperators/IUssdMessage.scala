package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUssdMessage extends js.Object {
  
  var dataCodingScheme: Double = js.native
  
  def getPayload(): Uint8Array = js.native
  
  var payloadAsText: String = js.native
  
  def setPayload(value: Uint8Array): Unit = js.native
}
object IUssdMessage {
  
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => Uint8Array,
    payloadAsText: String,
    setPayload: Uint8Array => Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[IUssdMessage]
  }
  
  @scala.inline
  implicit class IUssdMessageOps[Self <: IUssdMessage] (val x: Self) extends AnyVal {
    
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
    def setDataCodingScheme(value: Double): Self = this.set("dataCodingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPayload(value: () => Uint8Array): Self = this.set("getPayload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPayloadAsText(value: String): Self = this.set("payloadAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPayload(value: Uint8Array => Unit): Self = this.set("setPayload", js.Any.fromFunction1(value))
  }
}
