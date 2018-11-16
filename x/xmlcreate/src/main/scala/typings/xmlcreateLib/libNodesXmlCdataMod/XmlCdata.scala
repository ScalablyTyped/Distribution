package typings
package xmlcreateLib.libNodesXmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCdata
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _data: js.Any = js.native
  /**
       * Gets the character data of the CDATA section.
       *
       * @returns The character data of the CDATA section.
       */
  /**
       * Sets the character data of the CDATA section.
       *
       * @param data The character data of the CDATA section.
       */
  var data: java.lang.String = js.native
  /**
       * Throws an exception since {@link XmlCdata} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlCdata} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       * @param index This parameter is unused.
       *
       * @returns This method does not return.
       */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
       * Throws an exception since {@link XmlCdata} nodes cannot have any
       * children.
       *
       * @param node This parameter is unused.
       *
       * @returns This method does not return.
       */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

