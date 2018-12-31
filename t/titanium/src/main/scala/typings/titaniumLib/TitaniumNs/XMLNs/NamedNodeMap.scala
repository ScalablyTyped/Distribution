package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A key-value paired map that maps String objects to <Titanium.XML.Node> objects.
		 * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1780488922) on Android and iOS.
		 */
trait NamedNodeMap
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The number of nodes in the map. The valid range of child node indices is 0-`length`-1, inclusive.
  			 */
  val length: scala.Double
  /**
  			 * Gets the value of the <Titanium.XML.NamedNodeMap.length> property.
  			 */
  def getLength(): scala.Double
  /**
  			 * Retrieves a node specified by name.
  			 */
  def getNamedItem(name: java.lang.String): Node
  /**
  			 * Retrieves a node specified by name and namespace. Returns `null` if no matching node is in the map.
  			 */
  def getNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): Node
  /**
  			 * Retrieves the node at the specified index of the map. Note that NamedNodeMaps are not ordered.
  			 */
  def item(index: scala.Double): Node
  /**
  			 * Removes a node from the map specified by name. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value.
  			 */
  def removeNamedItem(name: java.lang.String): Node
  /**
  			 * Removes a node from the map specified by local name and namespace URI. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value. Returns the node removed from the map, or `null` if there is no corresponding node.
  			 */
  def removeNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): Node
  /**
  			 * Adds a node using its `nodeName` attribute. If a node with that name is already present, it is replaced. Throws an exception if the argument is from a different document, the map is read-only, or the argument is an attribute of another element.
  			 */
  def setNamedItem(node: Node): Node
  /**
  			 * Adds a node using its `namespaceURI` and `localName` attributes. If a node with that name is already present, it is replaced. Throws an exception if the argument is from a different document, the map is read-only, or the argument is an attribute of another element.
  			 */
  def setNamedItemNS(node: Node): Node
}

