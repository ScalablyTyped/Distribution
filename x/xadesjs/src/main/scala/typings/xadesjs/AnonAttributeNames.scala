package typings.xadesjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributeNames extends js.Object {
  var AttributeNames: AnonEncoding
  var DefaultPrefix: String
  var ElementNames: AnonAllDataObjectsTimeStamp
  /**
    * The XAdES XML namespace URI
    */
  var NamespaceURI: String
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  var SignedPropertiesType: String
}

object AnonAttributeNames {
  @scala.inline
  def apply(
    AttributeNames: AnonEncoding,
    DefaultPrefix: String,
    ElementNames: AnonAllDataObjectsTimeStamp,
    NamespaceURI: String,
    SignedPropertiesType: String
  ): AnonAttributeNames = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DefaultPrefix = DefaultPrefix.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], SignedPropertiesType = SignedPropertiesType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttributeNames]
  }
}

