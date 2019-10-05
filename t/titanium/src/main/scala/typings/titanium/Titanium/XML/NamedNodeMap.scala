package typings.titanium.Titanium.XML

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A key-value paired map that maps String objects to <Titanium.XML.Node> objects.
		 * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1780488922) on Android and iOS.
		 */
trait NamedNodeMap extends Proxy {
  /**
  			 * The number of nodes in the map. The valid range of child node indices is 0-`length`-1, inclusive.
  			 */
  val length: Double
  /**
  			 * Gets the value of the <Titanium.XML.NamedNodeMap.length> property.
  			 */
  def getLength(): Double
  /**
  			 * Retrieves a node specified by name.
  			 */
  def getNamedItem(name: String): Node
  /**
  			 * Retrieves a node specified by name and namespace. Returns `null` if no matching node is in the map.
  			 */
  def getNamedItemNS(namespaceURI: String, localName: String): Node
  /**
  			 * Retrieves the node at the specified index of the map. Note that NamedNodeMaps are not ordered.
  			 */
  def item(index: Double): Node
  /**
  			 * Removes a node from the map specified by name. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value.
  			 */
  def removeNamedItem(name: String): Node
  /**
  			 * Removes a node from the map specified by local name and namespace URI. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value. Returns the node removed from the map, or `null` if there is no corresponding node.
  			 */
  def removeNamedItemNS(namespaceURI: String, localName: String): Node
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
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getLength: () => Double,
    getNamedItem: String => Node,
    getNamedItemNS: (String, String) => Node,
    item: Double => Node,
    length: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeNamedItem: String => Node,
    removeNamedItemNS: (String, String) => Node,
    setBubbleParent: Boolean => Unit,
    setNamedItem: Node => Node,
    setNamedItemNS: Node => Node,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): NamedNodeMap = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getLength = js.Any.fromFunction0(getLength), getNamedItem = js.Any.fromFunction1(getNamedItem), getNamedItemNS = js.Any.fromFunction2(getNamedItemNS), item = js.Any.fromFunction1(item), length = length, removeEventListener = js.Any.fromFunction2(removeEventListener), removeNamedItem = js.Any.fromFunction1(removeNamedItem), removeNamedItemNS = js.Any.fromFunction2(removeNamedItemNS), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setNamedItem = js.Any.fromFunction1(setNamedItem), setNamedItemNS = js.Any.fromFunction1(setNamedItemNS))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[NamedNodeMap]
  }
}

