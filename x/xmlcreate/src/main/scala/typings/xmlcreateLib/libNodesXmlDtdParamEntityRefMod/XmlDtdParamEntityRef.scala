package typings
package xmlcreateLib.libNodesXmlDtdParamEntityRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtdParamEntityRef
  extends xmlcreateLib.libNodesXmlNodeMod.default {
  var _entity: js.Any = js.native
  /**
    * Gets the entity to be referenced.
    *
    * @returns The entity to be referenced.
    */
  /**
    * Sets the entity to be referenced.
    *
    * @param entity The entity to be referenced.
    */
  var entity: java.lang.String = js.native
  /**
    * Throws an exception since {@link XmlDtdParamEntityRef} nodes cannot have
    * any children.
    *
    * @param node This parameter is unused.
    * @param index This parameter is unused.
    *
    * @returns This method does not return.
    */
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  def insertChild(node: xmlcreateLib.libNodesXmlNodeMod.default, index: scala.Double): js.UndefOr[xmlcreateLib.libNodesXmlNodeMod.default] = js.native
  /**
    * Throws an exception since {@link XmlDtdParamEntityRef} nodes cannot have
    * any children.
    *
    * @param node This parameter is unused.
    *
    * @returns This method does not return.
    */
  def removeChild(node: xmlcreateLib.libNodesXmlNodeMod.default): scala.Boolean = js.native
}

