package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNode
  extends IXmlNodeSelector
     with IXmlNodeSerializer {
  var attributes: XmlNamedNodeMap
  var childNodes: XmlNodeList
  var firstChild: IXmlNode
  var lastChild: IXmlNode
  var localName: js.Any
  var namespaceUri: js.Any
  var nextSibling: IXmlNode
  var nodeName: java.lang.String
  var nodeType: NodeType
  var nodeValue: js.Any
  var ownerDocument: XmlDocument
  var parentNode: IXmlNode
  var prefix: js.Any
  var previousSibling: IXmlNode
  def appendChild(newChild: IXmlNode): IXmlNode
  def cloneNode(deep: scala.Boolean): IXmlNode
  def hasChildNodes(): scala.Boolean
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  def normalize(): scala.Unit
  def removeChild(childNode: IXmlNode): IXmlNode
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
}

