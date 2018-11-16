package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlObject extends IXmlSerializable {
  val Element: js.UndefOr[stdLib.Element | scala.Null] = js.native
  val LocalName: java.lang.String = js.native
  val NamespaceURI: java.lang.String | scala.Null = js.native
  var Prefix: java.lang.String | scala.Null = js.native
  var element: js.UndefOr[stdLib.Element | scala.Null] = js.native
  var localName: js.UndefOr[java.lang.String] = js.native
  var prefix: java.lang.String | scala.Null = js.native
  /* protected */ def CreateDocument(): stdLib.Document = js.native
  /* protected */ def CreateElement(): stdLib.Element = js.native
  /* protected */ def CreateElement(document: stdLib.Document): stdLib.Element = js.native
  /* protected */ def CreateElement(document: stdLib.Document, localName: java.lang.String): stdLib.Element = js.native
  /* protected */ def CreateElement(document: stdLib.Document, localName: java.lang.String, namespaceUri: java.lang.String): stdLib.Element = js.native
  /* protected */ def CreateElement(
    document: stdLib.Document,
    localName: java.lang.String,
    namespaceUri: java.lang.String,
    prefix: java.lang.String
  ): stdLib.Element = js.native
  /* protected */ def CreateElement(
    document: stdLib.Document,
    localName: java.lang.String,
    namespaceUri: scala.Null,
    prefix: java.lang.String
  ): stdLib.Element = js.native
  def GetAttribute(name: java.lang.String): java.lang.String | scala.Null = js.native
  def GetAttribute(name: java.lang.String, defaultValue: java.lang.String): java.lang.String | scala.Null = js.native
  def GetAttribute(name: java.lang.String, defaultValue: java.lang.String, required: scala.Boolean): java.lang.String | scala.Null = js.native
  def GetAttribute(name: java.lang.String, defaultValue: scala.Null, required: scala.Boolean): java.lang.String | scala.Null = js.native
  def GetChild(localName: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetChild(localName: java.lang.String, required: scala.Boolean): stdLib.Element | scala.Null = js.native
  def GetChildren(localName: java.lang.String): js.Array[stdLib.Element] = js.native
  def GetChildren(localName: java.lang.String, nameSpace: java.lang.String): js.Array[stdLib.Element] = js.native
  def GetElement(name: java.lang.String): stdLib.Element = js.native
  def GetElement(name: java.lang.String, required: scala.Boolean): stdLib.Element = js.native
  def GetFirstChild(localName: java.lang.String): stdLib.Element | scala.Null = js.native
  def GetFirstChild(localName: java.lang.String, namespace: java.lang.String): stdLib.Element | scala.Null = js.native
  /* protected */ def GetPrefix(): java.lang.String = js.native
  /* protected */ def GetStatic(): XmlSchema = js.native
  def GetXml(hard: scala.Boolean): stdLib.Element | scala.Null = js.native
  def HasChanged(): scala.Boolean = js.native
  def IsEmpty(): scala.Boolean = js.native
  def LoadXml(param: stdLib.Element): scala.Unit = js.native
  /* protected */ def OnGetXml(element: stdLib.Element): scala.Unit = js.native
  /* protected */ def OnLoadXml(element: stdLib.Element): scala.Unit = js.native
}

