package typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.XslNs

import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode
import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the methods needed by the Xslt processor. */
@JSGlobal("Windows.Data.Xml.Xsl.XsltProcessor")
@js.native
class XsltProcessor protected () extends js.Object {
  /**
    * Creates a new XsltProcessor object from the document provided.
    * @param document The XSLT to process.
    */
  def this(document: XmlDocument) = this()
  /**
    * Processes a node and its children and returns the resulting XmlDocument .
    * @param inputNode The node to process.
    * @return The resulting transformation.
    */
  def transformToDocument(inputNode: IXmlNode): XmlDocument = js.native
  /**
    * Processes a node and its children and returns the resulting string transformation.
    * @param inputNode The node to process.
    * @return The resulting transformation.
    */
  def transformToString(inputNode: IXmlNode): String = js.native
}

