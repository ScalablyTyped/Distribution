package typings
package xmlcreateLib.libNodesXmlCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlComment
  extends xmlcreateLib.libNodesXmlNodeMod.default {
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
  var content: java.lang.String = js.native
  /**
    * Throws an exception since {@link XmlComment} nodes cannot have any
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
    * Throws an exception since {@link XmlComment} nodes cannot have any
    * children.
    *
    * @param node This parameter is unused.
    *
    * @returns This method does not return.
    */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

