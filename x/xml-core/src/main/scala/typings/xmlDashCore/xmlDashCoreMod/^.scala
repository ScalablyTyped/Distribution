package typings.xmlDashCore.xmlDashCoreMod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Uint8Array
import typings.xmlDashCore.xmlDashCoreStrings.Empty
import typings.xmlDashCore.xmlDashCoreStrings.`application/xml`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val APPLICATION_XML: `application/xml` = js.native
  val DEFAULT_NAMESPACE_URI: Empty = js.native
  val DEFAULT_PREFIX: Empty = js.native
  val Select: SelectNodes = js.native
  val XmlBase64Converter: IConverter[Uint8Array] = js.native
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  val XmlNumberConverter: IConverter[Double] = js.native
  def Parse(xmlString: String): Document = js.native
  def SelectNamespaces(node: Element): AssocArray[String] = js.native
  def SelectSingleNode(node: Node, path: String): Node | Null = js.native
  def Stringify(target: Node): String = js.native
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
}

