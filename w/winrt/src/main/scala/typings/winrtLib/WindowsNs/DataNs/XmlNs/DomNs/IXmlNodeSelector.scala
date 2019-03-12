package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNodeSelector extends js.Object {
  def selectNodes(xpath: java.lang.String): XmlNodeList
  def selectNodesNS(xpath: java.lang.String, namespaces: js.Any): XmlNodeList
  def selectSingleNode(xpath: java.lang.String): IXmlNode
  def selectSingleNodeNS(xpath: java.lang.String, namespaces: js.Any): IXmlNode
}

object IXmlNodeSelector {
  @scala.inline
  def apply(
    selectNodes: java.lang.String => XmlNodeList,
    selectNodesNS: (java.lang.String, js.Any) => XmlNodeList,
    selectSingleNode: java.lang.String => IXmlNode,
    selectSingleNodeNS: (java.lang.String, js.Any) => IXmlNode
  ): IXmlNodeSelector = {
    val __obj = js.Dynamic.literal(selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
  
    __obj.asInstanceOf[IXmlNodeSelector]
  }
}

