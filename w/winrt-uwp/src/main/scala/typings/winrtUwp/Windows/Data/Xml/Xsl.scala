package typings.winrtUwp.Windows.Data.Xml

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for the XSLT processor. */
@JSGlobal("Windows.Data.Xml.Xsl")
@js.native
object Xsl extends js.Object {
  /** Provides the methods needed by the Xslt processor. */
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
  
}

