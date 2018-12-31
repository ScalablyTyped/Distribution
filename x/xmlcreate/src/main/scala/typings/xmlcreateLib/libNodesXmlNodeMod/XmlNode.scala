package typings
package xmlcreateLib.libNodesXmlNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlNode extends js.Object {
  var _children: js.Array[XmlNode] = js.native
  var _parent: js.UndefOr[js.Any] = js.native
  /**
    * Gets the parent of this node.
    *
    * @returns The parent of this node.
    */
  val parent: js.UndefOr[XmlNode] = js.native
  /**
    * Gets this node's children.
    *
    * Throws an exception if this node cannot have any children. Consult the
    * appropriate subclass documentation for more details.
    *
    * @returns This node's children.
    */
  def children(): js.Array[XmlNode] = js.native
  /**
    * Inserts the specified node into this node's children at the specified
    * index. The node is not inserted if it is already present. If this node
    * already has a parent, it is removed from that parent.
    *
    * Throws an exception if this node cannot have any children, or if the
    * specified node cannot be added at the specified index. Consult the
    * appropriate subclass documentation for more details.
    *
    * @param node The node to insert.
    * @param index The index at which to insert the node. Nodes at or after
    *              the index are shifted to the right. If no index is
    *              specified, the node is inserted at the end.
    *
    * @returns The node inserted into this node's children, or undefined if no
    *          node was inserted.
    */
  def insertChild(node: XmlNode): js.UndefOr[XmlNode] = js.native
  def insertChild(node: XmlNode, index: scala.Double): js.UndefOr[XmlNode] = js.native
  /**
    * Gets the node that follows this one, or undefined if no such node
    * exists or if this node has no parent.
    *
    * @returns The node that follows this one, or undefined if no such node
    *          exists or if this node has no parent.
    */
  def next(): js.UndefOr[XmlNode] = js.native
  /**
    * Gets the node that is previous to this one, or undefined if no such node
    * exists or if this node has no parent.
    *
    * @returns The node that is previous to this one, or undefined if no such
    *          node exists or if this node has no parent.
    */
  def prev(): js.UndefOr[XmlNode] = js.native
  /**
    * Removes this node from its parent if this node has a parent.
    *
    * @returns This node's parent, or undefined if it has no parent.
    */
  def remove(): js.UndefOr[XmlNode] = js.native
  /**
    * Removes the specified node from this node's children.
    *
    * Throws an exception if this node cannot have any children, or if the
    * specified node cannot be removed. Consult the appropriate subclass
    * documentation for more details.
    *
    * @param node The node to remove.
    *
    * @returns Whether a node was removed.
    */
  def removeChild(node: XmlNode): scala.Boolean = js.native
  /**
    * Removes the node at the specified index from this node's children.
    *
    * Throws an exception if this node cannot have any children, or if the
    * node at the specified index cannot be removed. Consult the appropriate
    * subclass documentation for more details.
    *
    * @param index The index at which the node to be removed is located.
    *
    * @returns The node that was removed.
    */
  def removeChildAtIndex(index: scala.Double): XmlNode = js.native
  def toString(options: xmlcreateLib.libOptionsMod.IStringOptions): java.lang.String = js.native
  /**
    * Returns the root node of the current hierarchy. If this node has no
    * parent, this node itself is returned.
    *
    * @returns The root node of the current hierarchy.
    */
  def top(): XmlNode = js.native
  /**
    * Gets the parent of this node.
    */
  def up(): js.UndefOr[XmlNode] = js.native
}

