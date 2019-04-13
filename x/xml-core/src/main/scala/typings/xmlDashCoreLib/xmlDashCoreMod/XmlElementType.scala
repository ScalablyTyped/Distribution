package typings
package xmlDashCoreLib.xmlDashCoreMod

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
  var localName_XmlElementType: java.lang.String
}

object XmlElementType {
  @scala.inline
  def apply(
    localName: java.lang.String,
    namespaceURI: java.lang.String = null,
    parser: IXmlSerializableConstructor = null,
    prefix: java.lang.String = null
  ): XmlElementType = {
    val __obj = js.Dynamic.literal(localName = localName)
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[XmlElementType]
  }
}

