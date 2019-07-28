package typings.xmlDashCore.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlChildElementType[T]
  extends XmlSchemaItem[T]
     with XmlSchemaItemParser {
  /**
    * max occurs of items in collection
    * 
    * @type {number}
    * @memberOf XmlChildElementType
    */
  var maxOccurs: js.UndefOr[Double] = js.undefined
  /**
    * min occurs of items in collection
    * 
    * @type {number}
    * @memberOf XmlChildElementType
    */
  var minOccurs: js.UndefOr[Double] = js.undefined
  /**
    * Don't add root element of XmlCollection to compiled element
    * 
    * @type {boolean}
    * @memberOf XmlChildElementType
    */
  var noRoot: js.UndefOr[Boolean] = js.undefined
}

object XmlChildElementType {
  @scala.inline
  def apply[T](
    converter: IConverter[T] = null,
    defaultValue: T = null,
    localName: String = null,
    maxOccurs: Int | Double = null,
    minOccurs: Int | Double = null,
    namespaceURI: String = null,
    noRoot: js.UndefOr[Boolean] = js.undefined,
    parser: IXmlSerializableConstructor = null,
    prefix: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): XmlChildElementType[T] = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName)
    if (maxOccurs != null) __obj.updateDynamic("maxOccurs")(maxOccurs.asInstanceOf[js.Any])
    if (minOccurs != null) __obj.updateDynamic("minOccurs")(minOccurs.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI)
    if (!js.isUndefined(noRoot)) __obj.updateDynamic("noRoot")(noRoot)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[XmlChildElementType[T]]
  }
}

