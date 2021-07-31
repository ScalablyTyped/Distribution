package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlNodeSelector extends StObject {
  
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
  
  @scala.inline
  implicit class IXmlNodeSelectorMutableBuilder[Self <: IXmlNodeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectNodes(value: String => XmlNodeList): Self = StObject.set(x, "selectNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectNodesNS(value: (String, js.Any) => XmlNodeList): Self = StObject.set(x, "selectNodesNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectSingleNode(value: String => IXmlNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectSingleNodeNS(value: (String, js.Any) => IXmlNode): Self = StObject.set(x, "selectSingleNodeNS", js.Any.fromFunction2(value))
  }
}
