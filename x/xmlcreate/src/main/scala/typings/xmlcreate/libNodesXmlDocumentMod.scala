package typings.xmlcreate

import typings.xmlcreate.libOptionsMod.IDeclarationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDocument", JSImport.Namespace)
@js.native
object libNodesXmlDocumentMod extends js.Object {
  @js.native
  trait XmlDocument
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    /**
      * Inserts a new comment at the specified index. If no index is specified,
      * the node is inserted at the end of this node's children.
      *
      * @param content The data of the comment.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted at the end of this node's
      *              children.
      *
      * @returns The newly created element.
      */
    def comment(content: String): typings.xmlcreate.libNodesXmlCommentMod.default = js.native
    def comment(content: String, index: Double): typings.xmlcreate.libNodesXmlCommentMod.default = js.native
    /**
      * Inserts a new XML declaration at the beginning of this node's children.
      *
      * @param options The options associated with the XML declaration.
      *
      * @returns The newly created XML declaration.
      */
    def decl(): typings.xmlcreate.libNodesXmlDeclMod.default = js.native
    def decl(options: IDeclarationOptions): typings.xmlcreate.libNodesXmlDeclMod.default = js.native
    /**
      * Inserts a new XML document type definition. Unless a different index is
      * specified, the node is inserted immediately after the XML declaration
      * if one exists, or at the beginning of this node's children if one does
      * not.
      *
      * @param name The name of the DTD.
      * @param sysId The system identifier of the DTD, excluding quotation marks.
      * @param pubId The public identifier of the DTD, excluding quotation marks.
      *              If a public identifier is provided, a system identifier
      *              must be provided as well.
      * @param index The index at which the node should be inserted. If no index
      *              is specified, the node is inserted immediately after the
      *              XML declaration if one exists, or at the beginning of this
      *              node's children if one does not.
      *
      * @returns The newly created XML document type definition.
      */
    def dtd(name: String): typings.xmlcreate.libNodesXmlDtdMod.default = js.native
    def dtd(name: String, sysId: String): typings.xmlcreate.libNodesXmlDtdMod.default = js.native
    def dtd(name: String, sysId: String, pubId: String): typings.xmlcreate.libNodesXmlDtdMod.default = js.native
    def dtd(name: String, sysId: String, pubId: String, index: Double): typings.xmlcreate.libNodesXmlDtdMod.default = js.native
    /**
      * Inserts the specified node into this node's children at the specified
      * index. The node is not inserted if it is already present. If this node
      * already has a parent, it is removed from that parent.
      *
      * Only {@link XmlComment}, {@link XmlDecl}, {@link XmlDtd}, or
      * {@link XmlProcInst} nodes can be inserted. Furthermore, {@link XmlDecl}
      * and {@link XmlDtd} nodes must be inserted in that order and must
      * precede the {@link XmlElement} node. In addition, {@link XmlComment} or
      * {@link XmlProcInst} nodes must follow the {@link XmlDecl} node.
      *
      * @param node The node to insert.
      * @param index The index at which to insert the node. Nodes at or after
      *              the index are shifted to the right. If no index is
      *              specified, the node is inserted at the end.
      *
      * @returns The node inserted into this node's children, or undefined if no
      *          node was inserted.
      */
    def insertChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): js.UndefOr[typings.xmlcreate.libNodesXmlNodeMod.default] = js.native
    def insertChild(node: typings.xmlcreate.libNodesXmlNodeMod.default, index: Double): js.UndefOr[typings.xmlcreate.libNodesXmlNodeMod.default] = js.native
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
    def procInst(target: String): typings.xmlcreate.libNodesXmlProcInstMod.default = js.native
    def procInst(target: String, content: String): typings.xmlcreate.libNodesXmlProcInstMod.default = js.native
    def procInst(target: String, content: String, index: Double): typings.xmlcreate.libNodesXmlProcInstMod.default = js.native
    /**
      * Removes the specified node from this node's children.
      *
      * Note that {@link XmlElement} nodes cannot be removed from this node;
      * attempts to do so will result in an exception being thrown.
      *
      * @param node The node to remove.
      *
      * @returns Whether a node was removed.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
    /**
      * Returns the root element of this document.
      *
      * @returns The root element of this document.
      */
    def root(): typings.xmlcreate.libNodesXmlElementMod.default = js.native
  }
  
  @js.native
  class default protected () extends XmlDocument {
    /**
      * Initializes a new instance of the {@link XmlDocument} class.
      *
      * @param root The name of the root element.
      */
    def this(root: String) = this()
  }
  
}

