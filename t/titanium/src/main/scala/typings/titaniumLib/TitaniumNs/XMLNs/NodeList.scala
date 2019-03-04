package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list of <Titanium.XML.Node> objects. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-536297177) on Android and iOS.
		 */
trait NodeList
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The length of the node list.
  			 */
  val length: scala.Double
  /**
  			 * Gets the value of the <Titanium.XML.NodeList.length> property.
  			 */
  def getLength(): scala.Double
  /**
  			 * Returns the <Titanium.XML.Node> object at the specified index.
  			 */
  def item(index: scala.Double): Node
}

object NodeList {
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
    item: js.Function1[scala.Double, Node],
    length: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): NodeList = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getLength = getLength, item = item, length = length, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[NodeList]
  }
}

