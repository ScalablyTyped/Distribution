package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtd", JSImport.Namespace)
@js.native
object xmlDtdMod extends js.Object {
  @js.native
  trait XmlDtd
    extends typings.xmlcreate.xmlNodeMod.default {
    var _name: js.Any = js.native
    var _pubId: js.UndefOr[js.Any] = js.native
    var _sysId: js.UndefOr[js.Any] = js.native
    /**
      * Gets the name of the DTD.
      *
      * @returns The name of the DTD.
      */
    /**
      * Sets the name of the DTD.
      *
      * @param name The name of the DTD.
      */
    var name: String = js.native
    /**
      * Gets the public identifier of the DTD, excluding quotation marks.
      *
      * @returns The public identifier of the DTD, excluding quotation marks.
      *          This value may be undefined.
      */
    /**
      * Sets the public identifier of the DTD, excluding quotation marks. If a
      * public identifier is provided, a system identifier must be provided as
      * well.
      *
      * @param pubId The public identifier of the DTD, excluding quotation marks.
      *              This value may be undefined.
      */
    var pubId: js.UndefOr[String] = js.native
    /**
      * Gets the system identifier of the DTD, excluding quotation marks.
      *
      * @returns The system identifier of the DTD, excluding quotation marks.
      *          This value may be undefined.
      */
    /**
      * Sets the system identifier of the DTD, excluding quotation marks.
      *
      * @param sysId The system identifier of the DTD, excluding quotation marks.
      *              This value may be undefined.
      */
    var sysId: js.UndefOr[String] = js.native
    /**
      * Inserts a new attribute-list declaration at the specified index. If no
      * index is specified, the node is inserted at the end of this node's
      * children.
      *
      * @param text The text of the attribute-list declaration.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created attribute-list declaration.
      */
    def attlist(text: String): typings.xmlcreate.xmlDtdAttlistMod.default = js.native
    def attlist(text: String, index: Double): typings.xmlcreate.xmlDtdAttlistMod.default = js.native
    /**
      * Inserts a new comment at the specified index. If no index is specified,
      * the node is inserted at the end of this node's children.
      *
      * @param content The data of the comment.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created comment.
      */
    def comment(content: String): typings.xmlcreate.xmlCommentMod.default = js.native
    def comment(content: String, index: Double): typings.xmlcreate.xmlCommentMod.default = js.native
    /**
      * Inserts a new element declaration at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param text The text of the element declaration.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created element declaration.
      */
    def element(text: String): typings.xmlcreate.xmlDtdElementMod.default = js.native
    def element(text: String, index: Double): typings.xmlcreate.xmlDtdElementMod.default = js.native
    /**
      * Inserts a new entity declaration at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param text The text of the entity declaration.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created entity declaration.
      */
    def entity(text: String): typings.xmlcreate.xmlDtdEntityMod.default = js.native
    def entity(text: String, index: Double): typings.xmlcreate.xmlDtdEntityMod.default = js.native
    /**
      * Inserts the specified node into this node's children at the specified
      * index. The node is not inserted if it is already present. If this node
      * already has a parent, it is removed from that parent.
      *
      * Only {@link XmlComment}, {@link XmlDtdAttlist}, {@link XmlDtdElement},
      * {@link XmlDtdEntity}, {@link XmlDtdNotation}, and {@link XmlProcInst}
      * nodes can be inserted; otherwise an exception will be thrown.
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
      * Inserts a new notation declaration at the specified index. If no index is
      * specified, the node is inserted at the end of this node's children.
      *
      * @param text The text of the notation declaration.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created notation declaration.
      */
    def notation(text: String): typings.xmlcreate.xmlDtdNotationMod.default = js.native
    def notation(text: String, index: Double): typings.xmlcreate.xmlDtdNotationMod.default = js.native
    /**
      * Inserts a new parameter entity reference at the specified index. If no
      * index is specified, the node is inserted at the end of this node's
      * children.
      *
      * @param entity The entity to reference.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this
      *              node's children.
      *
      * @returns The newly created parameter entity reference.
      */
    def paramEntityRef(entity: String): typings.xmlcreate.xmlDtdParamEntityRefMod.default = js.native
    def paramEntityRef(entity: String, index: Double): typings.xmlcreate.xmlDtdParamEntityRefMod.default = js.native
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
  class default protected () extends XmlDtd {
    /**
      * Initializes a new instance of the {@link XmlDtd} class.
      *
      * @param name The name of the DTD.
      * @param sysId The system identifier of the DTD, excluding quotation marks.
      * @param pubId The public identifier of the DTD, excluding quotation marks.
      *              If a public identifier is provided, a system identifier
      *              must be provided as well.
      */
    def this(name: String) = this()
    def this(name: String, sysId: String) = this()
    def this(name: String, sysId: String, pubId: String) = this()
  }
  
}

