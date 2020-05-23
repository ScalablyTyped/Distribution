package typings.winrtUwp.Windows.Data.Xml.Xsl

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the methods needed by the Xslt processor. */
trait XsltProcessor extends js.Object {
  /**
    * Processes a node and its children and returns the resulting XmlDocument .
    * @param inputNode The node to process.
    * @return The resulting transformation.
    */
  def transformToDocument(inputNode: IXmlNode): XmlDocument
  /**
    * Processes a node and its children and returns the resulting string transformation.
    * @param inputNode The node to process.
    * @return The resulting transformation.
    */
  def transformToString(inputNode: IXmlNode): String
}

object XsltProcessor {
  @scala.inline
  def apply(transformToDocument: IXmlNode => XmlDocument, transformToString: IXmlNode => String): XsltProcessor = {
    val __obj = js.Dynamic.literal(transformToDocument = js.Any.fromFunction1(transformToDocument), transformToString = js.Any.fromFunction1(transformToString))
    __obj.asInstanceOf[XsltProcessor]
  }
}

