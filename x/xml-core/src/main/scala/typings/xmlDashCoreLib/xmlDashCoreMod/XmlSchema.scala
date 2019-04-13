package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlSchema extends js.Object {
  var items: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with xmlDashCoreLib.Anon_Type]
  ] = js.undefined
  var localName: js.UndefOr[java.lang.String] = js.undefined
  var namespaceURI: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.undefined
  var prefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object XmlSchema {
  @scala.inline
  def apply(
    items: org.scalablytyped.runtime.StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with xmlDashCoreLib.Anon_Type] = null,
    localName: java.lang.String = null,
    namespaceURI: java.lang.String = null,
    parser: IXmlSerializableConstructor = null,
    prefix: java.lang.String = null,
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

