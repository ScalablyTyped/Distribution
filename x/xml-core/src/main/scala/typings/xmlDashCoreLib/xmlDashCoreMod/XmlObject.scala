package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlObject")
@js.native
class XmlObject ()
  extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlObject

@JSImport("xml-core", "XmlObject")
@js.native
object XmlObject extends js.Object {
  var attributes: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.AssocArray[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlAttributeType[_]] = js.native
  var elements: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.AssocArray[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlChildElementType[_]] = js.native
  var localName: java.lang.String = js.native
  var namespaceURI: java.lang.String | scala.Null = js.native
  var prefix: java.lang.String | scala.Null = js.native
  def CreateDocument(): stdLib.Document = js.native
  def CreateDocument(root: java.lang.String): stdLib.Document = js.native
  def CreateDocument(root: java.lang.String, namespaceUri: java.lang.String): stdLib.Document = js.native
  def CreateDocument(root: java.lang.String, namespaceUri: java.lang.String, prefix: java.lang.String): stdLib.Document = js.native
  def CreateDocument(root: java.lang.String, namespaceUri: scala.Null, prefix: java.lang.String): stdLib.Document = js.native
  def GetAttribute(element: stdLib.Element, attrName: java.lang.String): java.lang.String | scala.Null = js.native
  def GetAttribute(element: stdLib.Element, attrName: java.lang.String, defaultValue: java.lang.String): java.lang.String | scala.Null = js.native
  def GetAttribute(
    element: stdLib.Element,
    attrName: java.lang.String,
    defaultValue: java.lang.String,
    required: scala.Boolean
  ): java.lang.String | scala.Null = js.native
  def GetAttribute(
    element: stdLib.Element,
    attrName: java.lang.String,
    defaultValue: scala.Null,
    required: scala.Boolean
  ): java.lang.String | scala.Null = js.native
  def GetChild(node: stdLib.Element, localName: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetChild(node: stdLib.Element, localName: java.lang.String, nameSpace: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetChild(
    node: stdLib.Element,
    localName: java.lang.String,
    nameSpace: java.lang.String,
    required: scala.Boolean
  ): stdLib.Element | scala.Null = js.native
  def GetChildren(node: stdLib.Node, localName: java.lang.String): js.Array[stdLib.Element] = js.native
  def GetChildren(node: stdLib.Node, localName: java.lang.String, nameSpace: java.lang.String): js.Array[stdLib.Element] = js.native
  def GetElement(element: stdLib.Element, name: java.lang.String): stdLib.Element = js.native
  def GetElement(element: stdLib.Element, name: java.lang.String, required: scala.Boolean): stdLib.Element = js.native
  def GetElementById(document: stdLib.Document, idValue: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetElementById(element: stdLib.Element, idValue: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetFirstChild(node: stdLib.Node, localName: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetFirstChild(node: stdLib.Node, localName: java.lang.String, nameSpace: java.lang.String): stdLib.Element | scala.Null = js.native
  def LoadXml[T /* <: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlObject */](`this`: xmlDashCoreLib.Anon_T[T], param: java.lang.String): T = js.native
  def LoadXml[T /* <: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlObject */](`this`: xmlDashCoreLib.Anon_T[T], param: stdLib.Element): T = js.native
}

