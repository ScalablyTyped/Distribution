package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlElementType
  extends XmlSchemaItemBase
     with XmlSchemaItemParser {
  /**
    * Local name for Xml element
    *
    * @type {string}
    * @memberOf XmlElementType
    */
  @JSName("localName")
  var localName_XmlElementType: String
}

object XmlElementType {
  @scala.inline
  def apply(
    localName: String,
    namespaceURI: String = null,
    parser: IXmlSerializableConstructor = null,
    prefix: String = null
  ): XmlElementType = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlElementType]
  }
}

