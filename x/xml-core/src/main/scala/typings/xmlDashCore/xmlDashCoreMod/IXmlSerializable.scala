package typings.xmlDashCore.xmlDashCoreMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlSerializable extends js.Object {
  /**
    * Writes object to XML node
    * - if class was initialized and it has no one change, GetXml returns null
    * @returns Node
    */
  def GetXml(): Node | Null = js.native
  def LoadXml(node: String): Unit = js.native
  /**
    * Reads XML from string
    * @param  {Node} node
    * @returns void
    */
  def LoadXml(node: Node): Unit = js.native
}

