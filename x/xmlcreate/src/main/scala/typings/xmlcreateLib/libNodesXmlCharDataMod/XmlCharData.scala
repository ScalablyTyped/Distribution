package typings
package xmlcreateLib.libNodesXmlCharDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCharData
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _charData: js.Any = js.native
  /**
       * Gets the character data associated with this node.
       *
       * @returns The character data associated with this node.
       */
  /**
       * Sets the character data associated with this node.
       *
       * @param charData Character data.
       */
  var charData: java.lang.String = js.native
  /**
       * Throws an exception since {@link XmlCharData} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlCharData} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlCharData} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       *
       * @returns This method does not return.
       */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

