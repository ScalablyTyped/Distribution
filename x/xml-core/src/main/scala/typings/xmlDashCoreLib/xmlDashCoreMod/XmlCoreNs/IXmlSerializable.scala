package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

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
  def GetXml(): stdLib.Node | scala.Null = js.native
  /**
           * Reads XML from string
           * @param  {Node} node
           * @returns void
           */
  def LoadXml(node: java.lang.String): scala.Unit = js.native
  /**
           * Reads XML from string
           * @param  {Node} node
           * @returns void
           */
  def LoadXml(node: stdLib.Node): scala.Unit = js.native
}

