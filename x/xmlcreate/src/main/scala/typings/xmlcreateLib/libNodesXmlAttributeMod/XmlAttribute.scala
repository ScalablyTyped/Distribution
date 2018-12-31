package typings
package xmlcreateLib.libNodesXmlAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlAttribute
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _name: js.Any = js.native
  /**
    * Gets the name of this attribute.
    *
    * @returns The name of this attribute.
    */
  /**
    * Sets the name of this attribute.
    *
    * @param name The name of this attribute.
    */
  var name: java.lang.String = js.native
  /**
    * Inserts a new XML character reference at the specified index.
    *
    * @param char The character to represent using the reference.
    * @param hex Whether to use the hexadecimal or decimal representation for
    *            the reference. If left undefined, decimal is the default.
    * @param index The index at which the node should be inserted. If no index
    *              is specified, the node is inserted at the end of this node's
    *              children.
    *
    * @returns The newly created XML declaration.
    */
  def charRef(char: java.lang.String, hex: scala.Boolean): xmlcreateLib.libNodesXmlCharRefMod.default = js.native
  def charRef(char: java.lang.String, hex: scala.Boolean, index: scala.Double): xmlcreateLib.libNodesXmlCharRefMod.default = js.native
  /**
    * Inserts a new XML entity reference at the specified index.
    *
    * @param entity The entity to be referenced.
    * @param index The index at which the node should be inserted. If no index
    *              is specified, the node is inserted at the end of this
    *              node's children.
    *
    * @returns The newly created XML declaration.
    */
  def entityRef(entity: java.lang.String): xmlcreateLib.libNodesXmlEntityRefMod.default = js.native
  def entityRef(entity: java.lang.String, index: scala.Double): xmlcreateLib.libNodesXmlEntityRefMod.default = js.native
  /**
    * Inserts the specified node into this node's children at the specified
    * index. The node is not inserted if it is already present. If this node
    * already has a parent, it is removed from that parent.
    *
    * Note that only {@link XmlCharRef}, {@link XmlEntityRef}, and
    * {@link XmlCharData} nodes can be inserted; otherwise, an exception will
    * be thrown.
    *
    * @param node The node to insert.
    * @param index The index at which to insert the node. Nodes at or after the
    *              index are shifted to the right. If no index is specified,
    *              the node is inserted at the end.
    *
    * @returns The node inserted into this node's children, or undefined if no
    *          node was inserted.
    */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
    * Removes the specified node from this node's children.
    *
    * Note that this node must have at least one child. Attempts to remove
    * the last child node will result in an exception.
    *
    * @param node The node to remove.
    *
    * @returns Whether a node was removed.
    */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
  /**
    * Inserts a new XML text node at the specified index.
    *
    * @param text Arbitrary character data.
    * @param index The index at which the node should be inserted. If no index
    *              is specified, the node is inserted at the end of this node's
    *              children.
    *
    * @returns The newly created XML declaration.
    */
  def text(text: java.lang.String): xmlcreateLib.libNodesXmlAttributeTextMod.default = js.native
  def text(text: java.lang.String, index: scala.Double): xmlcreateLib.libNodesXmlAttributeTextMod.default = js.native
}

