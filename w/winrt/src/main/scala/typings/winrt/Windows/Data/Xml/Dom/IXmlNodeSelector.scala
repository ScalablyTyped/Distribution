package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNodeSelector extends js.Object {
  def selectNodes(xpath: String): XmlNodeList
  def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList
  def selectSingleNode(xpath: String): IXmlNode
  def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode
}

object IXmlNodeSelector {
  @scala.inline
  def apply(
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode
  ): IXmlNodeSelector = {
    val __obj = js.Dynamic.literal(selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
  
    __obj.asInstanceOf[IXmlNodeSelector]
  }
}

