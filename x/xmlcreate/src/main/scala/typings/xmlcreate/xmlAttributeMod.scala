package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlAttribute", JSImport.Namespace)
@js.native
object xmlAttributeMod extends js.Object {
  @js.native
  trait XmlAttribute
    extends typings.xmlcreate.xmlNodeMod.default {
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
    var name: String = js.native
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
    def charRef(char: String, hex: Boolean): typings.xmlcreate.xmlCharRefMod.default = js.native
    def charRef(char: String, hex: Boolean, index: Double): typings.xmlcreate.xmlCharRefMod.default = js.native
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
    def entityRef(entity: String): typings.xmlcreate.xmlEntityRefMod.default = js.native
    def entityRef(entity: String, index: Double): typings.xmlcreate.xmlEntityRefMod.default = js.native
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
    def insertChild(node: typings.xmlcreate.xmlNodeMod.default): js.UndefOr[typings.xmlcreate.xmlNodeMod.default] = js.native
    def insertChild(node: typings.xmlcreate.xmlNodeMod.default, index: Double): js.UndefOr[typings.xmlcreate.xmlNodeMod.default] = js.native
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
    def removeChild(node: typings.xmlcreate.xmlNodeMod.default): Boolean = js.native
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
    def text(text: String): typings.xmlcreate.xmlAttributeTextMod.default = js.native
    def text(text: String, index: Double): typings.xmlcreate.xmlAttributeTextMod.default = js.native
  }
  
  @js.native
  class default protected () extends XmlAttribute {
    def this(name: String, value: js.Array[typings.xmlcreate.xmlNodeMod.default]) = this()
    /**
      * Initializes a new instance of the {@link XmlAttribute} class.
      *
      * @param name The name of the XML attribute.
      * @param value The initial value of the XML attribute. Additional children
      *              can be added later. Only {@link XmlAttributeText},
      *              {@link XmlCharRef}, and {@link XmlEntityRef} nodes are
      *              permitted.
      */
    def this(name: String, value: typings.xmlcreate.xmlNodeMod.default) = this()
  }
  
}

