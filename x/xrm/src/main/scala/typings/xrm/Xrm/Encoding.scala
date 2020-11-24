package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Xrm.Encoding API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
  */
@js.native
trait Encoding extends js.Object {
  
  /**
    * Applies attribute encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlAttributeEncode(arg: String): String = js.native
  
  /**
    * Applies XML encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlEncode(arg: String): String = js.native
}
object Encoding {
  
  @scala.inline
  def apply(xmlAttributeEncode: String => String, xmlEncode: String => String): Encoding = {
    val __obj = js.Dynamic.literal(xmlAttributeEncode = js.Any.fromFunction1(xmlAttributeEncode), xmlEncode = js.Any.fromFunction1(xmlEncode))
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    
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
    def setXmlAttributeEncode(value: String => String): Self = this.set("xmlAttributeEncode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXmlEncode(value: String => String): Self = this.set("xmlEncode", js.Any.fromFunction1(value))
  }
}
