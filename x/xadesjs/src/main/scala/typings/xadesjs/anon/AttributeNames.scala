package typings.xadesjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeNames extends js.Object {
  var AttributeNames: Encoding
  var DefaultPrefix: String
  var ElementNames: AllDataObjectsTimeStamp
  /**
    * The XAdES XML namespace URI
    */
  var NamespaceURI: String
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  var SignedPropertiesType: String
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
}

