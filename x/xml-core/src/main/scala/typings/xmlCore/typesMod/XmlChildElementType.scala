package typings.xmlCore.typesMod

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
    defaultValue: js.UndefOr[Null | T] = js.undefined,
    localName: String = null,
    maxOccurs: js.UndefOr[Double] = js.undefined,
    minOccurs: js.UndefOr[Double] = js.undefined,
    namespaceURI: js.UndefOr[Null | String] = js.undefined,
    noRoot: js.UndefOr[Boolean] = js.undefined,
    parser: IXmlSerializableConstructor = null,
    prefix: js.UndefOr[Null | String] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  ): XmlChildElementType[T] = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOccurs)) __obj.updateDynamic("maxOccurs")(maxOccurs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOccurs)) __obj.updateDynamic("minOccurs")(minOccurs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceURI)) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (!js.isUndefined(noRoot)) __obj.updateDynamic("noRoot")(noRoot.get.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlChildElementType[T]]
  }
}

