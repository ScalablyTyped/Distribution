package typings
package xmlcreateLib.libNodesXmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCharRef
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _char: js.Any = js.native
  var _hex: js.Any = js.native
  /**
    * Gets the character to represent using the reference.
    *
    * @returns The character to represent using the reference.
    */
  /**
    * Sets the character to represent using the reference.
    *
    * @param char The character to represent using the reference.
    */
  var char: java.lang.String = js.native
  /**
    * Gets whether or not to use the hexadecimal or decimal representation for
    * the reference.
    *
    * @returns Whether or not to use the hexadecimal or decimal representation
    *          for the reference.
    */
  /**
    * Sets whether or not to use the hexadecimal or decimal representation for
    * the reference.
    *
    * @param hex Whether or not to use the hexadecimal or decimal
    *            representation for the reference.
    */
  var hex: scala.Boolean = js.native
  /**
    * Throws an exception since {@link XmlCharRef} nodes cannot have any
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
    * Throws an exception since {@link XmlCharRef} nodes cannot have any
    * children.
    *
    * @param node This parameter is unused.
    *
    * @returns This method does not return.
    */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

