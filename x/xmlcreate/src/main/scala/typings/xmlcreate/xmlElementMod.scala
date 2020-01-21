package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlElement", JSImport.Namespace)
@js.native
object xmlElementMod extends js.Object {
  @js.native
  trait XmlElement
    extends typings.xmlcreate.xmlNodeMod.default {
    var _name: js.Any = js.native
    /**
      * Gets the name of the element.
      *
      * @returns The name of the element.
      */
    /**
      * Sets the name of the element.
      *
      * @param name The name of the element.
      */
    var name: String = js.native
    /**
      * Inserts an new attribute at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param name The name of the attribute.
      * @param value The value of the attribute. Strings are converted to
      *        XmlAttributeText nodes.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns {XmlAttribute} The newly created attribute.
      */
    def attribute(name: String, value: String): typings.xmlcreate.xmlAttributeMod.default = js.native
    def attribute(name: String, value: String, index: Double): typings.xmlcreate.xmlAttributeMod.default = js.native
    def attribute(name: String, value: js.Array[String | typings.xmlcreate.xmlNodeMod.default]): typings.xmlcreate.xmlAttributeMod.default = js.native
    def attribute(name: String, value: js.Array[String | typings.xmlcreate.xmlNodeMod.default], index: Double): typings.xmlcreate.xmlAttributeMod.default = js.native
    def attribute(name: String, value: typings.xmlcreate.xmlNodeMod.default): typings.xmlcreate.xmlAttributeMod.default = js.native
    def attribute(name: String, value: typings.xmlcreate.xmlNodeMod.default, index: Double): typings.xmlcreate.xmlAttributeMod.default = js.native
    /**
      * Returns an array containing all of the children of this node that are
      * instances of {@link XmlAttribute}.
      *
      * @returns An array containing all of the children of this node that are
      *          instances of {@link XmlAttribute}.
      */
    def attributes(): js.Array[typings.xmlcreate.xmlAttributeMod.default] = js.native
    /**
      * Inserts a new CDATA section at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param content The data of the CDATA section.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created CDATA section.
      */
    def cdata(content: String): typings.xmlcreate.xmlCdataMod.default = js.native
    def cdata(content: String, index: Double): typings.xmlcreate.xmlCdataMod.default = js.native
    /**
      * Inserts some character data at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param charData Character data.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created text node.
      */
    def charData(charData: String): typings.xmlcreate.xmlCharDataMod.default = js.native
    def charData(charData: String, index: Double): typings.xmlcreate.xmlCharDataMod.default = js.native
    /**
      * Inserts a new character reference at the specified index. If no index
      * is specified, the node is inserted at the end of this node's children.
      *
      * @param char The character to represent using the reference.
      * @param hex Whether to use the hexadecimal or decimal representation for
      *            the reference. If left undefined, decimal is the default.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created character reference.
      */
    def charRef(char: String): typings.xmlcreate.xmlCharRefMod.default = js.native
    def charRef(char: String, hex: Boolean): typings.xmlcreate.xmlCharRefMod.default = js.native
    def charRef(char: String, hex: Boolean, index: Double): typings.xmlcreate.xmlCharRefMod.default = js.native
    /**
      * Inserts a new comment at the specified index. If no index is specified,
      * the node is inserted at the end of this node's children.
      *
      * @param content The data of the comment.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created comment.
      */
    def comment(content: String): typings.xmlcreate.xmlCommentMod.default = js.native
    def comment(content: String, index: Double): typings.xmlcreate.xmlCommentMod.default = js.native
    /**
      * Inserts a new element at the specified index. If no index is specified,
      * the node is inserted at the end of this node's children.
      *
      * @param name The name of the element.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created element.
      */
    def element(name: String): XmlElement = js.native
    def element(name: String, index: Double): XmlElement = js.native
    /**
      * Inserts a new entity reference at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param entity The entity to be referenced.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created entity reference.
      */
    def entityRef(entity: String): typings.xmlcreate.xmlEntityRefMod.default = js.native
    def entityRef(entity: String, index: Double): typings.xmlcreate.xmlEntityRefMod.default = js.native
    /**
      * Inserts the specified node into this node's children at the specified
      * index. The node is not inserted if it is already present. If this node
      * already has a parent, it is removed from that parent.
      *
      * Note that only {@link XmlAttribute}, {@link XmlCdata},
      * {@link XmlCharRef}, {@link XmlComment}, {@link XmlElement},
      * {@link XmlEntityRef}, {@link XmlProcInst}, or {@link XmlCharData} nodes
      * can be inserted; otherwise, an exception will be thrown.
      *
      * @param node The node to insert.
      * @param index The index at which to insert the node. Nodes at or after
      *              the index are shifted to the right. If no index is
      *              specified, the node is inserted at the end.
      *
      * @returns The node inserted into this node's children, or undefined if no
      *          node was inserted.
      */
    def insertChild(node: typings.xmlcreate.xmlNodeMod.default): js.UndefOr[typings.xmlcreate.xmlNodeMod.default] = js.native
    def insertChild(node: typings.xmlcreate.xmlNodeMod.default, index: Double): js.UndefOr[typings.xmlcreate.xmlNodeMod.default] = js.native
    /**
      * Inserts a new processing instruction at the specified index. If no index
      * is specified, the node is inserted at the end of this node's children.
      *
      * @param target The target of the processing instruction.
      * @param content The data of the processing instruction, or undefined if
      *                there is no target.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created processing instruction.
      */
    def procInst(target: String): typings.xmlcreate.xmlProcInstMod.default = js.native
    def procInst(target: String, content: String): typings.xmlcreate.xmlProcInstMod.default = js.native
    def procInst(target: String, content: String, index: Double): typings.xmlcreate.xmlProcInstMod.default = js.native
  }
  
  @js.native
  class default protected () extends XmlElement {
    /**
      * Initializes a new instance of the {@link XmlElement} class.
      *
      * @param name The name of the element.
      */
    def this(name: String) = this()
  }
  
}

