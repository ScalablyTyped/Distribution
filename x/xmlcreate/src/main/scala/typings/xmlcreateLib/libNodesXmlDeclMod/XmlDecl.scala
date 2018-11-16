package typings
package xmlcreateLib.libNodesXmlDeclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDecl
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _encoding: js.UndefOr[js.Any] = js.native
  var _standalone: js.UndefOr[js.Any] = js.native
  var _version: js.Any = js.native
  /**
       * Gets the XML encoding to be included in the declaration.
       *
       * @returns The XML encoding to be included in the declaration. This value
       *          may be undefined.
       */
  /**
       * Sets the XML encoding to be included in the declaration.
       *
       * @param encoding The XML encoding to be included in the declaration. This
       *                 value must be a valid encoding. If left undefined, no
       *                 encoding is included.
       */
  var encoding: js.UndefOr[java.lang.String] = js.native
  /**
       * Gets the XML standalone attribute to be included in the declaration.
       *
       * @returns The XML standalone attribute to be included in the declaration.
       *          This value may be undefined.
       */
  /**
       * Sets the XML standalone attribute to be included in the declaration.
       *
       * @param standalone The XML standalone attribute to be included. This
       *                   value must be "yes" or "no". If left undefined, no
       *                   standalone attribute is included.
       */
  var standalone: js.UndefOr[java.lang.String] = js.native
  /**
       * Gets the XML version to be included in the declaration.
       *
       * @returns The XML version to tbe included in the declaration.
       */
  /**
       * Sets the XML version to be included in the declaration.
       *
       * @param version The XML version to be included in the declaration. This
       *                value must be a valid XML version number. If left
       *                undefined, the default version is "1.0".
       */
  var version: java.lang.String = js.native
  /**
       * Throws an exception since {@link XmlDecl} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlDecl} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlDecl} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       *
       * @returns This method does not return.
       */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

