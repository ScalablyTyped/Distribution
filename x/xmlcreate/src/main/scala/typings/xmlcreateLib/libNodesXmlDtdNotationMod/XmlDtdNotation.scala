package typings
package xmlcreateLib.libNodesXmlDtdNotationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtdNotation
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _text: js.Any = js.native
  /**
    * Gets the text associated with the XML notation declaration.
    *
    * @return The text associated with the XML notation declaration.
    */
  /**
    * Sets the text associated with the XML notation declaration.
    *
    * @param text The text associated with the XML notation declaration.
    */
  var text: java.lang.String = js.native
  /**
    * Throws an exception since {@link XmlDtdNotation} nodes cannot have any
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
    * Throws an exception since {@link XmlDtdNotation} nodes cannot have any
    * children.
    *
    * @param node This parameter is unused.
    *
    * @returns This method does not return.
    */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

