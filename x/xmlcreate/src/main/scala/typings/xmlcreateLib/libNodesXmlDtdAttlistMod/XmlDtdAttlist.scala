package typings
package xmlcreateLib.libNodesXmlDtdAttlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtdAttlist
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _text: js.Any = js.native
  /**
    * Gets the text associated with the XML attribute-list declaration.
    *
    * @return The text associated with the XML attribute-list declaration.
    */
  /**
    * Sets the text associated with the XML attribute-list declaration.
    *
    * @param text The text associated with the XML attribute-list declaration.
    */
  var text: java.lang.String = js.native
  /**
    * Throws an exception since {@link XmlDtdAttlist} nodes cannot have any
    * children.
    *
    * @param node This parameter is unused.
    * @param index This parameter is unused.
    *
    * @returns This method does not return.
    */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
    * Throws an exception since {@link XmlDtdAttlist} nodes cannot have any
    * children.
    *
    * @param node This parameter is unused.
    *
    * @returns This method does not return.
    */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

