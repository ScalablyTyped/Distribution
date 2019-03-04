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
    selectNodes: js.Function1[java.lang.String, XmlNodeList],
    selectNodesNS: js.Function2[java.lang.String, js.Any, XmlNodeList],
    selectSingleNode: js.Function1[java.lang.String, IXmlNode],
    selectSingleNodeNS: js.Function2[java.lang.String, js.Any, IXmlNode]
  ): IXmlNodeSelector = {
    val __obj = js.Dynamic.literal(selectNodes = selectNodes, selectNodesNS = selectNodesNS, selectSingleNode = selectSingleNode, selectSingleNodeNS = selectSingleNodeNS)
  
    __obj.asInstanceOf[IXmlNodeSelector]
  }
}

