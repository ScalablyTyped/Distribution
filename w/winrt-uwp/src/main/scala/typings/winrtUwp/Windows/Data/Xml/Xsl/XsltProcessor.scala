package typings.winrtUwp.Windows.Data.Xml.Xsl

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the methods needed by the Xslt processor. */
@js.native
trait XsltProcessor extends js.Object {
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

object XsltProcessor {
  @scala.inline
  def apply(transformToDocument: IXmlNode => XmlDocument, transformToString: IXmlNode => String): XsltProcessor = {
    val __obj = js.Dynamic.literal(transformToDocument = js.Any.fromFunction1(transformToDocument), transformToString = js.Any.fromFunction1(transformToString))
    __obj.asInstanceOf[XsltProcessor]
  }
  @scala.inline
  implicit class XsltProcessorOps[Self <: XsltProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransformToDocument(value: IXmlNode => XmlDocument): Self = this.set("transformToDocument", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformToString(value: IXmlNode => String): Self = this.set("transformToString", js.Any.fromFunction1(value))
  }
  
}

