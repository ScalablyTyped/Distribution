package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlNamedNodeMap
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IXmlNode] {
  def getNamedItem(name: java.lang.String): IXmlNode = js.native
  def getNamedItemNS(namespaceUri: js.Any, name: java.lang.String): IXmlNode = js.native
  def item(index: scala.Double): IXmlNode = js.native
  def removeNamedItem(name: java.lang.String): IXmlNode = js.native
  def removeNamedItemNS(namespaceUri: js.Any, name: java.lang.String): IXmlNode = js.native
  def setNamedItem(node: IXmlNode): IXmlNode = js.native
  def setNamedItemNS(node: IXmlNode): IXmlNode = js.native
}

