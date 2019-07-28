package typings.winrt.WindowsNs.DataNs.XmlNs.DomNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlNamedNodeMap extends IVectorView[IXmlNode] {
  def getNamedItem(name: String): IXmlNode = js.native
  def getNamedItemNS(namespaceUri: js.Any, name: String): IXmlNode = js.native
  def item(index: Double): IXmlNode = js.native
  def removeNamedItem(name: String): IXmlNode = js.native
  def removeNamedItemNS(namespaceUri: js.Any, name: String): IXmlNode = js.native
  def setNamedItem(node: IXmlNode): IXmlNode = js.native
  def setNamedItemNS(node: IXmlNode): IXmlNode = js.native
}

