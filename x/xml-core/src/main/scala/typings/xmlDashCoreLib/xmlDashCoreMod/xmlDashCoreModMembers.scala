package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", JSImport.Namespace)
@js.native
object xmlDashCoreModMembers extends js.Object {
  val APPLICATION_XML: /* application/xml */ java.lang.String = js.native
  val DEFAULT_NAMESPACE_URI: /*  */ java.lang.String = js.native
  val DEFAULT_PREFIX: /*  */ java.lang.String = js.native
  val Select: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.SelectNodes = js.native
  val XmlBase64Converter: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.IConverter[stdLib.Uint8Array] = js.native
  val XmlBooleanConverter: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.IConverter[scala.Boolean] = js.native
  val XmlNumberConverter: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.IConverter[scala.Double] = js.native
  def Parse(xmlString: java.lang.String): stdLib.Document = js.native
  def SelectNamespaces(node: stdLib.Element): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.AssocArray[java.lang.String] = js.native
  def SelectSingleNode(node: stdLib.Node, path: java.lang.String): stdLib.Node | scala.Null = js.native
  def Stringify(target: stdLib.Node): java.lang.String = js.native
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlAttribute[T](params: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlChildElement[T](params: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlContent[T](params: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def XmlElement(params: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlElementType): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
}

