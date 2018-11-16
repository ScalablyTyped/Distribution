package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to execute XPath queries on an XML DOM tree or subtree. */

trait IXmlNodeSelector extends js.Object {
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList.
                       * @param xpath Specifies an XPath expression.
                       * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
                       */
  def selectNodes(xpath: java.lang.String): XmlNodeList
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList.
                       * @param xpath Specifies an XPath expresssion.
                       * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
                       * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
                       */
  def selectNodesNS(xpath: java.lang.String, namespaces: js.Any): XmlNodeList
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
                       * @param xpath Specifies an XPath expression.
                       * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
                       */
  def selectSingleNode(xpath: java.lang.String): IXmlNode
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
                       * @param xpath Specifies an XPath expression.
                       * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
                       * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
                       */
  def selectSingleNodeNS(xpath: java.lang.String, namespaces: js.Any): IXmlNode
}

