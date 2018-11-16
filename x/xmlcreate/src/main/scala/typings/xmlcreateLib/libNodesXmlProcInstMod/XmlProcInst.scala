package typings
package xmlcreateLib.libNodesXmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlProcInst
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _content: js.UndefOr[js.Any] = js.native
  var _target: js.Any = js.native
  /**
       * Gets the data of the processing instruction.
       *
       * @returns The data of the processing instruction. This value may be
       *          undefined.
       */
  /**
       * Sets the data of the processing instruction.
       *
       * @param content The data of the processing instruction. This value may be
       *                undefined.
       */
  var content: js.UndefOr[java.lang.String] = js.native
  /**
       * Gets the target of the processing instruction.
       *
       * @returns The target of the processing instruction.
       */
  /**
       * Sets the target of the processing instruction.
       *
       * @param target The target of the processing instruction.
       */
  var target: java.lang.String = js.native
  /**
       * Throws an exception since {@link XmlProcInst} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlProcInst} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlProcInst} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       *
       * @returns This method does not return.
       */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

