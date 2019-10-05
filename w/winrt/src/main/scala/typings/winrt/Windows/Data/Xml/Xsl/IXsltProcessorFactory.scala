package typings.winrt.Windows.Data.Xml.Xsl

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessorFactory extends js.Object {
  def createInstance(document: XmlDocument): XsltProcessor
}

object IXsltProcessorFactory {
  @scala.inline
  def apply(createInstance: XmlDocument => XsltProcessor): IXsltProcessorFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction1(createInstance))
  
    __obj.asInstanceOf[IXsltProcessorFactory]
  }
}

