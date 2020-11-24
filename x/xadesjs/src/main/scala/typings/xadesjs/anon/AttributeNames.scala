package typings.xadesjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeNames extends js.Object {
  
  var AttributeNames: Encoding = js.native
  
  var DefaultPrefix: String = js.native
  
  var ElementNames: AllDataObjectsTimeStamp = js.native
  
  /**
    * The XAdES XML namespace URI
    */
  var NamespaceURI: String = js.native
  
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  var SignedPropertiesType: String = js.native
}
object AttributeNames {
  
  @scala.inline
  def apply(
    AttributeNames: Encoding,
    DefaultPrefix: String,
    ElementNames: AllDataObjectsTimeStamp,
    NamespaceURI: String,
    SignedPropertiesType: String
  ): AttributeNames = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DefaultPrefix = DefaultPrefix.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], SignedPropertiesType = SignedPropertiesType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNames]
  }
  
  @scala.inline
  implicit class AttributeNamesOps[Self <: AttributeNames] (val x: Self) extends AnyVal {
    
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
    def setAttributeNames(value: Encoding): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrefix(value: String): Self = this.set("DefaultPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNames(value: AllDataObjectsTimeStamp): Self = this.set("ElementNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("NamespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedPropertiesType(value: String): Self = this.set("SignedPropertiesType", value.asInstanceOf[js.Any])
  }
}
