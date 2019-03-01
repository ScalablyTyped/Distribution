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

object NamedNodeMap {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getLength: js.Function0[scala.Double],
    getNamedItem: js.Function1[java.lang.String, Node],
    getNamedItemNS: js.Function2[java.lang.String, java.lang.String, Node],
    item: js.Function1[scala.Double, Node],
    length: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeNamedItem: js.Function1[java.lang.String, Node],
    removeNamedItemNS: js.Function2[java.lang.String, java.lang.String, Node],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setNamedItem: js.Function1[Node, Node],
    setNamedItemNS: js.Function1[Node, Node],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): NamedNodeMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getNamedItem")(getNamedItem)
    __obj.updateDynamic("getNamedItemNS")(getNamedItemNS)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeNamedItem")(removeNamedItem)
    __obj.updateDynamic("removeNamedItemNS")(removeNamedItemNS)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setNamedItem")(setNamedItem)
    __obj.updateDynamic("setNamedItemNS")(setNamedItemNS)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[NamedNodeMap]
  }
}

