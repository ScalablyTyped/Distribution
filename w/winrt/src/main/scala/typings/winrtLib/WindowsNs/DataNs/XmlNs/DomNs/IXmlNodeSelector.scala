package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IXmlNodeSelector extends js.Object {
  def selectNodes(xpath: java.lang.String): XmlNodeList
  def selectNodesNS(xpath: java.lang.String, namespaces: js.Any): XmlNodeList
  def selectSingleNode(xpath: java.lang.String): IXmlNode
  def selectSingleNodeNS(xpath: java.lang.String, namespaces: js.Any): IXmlNode
}

