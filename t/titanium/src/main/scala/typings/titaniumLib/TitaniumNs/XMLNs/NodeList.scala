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

