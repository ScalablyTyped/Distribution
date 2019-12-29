package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlComment", JSImport.Namespace)
@js.native
object libNodesXmlCommentMod extends js.Object {
  @js.native
  trait XmlComment
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _content: js.Any = js.native
    /**
      * Gets the content of the comment.
      *
      * @returns The content of the comment.
      */
    /**
      * Sets the content of the comment.
      *
      * @param content The content of the comment.
      */
    var content: String = js.native
    /**
      * Throws an exception since {@link XmlComment} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      * @param index This parameter is unused.
      *
      * @returns This method does not return.
      */
    def insertChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): js.UndefOr[typings.xmlcreate.libNodesXmlNodeMod.default] = js.native
    def insertChild(node: typings.xmlcreate.libNodesXmlNodeMod.default, index: Double): js.UndefOr[typings.xmlcreate.libNodesXmlNodeMod.default] = js.native
    /**
      * Throws an exception since {@link XmlComment} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlComment {
    /**
      * Initializes a new instance of the {@link XmlComment} class.
      *
      * @param content The content of the comment.
      */
    def this(content: String) = this()
  }
  
}

