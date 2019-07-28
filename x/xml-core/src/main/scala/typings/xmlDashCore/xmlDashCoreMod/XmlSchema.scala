package typings.xmlDashCore.xmlDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.xmlDashCore.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlSchema extends js.Object {
  var items: js.UndefOr[StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Anon_Type]] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var namespaceURI: js.UndefOr[String | Null] = js.undefined
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.undefined
  var prefix: js.UndefOr[String | Null] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object XmlSchema {
  @scala.inline
  def apply(
    items: StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Anon_Type] = null,
    localName: String = null,
    namespaceURI: String = null,
    parser: IXmlSerializableConstructor = null,
    prefix: String = null,
    target: js.Any = null
  ): XmlSchema = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (localName != null) __obj.updateDynamic("localName")(localName)
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[XmlSchema]
  }
}

