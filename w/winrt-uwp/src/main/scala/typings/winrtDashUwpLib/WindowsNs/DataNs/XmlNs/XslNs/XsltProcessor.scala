package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.XslNs

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
  def this(document: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument) = this()
  /**
                       * Processes a node and its children and returns the resulting XmlDocument .
                       * @param inputNode The node to process.
                       * @return The resulting transformation.
                       */
  def transformToDocument(inputNode: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /**
                       * Processes a node and its children and returns the resulting string transformation.
                       * @param inputNode The node to process.
                       * @return The resulting transformation.
                       */
  def transformToString(inputNode: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode): java.lang.String = js.native
}

