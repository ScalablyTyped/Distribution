package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IXmlDocument extends IXmlNode {
  var doctype: XmlDocumentType
  var documentElement: XmlElement
  var documentUri: java.lang.String
  var implementation: XmlDomImplementation
  def createAttribute(name: java.lang.String): XmlAttribute
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: java.lang.String): XmlAttribute
  def createCDataSection(data: java.lang.String): XmlCDataSection
  def createComment(data: java.lang.String): XmlComment
  def createDocumentFragment(): XmlDocumentFragment
  def createElement(tagName: java.lang.String): XmlElement
  def createElementNS(namespaceUri: js.Any, qualifiedName: java.lang.String): XmlElement
  def createEntityReference(name: java.lang.String): XmlEntityReference
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): XmlProcessingInstruction
  def createTextNode(data: java.lang.String): XmlText
  def getElementById(elementId: java.lang.String): XmlElement
  def getElementsByTagName(tagName: java.lang.String): XmlNodeList
  def importNode(node: IXmlNode, deep: scala.Boolean): IXmlNode
}

