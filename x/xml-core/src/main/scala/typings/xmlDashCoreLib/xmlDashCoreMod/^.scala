package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val APPLICATION_XML: xmlDashCoreLib.xmlDashCoreLibStrings.`application/xml` = js.native
  val DEFAULT_NAMESPACE_URI: xmlDashCoreLib.xmlDashCoreLibStrings.Empty = js.native
  val DEFAULT_PREFIX: xmlDashCoreLib.xmlDashCoreLibStrings.Empty = js.native
  val Select: SelectNodes = js.native
  val XmlBase64Converter: IConverter[stdLib.Uint8Array] = js.native
  val XmlBooleanConverter: IConverter[scala.Boolean] = js.native
  val XmlNumberConverter: IConverter[scala.Double] = js.native
  def Parse(xmlString: java.lang.String): stdLib.Document = js.native
  def SelectNamespaces(node: stdLib.Element): AssocArray[java.lang.String] = js.native
  def SelectSingleNode(node: stdLib.Node, path: java.lang.String): stdLib.Node | scala.Null = js.native
  def Stringify(target: stdLib.Node): java.lang.String = js.native
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
}

