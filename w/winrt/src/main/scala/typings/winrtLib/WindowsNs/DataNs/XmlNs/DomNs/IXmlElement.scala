package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlElement extends IXmlNode {
  var tagName: java.lang.String
  def getAttribute(attributeName: java.lang.String): java.lang.String
  def getAttributeNS(namespaceUri: js.Any, localName: java.lang.String): java.lang.String
  def getAttributeNode(attributeName: java.lang.String): XmlAttribute
  def getAttributeNodeNS(namespaceUri: js.Any, localName: java.lang.String): XmlAttribute
  def getElementsByTagName(tagName: java.lang.String): XmlNodeList
  def removeAttribute(attributeName: java.lang.String): scala.Unit
  def removeAttributeNS(namespaceUri: js.Any, localName: java.lang.String): scala.Unit
  def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute
  def setAttribute(attributeName: java.lang.String, attributeValue: java.lang.String): scala.Unit
  def setAttributeNS(namespaceUri: js.Any, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit
  def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute
  def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute
}

