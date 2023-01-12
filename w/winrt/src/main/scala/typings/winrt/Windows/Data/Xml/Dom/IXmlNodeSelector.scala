package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlNodeSelector extends StObject {
  
  def selectNodes(xpath: String): XmlNodeList
  
  def selectNodesNS(xpath: String, namespaces: Any): XmlNodeList
  
  def selectSingleNode(xpath: String): IXmlNode
  
  def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode
}
object IXmlNodeSelector {
  
  inline def apply(
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, Any) => IXmlNode
  ): IXmlNodeSelector = {
    val __obj = js.Dynamic.literal(selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[IXmlNodeSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IXmlNodeSelector] (val x: Self) extends AnyVal {
    
    inline def setSelectNodes(value: String => XmlNodeList): Self = StObject.set(x, "selectNodes", js.Any.fromFunction1(value))
    
    inline def setSelectNodesNS(value: (String, Any) => XmlNodeList): Self = StObject.set(x, "selectNodesNS", js.Any.fromFunction2(value))
    
    inline def setSelectSingleNode(value: String => IXmlNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction1(value))
    
    inline def setSelectSingleNodeNS(value: (String, Any) => IXmlNode): Self = StObject.set(x, "selectSingleNodeNS", js.Any.fromFunction2(value))
  }
}
