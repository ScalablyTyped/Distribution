package typings.xadesjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeNames extends js.Object {
  var AttributeNames: Anon_Encoding
  var DefaultPrefix: String
  var ElementNames: Anon_AllDataObjectsTimeStamp
  /**
    * The XAdES XML namespace URI
    */
  var NamespaceURI: String
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  var SignedPropertiesType: String
}

object Anon_AttributeNames {
  @scala.inline
  def apply(
    AttributeNames: Anon_Encoding,
    DefaultPrefix: String,
    ElementNames: Anon_AllDataObjectsTimeStamp,
    NamespaceURI: String,
    SignedPropertiesType: String
  ): Anon_AttributeNames = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DefaultPrefix = DefaultPrefix.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], SignedPropertiesType = SignedPropertiesType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AttributeNames]
  }
}

